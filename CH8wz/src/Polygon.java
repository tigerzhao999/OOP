
public class Polygon {
    double points[][] = {
            {1,1},
            {4,1},
            {1,5},
            {4,5}
    };

    double distance(double[] p1, double[] p2){
        return Math.sqrt((p2[0] - p1[0]) * (p2[0] - p1[0]) +
                (p2[1] - p1[1]) * (p2[1] - p1[1]));
    }

    double perimeter(){
        double perm = distance(points[points.length - 1], points[0]);
        for(int i = 1; i < points.length; i++){
            perm = perm + distance(points[i-1], points[i]);
        }
        return perm;
    }
    double areaContrib(double[] p1, double[] p2) {
        return p1[0]*p2[1] - p1[1]*p2[0];
    }

    double area() {
        double a = areaContrib(points[points.length - 1], points[0]);
        for (int i = 1; i < points.length; i++) {
            a = a + areaContrib(points[i - 1], points[i]);
        }
        return a/2;
    }
    public static void main(String[] args) {
        Polygon poly = new Polygon();
        System.out.println("area is " + poly.area());
        System.out.println("Perm is " + poly.perimeter());


    }
}
