package oops.this_static_and_final;
class BankAccount {
	static String bankName="State Bank Of India";
	private static int totalAccounts=0;
	
	private String accountHolderName;
	private final long accountNumber;
	
	BankAccount(String accountHolderName,long accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		totalAccounts++;
	}
	public static int getTotalAccount() {
		return totalAccounts;
	}
	public void display() {
		if(this instanceof BankAccount) {
			System.out.println(accountHolderName+"'s Bank details");
			System.out.println("Bank Name :"+bankName);
			System.out.println("Account Holder: "+accountHolderName);
			System.out.println("Account Number: "+accountNumber);
			System.out.println("---------------------------------");
		}else {
			System.out.println("Account is not the instace of of Bank Account");
		}
	}
	public static void main(String[] args) {
		BankAccount bankAccount1=new BankAccount("Anurag",456123);
		BankAccount bankAccount2=new BankAccount("Aakash",455621);
		bankAccount1.display();
		bankAccount2.display();
		System.out.println("Total Accounts: "+BankAccount.getTotalAccount());
	}
}
