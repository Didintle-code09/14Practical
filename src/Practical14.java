import java.util.*;

public class Practical14 {
    public class HashingDataSetup {
        public static void main(String[] args) {
            int N = 1 << 20;

            int[] keys = new int[N];
            for (int i = 0; i < N; i++) {
                keys[i] = i + 1;
            }
            List<Integer> keyList = new ArrayList<>();
            for (int k : keys) {
                keyList.add(k);
            }
            Collections.shuffle(keyList);

            // Step 4: Create key-value pairs
            String[][] keyValuePairs = new String[N][2]; // [key, value]
            for (int i = 0; i < N; i++) {
                keyValuePairs[i][0] = String.valueOf(keyList.get(i)); // key
                keyValuePairs[i][1] = String.valueOf(i + 1);          // value
            }


            int usableSize = 950_000;
            String[][] usableData = Arrays.copyOfRange(keyValuePairs, 0, usableSize);
    }


}
}
