import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       checkKeyPress();
  
       move(); 
       lookforworm(); 
        
        
        
    }
    
    public void move( )
    {
        move(5);
    }
    
    
    public void lookforworm()
    {
        if(isTouching(worm.class))
        {
            removeTouching(worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left"))
       {
           turn(-5); 
       }
       
        if(Greenfoot.isKeyDown("right"))
       {
           turn(5); 
       }
    }
    
    
}


