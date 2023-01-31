public class tv {
    private String jenis, merk;
    private int channel;
    private boolean on;
    public tv(){
        channel=0;
        on=false;
    }
    public tv(int ch){
        channel=ch;
        on=false;
    }
    public void setJenis(String j){
        jenis=j;
    }
    public String getJenis(){
        return jenis;
    }
    
}
