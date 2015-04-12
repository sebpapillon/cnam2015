package metier;

public class Journal {
	private static Journal instance = null;
	private String rejets = "";
	protected Journal(){}
	
	/**
	 * récupération ou création d'un journal
	 * @return instande du journal
	 */
	public static Journal getInstance() {
		if(instance==null) {
			instance = new Journal();
		}
		System.out.println(instance);
		return instance;
	}
	
	public boolean rejet(String compte) {
		rejets = rejets+compte;
		return true;
	}
}
