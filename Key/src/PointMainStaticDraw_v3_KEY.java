import java.awt.*;

public class PointMainStaticDraw_v3_KEY {
    public static void main(String[] args) {
        DrawingPanel pnl = new DrawingPanel(200, 200);
        Graphics g = pnl.getGraphics();

        // create two Point objects
        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        p1.toString();
        p1.draw(g);

        Point p2 = new Point();
        p2.x = 51;
        p2.y = 79;

        p2.toString();
        p2.draw(g);
    }
}