/* 수도코드 :
        크기가 n x n인 행렬을 생성한다.
        행렬 전체 요소의 개수인 nn을 구한다.
        x 방향 (동, 남, 서, 북)과 y 방향 (동, 남, 서, 북)을 나타내는 배열을 초기화한다.
        현재 위치와 방향을 초기화한다. (방향은 '동'부터)
        1부터 nn까지 반복한다.현재 위치에 값을 넣는다.
        다음 위치를 계산한다.
        다음 위치가 범위를 벗어나거나 이미 값이 있는 경우 방향을 오른쪽으로 90도 회전한다.
        좌표를 업데이트한다.
        생성된 나선 모양 행렬을 반환한다.
        *
        */
public class LC_59 {
    public static int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];  // n x n 크기의 행렬 생성
        /*
        {0,1,2,3} =  arr[1] => x
        {4,5,6,7} = arr[상하][좌우]
         */
        int nn = n * n;  // 행렬의 전체 요소 개수
        int[] xDir = new int[]{1, 0, -1, 0};  // x 방향 (동, 남, 서, 북)
        int[] yDir = new int[]{0, 1, 0, -1};  // y 방향 (동, 남, 서, 북)
        int direction = 0;  // 현재 방향 (0: 동, 1: 남, 2: 서, 3: 북)

        int x = 0;  // 현재 x 좌표
        int y = 0;  // 현재 y 좌표
        for (int i = 1; i <= nn; i++) {  // 1부터 nn까지 반복
            if (matrix[y][x] == 0) {  // 현재 위치에 값이 없는 경우
                matrix[y][x] = i;  // 현재 위치에 i 값을 넣어줌
            }
            int nextX = x + xDir[direction];  // 다음 위치의 x 좌표
            int nextY = y + yDir[direction];  // 다음 위치의 y 좌표
            if ( ((nextX < 0 || nextX >= n) || (nextY < 0 || nextY >= n)) || matrix[nextY][nextX] > 0) {  // 다음 위치가 범위를 벗어나는 경우  (0,4) => error
                direction = (direction + 1) % 4;  // 방향을 전환 (오른쪽으로 90도 회전)
            }
//            else if (matrix[nextY][nextX] > 0) {  // 다음 위치에 값이 이미 있는 경우
//                direction = (direction + 1) % 4;  // 방향을 전환 (오른쪽으로 90도 회전)
//            }
            x = x + xDir[direction];  // x 좌표 업데이트
            y = y + yDir[direction];  // y 좌표 업데이트
        }

        return matrix;  // 생성된 나선 모양 행렬 반환
    }
    /*
    1 2
    4 3

    1 2 3
    8 9 4
    7 6 5
     */


    public static void main(String[] args) {
        generateMatrix(4);
    }
}
