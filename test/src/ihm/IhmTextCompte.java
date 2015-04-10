package ihm;
import metier.*;
import java.util.*;

public class IhmTextCompte {
	private static Compte Compte1;
	private static Compte Compte2;
	
	public static void main (String args [ ]) {
		lireSomme();
	
	}
	
	protected static void creerComptes() {
		Compte1 = new Compte("123",100,10);
	}
	
	/**
	 * boucle de lecture du shell
	 */
	protected static void lireSomme() {
		String scan = "";
		String operation = "";
		Scanner sc = new Scanner(System.in);
		Journal journ = Journal.getInstance();
		while(!scan.equals("exit")) {
			System.out.println("debit, credit ou exit");
			scan = sc.next();
			if(scan.equals("debit")||scan.equals("credit")) {
				operation=scan;
				while(!scan.equals("cancel")) {
					System.out.println("somme ou cancel");
					scan = sc.next();
				}
			}
			System.out.println(scan);
			
		}
		sc.close();
	}
		

}
