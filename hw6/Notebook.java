package hw6;

public class Notebook {
    int id;
    String brand, os, color;
    int ram, hd, diagonal;

    public Notebook(int id, String brand, String os, String color, int ram, int hd, int diagonal) {
        this.id = id;
        this.brand = brand;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.hd = hd;
        this.diagonal = diagonal;
    }

    public String toString(int number) {
        return "Notebook's number: " + number + "\n" +
                "id: " + id + "\n" +
                "Brand: " + brand + "\n" +
                "OS: " + os + "\n" +
                "Color: " + color + "\n" +
                "RAM: " + ram + "\n" +
                "HD: " + hd + "\n" +
                "Diagonal: " + diagonal + "\n";
    }

    public static StringBuilder getNotebooksByParam(Notebook[] notebooks, String par) {
        StringBuilder result = new StringBuilder();
        for (Notebook n : notebooks) {
            if (n.brand == par) {
                result.append("Операционная система: ");
                result.append(n.os);
                result.append(" \n");
                result.append("Цвет: ");
                result.append(n.color);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n\n");
            } else if (n.os == par) {
                result.append("\nБренд: ");
                result.append(n.brand);
                result.append(" \n");
                result.append("Цвет: ");
                result.append(n.color);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n\n");
            } else if (n.color == par) {
                result.append("\nБренд: ");
                result.append(n.brand);
                result.append(" \n");
                result.append("Операционная система: ");
                result.append(n.os);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n\n");
            }

        }
        return result;
    }

    public static StringBuilder getNotebooksByRAM(Notebook[] notebooks, int max, int min) {
        StringBuilder result = new StringBuilder();
        for (Notebook n : notebooks) {
            if (n.ram >= min && n.ram <= max) {
                result.append("\nБренд: ");
                result.append(n.brand);
                result.append(" \n");
                result.append("Операционная система: ");
                result.append(n.os);
                result.append(" \n");
                result.append("Цвет: ");
                result.append(n.color);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n");
            }  
        }
        return result;
    }

    public static StringBuilder getNotebooksByHD(Notebook[] notebooks, int max, int min) {
        StringBuilder result = new StringBuilder();
        for (Notebook n : notebooks) {
            if (n.hd >= min && n.ram <= max) {
                result.append("\nБренд: ");
                result.append(n.brand);
                result.append(" \n");
                result.append("Операционная система: ");
                result.append(n.os);
                result.append(" \n");
                result.append("Цвет: ");
                result.append(n.color);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n");
            }  
        }
        return result;
    }

    public static StringBuilder getNotebooksByDiagonal(Notebook[] notebooks, int max, int min) {
        StringBuilder result = new StringBuilder();
        for (Notebook n : notebooks) {
            if (n.diagonal >= min && n.diagonal <= max) {
                result.append("\nБренд: ");
                result.append(n.brand);
                result.append(" \n");
                result.append("Операционная система: ");
                result.append(n.os);
                result.append(" \n");
                result.append("Цвет: ");
                result.append(n.color);
                result.append(" \n");
                result.append("Объем оперативной памяти: ");
                result.append(n.ram);
                result.append(" гБ\n");
                result.append("Объем внутреннего хранилища: ");
                result.append(n.hd);
                result.append(" гБ\n");
                result.append("Диагональ экрана: ");
                result.append(n.diagonal);
                result.append(" дюймов\n");
            }  
        }
        return result;
    }

}
