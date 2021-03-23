import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        addObject(new Crab(),150,150); 
        addObject(new lobster(),400, 100); 
        addObject(new lobster(),400, 300);
        addObject(new lobster(),400, 500);
        addObject(new worm(),10, 500);
        addObject(new worm(),300, 60);
        addObject(new worm(),450, 450);
        addObject(new worm(),200, 300);
        addObject(new worm(),150, 50);
        addObject(new worm(),350, 450);
        addObject(new worm(),500, 100);
        addObject(new worm(),450, 20);
        addObject(new worm(),360, 20);
        addObject(new worm(),10, 50);
    }
    
}