package mey.springframework.sfgpetclinic.repositories;

import mey.springframework.sfgpetclinic.model.Owner;
import mey.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
