package Task3;

import java.util.Scanner;
public class House {
    private int floorsCount;
    protected int constructionDate;
    private String houseName;

    public void setAllParameters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число этажей");
        floorsCount = scanner.nextInt();

        System.out.println("Введите год постройки");
        constructionDate = scanner.nextInt();

        System.out.println("Введите название дома");
        houseName = scanner.next();
    }

    public void showAllParameters(){
        System.out.println("Количество этажей в доме " + floorsCount);
        System.out.println("Год посотройки дома " + constructionDate);
        System.out.println("Название дома " + houseName);
    }

    //Подсчёт лет, прошедших с момента постройки дома
    public int houseAgeCount (int a, int b){
        int result = b - a;
        return result;
    }
}
