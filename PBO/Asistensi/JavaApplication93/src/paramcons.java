public class paramcons {
    private String nama,nim;
    int semester;
    public paramcons(String n, int s, String nim){
        this.nama=n;
        this.nim=nim;
        this.semester=s;
    }
    public void info(){
        System.out.println(nama+" dengan nim "+nim+" semester "+semester);
    }
    public static void main(String[] args){
        paramcons p1=new paramcons("Zayn",3,"234567");
        p1.info();
    }
}
