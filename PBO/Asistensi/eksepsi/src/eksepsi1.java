public class eksepsi1 {
    public static void main(String[] args){
        int pembilang=7;
        int penyebut=0  ;
        try{
            int hasil=pembilang/penyebut;
            System.out.println("Hasil   : "+hasil);
        } catch(Exception e){
            System.out.println("Kesalahan   : Terdapat pembagian dengan 0");
        }
        
    }
}