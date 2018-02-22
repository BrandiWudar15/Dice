
package lab04b;



public class Lab04B {


    public static void main(String[] args) {
        

        
        //Variables for Point objects
        int rec1x = 10;
        int rec1y = 20;
        int rec2x = 50;
        int rec2y = 65;
        
        int tri1x = 450;
        int tri1y = 150;
        int tri2x = 200;
        int tri2y = 250;
        
        int circle1x = 300;
        int circle1y = 350;
        int circle2x = 75;
        int circle2y = 85;
        
        
        
        //Variables for shape objects
        float rLength1 = 4;
        float rWidth1 = 10;      
        float rLength2 = 5;
        float rWidth2 = 15;
        
        float base1 = 8;
        float base2 = 10;
        float height1 = 15;
        float height2 = 30;
        
        float radius1 = 6;
        float radius2 = 7;
        
        //Create Point objects array and fill the array
         Point p[];
         p = new Point[6];
         
         p[0] = new Point(rec1x, rec1y);
         p[1] = new Point(rec2x, rec2y);
         p[2] = new Point(tri1x, tri1y);
         p[3] = new Point(tri2x, tri2y);
         p[4] = new Point(circle1x, circle1y);
         p[5] = new Point(circle2x, circle2y);
        
         
        //Create Shape object arrays
        Rectangle r[];
        r = new Rectangle[2];
        
       
        Triangle t[];
        t = new Triangle[2];
        
        Circle c[];
        c = new Circle[2];


        //Create rectangle objects and fill the array
    
            //Rectangle1
            r[0] = new Rectangle(rLength1, rWidth1, p[0], 1);
            r[0].getArea();
            
            System.out.println("Rectangle 1: " + r[0]);
         
            
            //Rectangle2
            r[1] = new Rectangle(rLength2, rWidth2, p[1], 2);          
            r[1].getArea();

            System.out.println("Rectangle 2: " + r[1]);
            
            System.out.println();
           
            float totalRArea =  r[0].getArea() + r[1].getArea();
            System.out.println("Total Rectangle Area = " + totalRArea );
            System.out.println("-------------------------------");
            
            System.out.println();
        
        //Create Triangle objects and fill the array
 
            //Triangle 1
            t[0] = new Triangle(height1, base1, p[2], 3);
            t[0].getArea();

            System.out.println("Triangle 1: " + t[0]);
            
            
            //Triangle 2
            t[1] = new Triangle(height2, base2, p[3], 4);     
            t[1].getArea();
            
           System.out.println("Triangle 2: " + t[1]);
                
           System.out.println();
           
           float totalTArea =  t[0].getArea() + t[1].getArea();
           System.out.println("Total Triangle Area = " + totalTArea );
           System.out.println("-------------------------------");
            
           System.out.println();
        
         //Create Circle objects and fill the array
         
            //Circle 1
            c[0] = new Circle(radius1, p[4], 1);
            c[0].getArea();
            
            System.out.println("Circle 1: " + c[0]);
            
            //Circle 2
            c[1] = new Circle(radius2, p[5], 1);
            c[1].getArea();
            
            System.out.println("Circle 2: " + c[1]);

            System.out.println();
            
            float totalCArea =  c[0].getArea() + c[1].getArea();
            System.out.println("Total Circle Area = " + totalCArea );

     
        
    }
    
}
