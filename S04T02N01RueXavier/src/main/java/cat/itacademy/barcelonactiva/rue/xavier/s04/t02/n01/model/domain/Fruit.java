package cat.itacademy.barcelonactiva.rue.xavier.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")

public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "kilograms")
    private int kilograms;

    public Fruit() {}

    public Fruit(String name, int kilograms) {
        this.name = name;
        this.kilograms = kilograms;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kilograms=" + kilograms +
                '}';
    }
}
