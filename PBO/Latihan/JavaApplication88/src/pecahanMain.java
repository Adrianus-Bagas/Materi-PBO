public class pecahanMain {
    public static void main(String[] args){
        pecahanClass p1=new pecahanClass();
        pecahanClass p2=new pecahanClass(2,3);
        pecahanClass p3=new pecahanClass();
        pecahanClass p4=new pecahanClass();
        pecahanClass p5=new pecahanClass();
        pecahanClass p6=new pecahanClass(2,5);
        pecahanClass p7=new pecahanClass();
        pecahanClass hasil;
        p1.info();
        p2.info();
        p3.setPembilang(10);
        p3.setPenyebut(13);
        p3.info();
        p4.setPembilang(20);
        p4.setPenyebut(37);
        p4.kali(2).info();
        System.out.println(p5.getPembilang());
        hasil=p6.kali(2);
        hasil.info();
        p7.kali(10).info();
    }
}
