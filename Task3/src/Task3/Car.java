package Task3;

public class Car {
    private String color;
    private String brand;
    private int weight;

    public Car(String c, String b, int w) {
        color = c;
        brand = b;
        weight = w;
    }

    //Вывод цвета
    public String result(String c) {
        String partialInfoC = "Цвет :" + c + ".";
        return partialInfoC;
    }

    //Вывод цвета и веса
    public String result(String c, int w) {
        String partialInfoCW = "Цвет: " + c + ", вес: " + w + ".";
        return partialInfoCW;
    }

    //Вывод пустого поля
    public void result() {
        System.out.println("Пустой конструктор");
    }

    //Вывод всей информации
    public String showfullInfo() {
        String fullInfo = "Цвет: " + color + ", марка " + brand + ", вес " + weight;
        return fullInfo;
    }
}