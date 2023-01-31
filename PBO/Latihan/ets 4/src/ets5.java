public class ets5 {
    private int pembilang, penyebut;
    public ets5() {
        this.pembilang = 1;
        this.penyebut = 1;
    }
    public ets5(int a, int b) {
        this.pembilang = a;
        this.penyebut = b;
    }
    public ets5 jumlah(ets5 a) {
        ets5 p = new ets5();
        if(this.penyebut==a.penyebut){
        p.pembilang = this.pembilang + a.pembilang;
        p.penyebut = this.penyebut;
    } else {
            p.penyebut=this.penyebut*a.penyebut;
            p.pembilang=this.pembilang*a.penyebut+a.pembilang*this.penyebut;
        }
        return p;
    }
    public ets5 kali(ets5 a) {
        ets5 p = new ets5();
        p.pembilang = this.pembilang * a.pembilang;
        p.penyebut = this.penyebut * a.penyebut;
        return p;
    }
    public String bentuk() {
        if (this.pembilang > this.penyebut) {
            String t, b , s ;
            int a = this.pembilang / this.penyebut;
            ets5 e3 = new ets5();
            e3.pembilang = this.pembilang - a * this.penyebut;
            e3.penyebut = this.penyebut;
            t = Integer.toString(a);
            b = Integer.toString(e3.pembilang);
            s = Integer.toString(e3.penyebut);
            return (t + " " + b + "/" + s);
        } else {
            String x, y;
            int a=this.pembilang;
            int b=this.penyebut;
            x=Integer.toString(a);
            y=Integer.toString(b);
            return "Tidak ada bentuk campuran"+"("+x+"/"+y+")";
        }
    }
    public void info() {
        System.out.println("Pecahan : " + this.pembilang + "/" + this.penyebut);
    }
}
class main {
    public static void main(String[] args) {
        ets5 p1 = new ets5(1,5);
        ets5 p2 = new ets5(2,5);
        System.out.println("Penjumlahan pecahan");
        p1.jumlah(p2).info();
        System.out.println("Perkalian pecahan");
        p1.kali(p2).info();
        System.out.println("Bentuk Pecahan Campuran  :"+p1.bentuk());
        System.out.println("Bentuk Pecahan Campuran  :"+p2.bentuk());
    }
}