package designPatterns.Builder.BeanSetter;

public class LunchOrderBean {
    private String bread;
    private String condements;
    private String dressings;
    private String meat;

    LunchOrderBean(){

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondements() {
        return condements;
    }

    public void setCondements(String condements) {
        this.condements = condements;
    }

    public String getDressings() {
        return dressings;
    }

    public void setDressings(String dressings) {
        this.dressings = dressings;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
