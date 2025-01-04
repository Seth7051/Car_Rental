-- --------------------------------------------------------------------------------
-- Name:		SRN
-- Class:		IT-161 Java 1
-- Abstract:	VehicleRentalTest3SN
-- --------------------------------------------------------------------------------

-- --------------------------------------------------------------------------------
-- Options
-- --------------------------------------------------------------------------------
USE dbVehicleRental		            -- Don't work in master
SET NOCOUNT ON				-- Report only errors

-- ----------------------------------------------------------------------
-- Drops
-- ----------------------------------------------------------------------
IF OBJECT_ID( 'TLocations' )			IS NOT NULL		DROP TABLE TLocations

GO

-- ----------------------------------------------------------------------
-- Tables
-- ----------------------------------------------------------------------
CREATE TABLE TLocations
(
	intLocationID						INTEGER        NOT NULL,
	strLocationName						VARCHAR(50)    NOT NULL,
	strAddress						    VARCHAR(50)    NOT NULL,
	strCity				                VARCHAR(50)    NOT NULL,
	strState				            VARCHAR(50)    NOT NULL,
	strZip				                VARCHAR(50)    NOT NULL
	CONSTRAINT TLocations_PK PRIMARY KEY CLUSTERED ( intLocationID ))

-- Locations
INSERT INTO TLocations(intLocationID, strLocationName, strAddress, strCity, strState, strZip)
VALUES (2, 'Downtown', '2010 Vine', 'Cinti', 'OH', '45201');

INSERT INTO TLocations(intLocationID, strLocationName, strAddress, strCity, strState, strZip)
VALUES (4, 'Hamilton', '9010 C Street', 'Hamilton', 'OH', '45013');

INSERT INTO TLocations(intLocationID, strLocationName, strAddress, strCity, strState, strZip)
VALUES (3, 'Loveland', '202 Main St', 'Loveland', 'OH', '45140');

INSERT INTO TLocations(intLocationID, strLocationName, strAddress, strCity, strState, strZip)
VALUES (1, 'Northwest', '10 Colerain', 'Cinti', 'OH', '45241');


GO

-- ----------------------------------------------------------------------
-- Testing
-- ----------------------------------------------------------------------

SELECT *
FROM TLocations

