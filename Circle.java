
package lab04b;

import static java.lang.Math.pow;


public class Circle {
    
    //Instance Fields
    float radius;
    Point p;
    int layer;
    
    
    
    //Constructor

    public Circle(float radius, Point p, int layer) {
        this.radius = radius;
        this.p = p;
        this.layer = layer;
    }
    
    
    //Getter methods

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        
        float a = (float) (pow(radius, 2) * Math.PI);
       
        return a;
    }

    public String toString() {
        
        String string;
        string =  "(" + p.getX() + "," + p.getY() + "): " + "(" + getArea() + ")";
        
        return string;
    }

    public Point getPoint() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    
    
    
}
