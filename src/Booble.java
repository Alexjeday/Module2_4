public class Booble {
    public static void main(String[] args) {
        int[] ar={30, 20, 10, 9, 8, 7,5};
        boolean sort = false;

        while(!sort) {
            sort = true;
            for (int i = 0; i < ar.length -1; i++) {
                if (ar[i] > ar[i+1]) {
                    int temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    sort = false;
                }
            }

            }
        for (int i : ar) {
            System.out.println(i);
        }
    }
}
