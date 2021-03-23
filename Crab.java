import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
     private GreenfootImage image1;
     private GreenfootImage image2;
     private int wormEaten; 
    public Crab()
    {
        image1=new GreenfootImage("crab.png");
        image2=new GreenfootImage("crab2.png");
        setImage(image1); 
    }
   
    public void act()
    {
        
        
       checkKeyPress();
       switchImage();
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
            wormEaten+=1; 
            
            getWorld().showText ("Score:"+wormEaten, 50, 500);
            
            if(wormEaten==10)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            
          
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
    
    public void switchImage()
    {
        if(getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        } 
    }
    
}


