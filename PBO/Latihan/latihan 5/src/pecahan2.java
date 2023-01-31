public class pecahan2 {
    private int pembilang, penyebut;
    public pecahan2(){
        this.pembilang=14;
        this.penyebut=4;
    }
    public pecahan2(int b, int s){
        this.pembilang=b;
        this.penyebut=s;
    }
    public void setPembilang(int b){
        this.pembilang=b;
    }
    public void setPenyebut(int s){
        this.penyebut=s;
    }
    public int getPembilang(){
        return pembilang;
    }
    public int getPenyebut(){
        return penyebut;
    }
    public void info(){
        System.out.println("Nilai pecahan = "+pembilang+"/"+penyebut);
    }
    public pecahan2 kali(int c){
        pecahan2 hasilkali=new pecahan2();
        hasilkali.pembilang=this.pembilang*c;
        hasilkali.penyebut=this.penyebut;
        return hasilkali;
    }
    public double decimal(pecahan2 p){
        double temp;
        temp=(double)p.pembilang/(double)p.penyebut;
        return temp;
    }
    public pecahan2 kali2(pecahan2 x){
        pecahan2 hasilkali2=new pecahan2();
        hasilkali2.pembilang=this.pembilang*x.pembilang;
        hasilkali2.penyebut=this.penyebut*x.penyebut;
        return hasilkali2;
    }
}
