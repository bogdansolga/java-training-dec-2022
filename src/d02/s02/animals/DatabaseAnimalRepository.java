package d02.s02.animals;

public class DatabaseAnimalRepository implements AnimalRepository {

    @Override
    public AbstractAnimal getAnimalById(int id) {
        System.out.println("Returning the animal with the ID " + id + " from the database...");
        //TODO perform database querying

        return new Cow(); // just an example :-)
    }
}
