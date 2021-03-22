package generics;

public class ThreeDPrinterMain {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> threeDPrinter = new ThreeDPrinter<Powder>();
        threeDPrinter.setMaterial(new Powder());
        Powder powder = threeDPrinter.getMaterial();
        System.out.println(powder.toString());

        ThreeDPrinter<Plastic> threeDPrinterPlastic = new ThreeDPrinter<Plastic>();
        threeDPrinterPlastic.setMaterial(new Plastic());
        Plastic plastic = threeDPrinterPlastic.getMaterial();
        System.out.println(plastic.toString());

    }
}
