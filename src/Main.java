import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1,"A","AA",BankName.LEOMI,"1234",100);
        Customer c2 = new Customer(2,"B","BB",BankName.LEOMI,"1234",200);
        Customer c3 = new Customer(3,"C","CC",BankName.LEOMI,"1234",300);
        Customer c4 = new Customer(4,"D","DD",BankName.HAPOALIM,"1234",100);
        Customer c5 = new Customer(5,"E","EE",BankName.HAPOALIM,"1234",200);
        Customer c6 = new Customer(6,"F","FF",BankName.HAPOALIM,"1234",300);
        Customer c7 = new Customer(7,"G","GG",BankName.DISKONT,"1234",100);
        Customer c8 = new Customer(8,"H","HH",BankName.DISKONT,"1234",200);
        Customer c9 = new Customer(9,"I","II",BankName.DISKONT,"1234",300);

        ArrayList<Customer> lc = new ArrayList<>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);

        ArrayList<Customer> hc = new ArrayList<>();
        hc.add(c4);
        hc.add(c5);
        hc.add(c6);

        ArrayList<Customer> dc = new ArrayList<>();
        dc.add(c7);
        dc.add(c8);
        dc.add(c9);



        BankLeomi leomi = new BankLeomi(1,"TLV",100,10000,2000,lc);
        BankHapoalim hapoalim = new BankHapoalim(2,"TLV",100,8000,1000,hc);
        BankDiskont diskont = new BankDiskont(3,"TLV",100,100000,2000,dc);


    }



}