package patterns.singleton.lazyLoaded;

public class DbSingletonLazyMain {

    public static void main(String[] args) {

        DbSingletonLazy firstInstance = DbSingletonLazy.getInstance();

        System.out.println(firstInstance);

        DbSingletonLazy secondInstance = DbSingletonLazy.getInstance();

        System.out.println(secondInstance);



    }

}
