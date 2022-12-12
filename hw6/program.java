package hw6;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Notebook note1 = new Notebook(1, "Asus", "Windows", "silver", 8, 128, 15);
        Notebook note2 = new Notebook(2, "Lenovo", "noOS", "black", 16, 256, 13);
        Notebook note3 = new Notebook(3, "Dell", "Linux", "silver", 32, 128, 16);
        Notebook note4 = new Notebook(4, "Dell", "Windows", "red", 16, 512, 15);
        Notebook note5 = new Notebook(5, "Asus", "Linux", "silver", 8, 256, 17);
        Notebook note6 = new Notebook(6, "Acer", "noOS", "silver", 8, 512, 14);
        Notebook note7 = new Notebook(7, "HP", "Windows", "blue", 32, 128, 15);
        Notebook note8 = new Notebook(8, "Lenovo", "Windows", "black", 8, 256, 16);
        Notebook note9 = new Notebook(9, "Acer", "Windows", "white", 16, 512, 17);
        Notebook note10 = new Notebook(10, "Apple", "MacOS", "silver", 32, 512, 13);

        Notebook[] notebooks = new Notebook[] { note1, note2, note3, note4, note5, note6, note7, note8, note9, note10 };

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "\nВведите цифру, соответствующую параметру фильтрации:\n1 - бренд\n2 - операционная система\n3 - цвет\n4 - объем оперативной памяти\n5 - объем внутреннего хранилища\n6 - диагональ экрана\nнажмите <enter> для выхода из программы\n\nВведите ваш выбор: ");
            String a = sc.nextLine();
            if (a.equals("")) {
                break;
            } else if (a.equals("1")) {
                System.out.printf(
                        "\nВведите цифру, соответствующую названию бренда:\n1 - Apple\n2 - Acer\n3 -  Asus\n4 -  Dell\n5 -  HP\n6 -  Lenovo\n\nВведите ваш выбор: ");
                String b = sc.nextLine();
                String brand = "";
                if (b.equals("1")) brand = "Apple"; 
                else if (b.equals("2")) brand = "Acer";
                else if (b.equals("3")) brand = "Asus";
                else if (b.equals("4")) brand = "Dell";
                else if (b.equals("5")) brand = "HP";
                else if (b.equals("6")) brand = "Lenovo";
                System.out.printf("\nНоутбуки бренда %s:\n\n", brand);
                System.out.println(Notebook.getNotebooksByParam(notebooks, brand));

            } else if (a.equals("2")) {
                System.out.printf(
                        "\nВведите цифру, соответствующую названию операционной системы:\n1 - MacOS\n2 - noOS (без ОС)\n3 -  Windows\n\nВведите ваш выбор: ");
                String b = sc.nextLine();
                String os = "";
                if (b.equals("1")) os = "MacOS"; 
                else if (b.equals("2")) os = "noOS";
                else if (b.equals("3")) os = "Windows";

                System.out.printf("\nНоутбуки с операционной системой %s:\n", os);
                System.out.println(Notebook.getNotebooksByParam(notebooks, os));

            } else if (a.equals("3")) {
                System.out.printf(
                        "\nВведите цифру, соответствующую названию цвета:\n1 - black\n2 - blue\n3 -  red\n4 -  silver\n5 -  white\n\nВведите ваш выбор: ");
                String b = sc.nextLine();
                String color = "";
                if (b.equals("1")) color = "black"; 
                else if (b.equals("2")) color = "blue";
                else if (b.equals("3")) color = "red";
                else if (b.equals("4")) color = "silver";
                else if (b.equals("5")) color = "white";
                System.out.printf("\nНоутбуки цвета %s:\n", color);
                System.out.println(Notebook.getNotebooksByParam(notebooks, color));

            } else if (a.equals("4")) {
                System.out.printf("\nВведите минимальное значение объема оперативной памяти: ");
                String b = sc.nextLine();
                int min = Integer.parseInt(b);
                System.out.printf("\nВведите максимальное значение объема оперативной памяти: ");
                String c = sc.nextLine();
                int max = Integer.parseInt(c);
                System.out.printf("\nНоутбуки с объемом оперативной памяти от %d до %d:\n", min, max);
                System.out.println(Notebook.getNotebooksByRAM(notebooks, max, min));

            } else if (a.equals("5")) {
                System.out.printf("\nВведите минимальное значение объема внутреннего хранилища: ");
                String b = sc.nextLine();
                int min = Integer.parseInt(b);
                System.out.printf("\nВведите максимальное значение объема внутреннего хранилища: ");
                String c = sc.nextLine();
                int max = Integer.parseInt(c);
                System.out.printf("\nНоутбуки с объемом внутреннего хранилища от %d до %d:\n", min, max);
                System.out.println(Notebook.getNotebooksByHD(notebooks, max, min));

            } else if (a.equals("6")) {
                System.out.printf("\nВведите минимальное значение размера диагонали экрана: ");
                String b = sc.nextLine();
                int min = Integer.parseInt(b);
                System.out.printf("\nВведите максимальное значение размера диагонали экрана: ");
                String c = sc.nextLine();
                int max = Integer.parseInt(c);
                System.out.printf("\nНоутбуки с диагональю экрана от %d до %d:\n", min, max);
                System.out.println(Notebook.getNotebooksByDiagonal(notebooks, max, min));

            }

        }

        sc.close();

        // System.out.println(Notebook.getNotebooksByBrand(notebooks, "Lenovo"));
    }
}