package mey.springframework.sfgpetclinic.bootstrap;


import mey.springframework.sfgpetclinic.model.Owner;
import mey.springframework.sfgpetclinic.model.Vet;
import mey.springframework.sfgpetclinic.services.OwnerService;
import mey.springframework.sfgpetclinic.services.VetService;
import mey.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import mey.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("mey");
        owner1.setLastName("abd");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("sae");
        owner2.setLastName("bab");
        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("ali");
        vet1.setLastName("ahm");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("ali");
        vet2.setLastName("ahm");
        vetService.save(vet2);


    }


}
