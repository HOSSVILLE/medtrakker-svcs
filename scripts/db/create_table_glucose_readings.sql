-- public.glucose_readings definition

-- Drop table

-- DROP TABLE public.glucose_readings;

CREATE TABLE public.glucose_readings (
	glucose_date_reading timestamp NOT NULL DEFAULT now(),
	glucose_reading int4 NOT NULL,
	glucose_when varchar NOT NULL,
	glucose_notes varchar NULL
);
