package paketDua;
import paketSatu.ClassPaket1;
public class ClassPaket2{
    ClassPaket1 cp1=new ClassPaket1();
    public void test(){
       ClassPaket1.dataPublicClassPaket1="Duren";
    }
    public static void testStatic(){
        ClassPaket1.dataPublicStaticClassPaket1="Duren";
    }
    public void testInstance(){
        cp1.dataPublicClassPaket1="rawon";
    }
}
