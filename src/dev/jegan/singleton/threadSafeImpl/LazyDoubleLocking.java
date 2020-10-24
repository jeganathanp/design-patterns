package dev.jegan.singleton.threadSafeImpl;

/**
 * Two steps involved in creating
 * 1) Private constructor
 * 2) getInstance has two checks, if instance is available return it without lockig
 * or lock and return instance.
 * 2) Public method to access the instance
 */
public class LazyDoubleLocking {

    private static LazyDoubleLocking instance;
    private LazyDoubleLocking(){
        System.out.println("Single ton class");
    }

    public static LazyDoubleLocking getInstance(){
        if(instance == null){
            synchronized (LazyDoubleLocking.class)
            {
                if(instance == null){
                    instance = new LazyDoubleLocking();
                }
            }

        }

        return  instance;
    }

    public void doSomething(){
        System.out.println("Some output");
    }
    public static void main(String args[]){
        LazyDoubleLocking.getInstance().doSomething();
    }
}

