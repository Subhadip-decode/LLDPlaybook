public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("This singleton class has been initialized");
    }

    public static synchronized Singleton getInstance(){
        if(instance==null) // lazy init with thread locking
            instance = new Singleton();
        //eager init means initializing the member variable directly
        return  instance;
    }

}


