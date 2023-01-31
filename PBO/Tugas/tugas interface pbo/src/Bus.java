public class Bus extends MobilTransportasi {
    private boolean mesin, tape, tv, ac;
    private int gerigi = 0;
    private int kecepatan = 0;
    public void nyalakantape(){
        if (mesin==true){
            tape = true;
            System.out.println("Tape menyala");
        }   
    }
    public void nyalakantv(){
        if(mesin==true)
            tape = true;   
        System.out.println("TV menyala");
    }
    public void nyalakanac(){
        if (mesin==true){
            ac = true;
            System.out.println("AC menyala");
        }   
    }
    public void nyalakanmesin(){
        mesin = true;   
        System.out.println("Mesin menyala");
    }
    public void matikanmesin(){
        mesin = false;
        System.out.println("Mesin mati");
    }
    public void tambahkangerigi(){
        if (mesin==true)
            gerigi++;   
    }
    public void turunkangerigi(){
     if(mesin==true)
         gerigi--;
    }
    public void tekangas(){
        if(mesin==true)
            kecepatan+=10;
    }
    public void tekanrem(){
        if (mesin==true)
            kecepatan-=10;
    }
    public void tambahpenumpang() {
        int penumpang = 0;
        if(penumpang<jmlkursi)
            penumpang--;   
    }
    public int getkecepatan(){
        return kecepatan;
    }
    public int getgerigi(){
        return gerigi;
    }
}