import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The fox.
 * This is the animal we want to catch in our game.
 */
public class Fox extends SmoothMover
{
    GreenfootImage[] images = new GreenfootImage[10];
    SimpleTimer animTimer = new SimpleTimer();

    // Constructor
    public Fox(){
        // Load images    
        for(int i = 0; i < 10; i++){
            images[i] = new GreenfootImage("images/fox/fox_0" + i + ".png");
            images[i].scale(100,100);
        }
        setImage(images[0]);
        animTimer.mark();
        
        
    }
    
    // Called when actor is first added to any world
    public void addedToWorld(World world) {
        // Center the fox on the world
        setLocation(world.getWidth()/2, world.getHeight()/2);
    }
    

    private int animIdx = 0;
    public void animate(){
        if(animTimer.millisElapsed() < 100) {
            return;
        }
        animTimer.mark();
        animIdx = (animIdx + 1) % images.length - 1;
        setImage(images[++animIdx]);
        
    }

    public void act()
    {
        // Add your action code here.
        animate();
        
        if(Greenfoot.isKeyDown("a")){
            move(-2.5);
        }
        if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        // Teleport the fox
        if(Greenfoot.isKeyDown("space")){
            setLocation(10.34,15.89);
        }
    }
}
