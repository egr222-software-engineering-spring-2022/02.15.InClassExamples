import java.awt.*;

public class PointMainStaticDraw_v1_KEY {
    public static void main(String[] args) {
        DrawingPanel pnl = new DrawingPanel(200, 200);
        Graphics g = pnl.getGraphics();

        // create two Point objects
        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        g.fillOval(p1.x, p1.y, 3, 3);
        g.drawString("(" + p1.x + ", " + p1.y + ")", p1.x, p1.y);

        Point p2 = new Point();
        p2.x = 51;
        p2.y = 79;

        g.fillOval(p2.x, p2.y, 3, 3);
        g.drawString("(" + p2.x + ", " + p2.y + ")", p2.x, p2.y);
    }
}