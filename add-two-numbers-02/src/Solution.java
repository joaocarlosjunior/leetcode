import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Solution {

    public static void addTwoNumbers(LinkedList l1, LinkedList l2){
        List<Integer> listAux = new LinkedList<>();
        List<Integer> response = new LinkedList<>();

        int i = 0;
        int sum = 0;

        ListIterator<Integer> iterator1 = l1.listIterator();
        ListIterator<Integer> iterator2 = l2.listIterator();

        while (iterator1.hasNext()|| iterator2.hasNext()){

            if(iterator1.hasNext()){
                System.out.println(i + " - Numero list 1: " + iterator1.next());
                sum+=iterator1.next();
            }

            if (iterator2.hasNext()){
                System.out.println(i + " - Numero list 2: " + iterator2.next());
                sum+=iterator2.next();
            }

            listAux.add(sum%10);

            i++;
        }

    }


    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2,4,3));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(5,6,4,6));

        addTwoNumbers(l1,l2);
    }
}
