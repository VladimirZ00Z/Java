package Task2;

public class Cat {
    private String name; //Кличка
    private String breed; //Порода
    private String furColor; //Окрас шерсти
    private int age; // Возраст
    private double height; //Рост в холке
    private double weight; //Вес

    public Cat(String name, String breed, String furColor, int age, double height, double weight) {
        this.name = name;
        this.breed = breed;
        this.furColor = furColor;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Cat() {
    }

    public void CatShortInfo() {
        name = "Undefined";
        breed = "Undefined";
        furColor = "Undefined";
        System.out.println("Кличка: " + name + "Порда: " + breed + "окрас шерсти: " + furColor);
    }

    public void catFullInfo(String n, String b, String f, int a, double h, double w) {
        name = n;
        breed = b;
        furColor = f;
        age = a;
        height = h;
        weight = w;

        System.out.println("Кличка: " + n + "\n");
        System.out.println("Порода: " + b + "\n");
        System.out.println("Окрас шерсти: " + f + "\n");
        if (a <= 30) {
            System.out.println("Возраст: " + a + "\n");
        }
        if (a > 30) {
            System.out.println("Столько не живут!\n");
        }
        System.out.println("Рост в холке: " + h + "см.\n");
        System.out.println("Вес: " + w + "кг.\n");
    }
}
