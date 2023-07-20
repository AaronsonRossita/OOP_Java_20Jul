public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private BankName bankName;
    private String ccNumber; // xxxx xxxx xxxx xxxx
    private double amountOfMoney;

    public Customer(int id, String firstName, String lastName, BankName bankName, String ccNumber, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankName = bankName;
        this.ccNumber = ccNumber;
        this.amountOfMoney = amountOfMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankName getBankName() {
        return bankName;
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}

