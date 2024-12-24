package lesson_9_homework.Task_2_Shapes;

public class Triangle extends Figure{

    private int lengthFirstSide;
    private int lengthSecondSide;
    private int lengthThirdSide;


    public Triangle (String typeShape, int lengthFirstSide,int lengthSecondSide, int lengthThirdSide) {
        super(typeShape);
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;
    }


    // Условие существование треугольника: Треугольник существует только тогда, когда сумма любых двух
    // его сторон больше третьей. Если условие не соблюдено, такого треугольника не существует

    private boolean verifyExistence() {
        return lengthFirstSide + lengthSecondSide > lengthThirdSide &&
                lengthFirstSide + lengthThirdSide > lengthSecondSide &&
                lengthSecondSide + lengthThirdSide > lengthFirstSide;
    }


    @Override
    public int calculatePerimeter() {
        if (verifyExistence()) {
            int resultOfPerimeter = lengthFirstSide + lengthSecondSide + lengthThirdSide;
            System.out.println("Perimeter of the triangle: " + resultOfPerimeter);
            return resultOfPerimeter;
        }
        else {
            return 0;
        }

    }


    // использование формулы Герона
    @Override
    public void calculateSquare() {

        if (verifyExistence()) {
            int halfPerimeter = (lengthFirstSide + lengthSecondSide + lengthThirdSide) / 2;
            double resultOfSquare = Math.sqrt(halfPerimeter * (halfPerimeter - lengthFirstSide) *
                    (halfPerimeter - lengthSecondSide) * (halfPerimeter - lengthThirdSide));

            System.out.println("Square of the triangle: " + resultOfSquare + "\n\n");

        } else {
            System.out.println("The triangle is not valid. Please enter valid side lengths.\n\n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nlength 1 side: " + lengthFirstSide + "\nlength 2 side: " + lengthSecondSide
                + "\nlength 3 side: " + lengthThirdSide;
    }
}


