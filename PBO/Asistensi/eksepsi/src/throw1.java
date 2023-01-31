public class throw1 {
    private String nim,nama;
    public void setNIM(String nim){
        try{
            this.nim=nim;
            if(nim==null){
                throw new NullPointerException();
            }
        } catch(NullPointerException npe){
            System.out.println("Kesalahan   : NIM tidak boleh null");
        }
    }
    public String getNIM(){
        return nim;
    }
    public void setNama(String nama){
        try{
            this.nama=nama;
            if(nama==null){
                throw new NullPointerException();
            }
        } catch(NullPointerException npe){
            System.out.println("Kesalahan   : Nama tidak boleh null");
        }
    }
    public String getNama(){
        return nama;
    }
}
class demo{
    public static void main(String[] args){
        throw1 t=new throw1();
        t.setNIM("dfghjk");
         t.setNama(null);
        System.out.println("\nNIM     : "+t.getNIM());
        System.out.println("Nama    : "+t.getNama());
    }
}