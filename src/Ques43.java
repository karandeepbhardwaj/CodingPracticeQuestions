class Coordinate {
    int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Ques43{
    public static void main(String args[]) {
        Coordinate p = new Coordinate(2, 3);
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
