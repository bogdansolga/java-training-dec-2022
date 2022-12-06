package d02.s04;

import d02.s02.animals.AbstractAnimal;

// an interface that uses two generic types --> Input and Output
// for the types to become specific, we need to implement it
public interface AbstractConverter<Input, Output> {

    Output convertInput(Input input);

    Input convertOutput(Output output);
}
