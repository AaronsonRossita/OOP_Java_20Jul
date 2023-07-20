import java.util.ArrayList;

public abstract class Bank {

    private int id;
    private String name;
    private int numberOfEmployees;
    private double amountOfRevenue;
    private double amountOfExpenses;
    private ArrayList<Customer> customers;

    public Bank(int id, String name, int numberOfEmployees, double amountOfRevenue, double amountOfExpenses, ArrayList<Customer> customers) {
        this.id = id;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.amountOfRevenue = amountOfRevenue;
        this.amountOfExpenses = amountOfExpenses;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAmountOfRevenue() {
        return amountOfRevenue;
    }

    public void setAmountOfRevenue(double amountOfRevenue) {
        this.amountOfRevenue = amountOfRevenue;
    }

    public double getAmountOfExpenses() {
        return amountOfExpenses;
    }

    public void setAmountOfExpenses(double amountOfExpenses) {
        this.amountOfExpenses = amountOfExpenses;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

//    public void takePayment(Customer customer, double payment){
//        customer.setAmountOfMoney(customer.getAmountOfMoney()-payment);
//    }

    public abstract void takePayment(Customer customer, double payment);

    public void increaseRevenue(int revenueToAdd){
        this.amountOfRevenue += revenueToAdd;
    }

    public void increaseExpenses(double expensesToAdd){
        this.amountOfExpenses += expensesToAdd;
    }

    public abstract void calculateCustomerMoney();
}


//        ● increaseExpenses(int expensesToIncrease) - increase the
//        bank expenses by the amount passed as expensesToAdd


