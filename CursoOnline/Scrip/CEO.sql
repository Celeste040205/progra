-- database: ../database/Persona4C14.sqlite
/*
CopyRight
autor: Celeste Gallardo
fecha: 20/07/2024
*/

DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS Curso;
DROP TABLE IF EXISTS Profesores;
DROP TABLE IF EXISTS Alumnos;

INSERT INTO Persona
(Nombre ,Cedula ,CorreoElec ,Password ) VALUES
('Juan Perez'           ,'1752870078'       ,'Juan.Perez.@hotmail.com'          ,'Juan/Perez*')
,('Pedro Maldonado'     ,'1755956049'       ,'Pedro.Maldonado.@hotmail.com'     ,'Pedro$Maldonado*')
,('Maria Gallardo'      ,'1702878048'       ,'Maria.Gallardo.@hotmail.com'      ,'Maria9Gallardo*')
,('Jose Moreno'         ,'1701039366'       ,'Jose.Moreno.@hotmail.com'         ,'Jose/Moreno98')
,('Luis Andrade'        ,'1757893048'       ,'Luis.Andrade.@hotmail.com'        ,'Luis876Andrade*')
,('Ana Ayovi'           ,'1752973987'       ,'Ana.Ayovi.@hotmail.com'           ,'Ana.Ayovi098')
,('Isaac Herrera'       ,'1776577648'       ,'Isaac.Herrera.@hotmail.com'       ,'Isaac0405Herrera02')
,('Celeste Moreno'      ,'1752973048'       ,'Celeste.Moreno.@hotmail.com'      ,'Celeste14Moreno12')
,('Daniela Perez'       ,'1752890048'       ,'Daniela.Perez.@hotmail.com'       ,'Daniela/Perez+')
,('Luisa Ayovi'         ,'1757899048'       ,'Luisa.Ayovi.@hotmail.com'         ,'Luisa986Ayovi*')
,('Anahi Villareal'     ,'1759845676'       ,'Anahi.Villareal.@hotmail.com'     ,'Anahi45Villareal*')
,('Anshela Torres'      ,'1787653048'       ,'Anshela.Torres.@hotmail.com'      ,'Anshela/Torres%');

INSERT INTO Curso
(NombreCurso ) VALUES
('Matematicas')
,('Fisica')
,('Quimica')
,('Inglés')
,('Programacion')
,('Dibujo');

INSERT INTO Profesores
(IdPersona ,IdCurso ,Nombre                 ,Cedula             ,CorreoElec) VALUES
(1         ,5       ,'Juan Perez'           ,'1752870078'       ,'Juan.Perez.@hotmail.com')
,(5        ,2       ,'Luis Andrade'         ,'1757893048'       ,'Luis.Andrade.@hotmail.com')
,(9        ,3       ,'Daniela Perez'        ,'1752890048'       ,'Daniela.Perez.@hotmail.com')
,(8        ,1       ,'Celeste Moreno'       ,'1752973048'       ,'Celeste.Moreno.@hotmail.com')
,(10       ,6       ,'Luisa Ayovi'          ,'1757899048'       ,'Luisa.Ayovi.@hotmail.com')
,(7        ,4       ,'Isaac Herrera'        ,'1776577648'       ,'Isaac.Herrera.@hotmail.com');

INSERT INTO Alumnos
(IdPersona ,IdCurso ,Nombre                 ,Cedula             ,CorreoElec) VALUES
(2         ,1       ,'Pedro Maldonado'      ,'1755956049'       ,'Pedro.Maldonado.@hotmail.com')
,(11       ,4       ,'Anahi Villareal'      ,'1759845676'       ,'Anahi.Villareal.@hotmail.com')
,(3        ,6       ,'Maria Gallardo'       ,'1702878048'       ,'Maria.Gallardo.@hotmail.com' )
,(4        ,2       ,'Jose Moreno'          ,'1701039366'       ,'Jose.Moreno.@hotmail.com'    )
,(2        ,3       ,'Pedro Maldonado'      ,'1755956049'       ,'Pedro.Maldonado.@hotmail.com')
,(6        ,1       ,'Ana Ayovi'            ,'1752973987'       ,'Ana.Ayovi.@hotmail.com'      )
,(3        ,5       ,'Maria Gallardo'       ,'1702878048'       ,'Maria.Gallardo.@hotmail.com' )
,(6        ,4       ,'Ana Ayovi'            ,'1752973987'       ,'Ana.Ayovi.@hotmail.com'      )
,(12       ,6       ,'Anshela Torres'       ,'1787653048'       ,'Anshela.Torres.@hotmail.com' );

INSERT INTO Matematicas
(IdPersona ) VALUES
(2)
,(6);
INSERT INTO Fisica
(IdPersona ) VALUES
(4);
INSERT INTO Quimica
(IdPersona ) VALUES
(2);
INSERT INTO Ingles
(IdPersona ) VALUES
(11)
,(6);
INSERT INTO Programacion
(IdPersona ) VALUES
(3);
INSERT INTO Dibujo
(IdPersona ) VALUES
(3)
,(12);

CREATE TABLE Persona (
     IdPersona        INTEGER PRIMARY KEY autoincrement
    ,Nombre           TEXT NOT NULL UNIQUE
    ,Cedula           TEXT NOT NULL UNIQUE
    ,CorreoElec       TEXT NOT NULL UNIQUE
    ,Password         TEXT NOT NULL UNIQUE
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Curso (
     IdCurso          INTEGER PRIMARY KEY autoincrement
    ,NombreCurso           TEXT NOT NULL
    ,Estado           VARCHAR(1) DEFAULT('A') CHECK (Estado  IN ('A','R'))
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Profesores (
     IdProfesores     INTEGER PRIMARY KEY autoincrement
    ,IdPersona        INTEGER NOT NULL REFERENCES Persona(IdPersona)
    ,IdCurso          INTEGER NOT NULL REFERENCES Curso(IdCurso)
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);
CREATE TABLE Alumnos (
     IdAlumnos        INTEGER PRIMARY KEY autoincrement
    ,IdPersona        INTEGER NOT NULL REFERENCES Persona(IdPersona)
    ,IdCurso          INTEGER NOT NULL REFERENCES Curso(IdCurso)
    ,FechaCrea        DATETIME DEFAULT (datetime('now'))
    ,FechaModific     DATETIME DEFAULT (datetime('now'))
);

CREATE TABLE Matematicas (
    IdMatematicas    INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);
CREATE TABLE Fisica (
    IdFisica         INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);
CREATE TABLE Quimica (
    IdQuimica        INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);
CREATE TABLE Ingles (
    IdIngles         INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);
CREATE TABLE Programacion (
    IdProgramacion   INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);
CREATE TABLE Dibujo (
    IdDibujo         INTEGER PRIMARY KEY autoincrement
    ,IdPersona       INTEGER NOT NULL REFERENCES Persona(IdPersona)
);

SELECT * FROM Persona;
SELECT count(*) FROM Persona;
SELECT * FROM Persona WHERE IdPersona = 7;
SELECT * FROM Persona WHERE IdPersona < 8;
SELECT Nombre FROM Persona WHERE IdPersona < 8;
