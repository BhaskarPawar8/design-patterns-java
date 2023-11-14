package designPatterns.Singleton;

public class SingletonRuntimeDemo {


    public void runtimeEx() {

        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherinstance = Runtime.getRuntime();
        System.out.println(anotherinstance);

        if(singletonRuntime == anotherinstance){
            System.out.println("They both are same instances");
        }


    }
    // This is fine from public static void main. method has to define acces modifier first and then retrun type
    static public void main(String[] args) {

        SingletonRuntimeDemo re = new SingletonRuntimeDemo();
        re.runtimeEx();

    }



}
