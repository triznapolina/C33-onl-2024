package lesson_9_homework.Task_2_Shapes;

public class Circle extends Figure {

    private final double piNumber = 3.14;
    private int raduisCircle;


    public Circle (String typeShape, int raduisCircle) {
        super(typeShape);
        this.raduisCircle = raduisCircle;
    }


    @Override
    public int calculatePerimeter() {
        int resultOfPerimeter = (int) (2 * piNumber * raduisCircle);
        System.out.println("Perimeter of the circle: " + resultOfPerimeter);
        return resultOfPerimeter;
    }

    @Override
    public void calculateSquare() {
        double resultOfSquare = piNumber * Math.pow(raduisCircle, 2);
        System.out.println("Square of the circle: " + resultOfSquare + "\n\n");

    }

    @Override
    public String toString() {
        return super.toString() + "\nradius: " + raduisCircle;
    }
}
