package java_bomb.example;


/**
 * try to describe my worry
 *
 * @author ninja
 */
public class Refrence {
private final static String breaklines = "-----------------";
    public static void main(String[] args) {
  	testClassRefrence(); 
	testRefrence();
    }

    
    public static void testClassRefrence() {

        System.out.println(breaklines + "ninja bear" + breaklines);
        People ninja = new People();
        System.out.println(ninja);
        immigrantToUs(ninja);//a function may change the param's value
        System.out.println(ninja);


        System.out.println(breaklines + "ben bear" + breaklines);
        People ben = new People();
        System.out.println(ben);
        immigrantToUs1(ben);//when you call function, you send a copy of the refrence of the ben, 'ben' is one refrence and 'p' is another refrence
        System.out.println(ben);

        System.out.println(breaklines + "sam bear" + breaklines);
        People sam = new People("CAN");
        People sam1 = sam;
        sam = null;//even the sam refrence is dead, another sam refrence('sam1') can still operate the sam
        System.out.println(sam1);
    }

    /**
     * change p's nation to USA
     *
     * @param p
     */
    public static void immigrantToUs(People p) {
        p.nationality = "USA";
    }

    /**
     * change p's nation to USA in another way
     *
     * @param p
     */
    public static void immigrantToUs1(People p) {
        p = new People("USA");
    }


    /**
     * describe the people
     *
     * @author rabbie
     */
    public static class People {
        String nationality;

        People() {
            nationality = "China";
        }

        People(String nation) {
            nationality = nation;
        }

        @Override
        public String toString() {
            return nationality;
        }
    }



		public static void testRefrence() {
        System.out.println("");
        System.out.println(breaklines + "another test case start" + breaklines);

        String s = "ImNinja";
		char c = s.charAt(0);
		char[] cs = { 'I', 'm', 'N', 'i', 'n', 'j', 'a' };
		System.out.println("Before change,");
		show(s, c, cs);
		changeString(s);
		changeChar(c);
		changeChars(cs);
		System.out.println("After change,");
		show(s, c, cs);
	}

	public static void show(String s, char c, char[] cs) {
		System.out.println(s);
		System.out.println(c);
		System.out.println(cs);
	}

	/**
	 * this wont change
	 * @param s
	 */
	private static void changeString(String s) {
		s = "test";
	}

	/**
	 * this wont change
	 * @param c
	 */
	private static void changeChar(char c) {
		c = 'U';
	}

	/**
	 * this will change!
	 * @param cs
	 */
	private static void changeChars(char[] cs) {
		cs[0] = 'U';
	}
}
