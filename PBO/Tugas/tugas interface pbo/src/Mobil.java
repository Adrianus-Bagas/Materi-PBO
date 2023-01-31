public class Mobil implements InterfaceMobil {
      private int gerigi = 0;
    private boolean mesin = false;
    private int kecepatan=0;
    public void nyalakanmesin(){
        mesin = true;
        System.out.println("Mesin menyala");
    }
    
    public void matikanmesin(){
        mesin = false;
        System.out.println("Mesin mati");
    }
    
    public void tambahkangerigi(){
        if (mesin)
            gerigi++;
        if(gerigi==6)
            gerigi = 1;
        System.out.println("Gerigi : "+gerigi);
    }
    
    public void turunkangerigi(){
        if (mesin)
            gerigi--;
        if(gerigi==-1)
            gerigi=5;
    }
    public void tekangas() {
        if (mesin)
            kecepatan++;
    }
    public void tekanrem() {
        if (mesin)
            kecepatan--;
    }
}