package ru.ezhov.lessons.homework.Nickel;

public class SudokuMix implements Sudoku {

    private Sudoku sudoku;

    public SudokuMix(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    public int[][] build() {

        int[][] arr = sudoku.build();

        for (int i = 0; i < arr.length; i++) {
            for (int b = 0; b < arr.length; b++) {
                arr[i][b] = b - 1;
            }
        }

        return arr;
    }
}
