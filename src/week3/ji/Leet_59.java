class Solution {
	
	private int[][] matrix;
	private int element;
	private int i;
	private int j;
	private Direction direction;

	private enum Direction {
		UP, DOWN, LEFT, RIGHT
	}

	public int[][] generateMatrix(int n) {
		matrix = new int[n][n];
		element = 1;
		i = 0;
		j = 0;
		direction = Direction.RIGHT;
		n = 2*n - 1;
		while (n-- > 0) {
			switch (direction) {
				case UP -> toUp();
				case DOWN -> toDown();
				case LEFT -> toLeft();
				case RIGHT -> toRight();
			}
		}
		matrix[i][j] = element;

		return matrix;
	}

	private void toUp() {
		while (i >= 1 && matrix[i-1][j] == 0) {
			matrix[i--][j] = element++;
		}
		direction = Direction.RIGHT;
	}

	private void toDown() {
		while (i+1 < matrix.length && matrix[i+1][j] == 0) {
			matrix[i++][j] = element++;
		}
		direction = Direction.LEFT;
	}

	private void toLeft() {
		while (j >= 1 && matrix[i][j-1] == 0) {
			matrix[i][j--] = element++;
		}
		direction = Direction.UP;
	}

	private void toRight() {
		while (j+1 < matrix[i].length && matrix[i][j+1] == 0) {
			matrix[i][j++] = element++;
		}
		direction = Direction.DOWN;
	}
}
