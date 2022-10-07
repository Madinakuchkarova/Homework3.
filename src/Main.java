public class Main {
    public static void main(String[] args) {
        //Задача 1.
        System.out.println("ЗАДАЧА 1");
        int variable1 = 997_703_779;
        System.out.println("Значение переменной variable1 с типом int равно " + variable1);
        byte variable2 = -127;
        System.out.println("Значение переменной variable2 с типом byte равно " + variable2);
        short variable3 = -2510;
        System.out.println("Значение переменной variable3 с типом short равно " + variable3);
        long variable4 = 15_423_879_369L;
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);
        float variable5 = 3.65145F;
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);
        double variable6 = 2.6584;
        System.out.println("Значение переменной variable6 с типом double равно " + variable6);
        System.out.println("ЗАДАЧА 2");
        float catsCount = 27.12F;
        long dogsCount = 987_678_965_549L;
        double foxesCount = 2.786;
        boolean variableWithWord = false;
        short cowsCount = 569;
        int ducksCount = -159;
        char hamstersCount = 27897;
        byte goosesCount = 67;
        System.out.println("Задача 3");
        byte ludmilasPupils = 23;
        byte annasPupils = 27;
        byte catherinesPupils = 30;
        short paperCount = 480;
        int paperPerPupil = paperCount / (ludmilasPupils + annasPupils + catherinesPupils);
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");
        System.out.println("Задача 4");
        int bottels = 16;
        int minutes = 2;
        int productivityPerMinute = bottels / minutes;
        int per20Minutes = 20;
        System.out.println("За " + per20Minutes + " минут машина произвела бутылок " + per20Minutes * productivityPerMinute + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + minutesInDay * productivityPerMinute + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + minutesInThreeDays * productivityPerMinute + " штук");
        int minutesInMonth = 30 * minutesInDay;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + minutesInMonth * productivityPerMinute + " штук");
        System.out.println("Задача 5");
        int cansOfPaints = 120;
        int whitePaintPerClassroom = 2;
        int brownPaintPerClassroom = 4;
        int classroomsOnSchool = cansOfPaints / (whitePaintPerClassroom + brownPaintPerClassroom);
        int needWhitePaint = classroomsOnSchool * whitePaintPerClassroom;
        int needBrownPaint = classroomsOnSchool * brownPaintPerClassroom;
        System.out.println("В школе где " + classroomsOnSchool + " классов,нужно " + needWhitePaint + " банок белой краски и " + needBrownPaint + " банок коричневой краски");
        System.out.println("Задача 6");
        int bananasWeight = 5 * 80;
        int milkWeight = 200 / 100 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int weightInGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float weightInKilograms = weightInGrams / 1000F;
        System.out.println("Вес спорт-завтрака = " + weightInKilograms + " кг");
        System.out.println("Задача 7");
        int sevenKilogramsInGrams = 7 * 1000;
        int daysIfLose250PerDay = sevenKilogramsInGrams / 250;
        int daysIfLose500PerDay = sevenKilogramsInGrams / 500;
        System.out.println(+daysIfLose250PerDay + " дней уйдет на похудение,если спортсмен будет худеть каждый день на 250 грамм и " + daysIfLose500PerDay + " дней уйдет на похудение,если спортсмен будет терять 500 грамм.");

    }

}
