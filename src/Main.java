/**
 * Created by user on 18.03.17.
 */

import java.util.Scanner;// типо как include в плюсах//

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Hello world!");

        // Ctrl + Alt + L   - выровнять код  (Hot key)
        // Ctrl + D    - копировать строку

       /*

          // TREUGOLNIK


        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double P = a + b + c;
        //Math - класс хранения математ функций
        //Math.sqrt - корень
        double S = Math.sqrt((P/2- a) * (P/2 - b) * (P/2 - c));
        System.out.println("P = " + P);
        System.out.println("S = " + S);
        */



        //  ДЗ ЛЕКЦИЯ 1


        // #1
        //квадратное уравнение



        /*double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b*b - 4 * a * c;
        double x, x1, x2;
        System.out.println("d = " + d);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a; // d > 0
            x2 = (-b - Math.sqrt(d)) / 2 * a; // d > 0
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if ( d == 0) {
            x = -b / 2 * a; // d = 0
            System.out.println("x = " + x);
        }
        if ( d < 0) {
            System.out.println("Корней нет. ");
        }*/


        //  остальное аналогично




        //ВТОРАЯ_ЛЕКЦИЯ_DZ
        // #1 (деление двух чисел)

        /*System.out.println("Введите делимое число " );
        double b = scanner.nextDouble();
        System.out.println("Введите делитель (не равен 0)  " );
        double c = scanner.nextDouble();
        double x;
        if(c == 0 )
            System.out.println("Введеные данные не верны ( делитель = 0 )   " );
        else {
            x = b/c;
            System.out.println("Результат деления : " + x );
        }*/


        // #2 (Дата основания Одессы)
       /* int date = 1794;
        System.out.println("В каком году была основана Одесса ? " );
        int year = scanner.nextInt();
        if ( year == date )
            System.out.println("Верно.  " );

        else
            System.out.println("НЕ верно. Одесса была основана в 1794 году.  " );

        int date = scanner.nextInt();
        */

       // #3 (стоимость со скидками)

        /*System.out.println("Расчет стоимости товара со скидкой.  " );
        System.out.println("Введите изначальную стоимость товара " ) ;

        double cost = scanner.nextDouble();
        double limit1 = 500;
        double limit2 = 1000;

        if (  cost < limit1 )
            System.out.println("На данную стоимость скидка не распростроняется  ");

        else if ( cost > limit1 && cost < limit2  ) {
            System.out.println("Вам предостовляется скидка 3 % ");
            cost = cost * 0.97;
            System.out.println("Итоговая стоимость = " + cost);
        }
         else {
             System.out.println("Вам предостовляется скидка 5 % ");
             cost = cost * 0.95;
             System.out.println("Итоговая стоимость = " + cost);
         }*/


        // #4 (проверка на четность )
        /*System.out.println("Введите целое число и нажмите <Enter> " );
        int a = scanner.nextInt();
        if ((a & 1) == 0) // если число четное - его младший бит = 0
            System.out.println("Число " + a + " четное." );
        else
            System.out.println("Число " + a + " не четное." );
            */

        // Можно было еще так , но хз это читабельным считается?
        // System.out.println((а & 1) == 0 ? "чётное" : "нечётное");


        // #5 (Делимость нацело на 3)
       /* System.out.println("Введите целое число и нажмите <Enter> " );
        int a = scanner.nextInt();
        if ((a % 3) == 0)
            System.out.println("Число " + a + " не делится нацело на 3." );
        else
            System.out.println("Число " + a + " делится нацело на 3." );
        */



       // почитай про STRING !!!
       // #6 (Расчет стоимости разговора по телефону) // без String КАК СДЕЛАТЬ ОКРУГЛЕНИЕ ДО 2 ЗНАКА? к


            System.out.println("ТАРИФ 1 минута разговора - 0.5 евриков ");
            System.out.println("Введите целое количество минут разговора ");
            int minuts = scanner.nextInt();
            double cost = minuts*0.5;
            System.out.println("Введите день недели ");
            int day = scanner.nextInt();
            if (day >= 6) {
                cost = cost*0.8;
                // round(cost*100)/100.00 так или так
                //cost = cost.setScale(2, BigDecimal.ROUND_HALF_UP); подключить эти классы методы как?
                System.out.println("В этот день предоставляется скидка 20 %  ");
                System.out.println("Стоимость разговора составила " + cost + " евриков.");
            }
            else
                System.out.println("Стоимость разговора составила " + cost + " евриков.");


        // #7()
        //3_LECTION



    }
}


