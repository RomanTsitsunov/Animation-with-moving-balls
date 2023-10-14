import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    private static final Controller controller = new Controller();

    public static void init() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Координата прямоугольника x1 = ");
            if (controller.setX1(scanner.nextInt())) {
                break;
            }
            System.out.println("x1 должен находиться в диапазоне [0, 800]");
        }

        while (true) {
            System.out.print("Координата прямоугольника y1 = ");
            if (controller.setY1(scanner.nextInt())) {
                break;
            }
            System.out.println("y1 должен находиться в диапазоне [0, 800]");
        }

        while (true) {
            System.out.print("Координата прямоугольника x2 = ");
            if (controller.setX2(scanner.nextInt())) {
                break;
            }
            System.out.println("x2 должен находиться в диапазоне (x1 , 900]");
        }

        while (true) {
            System.out.print("Координата прямоугольника y2 = ");
            if (controller.setY2(scanner.nextInt())) {
                break;
            }
            System.out.println("y2 должен находиться в диапазоне (y1, 900]");
        }

        while (true) {
            System.out.print("Координата шарика x = ");
            if (controller.setX(scanner.nextDouble())) {
                break;
            }
            System.out.println("x должен находиться в диапазоне (x1, x2 - 20)");
        }

        while (true) {
            System.out.print("Координата шарика y = ");
            if (controller.setY(scanner.nextDouble())) {
                break;
            }
            System.out.println("y должен находиться в диапазоне (y1, y2 - 20)");
        }

        while (true) {
            System.out.print("Скорость шарика vx = ");
            if (controller.setVx(scanner.nextDouble())) {
                break;
            }
            System.out.println("vx должен находиться в диапазоне [-10, 10]");
        }

        while (true) {
            System.out.print("Скорость шарика vy = ");
            if (controller.setVy(scanner.nextDouble())) {
                break;
            }
            System.out.println("vy должен находиться в диапазоне [-10, 10]");
        }
    }
    public static void main(String[] args) {
        init();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Moving Circle");
                JPanel panel = new JPanel();
                double x = controller.getX();
                double y = controller.getY();
                double vx = controller.getVx();
                double vy = controller.getVy();
                int x1 = controller.getX1();
                int y1 = controller.getY1();
                int x2 = controller.getX2();
                int y2 = controller.getY2();
                final MovingCircle MovingCircleRed = new MovingCircle
                        (x, y, vx, vy, x1, y1, x2, y2);
                panel.add(MovingCircleRed);
                frame.getContentPane().add(panel);
                final JButton button = new JButton("Start");
                button.addActionListener(new ActionListener() {
                    private boolean pulsing = false;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (pulsing) {
                            pulsing = false;
                            MovingCircleRed.stop();
                            button.setText("Start");
                        } else {
                            pulsing = true;
                            MovingCircleRed.start();
                            button.setText("Stop");
                        }
                    }
                });
                panel.add(button);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(x2 + 100, y2 + 100);
                frame.setVisible(true);
            }
        });
    }
}