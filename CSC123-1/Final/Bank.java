// Hugo Noyola (hnoyola1@toromail.csudh.edu)

import java.util.Scanner;
import java.util.*;

public class Bank extends Object{
	static List<String> Fname = new ArrayList<>();
	static List<String> Lname = new ArrayList<>();
	static List<String> Birthday = new ArrayList<>();
	static List<Integer> SSN = new ArrayList<>();
	static List<String> Address = new ArrayList<>();
	static List<Integer> Age = new ArrayList<>();
	static List<String> Open = new ArrayList<>();
	static List<String> Types = new ArrayList<>();
	static List<String> Statements = new ArrayList<>();
	static List<Integer> Overdraft = new ArrayList<>();
	static List<Double> Balance = new ArrayList<>();
	static List<String> Accounts = new ArrayList<>();
	private static int acc_counter = 0;
	private static int stat_counter = 0;
	
	
	public Bank(List fname,List lname, List birthday, List sSN, 
			List address, List age, List open, List types, List statements,
			List overdraft, List balance) {

		this.Fname = fname;
		this.Lname =lname;
		this.Birthday = birthday;
		this.SSN = sSN;
		this.Address = address;
		this.Age = age;
		this.Open = open;
		this.Types = types;
		this.Statements = statements;
		this.Overdraft = overdraft;
		this.Balance = balance;
	}
	

	public static void main(String[] args) {
		int choice = 0;
		while (choice != 8) {
			Scanner option = new Scanner(System.in);
			System.out.println("1 - Open a Checking account");
			System.out.println("2 - Open Saving Account");
			System.out.println("3 - List Accounts");
			System.out.println("4 - Account statement");
			System.out.println("5 - Deposit funds");
			System.out.println("6 - Withdraw funds");
			System.out.println("7 - Close an account");
			System.out.println("8 - Exit");
			
			
			try {
			int check = option.nextInt();
			choice = check;
			}catch(Exception e) {
			}
			
			if(choice == 1) {
				Scanner namef = new Scanner(System.in);
				System.out.println("Enter first name: ");
				String fame = namef.next();
				
				Scanner namel = new Scanner(System.in);
				System.out.println("Enter last name: ");
				String lame = namef.next();
				
				while (true) {
					Scanner social = new Scanner(System.in);
					System.out.println("Enter SSN: ");
					try {
						int so = social.nextInt();
						SSN.add(acc_counter,so);
						break;
					}catch(Exception e) {
						System.out.println("Input is not a number, continue");
					}
				}
				
				Scanner DOB = new Scanner(System.in);
				System.out.println("Enter your Date of Birth: ");
				String dio = DOB.next();
				
				while (true) {
					Scanner ag = new Scanner(System.in);
					System.out.println("Enter your age: ");
					try {
						int ega = ag.nextInt();
						Age.add(acc_counter,ega);
						break;
					}catch(Exception e) {
						System.out.println("Input is not a number, continue");
					}
				}
				if(Age.get(acc_counter) < 16) {
					System.out.println("Sorry, but those under the age of 16 are not allowed to open a checking account");
				} else if(Age.get(acc_counter) < 18) {
					Fname.add(acc_counter,fame);
					Lname.add(acc_counter,lame);
					Birthday.add(acc_counter,dio);
					Open.add(acc_counter, "Open");
					Types.add(acc_counter, "Checking");
					Balance.add(acc_counter,0.00);
					
					
					Accounts.add(acc_counter+"("+Types.get(acc_counter)+") : " +Fname.get(acc_counter)+
							" : "+Lname.get(acc_counter)+" : "+ Birthday.get(acc_counter)+" : "
							+SSN.get(acc_counter)+" : "+Balance.get(acc_counter)+" : Account "+Open.get(acc_counter)+ "\n");
					
					System.out.println("Sorry due to your age you are to young to qualify for our Overdraft program but you still are able to have a Checking account.");
					System.out.println("Your Account number is : "+ acc_counter);
					acc_counter++;
				} else {
					Fname.add(acc_counter,fame);
					Lname.add(acc_counter,lame);
					Birthday.add(acc_counter,dio);
					Open.add(acc_counter, "Open");
					Types.add(acc_counter, "Checking");
					Balance.add(acc_counter,0.00);
					while (true) {
						Scanner od = new Scanner(System.in);
						System.out.println("Enter overdraft Limit: ");
						try {
							int all = od.nextInt();
							Overdraft.add(acc_counter,all);
							break;
						}catch(Exception e) {
							System.out.println("Input is not a number, continue");
						}
					}
					Accounts.add(acc_counter+"("+Types.get(acc_counter)+") : " +Fname.get(acc_counter)+
							" : "+Lname.get(acc_counter)+" : "+ Birthday.get(acc_counter)+" : "
							+SSN.get(acc_counter)+" : "+Balance.get(acc_counter)+" : Account "+Open.get(acc_counter)+ "\n");
					
					System.out.println("Your Account number is : "+ acc_counter);
					acc_counter++;
				}
			}else if (choice == 2) {
				Scanner namef = new Scanner(System.in);
				System.out.println("Enter first name: ");
				String fame = namef.next();
				
				Scanner namel = new Scanner(System.in);
				System.out.println("Enter last name: ");
				String lame = namef.next();
				
				while (true) {
					Scanner social = new Scanner(System.in);
					System.out.println("Enter SSN: ");
					try {
						int so = social.nextInt();
						SSN.add(acc_counter,so);
						break;
					}catch(Exception e) {
						System.out.println("Input is not a number, continue");
					}
				}
				
				Scanner DOB = new Scanner(System.in);
				System.out.println("Enter your Date of Birth: ");
				String dio = DOB.next();
				
				while (true) {
					Scanner ag = new Scanner(System.in);
					System.out.println("Enter your age: ");
					try {
						int ega = ag.nextInt();
						Age.add(acc_counter,ega);
						break;
					}catch(Exception e) {
						System.out.println("Input is not a number, continue");
					}
				}
				if(Age.get(acc_counter)< 5) {
					System.out.println("Sorry, but those under the age of 5 are not allowed to open a Savings account");
				}else {
					Fname.add(acc_counter,fame);
					Lname.add(acc_counter,lame);
					Birthday.add(acc_counter,dio);
					Open.add(acc_counter, "Open");
					Types.add(acc_counter, "Saving");
					Balance.add(acc_counter,0.00);
					Overdraft.add(acc_counter,0);
				
				
					Accounts.add(acc_counter+"("+Types.get(acc_counter)+") : " +Fname.get(acc_counter)+
							" : "+Lname.get(acc_counter)+" : "+ Birthday.get(acc_counter)+" : "
							+SSN.get(acc_counter)+" : "+Balance.get(acc_counter)+" : Account "+Open.get(acc_counter)+ "\n");
				
				System.out.println("Your Account number is : "+ acc_counter);
		
				acc_counter++;
				}
			}else if (choice == 3) {
				for (int i = 0; i < Accounts.size(); i++) {
					System.out.print(Accounts.get(i));
				}
			}else if (choice == 4) {
				
			}else if (choice == 5) {
				while (true) {
					Scanner check = new Scanner(System.in);
					System.out.println("Enter account number: ");
					try {
						int e = check.nextInt();
						if (Open.get(e) == "Closed" && Balance.get(e) >= 0.00) {
							System.out.println("Deposit failed, the balance is: "+ Balance.get(e));
						}else {

							while (true) {
								Scanner depo = new Scanner(System.in);
								System.out.println("Enter the ammount to deposit: ");
								try {
									Double also = depo.nextDouble();
									Double tot = Balance.get(e) + also;
									Balance.set(e,tot);
									break;
								}catch(Exception r) {
									System.out.println("Input is not a valid Double");
								}
							}
							System.out.println("Deposit successful, the balance is: "+ Balance.get(e));
						}
						break;
					}catch(Exception e) {
						System.out.println("Account not found");
						break;
					}
				}
			}else if (choice == 6) {
				
				while (true) {
					Scanner check = new Scanner(System.in);
					System.out.println("Enter account number: ");
					try {
						int e = check.nextInt();
						while (true) {
							Scanner with = new Scanner(System.in);
							System.out.println("Enter the ammount to withdraw: ");
							try {
								Double also = with.nextDouble();
								if (Open.get(e) == "Closed" && (Balance.get(e)-also) < 0.00) {
									Double tot = Balance.get(e) - also;
									Balance.set(e,tot);
	
								} else if (Open.get(e) == "Open" && also <= (Balance.get(e)+Overdraft.get(e))) {
								Double tot = Balance.get(e) - also;
								Balance.set(e,tot);
								} else {
									System.out.println("Deposit failed, the balance is: "+ Balance.get(e));
								}
								break;
							}catch(Exception r) {
								System.out.println("Input is not a valid Double");
							}
						}
						break;
					}catch(Exception e) {
						System.out.println("Account not found");
						break;
					}
				}
				
			}else if (choice == 7) {
				while (true) {
					Scanner check = new Scanner(System.in);
					System.out.println("Enter account number to close: ");
					try {
						int e = check.nextInt();
						Open.set(e,"Closed");
						System.out.println("Account closed, current balance is "+ Balance.get(e));
						Accounts.set(e,e+"("+Types.get(e)+") : " +Fname.get(e)+
								" : "+Lname.get(e)+" : "+ Birthday.get(e)+" : "
								+SSN.get(e)+" : "+Balance.get(e)+" : Account "+Open.get(e)+ "\n");
						break;
					}catch(Exception e) {
						System.out.println("Account not found");
						break;
					}
				}
			}
			
		}
			System.exit(0);
	}
}
