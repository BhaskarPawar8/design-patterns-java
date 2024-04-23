package designPatterns.Builder.builderExample1;

public class LunchOrderBuilderDemo {
    public static void main(String[] args) {
        LunchOrderBuilder lunchOrderBuilder = new LunchOrderBuilder.Builder().bread("Gheu")
                .condements("tomato")
                .dressings("ketchup")
                .meat("chichen").build();

        System.out.println("Brand: " + lunchOrderBuilder.getBread());
        System.out.println("Condements: " + lunchOrderBuilder.getCondements());
        System.out.println("Dressings: " + lunchOrderBuilder.getDressings());
        System.out.println("Meat: " + lunchOrderBuilder.getMeat());


    }
}
