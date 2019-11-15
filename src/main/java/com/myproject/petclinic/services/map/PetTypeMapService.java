package com.myproject.petclinic.services.map;

import com.myproject.petclinic.model.PetType;
import com.myproject.petclinic.services.CrudService;


import java.util.Set;

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements CrudService<PetType, Long> {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
