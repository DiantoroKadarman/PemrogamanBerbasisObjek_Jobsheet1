package Tugas;

public class Buku {
    private String judul;
    private String penulis;
    private int halaman;

    public void judulBuku (String newValue){
        judul = newValue;
    }

    public void penulisBuku (String newValue) {
        penulis = newValue;
    }

    public void jumlahHalaman (int newValue) {
        halaman = newValue;
    }

    public void print () {
        System.out.println("Judul buku : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Jumlah Halaman : " + halaman);
    }
}
