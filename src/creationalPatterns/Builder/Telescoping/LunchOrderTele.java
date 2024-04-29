package creationalPatterns.Builder.Telescoping;

public class LunchOrderTele {
    private String bread;
    private String condements;
    private String dressings;
    private String meat;

    LunchOrderTele(String bread){
        this.bread = bread;
    }

    LunchOrderTele(String bread, String condements){
        this(bread);
        this.condements = condements;
    }

    LunchOrderTele(String bread, String condements, String dressings){
        this(bread, condements);
        this.dressings = dressings;
    }

    LunchOrderTele(String bread, String condements, String dressings, String meat){
        this(bread, condements, dressings);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondements() {
        return condements;
    }

    public String getDressings() {
        return dressings;
    }

    public String getMeat() {
        return meat;
    }
}
