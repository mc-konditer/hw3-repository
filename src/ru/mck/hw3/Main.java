package ru.mck.hw3;

public class Main {
    public static void main(String[] args) {

        int a = 99100;
        byte b = - 110;
        short c = 23456;
        float d = 3.14f;
        double e = 5.11111777;
        long f = 999999999999L;
        System.out.println("Значение переменной а с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом float равно " + d);
        System.out.println("Значение переменной e с типом double равно " + e);
        System.out.println("Значение переменной f с типом long равно " + f);

        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        int j = 569;
        short k =  - 159;
        short l = 27897;
        byte m = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short papers  = 480;
        int n = papers / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + n + " листов бумаги.");

        byte efficiency = 8;
        int n1 = efficiency * 20;
        int n2 = efficiency * 1440;
        int n3 = efficiency * 4320;
        int n4 = efficiency * 43200;
        System.out.println("За 20 минут машина произвела " + n1 + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + n2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + n3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + n4 + " штук бутылок");

        int totalCans = 120;
        int oneClass = 6;
        int allClass = totalCans / oneClass;
        int whitePaint = allClass * 2;
        int brownPaint = allClass * 4;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        int bananas = 5;
        int weightBanana = 80;
        int milk100 = 2;
        int weightMilk100 = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int eggs = 4;
        int weightEgg = 70;
        int weightBananas = bananas * weightBanana;
        int weightMilk200 = weightMilk100 * milk100;
        int weightIceCream2 = weightIceCream * iceCream;
        int weightEggs = weightEgg * eggs;
        int weightBreakfast = weightBananas + weightMilk200 + weightIceCream2 + weightEggs;
        int grPerKg = 1000;
        float weightBreakfastKg = (float) weightBreakfast / grPerKg;
        System.out.println("Вес завтрака спортсменов в граммах равен " + weightBreakfast + " гр.");
        System.out.println("Вес завтрака спортсменов в киллограммах равен " + weightBreakfastKg + " кг.");

        int excessWeight = 7;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int days1 = excessWeight * 1000 / weightLoss1;
        int days2 = excessWeight * 1000 / weightLoss2;
        System.out.println("При потере каждый день по 250 гр. спортсмену понадобится " + days1 + " дней.");
        System.out.println("При потере каждый день по 500 гр. спортсмену понадобится " + days2 + " дней.");
        int daysSr = (days1 + days2) / 2;
        System.out.println("В среднем спортсмену понадобится " + daysSr + " день.");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double increase = 1.1;
        int newSalaryMasha = (int) (salaryMasha * increase);
        int newSalaryDenis = (int) (salaryDenis * increase);
        int newSalaryKristina = (int) (salaryKristina * increase);
        int annualSalaryMashaBefore = salaryMasha * 12;
        int annualSalaryMashaAfter = (int) (newSalaryMasha * 12);
        int annualSalaryMashaDiff = annualSalaryMashaAfter - annualSalaryMashaBefore;
        int annualSalaryDenisDiff = 12 * (newSalaryDenis - salaryDenis);
        System.out.println("«Маша теперь получает " + newSalaryMasha + " рублей в месяц. Годовой доход вырос на " + annualSalaryMashaDiff + " рублей.");
        System.out.println("«Денис теперь получает " + newSalaryDenis + " рублей в месяц. Годовой доход вырос на " + annualSalaryDenisDiff + " рублей.");
        System.out.println("«Кристина теперь получает " + newSalaryKristina + " рублей в месяц. Годовой доход вырос на " + (newSalaryKristina * 12 - salaryKristina * 12) + " рублей.");





    }
}