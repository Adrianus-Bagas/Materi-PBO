package tugas11;
public class TestPersonHanif {

    public static void main(String[] args) {        PersonHanif p = new PersonHanif("Sule","bhaskara","081-001","gmail");
        System.out.println(p.toString());
        
        Students s=new Students("Senior","Sule","bhaskara","081-001","gmail");
        System.out.println(s.toString());
        
        Employee e=new Employee("Dep.Math","100 juta","2018","Sule","bhaskara","081-001","gmail");
        System.out.println(e.toString());
        
        Faculty f=new Faculty("8 jam","satu","Dep.Math","100 juta","2018","Sule","bhaskara","081-001","gmail");
        System.out.println(f.toString());
        
        Staff st=new Staff("S.mat","Dep.Math","100 juta","2018","Sule","bhaskara","081-001","gmail");
        System.out.println(st.toString());
    }
    
}
