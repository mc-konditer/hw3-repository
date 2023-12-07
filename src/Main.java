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






    }
}