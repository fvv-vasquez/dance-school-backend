-- DDL scripts to create the database for the project

CREATE DATABASE danceschooldb;

-- DROP SCHEMA dance_types;

CREATE SCHEMA dance_types AUTHORIZATION postgres;

-- dance_types.tb_dance_types definition

-- Drop table

-- DROP TABLE dance_types.tb_dance_types;

CREATE TABLE dance_types.tb_dance_types (
	id int4 NOT NULL,
	title text NOT NULL,
	description text NOT NULL
);

-- dance_types.tb_contact definition

-- Drop table

-- DROP TABLE dance_types.tb_contact;

CREATE TABLE dance_types.tb_contact (
	"name" text NOT NULL,
	email text NOT NULL,
	address text NOT NULL,
	cellphone text NOT NULL,
	dancetype text NOT NULL,
	schedule text NOT NULL,
	age int4 NOT NULL,
	"level" text NOT NULL,
	"comment" text NOT NULL
);