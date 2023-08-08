
import java.util.Arrays;

public class RandomizeQuestions {
    public static void main(String[] args) {
        Integer[] elio = {1, 2, 4, 5, 7, 9, 14, 15, 16, 33, 36, 53,59};
        Integer[] cainan = {6, 28, 30, 34, 39, 42, 44, 45, 47, 49, 58, 62, 65};
        Integer[] alisson = {51, 10, 31, 20, 3, 22, 64, 17, 41, 50, 8, 11, 54};
        Integer[] victor = {25, 13, 61, 52, 48, 56, 60, 37, 57, 21, 24, 18, 29};
        Integer[] leonardo = {63, 40, 32, 38, 35, 26, 19, 12, 55, 46, 23, 43, 27};

        Arrays.sort(cainan);
        Arrays.sort(alisson);
        Arrays.sort(victor);
        Arrays.sort(leonardo);

        System.out.println("Alisson: " + Arrays.asList(alisson));
        System.out.println("Cainan: " + Arrays.asList(cainan));
        System.out.println("Victor: " + Arrays.asList(victor));
        System.out.println("Leonardo: " + Arrays.asList(leonardo));
//
//        List<Long> a = new ArrayList<>();
//
//        for (int i = 0; i < 65; i++) {
//            boolean found = false;
//
//            for (int j = 0; j < elio.length; j++) {
//                if(i+1 == elio[j]){
//                    found = true;
//                }
//            }
//
//            if(!found) {
//                a.add((long) i+1);
//            }
//        }
//
//        for (int i = 0; i < 13; i++) {
//            int aux = (int) ((Math.random() * (a.size() - 0)) + 0);
//            System.out.println(a.get(aux));
//            a.remove(aux);
//        }
//        System.out.println("-------------");
//        for (int i = 0; i < 13; i++) {
//            int aux = (int) ((Math.random() * (a.size() - 0)) + 0);
//            System.out.println(a.get(aux));
//            a.remove(aux);
//        }
//        System.out.println("-------------");
//        for (int i = 0; i < 13; i++) {
//            int aux = (int) ((Math.random() * (a.size() - 0)) + 0);
//            System.out.println(a.get(aux));
//            a.remove(aux);
//        }
//        System.out.println(a);
    }

    public static String printArrayAsString(int[] a){
        String aux = "";

        for (int i = 0; i < a.length; i++) {
            aux += a[i]+", ";
        }

        return aux;
    }
}
