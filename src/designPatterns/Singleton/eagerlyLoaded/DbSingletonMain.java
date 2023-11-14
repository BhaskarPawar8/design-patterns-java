package patterns.singleton.eagerlyLoaded;

public class DbSingletonMain {

    public static void main(String[] args) {

        DbSingleton firstInstance = DbSingleton.getInstance();

        System.out.println(firstInstance);

        DbSingleton secondInstance = DbSingleton.getInstance();

        System.out.println(secondInstance);



    }

}
