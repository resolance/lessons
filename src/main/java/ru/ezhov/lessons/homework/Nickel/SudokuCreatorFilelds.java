package ru.ezhov.lessons.homework.Nickel;

public class SudokuCreatorFilelds implements Sudoku {

    private final int countFields;

    public SudokuCreatorFilelds(int countFields) {
        this.countFields = countFields;
    }

    public int[][] build() {
        return new int[][]{
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                },
                {
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                }
        };
    }
}
