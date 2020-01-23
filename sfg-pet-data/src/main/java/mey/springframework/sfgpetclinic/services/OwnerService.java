package mey.springframework.sfgpetclinic.services;

import mey.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
