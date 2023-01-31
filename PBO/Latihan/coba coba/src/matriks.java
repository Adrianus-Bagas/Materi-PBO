public class matriks {
    public static void main(String[] args){
        hewan h1=new kucing();
        System.out.println("Nilai x="+h1.x);
        h1.suara();
        hewan h2=new anjing();
        System.out.println("Nilai x="+h2.x);
        h2.suara();
    }
}
class hewan{
    int x=0;
    public void suara(){
        System.out.println("duarr");
    }
}
class kucing extends hewan{
    int x=10;
    public void info(){
        System.out.println("meow");
    }
}
class anjing extends hewan{
    int x=7;
    public void suara(){
        System.out.println("guguk");
    }
}
