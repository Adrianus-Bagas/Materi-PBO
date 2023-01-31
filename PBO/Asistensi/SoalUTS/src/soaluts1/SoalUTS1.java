package soaluts1;

public class SoalUTS1 {

    public static void main(String[] args) {
        Hewan BG = new Hewan();
        cetak(BG);
        cetak(new Burung());
        cetak(new Hewan());
       System.out.println(BG.kucing());
    }
    
    public static void cetak(Hewan x) {
        System.out.println(x.getket() + "--" + x.warna);
    }
    
}
