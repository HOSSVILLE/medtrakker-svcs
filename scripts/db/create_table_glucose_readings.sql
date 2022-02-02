-- Drop table

-- DROP TABLE public.glucose_readings;

CREATE TABLE public.glucose_readings (
                                         glucose_date_reading date NOT NULL DEFAULT now(),
                                         glucose_reading int4 NOT NULL,
                                         glucose_when varchar NOT NULL,
                                         glucose_notes varchar NULL,
                                         id int4 NOT NULL GENERATED ALWAYS AS IDENTITY
);

