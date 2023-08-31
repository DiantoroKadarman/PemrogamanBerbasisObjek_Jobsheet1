package Tugas;

public class Baju {
    private String merk, warna;
    private char ukuran;
    private String jenis;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setUkuran (char newValue){
        ukuran = newValue;
    }

    public void setJenis (String newValue) {
        jenis = newValue;
    }

    public void setWarna (String newValue) {
        warna = newValue;
    }

    public void print () {
        System.out.println("Jenis : " + jenis );
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran : " + ukuran);
    }
}
