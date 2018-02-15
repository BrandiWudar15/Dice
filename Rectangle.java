
package lab04b;


public class Rectangle {
    
  
    //Instance Fields
    float length;
    float width;
    Point p;
    int layer;
    
    
    
    
    //Constructor

    public Rectangle(float length, float width, Point p, int layer) {
        this.length = length;
        this.width = width;
        this.p = p;
        this.layer = layer;
        
     
        
    }
    
    
    //Getter methods

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
    
    public float getArea() {
        
        float a = length * width;

        return a;
        
    }

    public String toString() {
        
        String string;
        string =  "(" + p.getX() + "," + p.getY() + "): " + "[" + getArea() + "]";
        
        return string;
    }

    public Point getPoint() {
        return p;
    }

    public int getLayer() {
        return layer;
    }
    
    

    




}
