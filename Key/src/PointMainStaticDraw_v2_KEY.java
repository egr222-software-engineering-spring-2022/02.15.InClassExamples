import java.awt.*;

public class PointMainStaticDraw_v2_KEY {
    public static void main(String[] args) {
        DrawingPanel pnl = new DrawingPanel(200, 200);
        Graphics g = pnl.getGraphics();

        // create two Point objects
        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        draw(p1, g);

        Point p2 = new Point();
        p2.x = 51;
        p2.y = 79;

        draw(p2, g);
    }

    public static void draw(Point p, Graphics g) {
        g.fillOval(p.x, p.y, 3, 3);
        g.drawString("(" + p.x + ", " + p.y + ")", p.x, p.y);
    }
}