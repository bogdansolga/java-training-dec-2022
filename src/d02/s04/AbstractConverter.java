package d02.s04;

// an interface that uses two generic types --> Input and Output
// for the types to become specific, we need to implement it
public interface AbstractConverter<Input, Output> {

    Output convertInput(Input input);

    Input convertOutput(Output output);
}
