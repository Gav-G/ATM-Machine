import java.util.*;
public class ATM {
	private HashMap<Integer, Double> accs = new HashMap<Integer, Double>();
	public ATM(HashMap<Integer, Double> accs) {
		this.accs = accs;
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
			return(0.0);
		return(accs.get(ID));
	}
	public boolean depositMoney(int ID, double deposit) {
		if(!accs.containsKey(ID))
			return false;
		accs.put(ID, accs.get(ID) + deposit);
		return true;
	}
	public boolean withdrawMoney(int ID, double withdrawl) {
		if(!accs.containsKey(ID) || accs.get(ID) < withdrawl)
			return false;
		accs.put(ID, accs.get(ID) - withdrawl);
		return true;
	}
}
