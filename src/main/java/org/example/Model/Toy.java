package org.example.Model;

public class Toy {
    public int id;
    public String name;
    public int quantity;
    public int chance;

    public Toy(int id, String name, int quantity, int chance) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", наименование = " + name +
                ", количество = " + quantity +
                ", шанс выпадения = " + chance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
