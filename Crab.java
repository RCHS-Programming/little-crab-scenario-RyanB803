import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       if (isAtEdge())
       {
          turn(17);   
       }  
        
        
       if(Greenfoot.getRandomNumber(100)<10)
       {
          turn(  Greenfoot.getRandomNumber(91)-45); 
       }   
        
        
        
       move(); 
       
       if(isTouching(worm.class))
       {
         removeTouching(worm.class);   
        }   
       
       
        lookforworm(); 
        randomTurn(); 
        
        
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
        }
    }
    
    
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10) 
        {
            turn(Greenfoot.getRandomNumber(91)-45); 
        }
    }
    
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(17); 
        }
    }
}


