package lesson_9_homework.Task_2_Shapes;

public abstract class Figure {

    private String typeShape;

    public Figure(String typeShape) {
        this.typeShape = typeShape;
    }


    public abstract int calculatePerimeter();

    public abstract void calculateSquare();


    @Override
    public String toString() {
        return "typeShape='" + typeShape + '\'';
    }
}
