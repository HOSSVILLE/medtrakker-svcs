package org.hoss.medtrakker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("glucose_readings")
@AllArgsConstructor

public class GlucoseReading {

    @Id
    private Integer Id;

    @JsonProperty("glucose_date_reading")
    @Column("glucose_date_reading")
    private java.util.Date glucoseDateReading;

    @JsonProperty("glucose_reading")
    @Column("glucose_reading")
    private Integer glucoseReading;

    @JsonProperty("glucose_when")
    @Column("glucose_when")
    private String glucoseWhen;

    @JsonProperty("glucose_notes")
    @Column("glucose_notes")
    private String glucoseNotes;
}
