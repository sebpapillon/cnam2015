package ihm;
import metier.*;
import java.util.*;

public class IhmTextCompte {
	public static void main (String args [ ]) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		while(!str.equals("exit")) {
			str = scan.next();
			System.out.println(str);			
		}
		Journal journ = Journal.getInstance();
		Journal journ2 = Journal.getInstance();
	
	}

}
