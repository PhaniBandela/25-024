import java.util.Scanner;
public class AraeShape {
    public static void main(String[] args){
        System.out.println("choose a shape to calculate area:");
        System.out.println("1.circle");
        System.out.println("2.square");
        System.out.println("3.triangle");
        System.out.println("4.rectangle");
        Scanner scan=new Scanner(System.in);
        int choise=scan.nextInt();
        double area=0.0f;
        switch(choise){
            case 1:
            System.out.print("enter radius: ");
            double radius=scan.nextDouble();
            area=3.14*radius*radius;
            System.out.print("area of circle: "+area);
            break;

            case 2:
            System.out.print("enter side length: ");
            double side=scan.nextDouble();
            area=side*side;
            System.out.print("area of square: "+area);
            break;

            case 3:
            System.out.print("enter length: ");
            double length=scan.nextDouble();
            System.out.print("enter breath: ");
            double breath=scan.nextDouble();
            area=0.5*length*breath;
            System.out.print("area of triangle: "+area);
            break;

            case 4:
            System.out.print("enter length: ");
            length=scan.nextDouble();
            System.out.print("enter breath: ");
            breath=scan.nextDouble();
            area=length*breath;
            System.out.print("area of rectangle: "+area);
            break;

            default:
            System.out.println("invalid shape: ");

        }
        scan.close();
    }
}
