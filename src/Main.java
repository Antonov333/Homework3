public class Main {
    public static void main(String[] args) {
        /* Задача 1
         * Объявите переменные типа int, byte, short, long, float, double.
         * Название переменных может быть любым, но если состоит из двух слов и более,
         * должно соответствовать правилу camelCase.
         * Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
         *  */
        System.out.println("Домашнее задание №3. Тема: Переменные, часть 2");
        System.out.println(" ");
        System.out.println("Задача №1");
        int number = 36_406_887;
        System.out.println("Значение переменной number с типом int равно "+number);
        byte smallNumber = 91;
        System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
        short shortNumber = 2120 ;
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber) ;
        long longNumber = 9223372036854775807L ;
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        float floatNumber = 675.47509803f ;
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        double pi = 3.14159 ;
        System.out.println("Значение переменной pi с типом double равно " + pi );
        System.out.println(" ");

        /* Задача 2
         * Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
         *Значения:
         * 27.12
         *  987 678 965 549
         *  2,786569
         *  -159
         * 27897
         * 67 */
        float float21 = 27.12f;
        long long21 = 987678965549L ;
        double double21 = 2.786569 ;
        short short21 = -159 ;
        int short22 = 27897 ;
        byte byte21 = 67 ;
        System.out.println("Задача 2");
        System.out.println("Переменные инициализированы");
        System.out.println(" ");

        /** Задача 3
         Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
         У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
         Три учительницы закупили все вместе 480 листов бумаги на все три класса.
         Посчитайте, сколько достанется листов каждому ученику.
         Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
         Для объявления переменных не используйте тип var. */
        System.out.println("Задача 3");
        byte pupilsLP = 23 ;
        byte pupilsAS = 27 ;
        byte pupilsEA = 30 ;
        short paperTotal = 480 ;
        int paperPerPerson = paperTotal / (pupilsLP + pupilsAS + pupilsEA) ;
        System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги");
        System.out.println(" ");

        /**
         Задача 4
         Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
         за 20 минут,
         в сутки,
         за 3 дня,
         за 1 месяц?
         Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
         Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
         Для объявления переменных не используйте тип var. */

        System.out.println("Задача 4");
        byte minutePerfomance = 16 / 2 ;
        int dayPerformance = minutePerfomance*60*24 ;
        int threeDayPerformance = 3 * dayPerformance ;
        int monthPerformance = 30 * dayPerformance ;
        System.out.println("За сутки машина произвела " + dayPerformance + " бутылок");
        System.out.println("За 3 три дня машина произвела " + threeDayPerformance + " бутылок");
        System.out.println("За месяц машина произвела " + monthPerformance + " бутылок");
        System.out.println(" ");

        /** Задача 5
         На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
         На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
         Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
         Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 5");
        int whiteCansPerClass = 2 ;
        int brownCansPerClass = 4 ;
        int totalCans = 120 ;
        int cansPerClass = whiteCansPerClass + brownCansPerClass ;
        int classes = totalCans / cansPerClass ;
        int whiteCans = whiteCansPerClass * classes ;
        int brownCans = brownCansPerClass * classes ;
        /* ("В школе, где " + " классов, нужно " + " банок белой краски и " + "банок коричневой краски") */
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и "
                + brownCans + " банок коричневой краски");
        System.out.println(" ");

        /** Задача 6
         Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
         Вот один из рецептов, по которому спортсмен готовит себе завтрак:
         Бананы — 5 штук (1 банан — 80 грамм).
         Молоко — 200 мл (100 мл = 105 грамм).
         Мороженое-пломбир — 2 брикета по 100 грамм.
         Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
         Смешать всё в блендере — и готово.
         Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
         Результат в граммах и килограммах напечатайте в консоль.
         Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
         то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить
         5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм),
         а не считать самим общую сумму граммов. */
        System.out.println("Задача 6");
        float bananaMass = 80.0f ;
        byte bananaQty = 5 ;
        float milkVolume = 200.0f ;
        float milkMass = milkVolume * 105.0f / 100.0f ;
        byte iceCreamPackQty = 2 ;
        float iceCreamPackMass = 100 ;
        float eggMass = 70.0f ;
        byte eggQty = 4 ;
        float breakfastMass = bananaMass*bananaQty + milkMass + iceCreamPackMass*iceCreamPackQty + eggMass*eggQty ;
        float breakfastMassKg = breakfastMass * 0.001f ;
        System.out.println("Масса завтрака равна " + breakfastMass + " гр" + " (" + breakfastMassKg +"кг)");
        System.out.println(" ");

        /**  Задача 7
         Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
         Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
         Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
         а сколько — если каждый день будет худеть на 500 грамм.
         Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
         Результаты всех подсчетов выведите в консоль. */
        System.out.println("Задача 7");
        float goal = 7.0f ;
        float dayLooseMin = 0.25f ;
        float dayLooseMax = 0.5f ;
        float daysMin = goal / dayLooseMax ;
        float daysMax = goal / dayLooseMin ;
        float daysAverage = (daysMax + daysMin)/2.0f ;
        System.out.println("Для снижения веса на 7кг спортсмену необходимо от " + daysMin
                + " дней при ежедневном снижении веса на " + dayLooseMax*1000 +" граммов," +
                " до " + daysMax + " дней при ежедневном снижении на " + dayLooseMin*1000 + " граммов");
        System.out.println("В среднем для достижения указанной цели необходимо " + daysAverage + " дней");
        System.out.println(" ");

        /** Задача 8
         Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
         В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
         К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
         Маша получает 67 760 рублей в месяц.
         Денис получает 83 690 рублей в месяц.
         Кристина получает 76 230 рублей в месяц.
         Каждому нужно увеличить зарплату на 10% от текущей месячной.
         Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
         Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

         Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */
        System.out.println("Задача 8");
        float mashaSalary = 67760f ;
        float denisSalary = 83690f ;
        float kristinaSalary = 76230 ;
        float increaseRatioPcnt = 10.0f ;
        float increaseRatio = 1.0f + increaseRatioPcnt*0.01f ;
        float mashaLastYear = mashaSalary*12.0f ;
        float denislastYear = denisSalary*12.0f ;
        float kristinaLastYear = kristinaSalary*12.0f ;
        float mashaSalaryNew = mashaSalary * increaseRatio ;
        float denisSalaryNew = denisSalary * increaseRatio ;
        float kristinaSalaryNew = kristinaSalary * increaseRatio ;
        float mashaNextYear = 12.0f * mashaSalaryNew ;
        float denisNextYear = 12.0f * denisSalaryNew ;
        float kristinaNextYear = 12.0f * kristinaSalaryNew ;
        float mashaYearAdvance = mashaNextYear - mashaLastYear ;
        float denisYearAdvance = denisNextYear - denislastYear ;
        float kristinYearAdvance = kristinaNextYear - kristinaLastYear ;
        System.out.println("Заработная плата после повышения составит");
        System.out.println("Маша: " + mashaSalaryNew + " рублей за месяц");
        System.out.println("Денис: " + denisSalaryNew + " рублей за месяц");
        System.out.println("Кристина: " + kristinaSalaryNew + " рублей за месяц");
        System.out.println(" ");
        System.out.println("За следующий год заработная плата составит");
        System.out.println("Маша: " + mashaNextYear +
                ", что больше прошлогоднего заработка на " + mashaYearAdvance + " рублей");
        System.out.println("Денис: " + denisNextYear +
                ", что больше прошлогоднего заработка на " + denisYearAdvance + " рублей");
        System.out.println("Кристина: " + kristinaNextYear +
                ", что больше прошлогоднего заработка на " + kristinYearAdvance + " рублей");
        System.out.println(" ");
    }
}