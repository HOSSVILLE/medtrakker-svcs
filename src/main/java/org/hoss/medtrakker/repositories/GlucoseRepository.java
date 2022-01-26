package org.hoss.medtrakker.repositories;

import org.hoss.medtrakker.models.GlucoseReading;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;


@Component
@Repository
public interface GlucoseRepository extends CrudRepository<GlucoseReading, Timestamp> {

}
