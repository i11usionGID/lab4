package ru.labs.figures;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    private List<Figure> figures;

    public Geometry() {
        figures = new ArrayList<>();
    }

    public Geometry(List<Figure> figures) {
        this.figures = figures;
    }

    public void addElement(Figure figure) {
        figures.add(figure);
    }

    public void popElement(Figure figure) {
        for (Figure element:figures) {
           if (element.hashCode() == figure.hashCode()){
               figures.remove(element);
               break;
           }
        }
    }

    public void calculateAllSquares() {
        double sum = 0;
        for (Figure figure:figures) {
            sum = sum + figure.calculateSquare();
        }
        System.out.println("Площадь всех собранных фигур = " + sum);
    }
}
