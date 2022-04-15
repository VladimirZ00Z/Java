package Ex6;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Владимир", "Саталкин", "Спб");
        BankEmployee employee = new BankEmployee("Владислав", "Иванов", "Альфа-банк");
        System.out.println("Клиент");
        System.out.println(client.getFirstName());
        System.out.println(client.getLastName());
        System.out.println(client.getBankName());
        System.out.println(client.getAllInfo());
        System.out.println("Работник");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getBankName());
        System.out.println(employee.getAllInfo());
        System.out.println("infoPerson");
        infoPerson(client);
        infoPerson(employee);
    }

    public static void infoPerson(Person person) {
        System.out.println(person.getBankName());
        System.out.println(person.getAllInfo());
    }
}
