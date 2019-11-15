package com.myproject.petclinic.bootstrap;

import com.myproject.petclinic.model.Owner;

import com.myproject.petclinic.model.PetType;
import com.myproject.petclinic.model.Vet;
import com.myproject.petclinic.services.OwnerService;
import com.myproject.petclinic.services.PetTypeService;
import com.myproject.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();

        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Michael");
        owner2.setLastName("Wiston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sara");
        vet1.setLastName("Kim");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Sam");
        vet2.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
