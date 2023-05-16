package org.example.Controller;

import org.example.Model.Model;
import org.example.Model.Toy;
import org.example.View.View;

import java.util.Scanner;

public class Controller {
    public void start(){
        Scanner s = new Scanner(System.in);

        View view = new View();
        Model model = new Model();
        model.fillWarehouse(new Toy(1, "ball", 10, 20));
        model.fillWarehouse(new Toy(2, "constructor", 5, 5));
        model.fillWarehouse(new Toy(3, "doll", 20, 15));
        model.fillWarehouse(new Toy(4, "twister", 10, 5));


        int choise = 1;
        while(choise !=5) {
            choise = view.menu();
            switch (choise) {
                case 1:
                    view.showWarehouse(model.getWarehouse());
                    break;
                case 2:
                    view.showWarehouse(model.getWarehouse());
                    System.out.println("Введите номер позиции для изменения шанса выпадения ");
                    int id = s.nextInt();
                    System.out.println("Введите новое значение шанса выпадения ");
                    int chance = s.nextInt();
                    model.changeLotChance(id, chance);
                    break;
                case 3:
                    model.startLotery();
                    break;
                case 4:
                    view.showWarehouse(model.getWarehouse());

                    System.out.println("После выдачи призов на складе осталось ");
                    view.showWarehouse(model.getWarehouse());


                    break;
            }
        }
    }
}
