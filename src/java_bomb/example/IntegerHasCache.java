package java_bomb.example;

/**
 * Some tricky integers instance
 */
public class IntegerHasCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(new Integer(1) == new Integer(1))
			System.out.println("new Integers(100) == new Integers(100)");
		else 
			System.out.println("new Integers(100) != new Integers(100)");
		if(new Integer(999) == new Integer(999))
			System.out.println("new Integers(999) == new Integers(999)");
		else
			System.out.println("new Integers(999) != new Integers(999)");
		
		if(Integer.valueOf(1) == Integer.valueOf(1))
			System.out.println("Integers.valueOf(1) == Integers.valueOf(1)");
		else 
			System.out.println("Integers.valueOf(1) != Integers.valueOf(1)");
		if(Integer.valueOf(999) == Integer.valueOf(999))
			System.out.println("Integers.valueOf(999) == Integers.valueOf(999)");
		else
			System.out.println("Integers.valueOf(999) == Integers.valueOf(999)");
			
	}

}
