package task.one.a;

/**
 * 1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?
 * Klasy abstrakcyjne używamy w momencie, gdy chcemy skorzystać z dziedziczenia, aby stworzyć defaultowe zachowanie metod.
 * Klasa abstrakcyjna może rozszerzać tylko jedną klasę. Wykorzystujemy klasę abstrakcyjną, gdy posiadamy niepełną implementację.
 * Gdy klasy rozszerzają klasę abstrakcyjną, mogą mieć kilka wspólnych pól lub metod, które wymagają innych modyfikatorów, niż publiczne.
 * Gdy potrzebujemy metody niefinalnej i niestatycznej.
 *
 * Interfejsy, gdy obiekt potrzebuje implementować różne zachowania z różnych hierarchii klas.
 * Gdy niepowiązane ze sobą klasy mają dzielić między sobą podobne zachowanie, np. compareTo().
 * Gdy w aplikacji nie ma znaczenia gdzie, zostanie zdefiniowany kontrakt, w sensie gdzie znajdzie się implementacja tego zachowania.
 *
 *
 */

public abstract class AbstractClass implements JustInterface{

}
