package java_bomb.example;


/**
 * try to describe
 * @author ninja
 */
public class Refrence {
	public static void main(String[] args) {
		
		System.out.println("-----------------ninja bears-----------------");
		People ninja = new People();
		System.out.println(ninja);
		immigrantToUs(ninja);//a function may change the param's value
		System.out.println(ninja);
		
		
		System.out.println("-----------------ben bears-----------------");
		People ben = new People();
		System.out.println(ben);
		immigrantToUs1(ben);//when you call function, you send a copy of the refrence of the ben, 'ben' is one refrence and 'p' is another refrence 
		System.out.println(ben);
		
		System.out.println("-----------------sam bears-----------------");
		People sam = new People("CAN");
		People sam1 = sam;
		sam = null;//even the sam refrence is dead, another sam refrence('sam1') can still operate the sam 
		System.out.println(sam1);
	}
	
	/**
	 * change p's nation to USA	
	 * @param p
	 */
	public static void immigrantToUs(People p){
		p.nationality = "USA";
	}
	
	/**
	 * change p's nation to USA in another way	
	 * @param p
	 */
	public static void immigrantToUs1(People p){
		p = new People("USA");
	}
	
	
	
	/**
	 * describe the people
	 * @author rabbie
	 *
	 */
	public static class People {
		String nationality;
		
		People(){
			nationality = "China";
		}
		
		People(String nation){
			nationality = nation;
		}
		
		@Override
		public String toString(){
			return nationality;
		}
	}
	
	
}
