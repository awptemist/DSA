import java.util.Scanner;

public class AreaOfTri {
    public static void main(String[] args) {
        System.out.println("Enter the height of Triangle");
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        System.out.println("Enter the base of Triangle");
        in = new Scanner(System.in);
        int B = in.nextInt();
        int area = (H * B) / 2;
        System.out.println("Area of Triangle " + area);
    }
}
