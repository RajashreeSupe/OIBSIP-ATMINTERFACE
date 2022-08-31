import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptMenu extends Account {
	Scanner menuInput = new Scanner(System.in);

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();


	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {
				data.put(123456789, 1234);
				data.put(123456780, 1230);

				System.out.println("Welcome to the ATM Project!");

				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());

				System.out.print("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		} while (x == 1);
	}

	public void getAccountType() {
        { 
            int balance = 0, withdraw, deposit;  
            Scanner sc = new Scanner(System.in);  
            System.out.println("\n\t Enter the Account User name  : ");
            String Account= sc.nextLine();
            String TranferAccount;
              
            while(true)  
            {  
                System.out.println(" \n\t **********ATM INTERFACE**********"); 
    
                System.out.println(" \n\t 1 : Withdraw       ");  
                System.out.println(" \n\t 2 : Deposit        ");  
                System.out.println(" \n\t 3 : Check Balance  ");  
                System.out.println(" \n\t 4 : EXIT           ");
                System.out.print(  "\n\t   Choose the operation you want to perform  : "); 
                int choice = sc.nextInt();  
                System.out.println(".......................................................................................");
                switch(choice)  
                {  
                    case 1:  
                        System.out.println("userName: "+Account);
                        System.out.print("Enter money to be withdrawn: ");  
                        withdraw = sc.nextInt();  
                        if(balance >= withdraw)  
                        {  
                            balance = balance - withdraw;  
                            System.out.println("Please collect your money");  
                        }   
                        else  
                        {  
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");  
                        break;  
       
                    case 2:  
                        System.out.println("user Name: "+Account);
                        System.out.print("Enter money to be deposited: ");  
                        deposit = sc.nextInt();  
                        balance = balance + deposit;  
                        System.out.println("Your Money has been successfully depsited");  
                        System.out.println("");  
                        break;  
       
                    case 3: 
                        System.out.println("user Name: "+Account);
                        System.out.println("Balance : "+balance);  
                        System.out.println("");  
                        break;
                        
                    case 4: 
                        System.exit(0);  
                }  
            }  
        }  
    }  
}