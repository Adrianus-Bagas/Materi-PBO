public class Database {
    private long harga,token1,token2,token3;
    public long getToken1() {
        return token1;
    }
    public void setToken1(long token1) {
        this.token1 = token1;
    }
    public long getToken2() {
        return token2;
    }
    public void setToken2(long token2) {
        this.token2 = token2;
    }
    public long getToken3() {
        return token3;
    }
    public void setToken3(long token3) {
        this.token3 = token3;
    }
    public long getHarga() {
        return harga;
    }
    public void setHarga(long harga) {
        this.harga = harga;
    }
    private String nomormeter,rekening,telepon,pdam;
    public String getPdam() {
        return pdam;
    }
    public void setPdam(String pdam) {
        this.pdam = pdam;
    }
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