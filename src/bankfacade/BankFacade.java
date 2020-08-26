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
 * @author sarun
 */
public class BankFacade {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomFacade facade = new CustomFacade();
        AccountIf account;
        
        System.out.println("------John-----");
        
        CustomerIf customer1 = facade.getBankCustomer("John");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer1.getCustomerName());
        System.out.println("Has " + customer1.getNumAccounts() + " accounts");
         
        account = facade.getBankAccount(customer1, 111111);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
       
        account = facade.getBankAccount(customer1, 67890);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        
        facade.doDeposit(800,customer1,67890);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
   
        ArrayList<AccountIf> accounts =  facade.getBankCustomer("John").getllAccounts();
         for(AccountIf accounted : accounts) {
            System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
    
    }
    
}
