package tugas11;

import java.util.Scanner;

public class TestTriangleHanif {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan warna segitiga:");
        String color = baca.nextLine();
        System.out.println("Masukkan panjang sisi 1");
        double side1 = baca.nextDouble();
        System.out.println("Masukkan panjang sisi 2");
        double side2 = baca.nextDouble();
        System.out.println("Masukkan panjang sisi 3");
        double side3 = baca.nextDouble();
        
        Trianglehanif sgtg = new Trianglehanif(side1,side2,side3,color);
        if (sgtg.filled()==false)
            System.out.println("/nBUKANSEGITIGA");
        else
            System.out.println(sgtg.toString()+"\nLuas="+sgtg.getArea()+"\nKeliling="+sgtg.getPerimeter());
    }
    
    
}
