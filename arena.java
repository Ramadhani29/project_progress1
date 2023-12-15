import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class arena extends World
{

    /**
     * Constructor for objects of class arena.
     * 
     */
    public arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("SILAHKAN PILIH ARENA : ",300,100); 
        //mengatur letak. 300 = kiri kanan, 100 = atas bawah
        
        arena1 arena1 = new arena1();
        addObject(arena1,132,300);
        showText("ARENA 1 ",140,350);
        arena2 arena2 = new arena2();
        addObject(arena2,288,300);
        showText("ARENA 2 ",290,350);
        arena3 arena3 = new arena3();
        addObject(arena3,455,300);
        showText("ARENA 3 ",470,350);
        
    }
}
