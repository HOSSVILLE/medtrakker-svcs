package org.hoss.medtrakker.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;

@Data
@Table("glucose_readings")
public class GlucoseReading {
    @Id
    @Column("glucose_date_reading")
    private Timestamp glucoseDateReading;

    @Column("glucose_reading")
    private Integer glucoseReading;

    @Column("glucose_when")
    private String glucoseWhen;

    @Column("glucose_notes")
    private String glucoseNotes;
}
