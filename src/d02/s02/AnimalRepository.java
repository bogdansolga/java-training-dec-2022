package d02.s02;

import domain.animals.AbstractAnimal;

// a repository - a place from where we can read and write objects of that type
public interface AnimalRepository {

    AbstractAnimal getAnimalById(int id);
}
