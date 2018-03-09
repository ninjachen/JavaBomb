package java_bomb.example;

/**
 * Created by ninja_chen on 14-5-10.
 */
public class ClassStaticInit {
    static char a = 'a';
    static char b = 'b';
    static char c = 'c';
    static char d = 'd';
    static char e = init();

    public static char init(){
        e = 'e';
        System.out.println("before:");
        show();
        a = 'A';
        b = 'B';
        c = 'C';
        d = 'D';
        e = 'E';
        System.out.println("\nafter:");
        show();
        return 'Z';
    }

    public static void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    public static void main(String[] args){
        //do nothing
        System.out.println("\nmain() start");
        show();
    }
}
