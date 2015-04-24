/**
 * Created by m.vlasova on 12.03.2015.
 */

public class PointPerimeter {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);

        Point[] points = {a, b, c};

        System.out.print(perimeter(points));

    }

    private static double dist(Point a, Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public static double perimeter(Point[] points){
        double result = 0;
        for (int i=0; i < points.length; i++){
                result += dist(points[i], points[i+1]);
        }
        result += dist(points[points.length-1], points[0]);
        return result;
    }
}

