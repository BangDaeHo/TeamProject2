package base;
import myInterface.Shape;
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * @author (2018315033 태영준, 2018315021 방대호, 2018315051 Yamamoto Yoshika)
 * @version (2019.09.09)
 **/
public class Circle implements Shape
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    int x;
    int y;
    double radius;

    public Circle()
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean equals(Object obj){
        if(c1.equals(c2))
            return true;
        else
            return false;
    }
    
    public void draw(){
        System.out.println("반지름이 " + radius +"인 " + "원입니다.");
    }
    
    public double getArea(){
        return radius * radius * PI;
    }
}
