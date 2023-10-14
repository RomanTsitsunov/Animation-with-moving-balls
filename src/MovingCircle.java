import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class MovingCircle extends JComponent implements ActionListener {

    private final double scale;
    private final Color color;
    private final Timer timer;
    private double x;
    private double y;
    private final double vxstart;
    private final double vystart;
    private double vx = 0;
    private double vy = 0;
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public MovingCircle(double x, double y, double vx, double vy,
                        int x1, int y1, int x2, int y2) {
        this.scale = 1.0;
        this.color = Color.red;
        this.timer = new Timer(20, this);
        this.x = x;
        this.y = y;
        this.vxstart = vx;
        this.vystart = vy;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        setPreferredSize(new Dimension(x2, y2));
    }

    public void start() {
        vx=vxstart;
        vy=vystart;
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        int width = x2 - x1;
        int height = y2 - y1;
        g.fillRect(x1, y1, width, height);
        g2d.setColor(Color.black);
        g2d.drawRect(x1, y1, width - 1, height - 1);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.scale(scale, scale);
        if (x >= x2 - 20 || x <= x1) {
            vx = -vx;
        }
        if (y >= y2 - 20 || y <= y1) {
            vy = -vy;
        }
        x += vx;
        y += vy;
        Ellipse2D el = new Ellipse2D.Double(x, y, 20, 20);
        g2d.fill(el);
    }
}