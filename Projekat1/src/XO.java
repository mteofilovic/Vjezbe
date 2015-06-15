import java.util.Scanner;

public class XO {

	/**
	 * <h1>This method will print empty table for game</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our 2D Array
	 */
	public static void get2DArray(String[][] array2D) {

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = " ";
			}
			System.out.println();
		}
	}

	/**
	 * <h1>This method will insert sign X into playing table</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our playing table
	 * @param x
	 *            - represents row coordinate
	 * @param y
	 *            - represents column coordinate
	 */
	public static void playerX(String[][] array2D, int x, int y) {

		try {
			if (array2D[x][y].equals(" ")) {
				array2D[x][y] = "X";
			} else
				System.err.println("Full field! You lost your move");
			System.out.println();
		} catch (Exception ex) {
			System.out.println("You inserted wrong coordinates.");
		}

	}

	/**
	 * <h1>This method will insert sign O into playing table</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our playing table
	 * @param x
	 *            - represents row coordinate
	 * @param y
	 *            - represents column coordinate
	 */
	
	public static void playerO(String[][] array2D, int x, int y) {

		try {
			if (array2D[x][y].equals(" ")) {
				array2D[x][y] = "O";
			} else
				System.err.println("Full field! You lost your move");
			System.out.println();
		} catch (Exception ex) {
			System.out.println("You inserted wrong coordinates.");
		}
	}

	/**
	 * <h1>This method will check if our game should be finished for player X</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our playing table.
	 * @return boolean values true or false
	 */
	public static boolean checkingX(String[][] array2D) {
		int counterXX = 0;
		for (int i = 0; i < array2D.length; i++) {
			int counterXY = 0;
			int counterYX = 0;

			if (array2D[i][i].equals("X")) {
				counterXX++;
			}
			if (counterXX == array2D.length) {
				return false;
			}
			for (int j = 0; j < array2D[i].length; j++) {

				if (array2D[i][j].equals("X")) {
					counterXY++;
				}
				if (counterXY == array2D[i].length) {
					return false;
				}
				if (array2D[j][i].equals("X")) {
					counterYX++;
				}
				if (counterYX == array2D[i].length) {
					return false;
				}
			}

		}
		return true;
	}

	/**
	 * <h1>This method will check if our game should be finished for player O</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents our playing table.
	 * @return boolean values true or false
	 */
	public static boolean checkingO(String[][] array2D) {
		int counterXX = 0;
		for (int i = 0; i < array2D.length; i++) {
			int counterXY = 0;
			int counterYX = 0;

			if (array2D[i][i].equals("O")) {
				counterXX++;
			}
			if (counterXX == array2D.length) {
				return false;
			}
			for (int j = 0; j < array2D[i].length; j++) {

				if (array2D[i][j].equals("O")) {
					counterXY++;
				}
				if (counterXY == array2D[i].length) {
					return false;
				}
				if (array2D[j][i].equals("O")) {
					counterYX++;
				}
				if (counterYX == array2D[i].length) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <h1>This method will check our playing board for empty space</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - represents playing table
	 * @return true if there is still free space, and false if there is no free
	 *         space.
	 */

	public static boolean checkingXO(String[][] array2D) {

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {

				if (array2D[i][j].equals(" ")) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <h1>This method will check second diagonal</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - our 2D Array.
	 * @param x
	 *            - represents rows.
	 * @param y
	 *            - represents columns.
	 * @return - true if X win, false if there is still space to play
	 */
	public static boolean checkingHardDiagonalX(String[][] array2D, int x, int y) {
		int temp = array2D.length - 1;
		if (x + y != temp) {
			return true;
		} else {
			for (int i = 0, j = array2D.length - 1; i < array2D.length; i++, j--) {
				if (array2D[i][j] != "X") {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <h1>This method will check second diagonal</h1>
	 * <p>
	 * 
	 * @param array2D
	 *            - our 2D Array.
	 * @param x
	 *            - represents rows.
	 * @param y
	 *            - represents columns.
	 * @return - true if O win, false if there is still space to play
	 */

	public static boolean checkingHardDiagonalO(String[][] array2D, int x, int y) {
		int temp = array2D.length - 1;
		if (x + y != temp) {
			return true;
		} else {
			for (int i = 0, j = array2D.length - 1; i < array2D.length; i++, j--) {
				if (array2D[i][j] != "O") {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * This method will print our borders.
	 * 
	 * @param array2D
	 *            - represents our 2D array.
	 */

	public static void printTable(String[][] array2D) {
		for (int i = 0; i < array2D.length; i++) {
			System.out.print(" -- ");
		}
		System.out.println();
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print("| " + array2D[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
			for (int k = 0; k < array2D.length; k++) {
				System.out.print(" -- ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Game size:");
		int size = in.nextInt();

		String[][] array2D = new String[size][size];
		get2DArray(array2D);
		printTable(array2D);

		while (true) {
			// First player inserting coordinates
			System.out.println("Player X: insert coordinate 1 (row):");
			int x = in.nextInt();
			System.out.println("Player X: insert coordinate 2 (column):");
			int y = in.nextInt();
			// Printing table after every move X
			playerX(array2D, x, y);
			printTable(array2D);
			// Checking rows, columns and first diagonal for win X
			if (checkingX(array2D) == false) {
				System.out.println("Player X won!");
				System.exit(0);
			}
			// Checking second diagonal for X
			if (checkingHardDiagonalX(array2D, x, y) == false) {
				System.exit(0);
			}
			// When every field is full, game is tied
			if (checkingXO(array2D) == false) {
				System.out.println("Game is tied!");
				System.exit(0);
			}
			// Second player inserting coordinates
			System.out.println("Player O: insert coordinate 1 (row):");
			x = in.nextInt();
			System.out.println("Player O: insert coordinate 2 (column):");
			y = in.nextInt();
			// Printing table after every move Y
			playerO(array2D, x, y);
			printTable(array2D);
			// Checking rows, columns and first diagonal for win O
			if (checkingO(array2D) == false) {
				System.out.println("Player O won!");
				System.exit(0);
			}
			// Checking second diagonal for O
			if (checkingHardDiagonalO(array2D, x, y) == false) {
				System.exit(0);
			}
			// When every field is full, game is tied
			if (checkingXO(array2D) == false) {
				System.out.println("Game is tied!");
				System.exit(0);
			}

		}

	}

}