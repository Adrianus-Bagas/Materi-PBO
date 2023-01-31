public class eas2 {
//    public static void main(String[] args) {
//        A a=new C();
//        a.foo("Java");
//        C c=new C();
//        c.foo("Java");
//        B b=new D();
//        b.foo("Java");
//        D d=new D();
//        d.foo("Java");
//}
//}
//class A{
//    public void foo(Object o){
//        System.out.println("A");
//    }
//}
//class B{
//    public void foo(String o){
//        System.out.println("B");
//    }
//}
//class C extends A{
//    public void foo(String s){
//        System.out.println("C");
//    }
//}
//class D extends B{
//    public void foo(Object o){
//        System.out.println("D");
//    }
    public int linear(int angka, int[] list){
        boolean temukan=false;
        for(int i=0;i<list.length;i++){
            if(angka==list[i]){
                temukan=true;
                break;
            }
        }
        if(temukan){
            return angka;
        } else {
            return -1;
        }
    }
    public int binary(int angka, int[] list){
         int batasAtas=list.length-1;
        int batasBawah=0;
        boolean notfound=true;
        while (notfound)
        {
            int posisiSekarang = (batasAtas + batasBawah)/2;
            if(list[posisiSekarang] == angka)
            {
                notfound=false;
                return angka;
            }
            else if(batasBawah>batasAtas)
            {
                return -1;
            }
            else
            {
                if(list[posisiSekarang]< angka)
                {
                    batasBawah = posisiSekarang+1;
                }
                else
                {
                    batasAtas = posisiSekarang-1;
                }
            }
        }
        if(notfound){
            return angka;
        } else{
            return -1;
        }
    }
}
class main{
    public static void main(String[] args) {
       int[] list={3,8,6,2};
       int[] urut={1,3,6,8,19};
       eas2 l=new eas2();
        System.out.println(l.linear(3, list));
        System.out.println(l.binary(9, urut));
    }
}