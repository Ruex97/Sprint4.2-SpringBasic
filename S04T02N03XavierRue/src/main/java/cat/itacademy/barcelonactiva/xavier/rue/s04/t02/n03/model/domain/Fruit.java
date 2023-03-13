package cat.itacademy.barcelonactiva.xavier.rue.s04.t02.n03.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "fruits")
public class Fruit {

    public static long counter = 0;

    @Id
    private long id;

    private String name;

    private int kilograms;

    public Fruit(String name, int kilograms) {
        this.id = ++counter;
        this.name = name;
        this.kilograms = kilograms;
    }

}

