import java.util.Scanner;
public class kendaraanmain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        mobil m=new mobil();
        motor s=new motor();
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilih");
        int a=input.nextInt();
        if(a==1){
            System.out.print("Nama    : ");
            String namamobil=input.next();
            System.out.print("Tipe    : ");
            String tipemobil=input.next();
            System.out.print("Kapasitas : ");
            int kap=input.nextInt();
            System.out.print("Bahan Bakar   : ");
            String bm=input.next();
            
            m.info();
        } else if(a==2){
            System.out.print("Nama    : ");
            String namaotor=input.next();
            System.out.print("Tipe    : ");
            String tipemotor=input.next();
            System.out.print("Bahan Bakar   : ");
            String bs=input.next();
            
            s.info();
        } else{
            System.out.println("Salah");
        }
    }
}
