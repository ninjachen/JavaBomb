package java_bomb.example;

/**
 * Created by ninja_chen on 14-5-29.
 */
public class ThreadOperations {
    private Refrence.People p = null;

    private void operatePeople(){
        Thread thread = new Thread(){
            int count = 0;
            @Override
            public void run() {

                while (true) {
                    try {
                        sleep(2000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p = new Refrence.People("USA"+count);
//                    super.run();
                }

            }
        };
        thread.run();
    }

    private void queryPeople(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(3000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(p);
                }
            }
        };
        thread.run();
    }

    public static void main(String[] argc){
        ThreadOperations to = new ThreadOperations();
        to.operatePeople();
        to.queryPeople();
    }
}
