SELECT * FROM iteration3.citizen;
SELECT * FROM iteration3.mutation;
SELECT * FROM iteration3.test;
SELECT * FROM iteration3.summary;

UPDATE citizen
SET zipCode = 2400
WHERE CPR = "2010901234";


CREATE TABLE `iteration3`.`Summary` (
	SELECT citizen.CPR, citizen.zipCode, test.result, test.date_test, test.strainOfCovid, mutation.mutationName
	FROM citizen
	INNER JOIN test ON test.CPR = citizen.CPR
	INNER JOIN mutation ON mutation.MutationName=test.strainOfCovid
);
    