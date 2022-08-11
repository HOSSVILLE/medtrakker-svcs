-- Drop table

-- DROP TABLE public.weight_readings;

CREATE TABLE public.weight_readings (
                                         weight_date_reading date NOT NULL DEFAULT now(),
                                         weight_reading int2 NOT NULL,
                                         weight_when varchar NOT NULL,
                                         weight_notes varchar NULL,
                                         id int4 NOT NULL GENERATED ALWAYS AS IDENTITY
);
