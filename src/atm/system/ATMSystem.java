/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.system;
import java.util.Scanner;

/**
 *
 * @author Nwanwobi Samuel
 */
public class ATMSystem {
    
    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atm();
        // TODO code application logic here
    }
    
    public static void activity(){
        System.out.println("What do you want to do? ");
        System.out.println("1 Withdraw");
        System.out.println("2 Transfer");
        System.out.println("3 Check balnce");
    }
    
    public static void transfer(){
        System.out.println("Select your bank: ");
        System.out.println("1 This bank ");
        System.out.println("2 Other bank ");
    }
    
    public static void displayAccount(){
        System.out.println("Choose Your Account Type: ");
        System.out.println("1 Savings Account");
        System.out.println("2 Current Account");   
    }
    
    public static void displayAmount(){
        System.out.println("Select withdrawal amount: ");
        System.out.println("1 500");
        System.out.println("2 1000");
        System.out.println("3 2000");
        System.out.println("4 5000");
        System.out.println("5 10000");
    }
  
    
    public static void Atm(){
        int balance = 2000;
        int pin = 4040;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        int input_pin = input.nextInt();
        if (input_pin == pin){
            activity();
            int act = input.nextInt();
            switch(act){
                case 1:
                    displayAccount();
                    int acct = input.nextInt();
                    switch(acct){
                        case 1:
                            displayAmount();
                            int amt = input.nextInt();
                            switch(amt){
                                case 1:
                                    balance = balance - amt;
                                    System.out.println("Please collect your money");
                                    System.out.println(balance);
                                    break;

                                case 2:
                                    balance = balance - amt;
                                    System.out.println("Please collect your money");
                                    System.out.println(balance);
                                    break;

                                case 3:
                                    balance = balance - amt;
                                    System.out.println("Please collect your money");
                                    System.out.println(balance);
                                    break;

                                case 4:
                                    System.out.println("Insufficient balance");
                                    break;

                                case 5:
                                    System.out.println("Insufficient balance");
                                    break;
                    }
                
                        case 2:
                            displayAmount();
                            int amt2 = input.nextInt();
                            switch (amt2){
                                case 1:
                                    balance = balance - amt2;
                                    System.out.println("Please collect your money");
                                    System.out.println(balance);
                                    break;

                                case 2:
                                    balance = balance - amt2;
                                    System.out.println("Please collect your money");
                                    System.out.println(balance);
                                    break;

                                case 3:
                                    balance = balance - amt2;
                                    System.out.println("Insufficient balnce");
                                    System.out.println(balance);
                                    break;

                                case 4:
                                    System.out.println("Insufficient balance");
                                    break;

                                case 5:
                                    System.out.println("Insufficient balance");
                                    break;
                    }
           }
                case 2:
                    transfer();
                    int trans = input.nextInt();
                    switch(trans){
                        case 1:
                            System.out.println("Enter recepient's account number: ");
                            int acctno = input.nextInt();
                            System.out.println("Enter amount: ");
                            int trans_amt = input.nextInt();
                            if (trans_amt < balance){
                                balance = balance - trans_amt;
                                System.out.println(balance);
                            } else {
                                System.out.println("Insufficient funds");
                            }
                            break;
                     
                        case 2:
                            System.out.println("Enter recepient's account number: ");
                            int acctno1 = input.nextInt();
                            System.out.println("Enter amount: ");
                            int trans_amt1 = input.nextInt();
                            if (trans_amt1 < balance){
                                balance = balance - trans_amt1;
                                System.out.println(balance);
                            } else {
                                System.out.println("Insufficient funds");
                            }
                            break;
                    }   
                case 3:
                    System.out.println(balance);
            }
        }
        else{
            System.out.println("Incorrect pin");
        }
    }
    
}
