package mey.springframework.sfgpetclinic.repositories;

import mey.springframework.sfgpetclinic.model.Owner;
import mey.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
