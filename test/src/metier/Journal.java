package metier;

public class Journal {
	private static Journal instance = null;
	protected Journal(){}
	public static Journal getInstance() {
		if(instance==null) {
			instance = new Journal();
		}
		System.out.println(instance);
		return instance;
	}
}
