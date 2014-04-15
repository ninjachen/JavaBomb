package java_bomb.example;


/**
 * try to describe my worry
 *
 * @author ninja
 */
public class Try {
    //the sequence of execute order is quite strange,
    // Run finally first ,then return.
    // But the return value is previous, the finally value is the finally
    public static void main(String[] args) {
        System.out.println("---------------first test---------------");
        System.out.println("-----------in main   ,result is" + testFinally() + "----------------");
        System.out.println("---------------2nd test---------------");
        System.out.println("-----------in main   ,result is" + testFinallyReturn() + "----------------");
    }

    public static int testFinally() {
        int result = 0;
        try {
            return result = 999 + 101;
        } finally {
            System.out.println("-----------in finally,result is" + ++result + "----------------");
        }
    }

    public static int testFinallyReturn() {
        int result = 0;
        try {
            return ++result;
        } finally {
            System.out.println("-----------in finally,result is" + ++result + "----------------");
            return result;
        }
    }


}
