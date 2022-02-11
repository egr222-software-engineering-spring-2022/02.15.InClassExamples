import java.awt.*;

public class Point {
    int x;
    int y;

    public Point() {
        this(0,0);
    }

    public Point(int initialX) {
        this(initialX, 0);
    }

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        g.fillOval(x,y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x+5, y-5);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
