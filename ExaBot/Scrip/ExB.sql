-- database: ../database/ExaBot02C04.sqlite
/*
CopyRight
autor: Celeste Gallardo
fecha: 20/07/2024
*/
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS TipoPersona;
DROP TABLE IF EXISTS Exobot;
DROP TABLE IF EXISTS UsuarioExobot;

INSERT INTO Persona
(Nombre                 ,Cedula             ,CorreoElec ) VALUES
('Mario Gallardo'       ,'1717878048'       ,'Mario.Gallardo.@ejercito.ec')
,('Joel Ayovi'          ,'1721973987'       ,'Joel.Ayovi.@ejercito.ec')
,('Celeste Moreno'      ,'1724973048'       ,'Celeste.Moreno.@ejercito.ec')
,('Daniela Perez'       ,'1719890048'       ,'Daniela.Perez.@ejercito.ec')
,('Luis Ayovi'          ,'1717899048'       ,'Luis.Ayovi.@ejercito.ec')
,('Danilo Villareal'    ,'1721845676'       ,'Danilo.Villareal.@ejercito.ec')
,('Anshela Torres'      ,'1724653048'       ,'Anshela.Torres.@ejercito.ec');
INSERT INTO Rango
(NombreRango ) VALUES
('Soldado')
,('General')
,('Ranger')
,('Capitan');
INSERT INTO Exobot
(ModeloExobot ) VALUES
('AndromonVs.1.2')
,('ImperialdramonVs.2.5')
,('MashindramonVs.1.0');

INSERT INTO UsuarioExobot
(IdPersona ,IdRango   ,IdExobot) VALUES
(1         ,3         ,2)
,(2        ,1         ,3)
,(3        ,4         ,1)
,(4        ,2         ,1)
,(5        ,3         ,3)
,(6        ,1         ,2)
,(7        ,4         ,1);
CREATE TABLE Persona (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,Cedula           TEXT NOT NULL UNIQUE
    ,CorreoElec       TEXT NOT NULL UNIQUE
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Rango (
     IdRango                INTEGER PRIMARY KEY autoincrement
    ,NombreRango            TEXT NOT NULL UNIQUE
    ,FechaCrea              DATETIME DEFAULT (datetime('now'))
    ,FechaModific           DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Exobot (
     IdExobot          INTEGER PRIMARY KEY autoincrement
    ,ModeloExobot      TEXT NOT NULL UNIQUE
    ,FechaCrea         DATETIME DEFAULT (datetime('now'))
    ,FechaModific      DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE UsuarioExobot (
     IdUsuarioExobot      INTEGER PRIMARY KEY autoincrement
    ,IdPersona            INTEGER NOT NULL REFERENCES Persona(IdPersona)
    ,IdRango              INTEGER NOT NULL REFERENCES Rango(IdRango)
    ,IdExobot             INTEGER NOT NULL REFERENCES Exobot(IdExobot)
    ,FechaCrea            DATETIME DEFAULT (datetime('now'))
    ,FechaModific         DATETIME DEFAULT (datetime('now'))
);