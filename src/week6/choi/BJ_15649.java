package week6.choi;


public class BJ_15649 {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[] arr = new int[m];
        boolean[] visited = new boolean[n];
        int[] tmpResult = new int[m];

        dfs(arr,visited,0,n,m,tmpResult);

    }

    private static void dfs(int[] arr, boolean[] visited, int i, int n, int m, int[] tmpResult) {
        if (i == m){
            for (int j = 0; j < m; j++) {
                System.out.print(tmpResult[j]);
                if (j < m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (visited[j]){
                continue;
            }
            visited[j] = true;
            tmpResult[i]= j+1;
            dfs(arr, visited, i+1, n, m, tmpResult);
            visited[j] = false;
            tmpResult[i]= 0;

        }
    }
}