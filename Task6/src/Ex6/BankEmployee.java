package Ex6;

public class BankEmployee extends Person {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getAllInfo() {
        return "Имя работника: " + getFirstName() + "\nФамилия работника: " + getLastName() + "\nНазвание банка: " + bankName;
    }
}
