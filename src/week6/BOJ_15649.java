import java.util.Scanner;

public class Main {

    private static int n;
    private static int m;
    private static boolean[] visited;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        arr = new int[m];
        int depth = 0;
        dfs(depth);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            print();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void print() {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
