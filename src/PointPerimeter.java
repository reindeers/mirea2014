/**
 * Created by m.vlasova on 12.03.2015.
 */

    public class PointPerimeter {
        public static void main(String[] args) {
            Point a = new Point(1, 2);
            Point b = new Point(3, 4);
            Point c = new Point(2, 1);

            Point[] points = {a, b, c};

            System.out.print(perimeter(points));

        }

        private static double dist(Point a, Point b){
             return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        }

        public static double perimeter(Point[] points){
            double result = 0;
            for (int i=0; i < points.length-1; i++){
                result = result + dist(points[i], points[i+1]);
            }

            return result;
        }
    }

