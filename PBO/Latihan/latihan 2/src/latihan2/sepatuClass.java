package latihan2;
public class sepatuClass {
   private String merk;
   private int ukuran;
   //constructor tak berparameter//
   public sepatuClass(){
       this.merk="Bata";
       this.ukuran=39;
   }
   //contructor berparameter//
   public sepatuClass(String me, int uk){
       this.merk=me;
       this.ukuran=uk;
   }
   public void setMerk(String m){
       this.merk=m;
   }
   public void setUkuran(int u){
       this.ukuran=u;
   }
   public String getMerk(){
       return merk;
   }
   public int getUkuran(){
       return ukuran;
   }
   public void infosepatu(){
       System.out.println("Merk Sepatu  : "+getMerk());
       System.out.println("Ukuran Sepatu: "+getUkuran());
   }
}
