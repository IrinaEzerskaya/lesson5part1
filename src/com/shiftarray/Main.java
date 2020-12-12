package com.shiftarray;

public class Main {

    public static void main(String[] args) {
        int[][] processArr = new int[2][10];

        // Начальная инициализация
        for (int i = 0; i < processArr.length; i++) {
            for (int j = 0; j < processArr[i].length; j++) {
                processArr[i][j] = j + 1;
            }
        }

        toLeft(processArr);
    }

    // Задача – написать метод public void toLeft() {}
    
    public static void toLeft(int[][] inputArr) {
        System.out.println("Пройти с 1-ой до последней строки");
        String buffer = "";

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                inputArr[i][j] = j + 1;
                System.out.print(inputArr[i][j] + " ");
            }
            /*
            если убрать эту строку (34 строка), и поставить System.out.print(inputArr[i][j] + " " + "\n") в 27 строке,
            то все элементы вместо строки валяться в столбик. Могу опять же в 34 строке поставить
            System.out.print("\n");, но не понимаю смысла.
             */
            System.out.println();
        }

        // Вариант 2 с переносом строки (чтобы не писать System.out.println();)
        System.out.println("Вариант 2 cо строковым буфером");
        for (int i = 0; i < inputArr.length; i++) {
            buffer = "";
            for (int j = 0; j < inputArr[i].length; j++) {
                buffer += inputArr[i][j] + " ";
            }
            System.out.println(buffer);
        }


        System.out.println("Пройти с 1-го до предпоследнего элемента");
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length -1 ; j++) {
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("В текущую ячейку поместить значение следующей");
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length -1 ; j++) {
                inputArr[i][j] = inputArr[i][j+1];
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Последнему элементу присвоить 0");
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i][9] = 0;

            for (int j = 0; j < inputArr[i].length; j++) {
                System.out.print(inputArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



