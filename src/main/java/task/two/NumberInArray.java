package task.two;

/**
 * Mając tablicę int[] numbers, wypełnioną liczbami całkowitymi i posortowaną malejąco ( numbers[i] > numbers[i+1] ), sprawdź czy występuje w niej liczba int x.
 * Metoda powinna zwracać wartość TRUE, jeśli dana liczba występuje oraz FALSE w przeciwnym wypadku.
 * W rozwiązaniu zależy nam na jak najmniejszej złożoności obliczeniowej (priorytet) oraz pamięciowej.
 * Podaj szacowaną złożoność obliczeniową oraz pamięciową. Poniżej sygnatura metody do napisania.
 * private boolean search(int[] numbers, int x){}
 */

public class NumberInArray {
    int[] array = new int[]{20, 18, 17, 14, 11, 9, 6, 4, 2, 1};

    //    złożoność obliczeniowa: O(NLog(N))
    //    złożoność pamięciowa: O(1)
    private boolean search(int[] numbers, int x) {
        if (x < numbers[numbers.length - 1] || x > numbers[0])
            return false;
        if (x == numbers[numbers.length - 1] || x == numbers[0])
            return true;
        return binarySearch(numbers, x, 0, numbers.length - 1);
    }

    private boolean binarySearch(int[] numbers, int x, int first, int last) {
        if (first <= last) {
            int mid = last + (first - last)/2;
            if (x == numbers[mid]) {
                return true;
            }
            if (x < numbers[mid]) {
                return binarySearch(numbers,x,mid+1,last);
            } else {
                return binarySearch(numbers,x,first,mid-1);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        NumberInArray numberInArray = new NumberInArray();
        System.out.println(numberInArray.search(numberInArray.array, 6));
    }

}
