package lesson1.ex2;

import lesson1.ex2.input.Input;
import lesson1.ex2.output.Output;

public class Computer <I extends Input, O extends Output> {
    private O outputObject;
    private I inputobject;

    public Computer(O outputObject, I inputobject) {
        this.outputObject = outputObject;
        this.inputobject = inputobject;
    }

    public O getOutputObject() {
        return outputObject;
    }

    public void show() {
        outputObject.show();
    }

    public void input() {
        inputobject.input();
    }
    public I getInputobject() {
        return inputobject;
    }
}
