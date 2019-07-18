package by.epam.java_introduction.module4.Classes7;

//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class Triangle {
    private int Ax, Ay, Bx, By, Cx, Cy, X1, X2;

    public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        Ax = ax;
        Ay = ay;
        Bx = bx;
        By = by;
        Cx = cx;
        Cy = cy;
    }

    public double getSquare() {
        double result = (this.Bx - this.Ax)*(this.Cy-this.Ay)-(this.Cx-this.Ax)*(this.By-this.Ay);
        if(result<0) result *=-1;
        result /= 2;
        return result;
    }

    public double getPerimeter() {
        double a = Math.sqrt((this.Ax - this.Bx) * (this.Ax - this.Bx) + (this.Ay - this.By) * (this.Ay - this.By));
        double b = Math.sqrt((this.Ax - this.Cx) * (this.Ax - this.Cx) + (this.Ay - this.Cy) * (this.Ay - this.Cy));
        double c = Math.sqrt((this.Bx - this.Cx) * (this.Bx - this.Cx) + (this.By - this.Cy) * (this.By - this.Cy));
        return a + b + c;
    }

    public String getCrossMed() {
        double x = (this.Ax+this.Bx+this.Cx)/3;
        double y = (this.Ay+this.By+this.Cy)/3;
        return "("+x+", "+y+")";
    }
}
