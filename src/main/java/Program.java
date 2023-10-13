//public class Program {
////процедурный подход
//    static double distance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//    }
//
//    public static void main(String[] args) {
//        int ax = 0;
//        int ay = 0;
//        int bx = 0;
//        int by = 0;
//        System.out.println(distance(ax, ay, bx, by));
//    }
//}

//а теперь как нужно в ООП
public class Program {

    static double distance (Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        a.setX(12);

        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a);

        Point2D b = new Point2D(10);
        System.out.println(b);

        System.out.println(distance(a, b));
    }
}
