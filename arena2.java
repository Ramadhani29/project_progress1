import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class arena2 extends Actor
{
  
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new chikenworld1());
        }
    }
}
