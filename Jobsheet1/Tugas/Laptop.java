package Tugas;

public class Laptop {
    private String merk;
    private int ukuran;
    private int ram;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setUkuran (int newValue){
        ukuran = newValue;
    }

    public void setRam (int newValue) {
        ram = newValue;
    }

    public void print () {
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran : " + ukuran + " inch");
        System.out.println("Ram : " + ram + " GB");
    }
}
