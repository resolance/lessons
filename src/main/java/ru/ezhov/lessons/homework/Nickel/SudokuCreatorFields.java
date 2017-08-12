package ru.ezhov.lessons.homework.Nickel;

public class SudokuCreatorFields implements Sudoku {

    private final int countFields;

    public SudokuCreatorFields(int countFields) {
        this.countFields = countFields;
    }

    @Override
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
