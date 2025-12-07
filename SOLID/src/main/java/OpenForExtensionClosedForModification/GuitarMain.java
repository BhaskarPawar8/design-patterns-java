package OpenForExtensionClosedForModification;

public class GuitarMain {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("marshall","v20", 10);

        System.out.println(guitar);

        SuperCoolGuitarWithFlames superCoolGuitarWithFlames = new SuperCoolGuitarWithFlames("marshall","v20", 10,"yello");

        System.out.println(superCoolGuitarWithFlames);
    }
}
