public class pecahan2main {
    public static void main(String[] args){
        pecahan2 p1=new pecahan2();
        pecahan2 p2=new pecahan2(2,4);
        pecahan2 p3=new pecahan2();
        p2.kali(2).info();
        System.out.println("Nilai desimal : "+p1.decimal(p2));
        p3=p1.kali2(p2);
        p3.info();
        
    }
}
