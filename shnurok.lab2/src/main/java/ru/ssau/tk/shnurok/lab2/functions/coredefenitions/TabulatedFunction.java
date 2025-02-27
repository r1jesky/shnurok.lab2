package ru.ssau.tk.shnurok.lab2.functions.coredefenitions;

import ru.ssau.tk.shnurok.lab2.functions.realizations.Point;

import java.util.Iterator;

public interface TabulatedFunction extends MathFunction, Iterable <Point>{
    int getCount();

    double getX(int index);
    double getY(int index);

    void setY(int index, double value);

    int indexOfX(double x);
    int indexOfY(double y);

    double leftBound();
    double rightBound();

    Iterator<Point> iterator();

}
