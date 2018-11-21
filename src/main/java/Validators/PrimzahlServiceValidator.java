package Validators;

import java.util.InputMismatchException;

public class PrimzahlServiceValidator {
    public static void checkIfParametergreatherThan3(String [] args) throws InputMismatchException {
        if (Integer.parseInt(args[1])>=4){
            throw new InputMismatchException();
        }

    }

}
