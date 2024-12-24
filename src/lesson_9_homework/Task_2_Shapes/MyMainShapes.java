package lesson_9_homework.Task_2_Shapes;

public class MyMainShapes {

    public static void main(String[] args)  {

        // При задании сторон треугольника учитывается условие его существования: Треугольник существует только
        // тогда, когда сумма любых двух его сторон больше третьей.
        Figure[] shapes = new Figure[] {
                new Circle("circle 1", 8),
                new Triangle("triangle 1",14,6,7),
                new Rectangle("rectangle 1",7,9),
                new Triangle("triangle 2",11,12,8),
                new Circle("circle 2", 6)
        };

        int resultAmountOfPerimeter = 0;

        for (Figure typeShape : shapes) {
            System.out.println(typeShape + "\n-----------------------------------------");
            resultAmountOfPerimeter += typeShape.calculatePerimeter();
            typeShape.calculateSquare();
        }

        System.out.println("********\nTotal sum of all shape's perimeter is " + resultAmountOfPerimeter +"\n********");


    }
}
