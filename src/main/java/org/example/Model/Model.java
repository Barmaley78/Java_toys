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
            if (i.id == id) {
                i.chance = chance;
                flag = true;
            }
        }
        if (flag == true) { System.out.println("Изменения внесены "); }
        else { System.out.println("На складе нет позиции с таким номером"); }
    }

    public int getMaximumId (){
        int res = -1;
        for (Toy i: warehouse) {
            if (i.id > res) {
                res = i.id;
            }
        }
        return res;
    }

    public int getMinimumId (){
        int res = 10000;
        for (Toy i: warehouse) {
            if (i.id < res) {
                res = i.id;
            }
        }
        return res;
    }

    public void startLotery(){
        Toy t = new Toy();
        int min = getMinimumId();
        int max = getMaximumId()+1 -min;
        int tempId = (int) (Math.random() * max) + min;
        int prizeId = (int) (Math.random() * tempId);
        boolean flag = false;
        for (Toy i: warehouse){
            if (i.id == prizeId){
                int lotery = (int) (Math.random()*100);
                if (i.chance+lotery >=80){
                    t = i;
                    t.quantity = 1;
                    winLots.add(t);
                    flag = true;
                    System.out.println("Был разыгран приз - " + i.name);
                }
            }
        }
        if (flag == false) System.out.println("В розыгрыше нет победителя");
    }

    public void finalizingLotery(){
        Toy t = new Toy();
        for(Toy i: warehouse){
            for (Toy j: winLots){
                if (i.id == j.id) i.quantity = i.quantity - j.quantity;
            }
        }
        for(Toy i: warehouse) {
            if (i.quantity == 0) t = i;

        }
        winLots.clear();
        }


}
