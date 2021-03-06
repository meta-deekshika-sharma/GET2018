package zooManagement;

/**
 * Parrot is the subclass of Bird
 * @author Deekshika Sharma 
 * It initializes the properties of Parrot when added to Zoo
 */
public class Parrot extends Bird{

	static int id = 1;
	
	/**
	 * This intializes Parrot and calls its super to add it into Bird
	 * @param weight
	 * @param age
	 * @param wingsSpan
	 */
	public Parrot(double weight, int age, double wingsSpan) {
		
		super("Parrot" + (id++), weight, age, "squawk", 2, true, wingsSpan, AnimalName.PARROT);
		// TODO Auto-generated constructor stub
	}

}
