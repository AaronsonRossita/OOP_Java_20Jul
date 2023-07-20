import java.util.ArrayList;

public class BankDiskont extends Bank{
    public BankDiskont(int id, String name, int numberOfEmployees, double amountOfRevenue, double amountOfExpenses, ArrayList<Customer> customers) {
        super(id, name, numberOfEmployees, amountOfRevenue, amountOfExpenses, customers);
    }

    @Override
    public void takePayment(Customer customer, double payment) {
        if(customer.getBankName() == BankName.DISKONT){
            Utils.pay(customer,payment);
        }
    }

    @Override
    public void calculateCustomerMoney() {
        double sum = Utils.sumCustomersMoney(this.getCustomers());
        this.setAmountOfRevenue(sum);
    }
}
