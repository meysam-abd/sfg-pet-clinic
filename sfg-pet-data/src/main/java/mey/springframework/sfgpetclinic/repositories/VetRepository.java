package mey.springframework.sfgpetclinic.repositories;

import mey.springframework.sfgpetclinic.model.Owner;
import mey.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
