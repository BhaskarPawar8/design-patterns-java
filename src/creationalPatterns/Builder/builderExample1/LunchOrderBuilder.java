package creationalPatterns.Builder.builderExample1;

public class LunchOrderBuilder {
    private String bread;
    private String condements;
    private String dressings;
    private String meat;

    private LunchOrderBuilder(){
    }

    public static class Builder{
        private String bread;
        private String condements;
        private String dressings;
        private String meat;

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condements(String condements){
            this.condements = condements;
            return this;
        }

        public Builder dressings(String dressings){
            this.dressings = dressings;
            return this;
        }

        public Builder meat(String meat){
            this.condements = meat;
            return this;
        }

        public LunchOrderBuilder build(){
            LunchOrderBuilder lunchOrderBuilder = new LunchOrderBuilder();
            lunchOrderBuilder.bread = this.bread;
            lunchOrderBuilder.condements = this.condements;
            lunchOrderBuilder.dressings = this.dressings;
            lunchOrderBuilder.meat = this.meat;

            return lunchOrderBuilder;
        }
    }

    // getter and setters

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
