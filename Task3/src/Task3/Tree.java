package Task3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    Tree(int a, String n){
        age = a;
        name = n;
        System.out.println("Возраст и название дерева:" + "\n Age = " + age + "\n Name = " + name + "\n");
    }

    Tree(int a, boolean i, String n){
        age = a;
        isAlive = i;
        name = n;
        System.out.println("Возраст дерева, его сотстояние и имя:" + "\n Age = " + age + "\n isLive = " + isAlive + "\n Name = " + name + "\n");
    }

    Tree(){
        System.out.println("\n Пустой конструктор \n");
    }
}
