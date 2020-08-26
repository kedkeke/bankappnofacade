/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author kedkeke
 */
public class CustomFacade {
    private ArrayList<CustomerIf> customers = new ArrayList();
    
    public CustomFacade(){
        //customet1
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(111111);
       acc.deposit(300);
       cust1Accounts.add(acc);
       acc = new BankAccount(67890);
       acc.deposit(1000);
       cust1Accounts.add(acc);
       CustomerIf customer1 = new BankCustomer("John", cust1Accounts);
       customers.add(customer1);
       
       //customer 2
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       acc = new BankAccount(22222);
       acc.deposit(700);
       cust1Accounts.add(acc);
       acc = new BankAccount(12345);
       acc.deposit(3000);
       cust1Accounts.add(acc);
       CustomerIf customer2 = new BankCustomer("Hun", cust2Accounts);
       customers.add(customer2);
    }
    
    public void doDeposit(double amt, CustomerIf cust, int accNo){
        cust.getAccount(accNo).deposit(amt);
    }

    public AccountIf getBankAccount(CustomerIf cust, int accNo){
        return cust.getAccount(accNo);
    }

    public CustomerIf getBankCustomer(String custName){
        for(CustomerIf cus : customers){
            if(cus.getCustomerName().equals(custName)){
               return cus;
            }
        }
        return null;
    }
}
