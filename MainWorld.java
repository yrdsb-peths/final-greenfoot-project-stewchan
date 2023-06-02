import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main game world.
 * 
 */
public class MainWorld extends World
{
    public MainWorld()
    {    
        super(600, 400, 1);
        
        Fox fox = new Fox();
        addObject(fox, 10, 10);
    }
}
