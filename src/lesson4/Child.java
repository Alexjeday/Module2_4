package lesson4;

import java.util.Objects;

public class Child {
    private String firstName;
    private String lastName;
    private int yearBirth;

    public Child(String firstName, String lastName, int yearBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(firstName, child.firstName) && Objects.equals(lastName, child.lastName) && Objects.equals(yearBirth, child.yearBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, yearBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    @Override
    public String toString() {
        return "Child{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearBirth=" + yearBirth +
                '}';
    }
}
