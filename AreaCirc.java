import java.util.Scanner;

public class AreaCirc {
    public static void main(String[] args) {
        double pi = 3.14;
        System.out.println("Please Enter the radius");
        Scanner in = new Scanner(System.in);
        double r = in.nextInt();
        double area = pi * (r * r);
        System.out.println("Area of circle is " + area);

    }
}
