public class Buku {
    private String nama, judul;
    private int tahun,cetakan;
    private double harga;
    public Buku(String n, String j, int t, int c, double h){
        this.nama=n;
        this.judul=j;
        this.tahun=t;
        this.cetakan=c;
        this.harga=h;
    }
    public void info(){
        System.out.println("Nama Pengarang  : "+nama);
        System.out.println("Judul Buku      : "+judul);
        System.out.println("Tahun Terbit    : "+tahun);
        System.out.println("Cetakan         : "+cetakan);
        System.out.println("Harga Buku      : Rp "+harga);
    }
    public static void main(String[] args){
        Buku b1=new Buku("Zayn","Ranjang Gairah",2019,500,2000000);
        b1.info();
    }
}
