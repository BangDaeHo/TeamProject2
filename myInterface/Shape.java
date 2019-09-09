package myInterface;

/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
interface Shape{   
    final double PI = 3.14;        
    void draw();                  
    double getArea();             
    default public void redraw(){       
        System.out.print("--- 다시 그립니다. ");      
        draw();   
    } 
}