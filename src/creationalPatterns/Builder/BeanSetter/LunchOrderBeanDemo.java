package creationalPatterns.Builder.BeanSetter;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondements("Lettuce");
        lunchOrderBean.setDressings("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println("Brand: " + lunchOrderBean.getBread());
        System.out.println("Condements: " + lunchOrderBean.getCondements());
        System.out.println("Dressings: " + lunchOrderBean.getDressings());
        System.out.println("Meat: " + lunchOrderBean.getMeat());


    }
}
