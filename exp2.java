class calcarea{
    int x, y;
    double r;
    calcarea(int x){
        this.x = x;
    }
    calcarea(int x, int y){
        this.x = x;
        this.y = y;
    }
    calcarea(double r){
        this.r = r;
    }
    int areaSq(){
        return x * x;
    }
    int areaRect(){
        return x * y;
    }
    double areaCircle(){
        return 3.14 * r * r;
    }
}
public class exp2 {
    public static void main(String[] args){
        calcarea square = new calcarea(10);
        calcarea rectangle = new calcarea(4, 6);
        calcarea circle = new calcarea(10.5);
        System.out.println("A of square: " + square.areaSq());
        System.out.println("A of rectangle: " + rectangle.areaRect());
        System.out.printf("A of circle: %.4f\n", circle.areaCircle());
    }
}