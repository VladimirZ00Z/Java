import java.util.*;

public class Ex1_2 {

        public static void main(String[] args) {
            List list = Arrays.asList(1, 2, "Qw", 1, 2);
//        System.out.println(ex2(list));
            ex3();
        }

        public static Set ex2(List arList) {
            Set set = new HashSet();
            for (int i = 0; i < arList.size(); i++) {
                set.add(arList.get(i));
            }
            return set;


        }

        public static void ex3() {
            List<Integer> arList = new ArrayList<Integer>();
            int i = 0;
            long startTimeArList = System.nanoTime();
            while (i < 1000000) {
                arList.add(i);
                i++;
            }
            long endTimeArList = System.nanoTime();
            long durationArList = (endTimeArList - startTimeArList);

            List<Integer> linList = new LinkedList<Integer>();
            int j = 0;
            long startTimeLinList = System.nanoTime();
            while (j < 1000000) {
                arList.add(j);
                j++;
            }
            long endTimeLinList = System.nanoTime();
            long durationLinList = (endTimeLinList - startTimeLinList);

            System.out.println("Время выполнения 1 000 000 значений ArrayList - " + durationArList);
            System.out.println("Время выполнения 1 000 000 значений LinkedList - " + durationLinList);
        }
}

