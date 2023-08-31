package Tugas;

public class LaptopOffice extends Laptop {
    private String proccessor;

    public void tipeProccessor (String newValue) {
        proccessor = newValue;
    }

    public void print() {
        super.print();
        System.out.println("Proccessor : " + proccessor);
    }
}
