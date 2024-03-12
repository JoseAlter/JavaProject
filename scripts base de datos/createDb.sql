-- Table: Doses
CREATE TABLE Doses (
    Id bigint IDENTITY(1,1) NOT NULL,
    Employee_Id bigint NULL,
    Vaccine_Id int NULL,
    Dose_number int NOT NULL,
    First_dose date NULL,
    Second_dose date NULL,
    CONSTRAINT PK_Doses PRIMARY KEY (Id)
);

-- Table: Employees
CREATE TABLE Employees (
    Id bigint IDENTITY(1,1) NOT NULL,
    Firstname varchar(50) NOT NULL,
    Lastname varchar(50) NOT NULL,
    Status_Id int NULL,
    age int NOT NULL,
    Position varchar(255) NOT NULL,
    CONSTRAINT PK_Employees PRIMARY KEY (Id),
    CONSTRAINT FK_Employees_Status FOREIGN KEY (Status_Id) REFERENCES Status (ID)
);

-- Table: Status
CREATE TABLE Status (
    ID int NOT NULL,
    Status varchar(50) NOT NULL,
    PRIMARY KEY (ID)
);

-- Table: Vaccines
CREATE TABLE Vaccines (
    Id int NOT NULL,
    Name varchar(50) NOT NULL,
    Number_of_doses int NOT NULL,
    Dosing_interval int NOT NULL,
    Interval varchar(10) NOT NULL,
    PRIMARY KEY (Id)
);

-- Foreign Key Constraints
ALTER TABLE Doses WITH CHECK ADD CONSTRAINT FK_Doses_Employees FOREIGN KEY (Employee_Id) REFERENCES Employees (Id);
ALTER TABLE Doses CHECK CONSTRAINT FK_Doses_Employees;

ALTER TABLE Doses WITH CHECK ADD CONSTRAINT FK_Doses_Vaccines FOREIGN KEY (Vaccine_Id) REFERENCES Vaccines (Id);
ALTER TABLE Doses CHECK CONSTRAINT FK_Doses_Vaccines;

ALTER TABLE Employees WITH CHECK ADD CONSTRAINT FK_Employees_Status FOREIGN KEY (Status_Id) REFERENCES Status (ID);
ALTER TABLE Employees CHECK CONSTRAINT FK_Employees_Status;
