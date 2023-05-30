package edu.dio.anatomiadasclasses;
public class MyClass {
    public static void main (String[] args){
        //System.out.print("Welcome to Brazil!");

        String myName = "Helen";
        String myLastName = "Caroline";

        int yearManufacture;
        yearManufacture = 2023;

        boolean yesNo = true;
        boolean trueFalse = false;

        String fullName = FullName(myName, myLastName);
        System.out.print(fullName);
    }

    public static String FullName (String NameOne, String NameTwo){
        return "Resultado do metodo: " + NameOne.concat(" ").concat(NameTwo);
    }
}
