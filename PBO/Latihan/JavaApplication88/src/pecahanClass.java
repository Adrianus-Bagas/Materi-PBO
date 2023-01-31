public class pecahanClass {
    private int bilang,sebut;
    public pecahanClass(){
        this.bilang=1;
        this.sebut=1;
}
    public pecahanClass(int b, int s){
        this.bilang=b;
        this.sebut=s;
    }
    public void setPembilang(int b){
        this.bilang=b;
    }
    public void setPenyebut(int s){
        this.sebut=s;
    }
    public int getPenyebut(){
        return sebut;
    }
    public int getPembilang(){
        return bilang;
    }
    public void info(){
        System.out.println("Nilai Pecahan = "+bilang+"/"+sebut);
    }
    public pecahanClass kali(int c){
        pecahanClass hasilkali=new pecahanClass();
        hasilkali.bilang=this.bilang*c;
        hasilkali.sebut=this.sebut;
        return hasilkali;
    }
    
}
