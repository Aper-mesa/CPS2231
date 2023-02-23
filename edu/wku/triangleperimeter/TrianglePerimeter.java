package edu.wku.triangleperimeter;

public class TrianglePerimeter {
    public static double computeTrianglePerimeter(double edge1, double edge2, double edge3) {
        if ((edge1 + edge2) <= edge3) return -1.0;
        return edge1 + edge2 + edge3;
    }
}
