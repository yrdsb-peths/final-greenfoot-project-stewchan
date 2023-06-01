import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The fox.
 * This is the animal we want to catch in our game.
 */
public class Fox extends Actor
{
    GreenfootImage[] images = new GreenfootImage[10];

    public Fox(){
        // Load images    
        for(int i = 0; i < 10; i++){
            images[i] = new GreenfootImage("images/fox/fox_0" + i + ".png");
        }
        setImage(images[0]);
    }

    public void act()
    {
        // Add your action code here.
    }
}
