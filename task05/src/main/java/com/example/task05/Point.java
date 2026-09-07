package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {
    private double x;
    private double y;
    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return y;
    }

    /**
     * Устанавливает координату точки по оси абсцисс
     *
     * @param x координата точки по оси X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Устанавливает координату точки по оси ординат
     *
     * @param y координата точки по оси Y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

}
