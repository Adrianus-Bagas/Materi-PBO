
import latihan.pkg1.Latihan1;

public class mainkendaraan {
public static void main(String[] args) {
        Latihan1 k1=new Latihan1();
        Latihan1 k2=new Latihan1();
        k1.setMerk("Beat");
        k1.setBahanBakar("Bensin");
        k1.setJmlroda(2);
        k1.info();
        System.out.println();
        k2.setMerk("Avanza");
        k2.setBahanBakar("Solar");
        k2.setJmlroda(4);
        k2.info();
    }    
}
