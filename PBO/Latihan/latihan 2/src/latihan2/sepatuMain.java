package latihan2;
public class sepatuMain {
    public static void main(String[] args){
        sepatuClass s1=new sepatuClass();
        sepatuClass s2=new sepatuClass();
        sepatuClass s3=new sepatuClass();//constructor tak berparameter//
        sepatuClass s4=new sepatuClass("Kicker",42);//constructor berparameter//
        s1.setMerk("Adidas");
        s1.setUkuran(41);
        s1.infosepatu();
        System.out.println();
        s2.setMerk("Nike");
        s2.setUkuran(45);
        System.out.println("Merknya : "+s2.getMerk());
        System.out.println();
        s2.infosepatu();
        System.out.println();
        s3.infosepatu();//contructor tak berparameter//
        System.out.println();
        s4.infosepatu();//constructor berparameter//
        s4.setMerk("Kucing");
        s4.infosepatu();
    }
}