import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveandturn();
        eat();
    }
    
    public void moveandturn(){
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat(){
        Actor Target;
        Target = getOneObjectAtOffset(0, 0, Target.class);
        if(Target != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Target);
            addScore();
        }
    }
    
    public void addScore(){
        if(!getWorld().getObjects(Counter.class).isEmpty()){
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
        }
    }
}
