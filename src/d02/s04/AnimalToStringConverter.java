package d02.s04;

import d02.s02.animals.AbstractAnimal;

public class AnimalToStringConverter implements AbstractConverter<AbstractAnimal, String> {

    @Override
    public String convertInput(AbstractAnimal animal) {
        return animal.toString();
    }

    @Override
    public AbstractAnimal convertOutput(String string) {
        return AbstractAnimal.createFromString(string);
    }
}
