package ru.ezhov.lessons.homework.Nickel;

public class SudokuApp {
    public static void main(String[] args) {
        Sudoku sudoku = new SudokuMix(
                new SudokuCreatorFields(9)
        );
        int[][] arr = sudoku.build();
    }
}
