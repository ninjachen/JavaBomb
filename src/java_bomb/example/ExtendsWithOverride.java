package java_bomb.example;

/**
 * Created by ninja_chen on 14-7-15.
 * Its not make sense.
 */
@Deprecated
public class ExtendsWithOverride {

    public static class Base{
        public int f(int i){
            return i + i;
        }
        public int g(int i){
            return f(i);
        }
    }
    public static class Extends extends Base{

        @Override
        public int f(int i){
            return i * i;
        }
    }


    public static class Base1{
        int i = 3;

        public int f(){
            return i + i;
        }
        public int g(){
            return i * i;
        }
    }
    public static class Extends1 extends Base1{
        int i = 100;

        @Override
        public int f(){
            return i + i;
        }
    }

    public static void main(String[] args){
        Base b = new Base();
        Extends e = new Extends();
        System.out.print(b.f(3) + "" + b.g(3));
        b = e;
        System.out.println(b.f(3) + "" + b.g(3));
        System.out.println("====================");
        Base1 b1 = new Base1();
        Extends1 e1 = new Extends1();
        System.out.print(b1.f() + "" + b1.g());
        b1 = e1;
        System.out.println(b1.f() + "" + b1.g());
        System.out.println(e1.f() + "" + e1.g());

    }

}
