import java.util.*;

class Solution {
    public int maxProduct(int n) {

        int s = 0;
        ArrayList<Integer> ne = new ArrayList<>();

        while (n > 0) {
            ne.add(n % 10);
            n /= 10;
        }

        for (int i = 0; i < ne.size() - 1; i++) {

            for (int j = i + 1; j < ne.size(); j++) {

                if (ne.get(i) * ne.get(j) > s) {
                    s = ne.get(i) * ne.get(j);
                }
            }
        }

        return s;
    }
}