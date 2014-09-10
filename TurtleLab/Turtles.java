import java.awt.Color;
public class Turtles
{
    /** description of instance variable x (add comment for each instance variable) */
    
    public Turtles()
    {
        
    }

   
    public static void main(String[] args){
        World turtleWorld = new World ();
        Turtle snapping = new Turtle(200,200,turtleWorld);
        Turtle box = new Turtle(200,200,turtleWorld);
        Turtle musk = new Turtle(250,250, turtleWorld);
        
        // turtle colors
        snapping.setShellColor(Color.GREEN); 
        box.setShellColor(Color.BLUE);
        musk.setShellColor(Color.magenta);
         for( int i =0; i<6; i++){
        musk.turn(30);
        musk.forward(90);
        musk.turn(270);
        musk.forward(50);
        }
        
        for (int i=0; i<4; i++){
            snapping.forward(100);
            snapping.turnRight();
            
            box.forward(100);
            box.turnLeft();            
                      
            snapping.forward(90);
            snapping.turnRight();
                        
            box.forward(90);
            box.turnLeft();
            
            snapping.turn(45);
            snapping.forward(120);
            
            box.turn(315);
            box.forward(120);
            
        musk.forward(100);
        musk.turnRight();
        
        }            

       
        
        
        
        
        
        
        
    }

}
