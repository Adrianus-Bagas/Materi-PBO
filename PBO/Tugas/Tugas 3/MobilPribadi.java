public class MobilPribadi extends Mobil{
    private boolean mesin,tape,tv,ac;
    private int gerigi=0;
    private int kecepatan=0;
    public void nyalakantape(){
        if (mesin==true)
            tape = true;
        System.out.println("Tape Menyala");
    }
    public void nyalakantv(){
        if (mesin==true)
            tv = true;
        System.out.println("TV menyala");
    }
    public void nyalakanac(){
        if (mesin==true)
            ac=true;
        System.out.println("AC menyala");
    }
    public void nyalakanmesin() {
        mesin = true;
        System.out.println("Mesin menyala");
    }
    public void matikanmesin() {
        mesin = false;
        System.out.println("Mesin mati");
    }
    public void tambahkangerigi() {
        if (mesin)
            gerigi++;    
    }
    public void turunkangerigi() {
        if (mesin)
            gerigi--;
    }
    public void tekangas() {
        if (mesin)
            kecepatan+=10;
    }
    public void tekanrem() {
        if (mesin)
            kecepatan-=10;
    }
    public int getkecepatan(){
        return kecepatan;
    }
    public int getgerigi(){
        return gerigi;
    }
}