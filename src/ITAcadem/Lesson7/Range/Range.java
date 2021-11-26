package ITAcadem.Lesson7.Range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        System.out.println("Длина диапазона: " + Math.abs(to-from));
        return Math.abs(to-from);
    }

    public boolean isInside(double x) {
        System.out.println((from <= x && to >= x) ? true : false);
        return (from <= x && to >= x) ? true : false;
    }

    public void print() {
        System.out.println("Начало диапазона: " + from);
        System.out.println("Конец диапазона: " + to);
    }
}
