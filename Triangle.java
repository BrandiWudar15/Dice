
package lab04b;


public class Triangle {
    
    //Instance Fields
    float height;
    float base;
    Point p;
    int layer;

    
    
    //Constructor

    public Triangle(float height, float base, Point p, int layer) {
        this.height = height;
        this.base = base;
  
        this.p = p;
        this.layer = layer;

    }
    
    
    //Getter methods

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }

    public float getArea() {
        
        float a = (float) (0.5 * base * height);

        return a;
    }

    public String toString() {
        
        String string;
        string =  "(" + p.getX() + "," + p.getY() + "): " + "/" + getArea() + "\\";
        
        return string;
    }

    public Point getPoint() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    
    
    
    
    
    
}
