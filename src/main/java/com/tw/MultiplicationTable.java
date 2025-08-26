package com.tw;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable.create(1, 9));
    }

    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end) : null;
    }

    private Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    private Boolean isInRange(int number) {
        return 0 < number && number < 1000;
    }

    private Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    private String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int row = start; row <= end; row++) {
            table.append(generateLine(start, row));
            if (row != end) {
                table.append("\n");
            }
        }
        return table.toString();
    }

    private String generateLine(int start, int row) {
        StringBuilder Line = new StringBuilder();
        for (int multiplicand = start; multiplicand <= row; multiplicand++) {
            Line.append(generateExpression(multiplicand, row));
            if (multiplicand != row) {
                Line.append("\t");
            }
        }
        return Line.toString();
    }

    private String generateExpression(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d", multiplicand, multiplier, multiplicand * multiplier);
    }
}
