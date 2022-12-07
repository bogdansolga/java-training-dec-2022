package d02.s02;

import domain.animals.AbstractAnimal;

public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void buyAnimalAndTakeItHome(int animalId) {
        // retrieving an (abstract) animal from an abstract source
        AbstractAnimal animal = animalRepository.getAnimalById(animalId);
        System.out.println("We got a " + animal.getClass().getSimpleName() + ", taking it home to our beloved...");

        // ... walking home

        System.out.println("Honey, I'm home! I got an animal that has fur " + animal.hasFur());
    }
}
