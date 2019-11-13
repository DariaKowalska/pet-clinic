package com.myproject.petclinic.services;

import com.myproject.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {


    Owner findByLastName(String lastName);


}
