package OpenForExtensionClosedForModification;

public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;
public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
    super(make, model, volume);     // <-- correct call
    this.flameColor = flameColor;   // <-- new child field
}

    @Override
    public String toString() {
        return super.toString() + ", flameColor='" + flameColor + "'";
    }
}
