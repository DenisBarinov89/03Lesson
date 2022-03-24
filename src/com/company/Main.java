package com.company;

public class Main {

    public static void main(String[] args) {

        //Задание 1

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 5L;
        float e = 1.1f;
        double f = 1.2f;

        //Задание 2

        float boxerFirstWeight = 78.2f;
        float boxerSecondWeight = 82.7f;
        float boxerAllWeight = boxerFirstWeight + boxerSecondWeight;
        float boxerWeightDifference = boxerSecondWeight - boxerFirstWeight;

        System.out.println("Общий вес двух бойцов: " + boxerAllWeight + " кг.");
        System.out.println("Разница между весами бойцов: " + boxerWeightDifference + " кг.");

        //Задание 3
        int bananas = 5;
        int bananaWeight = bananas * 80;
        int milk = 200;
        int milkToGr = 105;
        int milkWeight = milk / 100 * milkToGr;
        int iceCream = 2;
        int iceCreamWeight = iceCream * 100;
        int eggs = 4;
        int eggsWeight = eggs * 70;


        float productsWeight = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Общий вес продуктов: " + productsWeight + " грамм");

        float grToKg = productsWeight / 1000;
        System.out.println("Общий вес продуктов: " + grToKg + " кг.");

        //Задание 4
        int weightToExecute = 7;
        int kdToGr = 1000;
        int weightToExecuteGr = weightToExecute * kdToGr;
        int weightPerDayMin = 250;
        int weightPerDayMax = 500;
        int weightPerDayAvg = 250 / 2 + 250;

        int daysToNormalMax = weightToExecuteGr / weightPerDayMin;
        int daysToNormalMin = weightToExecuteGr / weightPerDayMax;
        int daysToNormalAvg = weightToExecuteGr / weightPerDayAvg;

        System.out.println(daysToNormalMax + " дней нужно, чтобы похудеть, если сбрасывать 250 грамм в день");
        System.out.println(daysToNormalMin + " дней нужно, чтобы похудеть, если сбрасывать 500 грамм в день");
        System.out.println(daysToNormalAvg + " дней нужно, чтобы похудеть, если сбрасывать в среднес от 250 до 500 грамм в день");

        //Задание 5
        float percentage = 10.0F;
        float salaryMary = 67760.0F;
        float salaryDenis = 83690.0F;
        float salaryCristine = 76230.0F;

        float salaryMaryAfterIncrease = salaryMary + (salaryMary / 100 * percentage);
        float salaryDenisAfterIncrease = salaryDenis + (salaryDenis / 100 * percentage);
        float salaryCristineAfterIncrease = salaryCristine + (salaryCristine / 100 * percentage);

        float salaryDifferenceMary = salaryMaryAfterIncrease * 12 - salaryMary * 12;
        float salaryDifferenceDenis = salaryDenisAfterIncrease * 12 - salaryDenis * 12;
        float salaryDifferenceCristine = salaryCristineAfterIncrease * 12 - salaryCristine * 12;

        System.out.println("Зарплата Маши после увеличения: " + salaryMaryAfterIncrease + " руб. Годовой доход вырос на " + salaryDifferenceMary + " .руб");
        System.out.println("Зарплата Дениса после увеличения: " + salaryDenisAfterIncrease + " руб. Годовой доход вырос на " + salaryDifferenceDenis + " .руб");
        System.out.println("Зарплата Кристины после увеличения: " + salaryCristineAfterIncrease + " руб. Годовой доход вырос на " + salaryDifferenceCristine + " .руб");










	// write your code here
    }
}
