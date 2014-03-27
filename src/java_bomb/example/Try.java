package java_bomb.example;


/**
 * try to describe
 * @author ninja
 */
public class Try {
	public static void main(String[] args) {
	System.out.println("-----------after return,result is"+testFinally(+"---------"));
	}
	public static int testFinally(){
	int result = 0;
	try{
	return result = 999+101;
	}finally{
	System.out.println("-----------before return,result is" + result + "----------------");
	}
	}
}
