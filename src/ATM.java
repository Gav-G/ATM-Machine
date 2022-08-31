import java.util.*;
public class ATM {
	private HashMap<Integer, Double> accs;
	public ATM() {
		accs = new HashMap<Integer, Double>();
	}
	public void openAccount(int ID) {
		accs.put(ID, 0.0);
	}
	public void openAccount(int ID, double deposit) {
		accs.put(ID, deposit);
	}
	public void closeAccount(int ID) {
		if(checkBalance(ID) == 0.0) 
			accs.remove(ID);
		
	}
	public double checkBalance(int ID) {
		if(!accs.containsKey(ID))
			return 0.0;
		return(Math.round(100*accs.get(ID))/100.0);
	}
	public boolean depositMoney(int ID, double deposit) {
		if(!accs.containsKey(ID) || deposit < 0.0)
			return false;
		accs.put(ID, accs.get(ID) + deposit);
		return true;
	}
	public boolean withdrawMoney(int ID, double withdrawl) {
		if(!accs.containsKey(ID) || accs.get(ID) < withdrawl || withdrawl < 0.0)
			return false;
		accs.put(ID, accs.get(ID) - withdrawl);
		return true; //test
	}
}
