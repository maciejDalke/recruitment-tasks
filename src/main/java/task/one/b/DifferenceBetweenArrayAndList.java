package task.one.b;

import java.util.LinkedList;

/**
 * 1.B. Czym różni się tablica od listy liniowej?
 *     W javie tablica to prosty obiekt, który może przechować więcej niż jedną zmienną. Lista również może przechować wiecej niż jedną zmienną jednak jest już obiektem złożonym.
 *    Deklaracja tablicy:
 *          int[] array = new int[size];
 *     Deklaracja listy (LinkedList)
*           LinkedList<Type> linkedList = new LinkedList<>();
 *
 *    Tablice i listy pełnią taką samą funkcję jednak różnią sie czasem dostępu do poszczególnych pól oraz wykorzystuje się je do innego typu operacji.
 *    W tablicach możliwe jest szybkie przechodzenie między wszystkimi elementami ponieważ są dostępne pod odpowiednim indeksem (dostęp do losowych pól).
 *    Tablica przy inicjalizacji ma podaną wielkość, jeśli skończą się indeksy, trzeba stworzyć nową tablcę i przepisać elementy.
 *    Lista nie posiada zadeklarowanej wielkości, można jej nadać wielkość, jednak sama lista jest w stanie dynamicznie zmieniać swoją wielkość.
 *    Listy, jeśli chodzi o użytkowanie ich w celu wyrywkowego dostępu do elementów jest wolniejsza, ponieważ nie ma indeksów,
 *    każdy z elementów prócz pierwszego i ostatniego posiadają "linki" do elementu poprzedniego jak i następnego (jeśli mamy listę dwukierunkową),
 *    pierwszy posiada jedynie do kolejnego elementu a ostatni do przedostatniego.
 *    Dodanie elementu w tablicy nie na końcu spowoduje przepisanie całej pozostałej częsci tablicy w nowe indeksy. Jeśli dodawany element jest na końcu dorównuje to liście.
 *    Lista wyszukuje miejsce i zamienia w poprzednim adres następnego elementu i w następnym poprzedniego elementu umieszczając tam żądaną wartość.
 *    Lista implementuje interface Collecton. Listy to np LinkedList, ArrayList. Listy posiadają metody do dodawania odejmowania sortowania i innych operacji które można na nich wywołać.
 *    Tablice można rzutować na Listy i z listy zrobić tablicę.
 *    Pod spodem Listy znajduje się tablica.
 *    Występują w Javie również sety i mapy.
 *
 */


public class DifferenceBetweenArrayAndList {
    public static void main(String[] args) {
        // deklaracja tablicy liczb całkowitych
        int[] array = new int[10];

        array[3] = 14;
        array[5] = 14;
        // nadpisanie wartości na indeksie 3
        array[3] = 15;
        // deklaracja linkowanej listy liczb całkowitych
        var linkedList = new LinkedList<Integer>();

        linkedList.add(10);
        linkedList.addFirst(12);
        linkedList.add(13);
        System.out.println("List contains number - " + linkedList.contains(12));
    }


}
