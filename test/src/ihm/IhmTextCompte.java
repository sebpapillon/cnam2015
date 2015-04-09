package ihm;
import metier.*;
import java.util.*;

public class IhmTextCompte {
	private static Compte Compte1;
	private static Compte Compte2;
	
	public static void main (String args [ ]) {
		boucle();
	
	}
	
	protected static void creerComptes() {
		Compte1 = new Compte("123",100,10);
	}
	
	/**
	 * boucle de lecture du shell
	 */
	protected static void boucle() {
		String scan = "";
		Scanner sc = new Scanner(System.in);
		Journal journ = Journal.getInstance();
		while(!scan.equals("exit")) {
			scan = sc.next();
			System.out.println(scan);
			
		}
		sc.close();
	}

}
