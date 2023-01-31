public class Database {
    private long harga,sisasaldo;
    private String nomormeter,rekening,telepon;
    public String getRekening() {
        return rekening;
    }
    public void setRekening(String rekening) {
        this.rekening = rekening;
    }
    public long getSisasaldo() {
        return sisasaldo;
    }
    public void setSisasaldo(long sisasaldo) {
        this.sisasaldo = sisasaldo;
    }
    public long getHarga() {
        return harga;
    }
    public void setHarga(long harga) {
        this.harga = harga;
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
