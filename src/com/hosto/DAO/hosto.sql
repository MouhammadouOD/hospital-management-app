-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS Hosto;
CREATE DATABASE Hosto;
USE Hosto;

-- -----------------------------------------------------------------------------
-- - Construction de la table des utilisateurs                               ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Users (
	IdUser				int(4)		PRIMARY KEY AUTO_INCREMENT,
	Pseudo				varchar(20)	,
	Prenom				varchar(20)	,
	Nom					varchar(20)	,
	Mdp					varchar(20)	,
	Fonction			varchar(20) 
	
) ENGINE = InnoDB;

INSERT INTO T_Users (IdUser, Pseudo, Nom, Prenom, Mdp, Fonction) VALUES ( 1, 'Mod','Mouhammadou oury','diallo', 'mdp1', 	'Administrateur'  );
INSERT INTO T_Users (IdUser, Pseudo, Nom, Prenom, Mdp, Fonction) VALUES ( 2, 'Younouss','Younouss', 	 'Athie',  'mdp2',	'Medecin' 		  );
INSERT INTO T_Users (IdUser, Pseudo, Nom, Prenom, Mdp, Fonction) VALUES ( 3, 'Cof' , 'Cheikh Oumar', 'ba',	   'mdp3', 	'Infirmier'		  );

SELECT * FROM T_Users;


-- -----------------------------------------------------------------------------
-- - Construction de la table des patients                               	 ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Patients (
	IdPatient		int			PRIMARY KEY AUTO_INCREMENT,
	Nom				varchar(20)	,
	Prenom			varchar(20)	,
	Sexe			CHAR(1)     ,
	DateNaissance	DATE 		,
	Adresse			varchar(100)	,
	NomAcc			varchar(50),
	TelAcc			varchar(9)
)ENGINE = InnoDB;

INSERT INTO T_Patients (IdPatient, Nom, Prenom, Sexe, DateNaissance, Adresse, NomAcc, TelAcc) VALUES (1, 'Niang', 'Lamine', 'M', '19970714', 'thies', 'mod', '772806246');
			    
INSERT INTO T_Patients (IdPatient, Nom, Prenom, Sexe, DateNaissance, Adresse, NomAcc, TelAcc) VALUES (2, 'Niang', 'Maty', 'F', '19990814', 'thies', 'mod', '772806246');


SELECT * FROM T_Patients;


-- -----------------------------------------------------------------------------
-- - Construction de la table des consultations de l'infirmier               ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_ConsultationsI(
	IdConsultationI int 		PRIMARY KEY AUTO_INCREMENT,
	Patient	   	   int		 ,
	Poids		   int		UNSIGNED ,
	Temperature    int		UNSIGNED ,
	HeureDeCons    VARCHAR(20) ,	
	Taille		   int		UNSIGNED 		  DEFAULT 0	,
	
	CONSTRAINT fk_Patient_IdPatient FOREIGN KEY (Patient) REFERENCES T_Patients(IdPatient)
)ENGINE = InnoDB;

INSERT INTO T_ConsultationsI (IdConsultationI,Patient,Poids,Temperature,HeureDeCons,Taille) VALUES (1, 1, 65, 40, '2020-09-18 09:00:00',175);

SELECT * FROM T_ConsultationsI;


-- -----------------------------------------------------------------------------
-- - Construction de la table des consultations du Medecin               ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_ConsultationsM(
	IdConsultationM		int PRIMARY KEY AUTO_INCREMENT,
	PerimCranien		varchar(30),
	PerimBracial		varchar(30),
	PerimThoracique		varchar(30),
	SegmentInf			varchar(30),
	SegmentSup			varchar(30),
	FreqCardiaque		varchar(30),
	FreqThoracique		varchar(30),
	Patient				int,
	
	CONSTRAINT fk_Patient_IdPatient4 FOREIGN KEY (Patient) REFERENCES T_Patients(IdPatient)
)ENGINE = InnoDB;
	
INSERT INTO T_ConsultationsM (IdConsultationM , PerimCranien ,PerimBracial, PerimThoracique	, SegmentInf, SegmentSup, FreqCardiaque	, FreqThoracique, Patient) VALUES(1,'PerimCranien' ,'PerimBracial', 'PerimThoracique','SegmentInf', 'SegmentSup','FreqCardiaque', 'FreqThoracique',1);

SELECT * FROM T_ConsultationsM;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Rendez-vous                                ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_RendezVous(
	NomPatient varchar(30),
	PrenomPatient varchar(30),
	IdRv	int PRIMARY KEY AUTO_INCREMENT,
	DateRv	DATE , 
	Heure	TIME ,
	Patient	int , 
	
	CONSTRAINT fk_Patient_IdPatient1 FOREIGN KEY (Patient) REFERENCES T_Patients(IdPatient)
)ENGINE = InnoDB;

INSERT INTO T_RendezVous (NomPatient,PrenomPatient, IdRv, DateRv, Heure, Patient) VALUES ('lamine','niang',1, CURDATE(), CURTIME(), 1);
INSERT INTO T_RendezVous (NomPatient,PrenomPatient, IdRv, DateRv, Heure, Patient)	VALUES ('modou','diop',2, CURDATE(), CURTIME(), 2);

SELECT * FROM T_RendezVous;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Médicaments                                ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Medicaments(
	IdMed				int PRIMARY KEY AUTO_INCREMENT,
	NomMed				varchar(50) ,
	FrequenceDePrise	varchar(20) ,
	NombreParPrise		varchar(10) ,
	DureePrise			varchar(15) ,
	PeriodePrise		varchar(20)
	
)ENGINE = InnoDB;

INSERT INTO T_Medicaments (IdMed, NomMed, FrequenceDePrise, NombreParPrise, DureePrise, PeriodePrise) VALUES (1,'EFFRELGAN','JOUR', '1','1 SEMAINE','MATIN SOIR');

SELECT * FROM T_Medicaments;

-- -----------------------------------------------------------------------------
-- - Construction de la table des Dossiers des patients hostpiitalisés        ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Dossiers(
	IdDossier			int PRIMARY KEY AUTO_INCREMENT,
	Patient				int ,
	Division			varchar(40) ,
	DateEntree			DATETIME,
	DateSortie			DATETIME DEFAULT NULL,
	DiagEntree			varchar(100) ,
	DiagSortie			varchar(100) ,
	Imc					int ,
	Pc					int ,
	Pb					int ,
	ArgAnamnestiques	varchar(100) ,
	ArgCliniques		varchar(100) ,	
	Traitement			varchar(400),
	Evolution			varchar(400),
	
	CONSTRAINT fk_Patient_IdPatient2 FOREIGN KEY (Patient) REFERENCES T_Patients(IdPatient)
)ENGINE = InnoDB;

INSERT INTO T_Dossiers (IdDossier, Patient, Division, DateEntree, DateSortie, DiagEntree, DiagSortie, Imc, Pc, Pb, ArgAnamnestiques, ArgCliniques, Traitement, Evolution) VALUES (1, 1, '', '20200809', '20200909', 'FIEVRE CHRONIQUE', 'GUERI', 73, 12, 45, 'blablabla','blablabla','antibiotiques','');

SELECT * FROM T_Dossiers;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Examens des patients hostpiitalisés        ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Examens(
	IdExamen		int PRIMARY KEY AUTO_INCREMENT,
	Patient			int ,
	NomExamen		varchar(40) ,
	DateExamen		DATE,
	Resultat		varchar(10),
	
	CONSTRAINT fk_Patient_IdPatient3 FOREIGN KEY (Patient) REFERENCES T_Patients(IdPatient)
)ENGINE = InnoDB;

INSERT INTO T_Examens (IdExamen, Patient, NomExamen, DateExamen, Resultat) VALUES (1, 1, 'Corona', CURDATE(),'POSITIF');
INSERT INTO T_Examens (IdExamen, Patient, NomExamen, DateExamen, Resultat) VALUES (2, 2, 'Poche vide',CURDATE(),'');

SELECT * FROM T_Examens;




