//make variable
public class Point {
    private int x;
    private int y;

    //constructor that sets and accepts both instance variable
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    //constructor that takes a value and set both x and y to it
    public Point(int z) {
        x = z;
        y = z;
    }
//constructor sets x and y to 0
    public Point() {
        x = 0;
        y = 0;
    }
//getter method return int x
    public int getX() {
        return x;
    }
//getter method return int y
    public int getY() {
        return y;
    }
//setter new x parameter name
    public void setX(int newX) {
        x = newX;

    }
//setter new y parameter name
    public void setY(int newY) {
        y = newY;
    }
 //method return string coordinates
    public String coordinate() {
        return "(" + x + " ," + y + ")";
    }
//method that point on graph/quadrants
    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else if (x == 0 && y == 0) {
            quadrant = "origin";
        } else {
            quadrant = "on an axis";
        }
        return quadrant;
    }
}

