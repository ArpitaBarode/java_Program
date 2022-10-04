
//47.	Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle.
//Add another method in the above program circlePerimeter to calculate the perimeter of the circle
import java.util.Scanner;
import java.util.concurrent.Callable;

class CIRCLE1{
    double circleArea(int rad){
        return 3.141*rad*rad;
    }
    double circleParimeter(int rad){
        return 2*3.14*rad;
    }

}
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CIRCLE1 c1=new CIRCLE1();
        System.out.println("Enter radius:");
        int r=input.nextInt();
        System.out.println("Area of circle is:"+c1.circleArea(2));
        System.out.println("Parmeter of circle is:"+c1.circleParimeter(2));

    }
}
