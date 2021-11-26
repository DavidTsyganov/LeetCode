package ITAcadem.Lesson7.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(0, 1);
        Range range2 = new Range(5, 100);

        range1.print();
        range2.print();

        range1.isInside(1);
        range2.isInside(200);

        range1.getLength();

    }


}
