import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class burger extends Actor
{
   
    public void act()
    {
        move(-20);
        
        if(getX() <= 0) {
            resetBurger();
        }
    }
    public void resetBurger() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        }else {
            setLocation(600, 300);
        }
    }
    
}
