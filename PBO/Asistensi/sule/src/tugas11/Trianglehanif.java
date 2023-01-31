package tugas11;

public class Trianglehanif extends geometricobjecthanif{
    private double side1,side2,side3;
    public Trianglehanif(){
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }
    public Trianglehanif(double side1,double side2,double side3,String color){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1=side1;
    }
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2=side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide3(double side3){
        this.side3=side3;
    }
    public boolean filled(){
        double s = (getSide1()+getSide2()+getSide3())/2;
        return s>getSide1()&&s>getSide2()&&s>getSide3();
    }
    public double getArea(){
        if (filled()==true){
            double s = (getSide1()+getSide2()+getSide3())/2;
            return Math.sqrt(s*(s - getSide1())*(s - getSide2())*(s - getSide3()));
        }
        else
            return 0;
    }
    public double getPerimeter(){
        if(filled()==true)
            return getSide1()+getSide2()+getSide3();
        else
            return 0;
    }
    @Override
    public String toString(){
        return"/nTrianglehanif:/nside1 = "+side1+"/side2 ="+side2+"/nside3="+side3+"/nwarna="+color;
    }
}
