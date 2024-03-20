package de.neuefische;

import java.math.*;

public class Main {

    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;

        System.out.println(a+b);

        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.2");


        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));

        BigDecimal num3 = new BigDecimal("9.356789");
        System.out.println(num3.setScale(2, RoundingMode.UP));
        System.out.println(num3.setScale(2, RoundingMode.DOWN));



        //Class -> Muss nicht Immutable sein -> Hat die Möglichkeit Setter bereit zu stellen / bzw. Werte zu ändern.
        StudentC studentC = new StudentC("Max", "Muster", 45);

        studentC.getFirstName();
        studentC.getLastName();
        studentC.getAge();
        studentC.setLastName("Mustermann");
        System.out.println(studentC);

        //Record -> Ist Immutable, wir können nichts ändern!
        StudentR studentR = new StudentR("Max", "Muster", 45);
        studentR.firstName();
        studentR.lastName();
        studentR.age();
        studentR = new StudentR(studentR.firstName(), "Mustermann", studentR.age());
        System.out.println(studentR);
        StudentR student = new StudentR("Max", "Muster", 55);
        System.out.println(studentR.equals(student));
    }
}