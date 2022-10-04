class cylinder_intial{
    int radius;
   private int height;


    int getHeight(){
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }
    double area(){
        return (double) 2*3.142*radius*height+2*3.142*radius*radius;
    }
}
public class cylinder {
    public static void main(String [] args){
        cylinder_intial c=new cylinder_intial();
        c.setHeight(9);
        int h = c.getHeight();
        System.out.println(h);
        c.setRadius(12);
        System.out.println(c.getRadius());
        System.out.println(c.area());
    }

}
