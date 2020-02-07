package mey.springframework.sfgpetclinic.repositories;

import mey.springframework.sfgpetclinic.model.Owner;
import mey.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
