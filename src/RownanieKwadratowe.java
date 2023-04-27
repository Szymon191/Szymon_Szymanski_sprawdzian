/**
 * Opis: Klasa ktora przyjmuje 3 liczby a,b,c, posiada metode oblicz(), metody get(), zmodyfikowanego ToString()
   oraz equals i hashCode
 * @a, @b, @c : <liczby typu double> przechowuja liczby wykorzytywane w metodach
 * @oblicz() : <List> metoda wyliczajaca delte, sprawdza czy delta jest mniejsza od zera to zwraca pusta liste, jesli
    delta == 0 to dodaje do listy pierwiastek i zwraca liste, w ostatnim przypadku gdy delta > 0 wylicza 2 pierwiastki
    dodaje je do listy i zwraca liste
 * @ToString(): <typ String> metoda zwraca rownanie
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class RownanieKwadratowe {
    private double a,b,c;

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static List oblicz(double a, double b, double c)
    {
        List list = new List();
        double pierwiastek;
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            return list;
        }
        else if (delta == 0)
        {
            pierwiastek = -b/2* a;
            list.add(String.valueOf(pierwiastek));
        }
        else
        {
            pierwiastek = -b+Math.sqrt(delta) / 2 * a;
            double piewr2 = -b-Math.sqrt(delta) / 2 * a;
            list.add(String.valueOf(pierwiastek));
            list.add(String.valueOf(piewr2));
        }
        return list;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RownanieKwadratowe that)) return false;
        return Double.compare(that.getA(), getA()) == 0 && Double.compare(that.getB(), getB()) == 0 && Double.compare(that.getC(), getC()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "RownanieKwadratowe{" + getA() + "x^2 +" + getB()+ "x + " + getC()+'}';
    }
}
