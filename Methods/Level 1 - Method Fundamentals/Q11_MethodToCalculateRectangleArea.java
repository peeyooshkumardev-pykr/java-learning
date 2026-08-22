// Q11 — Method to Calculate Rectangle Area
// Create a method named calculateArea() that accepts the length and width of a rectangle and 
// returns its area.

public class Q11_MethodToCalculateRectangleArea {
    public static void main(String[] args) {
        System.out.print("Area of the rectangle = "+calculateArea(21, 12));
    }

    static int calculateArea(int length,int width){
        return length * width;
    }
}
// OUTPUT
// Area of the rectangle = 252