package patterns.singleton.lazyLoaded;

public class DbSingletonLazy {

    // lazy loaded. New instance was NOT created.
    private static DbSingletonLazy instance1;

    //SIngleton classes are created by making consutor as private. This will make it always returns single instance of the class
    private DbSingletonLazy(){};

    public static DbSingletonLazy getInstance()
    {
        if(instance1 == null) {
            instance1 = new DbSingletonLazy();
            return instance1;
        }
        return instance1;
    }



}
