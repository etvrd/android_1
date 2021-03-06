package com.company;
        //1.Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class Main {
        public static void main(String[] args) {
        //2.Создать переменные всех пройденных типов данных и инициализировать их значения.
            byte a = 127;
            short b = 32767;
            int c = 2147483647;
            long d = 9223372036854775807L;
            float e = 3.4e38F;
            double f = 1.7e308;
            char g = 'g';
            boolean h = true;
        }
        /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float. */
        public static float task3(float a, float b, float c, float d){
            return a * (b + (c / d));
        }
        /*4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. */
        public static boolean task4(int a, int b) {
            int c = a + b;
            if (c >= 10 && c <= 20)
                return true;
            else
                return false;
        }
        /*5. Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
        считаем положительным числом.
         */
        public static void task5(int a) {
            if (a<0)
                System.out.println("Вы передали отрицательное число");
            else
                System.out.println("Вы передали положительное число");
        }
        /*6. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
         */
        public static boolean task6(int a) {
            if (a < 0)
                return true;
            else
                return false;
        }
        /*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
         */
        public static void task7(String a){
            System.out.println("Привет, "+a+"!");
        }
        /*8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        public static void task8(int year){
            if (year%400==0)
                System.out.println("Год високосный");
            else if (year%100==0)
                System.out.println("Год не является високосным");
            else if (year%4==0)
                System.out.println("Год високосный");
            else
                System.out.println("Год не является високосным");
        }
}
