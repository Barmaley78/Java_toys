package org.example.Model;

import java.util.ArrayList;
import java.util.List;
public class Model {
    List<Toy> warehouse = new ArrayList<>();
    List<Toy> winLots = new ArrayList<>();

    public void fillWarehouse(Toy toy){
            warehouse.add(toy);
    }
    public List<Toy> getWarehouse() {return warehouse; }

    public void changeLotChance(int id, int chance){
        boolean flag = false;
        for (Toy i: warehouse) {
            if (i.id == id) { i.chance = chance; flag = true; }
        if (flag == true) {

        }
        else {
            System.out.println("На складе нет позиции с таким номером");
        }

        }
    }
}
