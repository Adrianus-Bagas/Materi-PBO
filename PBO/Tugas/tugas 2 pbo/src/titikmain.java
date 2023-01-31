import java.util.Scanner;
public class titikmain{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Titik t1=new Titik(1,1);
        Titik t2=new Titik(4,4);
        Titik t3=new Titik(-1,-1);
        /*System.out.print("Absis Titik 1     : ");
        int x=input.nextInt();
        System.out.print("Ordinat Titik 1   : ");
        int y=input.nextInt();
        System.out.print("Absis Titik Baru  : ");
        int x1=input.nextInt();
        System.out.print("Ordinat Titik Baru: ");
        int y1=input.nextInt();
        t1.setX(x);
        t1.setY(y);
        t4.setX(x1);
        t4.setY(y1);*/
        System.out.print("Titik 1                                   : ");
        t1.info(); System.out.println();
        System.out.print("Titik 2                                   : ");
        t2.info(); System.out.println();
        System.out.print("Titik 3                                   : ");
        t3.info(); System.out.println();
        System.out.print("Pergeseran Titik 1 dan 2                  : ");
        t1.Geser(t2).info(); System.out.println();
        System.out.print("Pergeseran Titik 1 dan 3                  : ");
        t1.Geser(t3).info(); System.out.println();
        System.out.print("Pergeseran Titik 2 dan 3                  : ");
        t2.Geser(t3).info(); System.out.println();
        System.out.print("Kuadran Titik 1                           : ");
        t1.infokuadran();
        System.out.print("Kuadran Titik 2                           : ");
        t2.infokuadran();
        System.out.print("Kuadran Titik 3                           : ");
        t3.infokuadran();
        System.out.println("Jarak Titik 1 dan 2                       : "+t1.jarak(t2,t1.Geser(t3)));
        System.out.println("Jarak Titik 1 dan 3                       : "+t1.jarak(t3,t1));
        System.out.println("Jarak Titik 2 dan 3                       : "+t2.jarak(t3,t2));
        System.out.print("Apakah Titik 1, 2, dan 3 segaris          : ");
        if (t1.segaris(t2, t3)==true){
            t1.info(); t2.info(); t3.info();
            System.out.println(" Segaris");
        } else {
            t1.info(); t2.info(); t3.info();
            System.out.println(" Tidak Segaris");
        }
        System.out.print("Hasil Refleksi Titik 1 terhadap sumbu x   : ");
        t1.refleksi("x").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 1 terhadap sumbu y   : ");
        t1.refleksi("y").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 1 terhadap sumbu o   : ");
        t1.refleksi("o").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 2 terhadap sumbu x   : ");
        t2.refleksi("x").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 2 terhadap sumbu y   : ");
        t2.refleksi("y").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 2 terhadap sumbu o   : ");
        t2.refleksi("o").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 3 terhadap sumbu x   : ");
        t3.refleksi("x").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 3 terhadap sumbu y   : ");
        t3.refleksi("y").info(); System.out.println();
        System.out.print("Hasil Refleksi Titik 3 terhadap sumbu o   : ");
        t3.refleksi("o").info(); System.out.println();
    }
}