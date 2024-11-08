import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] argc) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        method5();
        method6();
        method7();
        method8();
        method9();
        method10();
        method11();
        method12();
        method13();
        method14(7,2);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = -2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 11;
        int b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean method5() {
        int a = 9;
        int b = 1;
        if (a + b >= 10 & a + b <= 20) {
            System.out.println(true);
            return (true);
        } else {
            System.out.println(false);
            return (false);
        }
    }

    public static void method6() {
        int a = -9;
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    public static boolean method7() {
        int a = 9;
        if (a <= 0) {
            System.out.println(true);
            return (true);
        } else {
            System.out.println(false);
            return (false);
        }
    }

    public static void method8() {
        int a = 4;
        String str = "Строка";
        System.out.println(str.repeat(a));
    }

    public static void method9() {
        int a = 800;
        int b = a % 100;
        int c = a % 400;
        if (a / 4 >= 1 & c == 0) {
            System.out.println(true);
        }
        if (b == 0) {
            System.out.println(false);
        }
    }

    public static void method10() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void method11() {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void method12() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (nums[i] < 6)
                nums[i] *= 2;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void method13() {
        int[][] nums = new int[7][7];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j || i + j == nums.length - 1) {
                    nums[i][j] = 1;
                }
            }
            System.out.println(Arrays.deepToString(nums));
        }
    }
    public static void method14(int len, int initialValue) {
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = initialValue;
        }
        System.out.println(Arrays.toString(nums));
    }
}