public class cBentuk2Dmain {
    public static void main(String[] args) {
        lingkaran l=new lingkaran(10,"merah");
        kotak k=new kotak(10,20,"hitam");
        l.setJari(100);
        l.info();
        System.out.println();
        k.info();
    }
}