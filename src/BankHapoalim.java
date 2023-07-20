import java.util.ArrayList;

public class BankHapoalim extends Bank{

    public BankHapoalim(int id, String name, int numberOfEmployees, double amountOfRevenue, double amountOfExpenses, ArrayList<Customer> customers) {
        super(id, name, numberOfEmployees, amountOfRevenue, amountOfExpenses, customers);
    }

    @Override
    public void takePayment(Customer customer, double payment) {
        if(customer.getBankName() == BankName.HAPOALIM){
            Utils.pay(customer,payment);
        }
    }

    @Override
    public void calculateCustomerMoney() {
        double sum = Utils.sumCustomersMoney(this.getCustomers());
        this.setAmountOfRevenue(this.getAmountOfRevenue() + sum);
    }
}
