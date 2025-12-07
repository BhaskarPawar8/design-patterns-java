package OpenForExtensionClosedForModification;

public class Guitar {
    private String make;
    private String model;
    private  int volume;

    Guitar(String make, String model, int volume){
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
