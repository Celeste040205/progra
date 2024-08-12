-- database: ../database/Persona2k24.sqlite
/*
CopyRight
autor: Celeste Gallardo
fecha: 20/07/2024
*/

DROP TABLE IF EXISTS Profesores;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Curso;

INSERT INTO Persona
(Nombre ) VALUES
('Juan')
,('Pedro')
,('Maria')
,('Jose')
,('Luis')
,('Ana');


CREATE TABLE Persona (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,FechaNacimiento  DATETIME 
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Profesores (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,IdProfesores     INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,FechaNacimiento  DATETIME 
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Alumnos (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,IdAlumnos        INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,FechaNacimiento  DATETIME 
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Curso (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,IdProfesores     INTEGER PRIMARY KEY autoincrement
    ,IdAlumnos        INTEGER PRIMARY KEY autoincrement
    ,IdCurso          INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);

SELECT * FROM Persona;
SELECT count(*) FROM Persona;
SELECT * FROM Persona WHERE IdPersona = 2;
SELECT * FROM Persona WHERE IdPersona < 4;
SELECT Descripcion FROM Persona WHERE IdPersona < 4;
SELECT Descripcion FROM Persona WHERE Descripcion like "s%";
SELECT Descripcion FROM Persona WHERE Descripcion like "o%";
SELECT Descripcion FROM Persona WHERE Descripcion like "%o%";
