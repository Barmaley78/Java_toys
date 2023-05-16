package org.example.View;

import org.example.Model.Toy;

import java.util.List;
import java.util.Scanner;

public class View {
    public int menu(){
        Scanner s = new Scanner(System.in);
        int choise = 0;
        boolean f = false;
        while(f == false){
            System.out.println("Выберите действие");
            System.out.println("1. Просмотреть содержимое склада");
            System.out.println("2. Изменить шанс выподения лота");
            System.out.println("3. Провести лотерею");
            System.out.println("4. Выдать призы");
            System.out.println("5. Выход");
            System.out.println("Ваш выбор ");
            choise = s.nextInt();
            if (choise < 1 || choise > 5){
                System.out.println("Неопределенное действие");
            }
            else {f = true;}
        }
        return choise;
    }

    public void showWarehouse (List<Toy> warehouse){
        System.out.println("На складе находится");
        System.out.println();
        for (Toy i: warehouse) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

}
