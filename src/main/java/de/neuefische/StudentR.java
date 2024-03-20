package de.neuefische;

import java.util.Objects;

//Records können interfaces implementieren, aber nicht von Klassen erben oder Ihr Verhalten vererben!
//Release Java 14
public record StudentR(String firstName, String lastName, int age) {

}
