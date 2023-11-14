package patterns.singleton.eagerlyLoaded;

public class DbSingleton {

    // Eagerly loaded instance. New instance of the class was created.
    private static DbSingleton instance1 = new DbSingleton();

    private DbSingleton(){};

    public static DbSingleton getInstance(){
        return instance1;
    }



}
