import java.util.ArrayList;

public class Utils {

    private Utils(){}

    public static void pay(Customer customer, double payment){
        customer.setAmountOfMoney(customer.getAmountOfMoney() - payment);
    }

    public static double sumCustomersMoney(ArrayList<Customer> arr){
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).getAmountOfMoney();
        }
        return sum;
    }
}
