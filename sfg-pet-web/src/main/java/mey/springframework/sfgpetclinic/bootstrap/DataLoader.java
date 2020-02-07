package mey.springframework.sfgpetclinic.bootstrap;


import mey.springframework.sfgpetclinic.model.*;
import mey.springframework.sfgpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("mey");
        owner1.setLastName("abd");
        owner1.setAddress("1245 street");
        owner1.setCity("teh");
        owner1.setTelephone("1236547");

        Pet meyPet = new Pet();
        meyPet.setPetType(saveDogPetType);
        meyPet.setOwner(owner1);
        meyPet.setBirthDate(LocalDate.now());
        meyPet.setName("Rosco");
        owner1.getPets().add(meyPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("sae");
        owner2.setLastName("bab");
        owner1.setAddress("6589 street");
        owner1.setCity("esf");
        owner1.setTelephone("32145");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(saveCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);


        Visit catVisit = new Visit();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);


        Vet vet1 = new Vet();
        vet1.setFirstName("ali");
        vet1.setLastName("ahm");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("sam");
        vet2.setLastName("shi");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
    }


}
