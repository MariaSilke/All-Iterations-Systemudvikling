CREATE TABLE `iteration3`.`Mutation` (
  `MutationName` varchar(50),
  `MutationDate` datetime,
  PRIMARY KEY (`MutationName`)
);

CREATE TABLE `iteration3`.`Test` (
  `TestID` int,
  `CPR` varchar(10),
  `date` datetime,
  `place` varchar(50),
  `analyse` varchar(50),
  `result` varchar(50),
  `strainOfCovid` varchar(50),
  `interpretation` varchar(50),
  `comment` varchar(50),
  PRIMARY KEY (`TestID`)
);

CREATE TABLE `iteration3`.`Government` (
  `authorazationID` varchar(50),
  `firstName` varchar(50),
  `lastname` varchar(50),
  `professionTitle` varchar(50),
  `password` varchar(50),
  PRIMARY KEY (`authorazationID`)
);

CREATE TABLE `iteration3`.`Citizen` (
  `CPR` varchar(10),
  `firstName` varchar(50),
  `lastName` varchar(50),
  `dob` datetime,
  `adress` varchar(50),
  `phoneNumber` varchar(8),
  `zipCode` int,
  `password` varchar(50),
  PRIMARY KEY (`cprNumber`)
);

CREATE TABLE `iteration3`.`Healthcare Professional (HP)` (
  `authorizationID` varchar(50),
  `firstName` varchar(50),
  `lastName` varchar(50),
  `professionTitle` varchar(50),
  `password` varchar(50),
  PRIMARY KEY (`authorizationID`)
);

CREATE TABLE `iteration3`.`Statistics about COVID19 in DK` (
  `zipCode` int,
  `casesInfected` int,
  `casesTreatment` varchar(50),
  `mortalityRate` int,
  `caseFatalityRate` int,
  `geographicallyRegions` varchar(50),
  `matuationVariants` varchar(50)
);

CREATE TABLE `iteration3`.`Geographical/sensor data with concent` (
  `temperature` int,
  `pulse` int,
  `geographicalLocation` varchar(50)
);

CREATE TABLE `iteration3`.`Workplace` (
  `locationType` varchar(50),
  `loacationName` varchar(50)
);

CREATE TABLE `iteration3`.`Parent Children tabel` (
  `CPR` varchar(10),
  `CPRparent` varchar(10),
  PRIMARY KEY (`CPR`)
);

CREATE TABLE `iteration3`.`Restrictions` (
  `distance` varchar(50),
  `assamblyBan` varchar(50),
  `maskRecommendation` varchar(50),
  `closureProfessions` varchar(50),
  `testRecommendations` varchar(50)
);

CREATE TABLE `iteration3`.`Statistics with consent about current goegraphical location` (
  `zipCodeAfterCurrentAdress` int,
  `casesInfectedAfterCurrentZipCode` int,
  `casesTreatmentAfterCurrentZipCode` varchar(50),
  `mortalityRateAfterCurrentZipCode` int,
  `caseFatalityAfterCurrentZipCode` int,
  `geographicallyRegions` varchar(50),
  `mutationVariants` varchar(50)
);

SELECT * FROM iteration3.citizen;


INSERT INTO `iteration3`.`citizen`
(`cprNumber`,
`firstName`,
`lastName`,
`dob`,
`adress`,
`phoneNumber`,
`childrenList`,
`testResult`,
`zipCode`,
`password`)
VALUES
("2010901234",
"Carla",
"Svenson",
19901020,
"Violvej 3",
"23245657",
"None",
"Positiv",
2750,
"1234");

INSERT INTO `iteration3`.`test`
(`TestID`,
`CPR`,
`date`,
`place`,
`analyse`,
`result`,
`strainOfCovid`,
`interpretation`,
`comment`)
VALUES
(134565,
"1507651124",
19650715,
"Energivej 50",
"PCR",
"Positiv",
"B.1.1.7",
"Corona er påvist",
"Du skal gå i isolation");


SELECT * FROM iteration3.citizen;

INSERT INTO `iteration3`.`mutation`
(`MutationName`,
`MutationDate`)
VALUES
("N501Y",
20201115);

SELECT * FROM iteration3.citizen;

INSERT INTO `iteration3`.`citizen`
(`cprNumber`,
`firstName`,
`lastName`,
`dob`,
`adress`,
`phoneNumber`,
`zipCode`,
`password`)
VALUES
(1507651124,
"Signe",
"Jensen",
19650715,
"Violvej 14",
"97986758",
2730,
"Godmorgen789");
