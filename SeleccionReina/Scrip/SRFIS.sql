-- database: ../database/Alumnas02C04.sqlite
/*
CopyRight
autor: Celeste Gallardo
fecha: 20/07/2024
*/

DROP TABLE IF EXISTS Alumnas;
DROP TABLE IF EXISTS Carrera;
DROP TABLE IF EXISTS Candidatas;
DROP TABLE IF EXISTS Votos;
DROP TABLE IF EXISTS Ganadora;

INSERT INTO Alumnas
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

INSERT INTO Candidatas
(IdAlumnas ,IdCarrera   ,Votos) VALUES
(1         ,1           ,123)
,(2        ,1           ,134)
,(4        ,2           ,129)
,(6        ,2           ,165)
,(7        ,2           ,201);
INSERT INTO Ganadora
(IdAlumnas ,IdCarrera   ,Votos) VALUES
(7        ,2           ,201);


CREATE TABLE Alumnas (
     IdAlumnas        INTEGER PRIMARY KEY autoincrement
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
CREATE TABLE Candidatas (
     IdCandidatas      INTEGER PRIMARY KEY autoincrement
    ,IdAlumnas         INTEGER NOT NULL REFERENCES Alumnas(IdAlumnas)
    ,IdCarrera         INTEGER NOT NULL REFERENCES Carrera(IdCarrera)
    ,Votos             INT 
    ,FechaCrea         DATETIME DEFAULT (datetime('now'))
    ,FechaModific      DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Ganadora (
     IdGanadora      INTEGER PRIMARY KEY autoincrement
    ,IdAlumnas         INTEGER NOT NULL REFERENCES Alumnas(IdAlumnas)
    ,IdCarrera         INTEGER NOT NULL REFERENCES Carrera(IdCarrera)
    ,Votos             INT 
    ,FechaCrea         DATETIME DEFAULT (datetime('now'))
    ,FechaModific      DATETIME DEFAULT (datetime('now'))
);

