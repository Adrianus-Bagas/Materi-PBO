public class Televisi implements InterfaceElektronik,InterfaceChannelRadio{
    private boolean mesin;
    private String merk;
    private boolean listrik;
    public Televisi(String merk){
        this.merk=merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return merk;
    }
    public boolean on(){
        listrik=true; mesin=true;
        return listrik;
    }
    public boolean off(){
        listrik=false; mesin=false;
        return listrik;
    }
    public int gantichannel(int c){
        return c;
    }
}