package Tugas;

public class LaptopGaming extends Laptop{
    private String proccessor;
    private String gpu;
    private String rgb;

    public void tipeProccessor (String newValue) {
        proccessor = newValue;
    }

    public void setGpu (String newValue) {
        gpu = newValue;
    }

    public void setRGB (String newValue){
        rgb = newValue;
    }

    public void print() {
        super.print();
        System.out.println("Proccessor : " + proccessor);
        System.out.println("GPU : " + gpu);
        System.out.println("Keyboard Backlight RGB : " + rgb);
    }
}
