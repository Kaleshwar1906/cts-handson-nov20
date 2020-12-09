package com.org;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws AccountExistsException, AccountNotFoundException {
		Scanner in=new Scanner(System.in);
		int option=0, f=0;
		Service service=new Service();
		do {
			System.out.println("1. Add an account");
			System.out.println("2. Remove account by account number");
			System.out.println("3. Display account by account number");
			System.out.println("4. Display all the accounts");
			System.out.println("5. Display account numbers having account numbers less than Rs. 1000");
			System.out.println("6. exit");
			
			int n=in.nextInt();
			
			switch(n){
			case 1:{
				System.out.println("Enter the account number");
				int a=in.nextInt();
				System.out.println("Enter the name of the customer");
				String b=in.next();
				System.out.println("Enter the balance");
				int c=in.nextInt();
				Account ob=new Account(a,b,c);
				try {
					service.addAccount(ob);
				}
				catch(AccountExistsException e) {
					e.printStackTrace();
				}
				break;
			}
			case 2:{
				System.out.println("Enter the accountNumber of the account to be removed");
				int a=in.nextInt();
				try {
					service.removeAccount(a);
					System.out.println("Removed the account");
				}
				catch(AccountNotFoundException e) {
					e.printStackTrace();
				}
				break;
			}
			case 3:{
				System.out.println("Enter the accountNumber of the account to be displayed");
				int a=in.nextInt();
				try {
					Account ob=service.search(a);
					System.out.println("Account [accountNumber= "+ob.getAccountNumber()+" Name= "+ob.getName()+" Balance="+ob.getBalance()+"]");
				}
				catch(AccountNotFoundException e) {
					e.printStackTrace();
				}
				break;
			}
			case 4:{
				List<Account> list =service.display();
				list.forEach(acc->System.out.println(acc));
				break;
			}
			case 5:{
				List<Account> list =service.specificDisplay();
				if(list.size()>0)
				list.forEach(acc->System.out.println(acc));
				else
					System.out.println("No account holder with balance less than Rs.1000");
				break;
			}
			case 6:{
				f=1;
				System.out.println("Thank You for accessing the application");
				break;
			}
			default:
			{
				System.out.println("Invalid option, Enter the correct option");
			}
			}
		}while(f==0);
	}

}
