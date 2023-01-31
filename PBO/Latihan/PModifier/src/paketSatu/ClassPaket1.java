package paketSatu;
public class ClassPaket1 {
    private int data1;
    public String dataPublicClassPaket1;
    public static String dataPublicStaticClassPaket1;
    public ClassPaket1(){
       data1=0;
       dataPublicStaticClassPaket1="semangka";
    }
    public int getData1(){
        return data1;
    }
    protected void infoClassPaket1(){
        System.out.println("Info dari paket 1, classData1 : "+getData1());
    }
}
