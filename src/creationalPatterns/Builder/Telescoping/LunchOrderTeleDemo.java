package creationalPatterns.Builder.Telescoping;

public class LunchOrderTeleDemo {
    public static void main(String[] args) {
        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat","Lettuce","Mustard","Ham");

        System.out.println("Brand: " + lunchOrderTele.getBread());
        System.out.println("Condements: " + lunchOrderTele.getCondements());
        System.out.println("Dressings: " + lunchOrderTele.getDressings());
        System.out.println("Meat: " + lunchOrderTele.getMeat());


    }
}
