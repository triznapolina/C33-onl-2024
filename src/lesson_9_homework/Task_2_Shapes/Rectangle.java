package lesson_9_homework.Task_2_Shapes;

public class Rectangle extends Figure {

    private int lengthOfWidth;
    private int lengthOfHeight;

    public Rectangle(String typeShape, int lengthOfWidth, int lengthOfHeight) {
        super(typeShape);
        this.lengthOfHeight = lengthOfHeight;
        this.lengthOfWidth = lengthOfWidth;
    }

    @Override
    public int calculatePerimeter() {
        int resultOfPerimeter = 2 * (lengthOfWidth + lengthOfHeight);
        System.out.println("Perimeter of the rectangle: " + resultOfPerimeter);
        return resultOfPerimeter;
    }

    @Override
    public void calculateSquare() {
        int resultOfSquare = lengthOfWidth * lengthOfHeight;
        System.out.println("Square of the rectangle: " + resultOfSquare + "\n\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\nwidth: " + lengthOfWidth + "\nheight: " + lengthOfHeight;
    }
}
