import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arena1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arena1 extends Actor
{
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new ChickenWorld());
        }
    }
}
