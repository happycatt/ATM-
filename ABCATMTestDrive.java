package oo2;

public class ABCATMTestDrive {

	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		ABCImp card = new ABCImp(1000,"12345");
		atm.insertCard(card);
		atm.allMenu();
		

	}

}
