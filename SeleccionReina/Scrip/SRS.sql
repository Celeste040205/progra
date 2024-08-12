-- database: ../database/Persona2C04.sqlite
/*
CopyRight
autor: Celeste Gallardo
fecha: 20/07/2024
*/

DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS Carrera;
DROP TABLE IF EXISTS Candidatas;
DROP TABLE IF EXISTS Votos;
DROP TABLE IF EXISTS Ganadora;

INSERT INTO Persona
(Nombre                 ,CodUni             ,CorreoElec ) VALUES
('Maria Gallardo'       ,'2020878048'       ,'Maria.Gallardo.@epn.edu.ec')
,('Ana Ayovi'           ,'2021973987'       ,'Ana.Ayovi.@epn.edu.ec')
,('Celeste Moreno'      ,'2024973048'       ,'Celeste.Moreno.@epn.edu.ec')
,('Daniela Perez'       ,'2019890048'       ,'Daniela.Perez.@epn.edu.ec')
,('Luisa Ayovi'         ,'2020899048'       ,'Luisa.Ayovi.@epn.edu.ec')
,('Anahi Villareal'     ,'2021845676'       ,'Anahi.Villareal.@epn.edu.ec')
,('Anshela Torres'      ,'2024653048'       ,'Anshela.Torres.@epn.edu.ec');

INSERT INTO Carrera
(NombreCarrera ) VALUES
('Computacion')
,('Sofward');

INSERT INTO Candidata
(IdPersona ,IdCarrera) VALUES
(1         ,1)
,(2        ,1)
,(3        ,2)
,(4        ,1)
,(5        ,1)
,(6        ,2)
,(7        ,2);
INSERT INTO Votos
(IdCandidata    ,Votos ) VALUES
(1              ,123)
,(2             ,134)
,(3             ,87)
,(4             ,129)
,(5             ,135)
,(6             ,165)
,(7             ,201);
INSERT INTO Ganadora
(IdVotos ) VALUES
(2);

CREATE TABLE Persona (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,CodUni           TEXT NOT NULL UNIQUE
    ,CorreoElec       TEXT NOT NULL UNIQUE
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Carrera (
     IdCarrera              INTEGER PRIMARY KEY autoincrement
    ,NombreCarrera          TEXT NOT NULL
    ,FechaCrea              DATETIME DEFAULT (datetime('now'))
    ,FechaModific           DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Candidata (
     IdCandidata      INTEGER PRIMARY KEY autoincrement
    ,IdPersona        INTEGER NOT NULL REFERENCES Persona(IdPersona)
    ,IdCarrera        INTEGER NOT NULL REFERENCES Carrera(IdCarrera)
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Votos (
     IdVotos            INTEGER PRIMARY KEY autoincrement
    ,IdCandidata        INTEGER NOT NULL REFERENCES Candidata(IdCandidata)
    ,Votos              INT 
    ,FechaCrea          DATETIME DEFAULT (datetime('now'))
    ,FechaModific       DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Ganadora (
    IdGanadora       INTEGER PRIMARY KEY autoincrement
    ,IdVotos         INTEGER NOT NULL REFERENCES Persona(IdVotos)
);
