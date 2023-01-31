public class myKendaraanClass implements myKendaraanInterface{
    private String merk;
    private String BahanBakar;
    private int jmlhroda;
    
    @Override
    public void setMerk1(String m){
        this.merk=m;
    }
    @Override
    public void setBahanBakar1(String bb){
        this.BahanBakar=bb;
    }
    @Override
    public void setJmlroda1(int r){
        this.jmlhroda=r;
    }
    @Override
    public String getMerk1(){
        return merk;
    }
    @Override
    public String getBahanBakar1(){
        return BahanBakar;
    }
    @Override
    public int getJmlroda1(){
        return jmlhroda;
    }
    @Override
    public void info1(){
        System.out.println("Merk Kendaraan        : "+getMerk1());
        System.out.println("Bahan Bakar Kendaraan : "+getBahanBakar1());
        System.out.println("Jumlah roda Kendaraan : "+getJmlroda1());
    }

    public void setMerk1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBahanBakar1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setJmlroda1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
