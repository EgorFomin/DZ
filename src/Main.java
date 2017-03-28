import java.util.Scanner;// типо как include в плюсах//

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Hello world!");

        // Ctrl + Alt + L   - выровнять код  (Hot key)
        // Ctrl + D    - копировать строку

        //ПРОБУЕМ СДЕЛАТЬ МЕНЮ
        /* System.out.println("Введите номер лекции (1-2)  ");
            int lectionNumber = scanner.nextInt();//вводим номер лекции
            switch(lectionNumber) {
                case 1: {    //кейз для 1 лекции */





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


        System.out.println("Данная программа предостовляет возможность решить квадратное уравнение. ");
        System.out.println("Введите коэфициэнты при неизвестных переменных и нажмите <Enter>  ");

        System.out.println("Введите а ");
        double a = scanner.nextDouble();
        System.out.println("Введите b ");
        double b = scanner.nextDouble();
        System.out.println("Введите c ");
        double c = scanner.nextDouble();

        double d = b*b - 4 * a * c;
        double x, x1, x2;

        System.out.println("d = " + d);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a; // d > 0
            x2 = (-b - Math.sqrt(d)) / 2 * a; // d > 0
            System.out.println("Корни уравнения : ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if ( d == 0) {
            x = -b / 2 * a; // d = 0
            System.out.println("x = " + x);
        }
        if ( d < 0) {
            System.out.println("Корней нет. ");
        }

                    // #2
        /*
        System.out.println("Программа позволяет расчитать периметр и площадь прямоугольника по заданным сторонам. ");
        System.out.println("Введите длину стороны а и нажмите <Entet> ");
        double a = scanner.nextDouble();
        System.out.println("Введите длину стороны b и нажмите <Entet> ");
        double b = scanner.nextDouble();
        double P = ( a + b ) * 2;
        double S = a * b;
        System.out.println("Периметр прямоугольника равен = " + P);
        System.out.println("Площадь прямоугольника равна = " + S);
        System.out.println("Вы че сами посчитать это не могли ??? КЕК  " );

        */
                    //  Почему в консоли дробные числа нужно вводить через запятую , а не через точку?


                    // #3
        /*
        System.out.println("Программа позволяет расчитать длину стороны квадрата по заданному периметру. ");
        System.out.println("Введите периметр квадрата ");
        double P = scanner.nextDouble();
        double a = P/4;
        System.out.println("Сторона квадрата = " + a);
        */

                    // #4
            /*
            System.out.println("Данная программа предоставляет возможность расчета переменной по следующим формулам :");
            System.out.println(" 1)  (b + корень из(b^2 + 4ac))/2a - a^3*c + b^(-2) ");
            System.out.println(" 2)  x - x^3/3 + x^5/5 ");
            System.out.println(" 3)  (x+y)/(y+1) - (xy-12)/(34+x) ");
            System.out.println(" 4)  sin(корень из(x+1)) - sin(корень из(x-1)) ");
            System.out.println("Введите параметры вычислений : ");
            System.out.println("Введите b : ");
            double b = scanner.nextDouble();
            System.out.println("Введите a ( не равно 0)  : ");
            double a = scanner.nextDouble();
            System.out.println("Введите c : ");
            double c = scanner.nextDouble();
            System.out.println("Введите x (не равно -34) : ");
            double x = scanner.nextDouble();
            System.out.println("Введите y (не равно -1) : ");
            double y = scanner.nextDouble();

            double answer1 = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/2*a - Math.pow(a,3)*c + Math.pow(b,-2);
            double answer2 = x - Math.pow(x,3)/3 + Math.pow(x,5)/5;
            double answer3 = (x+y)/(y+1) - (x*y-12)/(34+x);
            double answer4 = Math.sin(Math.sqrt(x+1)) - Math.sin(Math.sqrt(x-1));

            System.out.println("Результаты расчетов по заданным формулам : ");
            System.out.println(" 1) Формула - результат = " + answer1);
            System.out.println(" 2) Формула - результат = " + answer2);
            System.out.println(" 3) Формула - результат = " + answer3);
            System.out.println(" 4) Формула - результат = " + answer4);
            */
           //     }//закрытие первого кейза для й лекции
            //} //закрытие свитча для выбора номера лекции , хз надо и оно

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


        // #6 (Расчет стоимости разговора по телефону) // без String КАК СДЕЛАТЬ ОКРУГЛЕНИЕ ДО 2 ЗНАКА? к

            /*
            //округлить до второго знака как ??
            System.out.println("ТАРИФ 1 минута разговора - 0.5 евриков ");
            System.out.println("Введите целое количество минут разговора и нажмите  <Enter> ");
            int minuts = scanner.nextInt();
            double cost = minuts*0.5;
            System.out.println("Введите день недели и нажмите  <Enter> ");
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
            */

        // #7() Определить наибольшее число трёхзначного числа
        /*
        System.out.print("Введите трёхзначное число : "); // print - после него то что вводишь сразу в этой же строке пишеться

        int chislo = scanner.nextInt();
        int sotye = chislo / 100;
        int des = (chislo - sotye * 100) / 10;
        int od = (chislo - sotye * 100 - des * 10);

        System.out.println("а) " + ((sotye > od) ? "Первое число больше" : "Последнее больше"));
        System.out.println("б) " + ((sotye > des) ? "Первое число больше" : "Второе больше"));
        System.out.println("в) " + ((des > od) ? "Второе число больше" : "Последнее больше"));
        */

        // #8 (DICH)

        /*
        System.out.print("Введите трёхзначное число : ");

        int chislo = scanner.nextInt();
        int sotye = chislo / 100;
        int des = (chislo - sotye * 100) / 10;
        int od = (chislo - sotye * 100 - des * 10);

        double kvadratChisla = Math.pow(chislo,2);
        double summaKubov = Math.pow(sotye,3) + Math.pow(des,3) + Math.pow(od,3);

        System.out.println((kvadratChisla == summaKubov)? "Квадрат  данного числа равен сумме кубов его цифр.":"не равен.");

        */

        // #9
        /*
        System.out.print("Введите первое вещественное число и нажмите <Enter> ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе вещественное число и нажмите <Enter> ");
        double y = scanner.nextDouble();
        double Max = 0;
        double Min = 0;

        if (x>y) {
            Min = y;
            Max = x;
        }
            else {
            Min = x;
            Max = y;
        }

        Min = (x+y)/2;
        Max =  2 * x * y;

        System.out.println("Результат меньшее число = " + Min + "\nБольшее число = " + Max);
        */

        // #10 (кубическое уравнение)
        /*
        System.out.print(" Введите коэфициэнты для кубического уравнения и нажмите <Enter>. ");
        System.out.print(" a =  ");
                double a = scanner.nextDouble();
        System.out.print(" b =  ");
                double b = scanner.nextDouble();

        double d = -4*a*b;
        double x, x1, x2;
        System.out.println("d = " + d);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / 2 * a; // d > 0
            x2 = (-b - Math.sqrt(d)) / 2 * a; // d > 0
            System.out.println("x1 = 0; x2 = " + x1 + "x3 = " + x2);
        }
        else if ( d == 0) {
            x = -b / 2 * a; // d = 0
            System.out.println("x1 = 0; x2 = " + x);
        }
        else if ( d < 0) {
            System.out.println(" x1 = 0; ");
        }
        */



        //3_LECTION

       /* //табличка умножения на 8

        System.out.println("Таблица умножения ");
        int counter = 0;
        int answer = 0;
        int i = 0;
            do {
                i++;
                while (counter < 10) {
                    counter++;
                    answer = i * counter;
                    System.out.println(i + " * " + counter + " = " + answer);

                }
                //System.out.println("");
            }
            while (i < 10);
        */




    }
}


