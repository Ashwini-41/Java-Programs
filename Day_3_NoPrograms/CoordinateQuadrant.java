import java.util.Scanner;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        String quadrant = determineQuadrant(x, y);

        System.out.println("The coordinate (" + x + ", " + y + ") lies in " + quadrant);

        scanner.close();
    }
    static String determineQuadrant(int x,int y){
        if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else if (x > 0 && y < 0) {
            return "Quadrant IV";
        } else if (x == 0 && y == 0) {
            return "the Origin";
        } else if (x == 0) {
            return "the Y-axis";
        } else {
            return "the X-axis";
        }
    }
}
