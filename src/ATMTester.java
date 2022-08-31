
public class ATMTester {
	public static void main(String[] args) {
		ATM Atm = new ATM();
		System.out.println(Atm.checkBalance(00001));
		System.out.println(Atm.depositMoney(00001, 100.0));
		System.out.println(Atm.withdrawMoney(00001, 50.0));
		System.out.println(Atm.checkBalance(00001));
		
		Atm.openAccount(00001);// Now account #00001 is opened
		System.out.println(Atm.checkBalance(00001)); //should return 0.0
		System.out.println(Atm.depositMoney(00001, 100.0)); // should return true now that account 00001 is open
		System.out.println(Atm.checkBalance(00001)); // should return 100.0
		System.out.println(Atm.withdrawMoney(00001, 50.0)); // should return true
		System.out.println(Atm.checkBalance(00001)); // should return 100.0-50.0, which = 50.0
		
		System.out.println(Atm.checkBalance(00002)); //all of these should return 0.0 or false
		System.out.println(Atm.depositMoney(00002, 100.0));
		System.out.println(Atm.withdrawMoney(00002, 50.0));
		System.out.println(Atm.checkBalance(00002));
		
		Atm.closeAccount(00001); //atm account #00001 shouldn't be closed since balance isn't = 0.0
		System.out.println(Atm.checkBalance(00001)); //should return 50.0
		System.out.println(Atm.withdrawMoney(00001, 50.0)); // should return true
		System.out.println(Atm.checkBalance(00001)); // should return 0.0
		
		Atm.closeAccount(00001); //atm account #00001 should be closed since balance = 0.0
		System.out.println(Atm.checkBalance(00001)); //should return 0.0
		System.out.println(Atm.depositMoney(00001, 50.0)); // should return false now that account is closed
		System.out.println(Atm.checkBalance(00001)); // should return 0.0
	}
}