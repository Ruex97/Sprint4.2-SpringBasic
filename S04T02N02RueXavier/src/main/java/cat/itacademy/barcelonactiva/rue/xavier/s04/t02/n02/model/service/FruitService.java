package cat.itacademy.barcelonactiva.rue.xavier.s04.t02.n02.model.service;

import cat.itacademy.barcelonactiva.rue.xavier.s04.t02.n02.model.domain.Fruit;
import cat.itacademy.barcelonactiva.rue.xavier.s04.t02.n02.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit createFruit(Fruit fruit) {
        return fruitRepository.save(new Fruit(fruit.getName(), fruit.getKilograms()));
    }

    public Fruit updateFruit(long id, Fruit fruit) {
        Optional<Fruit> fruitData = fruitRepository.findById(id);

        if (fruitData.isPresent()) {
            Fruit myFruit = fruitData.get();
            myFruit.setName(fruit.getName());
            myFruit.setKilograms(fruit.getKilograms());
            return fruitRepository.save(myFruit);
        } else {
            return null;
        }
    }

    public void deleteFruit(long id) {
        fruitRepository.deleteById(id);
    }

    public Fruit getFruitById(long id) {
        Optional<Fruit> fruitData = fruitRepository.findById(id);

        if (fruitData.isPresent()) {
            return fruitData.get();
        } else {
            return null;
        }
    }

    public List<Fruit> getAllFruits() {
        List<Fruit> fruitList = new ArrayList<Fruit>();
        fruitRepository.findAll().forEach(fruitList::add);

        return fruitList;
    }

}