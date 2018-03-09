package java_bomb.example;


import java.util.ArrayList;
import java.util.List;

/**
 * try to describe my worry
 * @author ninja
 */
public class DiamondOperator {
    //the DiamondOperator is weak
    public static void main(String[] args) {
    }

    public static int testDiamondOperator() {
        List<String> list = new ArrayList<>();//this is a diamond operator,new feature in JDK7

        //in {$JDK_VERSION} < 7,YOU MUST GIVE TYPE TWICE
        List<String> list_oldStyle = new ArrayList<String>();

        //this is ok
        list.add("a string");

        //this will occur compile error
        //list.addAll(new ArrayList<>());
        //since addAll() expects Collection<? extends String>

        //but this is ok
        list.addAll(new ArrayList<String>());

        return 0 ;
    }
}

