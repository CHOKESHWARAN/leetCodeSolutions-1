class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] inv : invocations) adj[inv[0]].add(inv[1]);

        boolean[] sus = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        sus[k] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u]) {
                if (!sus[v]) {
                    sus[v] = true;
                    q.add(v);
                }
            }
        }

        for (int[] inv : invocations) {
            if (!sus[inv[0]] && sus[inv[1]]) {
                List<Integer> res = new ArrayList<>();
                for (int i = 0; i < n; i++) res.add(i);
                return res;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sus[i]) res.add(i);
        }
        return res;
        
    }
}