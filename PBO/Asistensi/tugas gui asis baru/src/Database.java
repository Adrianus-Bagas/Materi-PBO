public class Database {
    private long harga;

    public long getHarga() {
        return harga;
    }
    public void setHarga(long harga) {
        this.harga = harga;
    }
    private String nomormeter,rekening,telepon;
    public String getRekening() {
        return rekening;
    }
    public void setRekening(String rekening) {
        this.rekening = rekening;
    }
    
    public String getTelepon() {
        return telepon;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    public String getNomormeter() {
        return nomormeter;
    }
    public void setNomormeter(String nomormeter) {
        this.nomormeter = nomormeter;
    }
}