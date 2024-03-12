INSERT INTO Status(ID, Status) VALUES
(1, 'Protegido'),
(2, 'En Proceso'),
(3, 'En Riesgo');

select * from Status;

INSERT INTO Vaccines(Id, Name, Number_of_doses, Dosing_interval, Interval) VALUES
(1, 'Sinopharm', 2, 4, 'Semanas'),
(2, 'AstaraZenenca', 2, 8, 'Semanas'),
(3, 'Sputnik V', 2, 60, 'Dias'),
(4, 'Moderna', 2, 28, 'Dias'),
(5, 'Janssen', 1, 0, 'No hay');

select * from Vaccines;