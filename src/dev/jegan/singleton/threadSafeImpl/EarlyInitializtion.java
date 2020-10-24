package dev.jegan.singleton.threadSafeImpl;

/**
 * Initialize early with static method.
 */
public class EarlyInitializtion {
    private static EarlyInitializtion instance = new EarlyInitializtion();
    private EarlyInitializtion(){
        System.out.println("Single ton class");
    }

    public static EarlyInitializtion getInstance(){


        return  instance;
    }

    public void doSomething(){
        System.out.println("Some output");
    }
    public static void main(String args[]){
        EarlyInitializtion.getInstance().doSomething();
    }
}
