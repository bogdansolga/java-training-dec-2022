package d02.s02.animals;

// a repository - a place from where we can read and write objects of that type
public interface AnimalRepository {

    AbstractAnimal getAnimalById(int id);
}
