import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @Ryan Bishop 
 * @version 3-16-21
 */
public class lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
       
       
       if(isTouching(Crab.class))
       {
         removeTouching(Crab.class); 
         Greenfoot.playSound("au.wav");
         Greenfoot.stop();
        
        }   
       
        
        
    }
public void move( )
    {
        move(5);
    }
    }    

