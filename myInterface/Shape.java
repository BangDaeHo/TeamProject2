package myInterface;

/**
 * Write a description of class Shape here.
 *
 * @author (2018315033 태영준, 2018315021 방대호, 2018315051 Yamamoto Yoshika)
 * @version (2019.09.09)
 */
public interface Shape{   
    final double PI = 3.14;        
    void draw();                  
    double getArea();             
    default public void redraw(){       
        System.out.print("--- 다시 그립니다. ");      
        draw();   
    } 
}