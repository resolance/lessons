package ru.ezhov.lessons.homework.Nickel;

import java.util.Scanner;
import java.util.Random;

//1. Необходимо сделать возможность использовать разные реализации формирования полей
//2. Уйти от использования статических методов

public class SudokuT {

    public static void main(String[] args) {
        // write your code here

        int[][] field = new int[9][9];
        Scanner scn = new Scanner(System.in);

        while (true) {
            generateField(field);

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("");
            System.out.println("Нажмите Enter для генерации поля или Е для выхода");
            String strInput = scn.nextLine();

            if (strInput.toLowerCase().equals("e")) {
                System.out.println("Работа завершена");
                break;
            }
        }

    }

    private static void generateField(int[][] f) {
        generateFirstLine(f);

        for (int reg = 0; reg < 3; reg++) {
            for (int regRow = 0; regRow < 3; regRow++) {
                for (int regCol = 0; regCol < 9; regCol++) {
                    int rowNum = reg * 3 + regRow;
                    int colNum = getIndex(reg, regRow, regCol);
                    f[rowNum][regCol] = f[0][colNum];
                }
            }
        }
    }

    private static void generateFirstLine(int[][] f) {
        for (int i = 0; i < f.length; i++) {
            f[0][i] = i + 1;
        }

        Random rnd = new Random();
        for (int i = 0; i < f.length; i++) {
            int idx = rnd.nextInt(f.length - 1);
            int tmp = f[0][i];
            f[0][i] = f[0][idx];
            f[0][idx] = tmp;
        }
    }

    private static int getIndex(int reg, int regRow, int col) {
        int idx = regRow * 3 + reg + col;
        if (idx > 8) {
            idx -= 9;
        }

        return idx;
    }
}
