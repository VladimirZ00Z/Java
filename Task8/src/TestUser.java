import java.util.*;

public class TestUser {
    public static void main(String[] args) {
        User ivan = new User("Ivan");
        User petr = new User("Petr");
        User alex = new User("Alex");


        Map<User, Integer> map = new HashMap<>();
        map.put(ivan, 10);
        map.put(petr, 11);
        map.put(alex, 11);

        showUsers(map);

        System.out.println("Введите имя участника, баллы которого хотите узнать:");
        Scanner scan = new Scanner(System.in);
        String foundName = scan.nextLine();

        showScore(map, foundName);
    }

    private static void showScore(Map<User, Integer> map, String foundName) {
        Integer score = null;
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            if (pair.getKey().getName().equals(foundName)) {
                score = pair.getValue();
                break;
            }
        }
        System.out.println((score == null ? "Ошибка ввода или игрок не зарегестрирован" : "Участник набрал " + score));

    }

    public static void showUsers(Map<User, Integer> map) {
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            System.out.print(pair.getKey().getName() + ", ");
        }
        System.out.println("");
    }
}