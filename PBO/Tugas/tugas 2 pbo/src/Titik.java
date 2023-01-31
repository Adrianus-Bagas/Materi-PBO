public class Titik{
    private int x,y;
    public Titik(){
        this.x=0;
        this.y=0;
    }
    public Titik(int x1,int y1){
        this.x=x1;
        this.y=y1;
    }
    public void setX(int x1){
        this.x=x1;
    }
    public void setY(int y1){
        this.y=y1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void info(){
        System.out.print("("+this.x+","+this.y+")");
    }
    public Titik Geser(Titik p){
        Titik geser=new Titik();
        geser.x=this.x+p.x;
        geser.y=this.y+p.y;
        return geser;
    }
    public void infokuadran(){
        if((this.x>0)&&(this.y>0)){
            System.out.println("Kuadran I");
        } else if ((this.x<0)&&(this.y>0)){
            System.out.println("Kuadran II");
        } else if ((this.x<0)&&(this.y<0)){
            System.out.println("Kuadran III");
        } else if(this.x==0&&this.y==0){
            System.out.println("Titik Pusat");
        } else if(this.x>0&&this.y<0){
            System.out.println("Kuadran IV");
        } else{ 
            System.out.println("Titik terletak pada sumbu");   
        }
    }
    public double jarak(Titik p, Titik q){
        double j=Math.sqrt((q.x-p.x)*(q.x-p.x)+(q.y-p.y)*(q.y-p.y));
        return j;
    }
    public boolean segaris(Titik p1, Titik p2){
        double m1,m2;
        m1=(double)(this.y-p2.y)/(this.x-p2.x);
        m2=(double)(p1.y-this.y)/(p1.x-this.x);
        boolean satu=false;
        if(m1==m2){
            satu=true;
        }
        return satu;
    }
    public Titik refleksi(String p){
        Titik refleksi=new Titik();
        if(p=="x"){
            refleksi.x=this.x;
            refleksi.y=this.y*-1;
        } else if(p=="y"){
            refleksi.x=this.x*-1;
            refleksi.y=this.y;
        } else {
            refleksi.x=this.x*-1;
            refleksi.y=this.y*-1;
        }
        return refleksi;
    }
}
