package Tugas;

public class Demo {
    public static void main(String[] args) {
        Laptop la = new Laptop();
        LaptopGaming lg = new LaptopGaming();
        LaptopOffice lo = new LaptopOffice();
        Buku bk = new Buku();
        Baju baju = new Baju();

        System.out.println("LAPTOP : ");
        la.setMerk("Dell");
        la.setUkuran(14);
        la.setRam(4);
        la.print();

        System.out.println();
        System.out.println("LAPTOP GAMING: ");
        lg.setMerk("ROG Flow 13");
        lg.setUkuran(15);
        lg.setRam(32);
        lg.tipeProccessor("Intel core i9-13900H");
        lg.setGpu("NVIDIA GeForce RTX™ 4070");
        lg.setRGB("Yes");
        lg.print();

        System.out.println();
        System.out.println("LAPTOP OFFICE");
        lo.setMerk("Lenovo IdeaPad Slim 5");
        lo.setUkuran(14);
        lo.setRam(8);
        lo.tipeProccessor("AMD Ryzen 5 4500U");
        lo.print();

        System.out.println();
        System.out.println("DETAIL BUKU");
        bk.judulBuku("Harry Potter and the Deathly Hallows");
        bk.penulisBuku("J. K. Rowling");
        bk.jumlahHalaman(607);
        bk.print();

        System.out.println();
        System.out.println("DETAIL BAJU");
        baju.setJenis("Kaos");
        baju.setMerk("Polo Shirt");
        baju.setWarna("Putih");
        baju.setUkuran('L');
        baju.print();

    }
}


