import java.util.Scanner;

public class Main {
    private static final Controller controller = new Controller();
    public static void init() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Координата прямоугольника x1 = ");
            if(controller.setX1(scanner.nextInt())) {
                break;
            }
            System.out.println("x1 должен находиться в диапазоне [0, 1000]");
        }

        while (true) {
            System.out.print("Координата прямоугольника y1 = ");
            if(controller.setY1(scanner.nextInt())) {
                break;
            }
            System.out.println("y1 должен находиться в диапазоне [0, 1000]");
        }

        while (true) {
            System.out.print("Координата прямоугольника x2 = ");
            if(controller.setX2(scanner.nextInt())) {
                break;
            }
            System.out.println("x2 должен находиться в диапазоне (x1 , 2000]");
        }

        while (true) {
            System.out.print("Координата прямоугольника y2 = ");
            if(controller.setY2(scanner.nextInt())) {
                break;
            }
            System.out.println("y2 должен находиться в диапазоне (y1, 2000]");
        }

        while (true) {
            System.out.print("Координата шарика x = ");
            if(controller.setX(scanner.nextInt())) {
                break;
            }
            System.out.println("x должен находиться в диапазоне [x1, x2]");
        }

        while (true) {
            System.out.print("Координата шарика y = ");
            if(controller.setY(scanner.nextInt())) {
                break;
            }
            System.out.println("y должен находиться в диапазоне [y1, y2]");
        }

        while (true) {
            System.out.print("Скорость шарика vx = ");
            if(controller.setVx(scanner.nextInt())) {
                break;
            }
            System.out.println("vx должен находиться в диапазоне [-10, 10]");
        }

        while (true) {
            System.out.print("Скорость шарика vy = ");
            if(controller.setVy(scanner.nextInt())) {
                break;
            }
            System.out.println("vy должен находиться в диапазоне [-10, 10]");
        }
    }
    public static void main(String[] args) {
        init();
    }
}