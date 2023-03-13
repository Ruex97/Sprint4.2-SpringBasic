package cat.itacademy.barcelonactiva.rue.xavier.s04.t02.n02.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {

    Fruit () {}

    public Fruit(String name, int kilograms) {
        this.name = name;
        this.kilograms = kilograms;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (length = 50)
    private String name;

    private int kilograms;

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
}