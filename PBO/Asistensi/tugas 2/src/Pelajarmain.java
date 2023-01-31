import java.util.Scanner;
public class Pelajarmain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Pelajar p1=new Pelajar();
        Pelajar p2=new Pelajar();
        Pelajar p3=new Pelajar();
        System.out.print("Nama          : ");
        String nama=input.next();
        System.out.print("NIP           : ");
        int nip=input.nextInt();
        System.out.print("Nilai Ujian 1 : ");
        int u1=input.nextInt();
        System.out.print("Nilai Ujian 2 : ");
        int u2=input.nextInt();
        System.out.print("Nilai Tugas   : ");
        int t=input.nextInt();
        p1.setNama(nama);
        p1.setNip(nip);
        p1.setUjian1(u1);
        p1.setUjian2(u2);
        p1.setTugas(t);
        System.out.println();
        System.out.println("Pelajar 1");
        p1.status();}}
    

