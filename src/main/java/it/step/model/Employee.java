package it.step.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    private final static long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(length=70)
    private String name;
    @Column(length=70)
    private String surname;
    @Column
    private LocalDate birthdate;



    public Employee(int id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Employee(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}


