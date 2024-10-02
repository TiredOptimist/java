// Вариант 22. Панькова Светлана

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);

        out.print("Задание 1.2. ");
        while (true) {
            out.print("Введи число, большее 9: ");
            if (in.hasNextInt()) {
                int x = in.nextInt();
                if (x > 9) {
                    int a2 = m.sumLastNums(x);
                    out.println("Сумма знаков: " + a2);
                    break;
                } else {
                    out.print("Число должно быть больше 9. Повторите попытку: ");
                    in.nextLine();
                }
            } else {
                out.print("Некорректный ввод. Повторите попытку: ");
                in.nextLine();
            }
        }

        out.println("Задание 1.4. ");
        while(true){
            out.print("Введите число: ");
            if (in.hasNextInt()){
                int y = in.nextInt();
                boolean a4 = m.isPositive(y);
                out.println("Число положительное? " + a4);
                break;
            }
            else{
                out.print("Некорректный ввод. Повторите попытку: ");
                in.next();
            }
        }


        out.print("Задание 1.6. Введите символ: ");
        char c = in.next().charAt(0);
        boolean a6 = m.isUpperCase(c);
        out.println("Символ является заглавной латинской буквой? " + a6);

        out.print("Задание 1.8. ");
        while (true) {
            out.print("Введите два числа: ");
            if (in.hasNextInt()) {
                int x1 = in.nextInt();
                if (in.hasNextInt()) {
                    int y1 = in.nextInt();
                    boolean a8 = m.isDivisor(x1, y1);
                    out.println("Одно из чисел делит другое нацело? " + a8);
                    break;
                } else {
                    out.print("Некорректные данные. Повторите ввод: ");
                    in.next();
                }
            } else {
                out.print("Некорректные данные. Повторите ввод: ");
                in.next();
            }
        }

        out.print("Задание 1.10. Введите 5 чисел: ");
        int rlt = 0;
        int count = 0;
        while (count < 5) {
            if (in.hasNextInt()) {
                int num = in.nextInt();
                if (count == 0) {
                    rlt = num;
                } else {
                    rlt = m.lastNumSum(rlt, num);
                }
                count++;
            } else {
                out.print("Некорректный ввод. Повторите ввод числа: ");
                in.next();
            }
        }
        out.println("Сумма цифр из разряда единиц: " + rlt);

        out.print("Задание 2.2. Введите 2 числа: ");
        while (true) {
            if (in.hasNextInt()) {
                int x = in.nextInt();
                if (in.hasNextInt()) {
                    int y = in.nextInt();
                     double b2 = m.safeDiv(x, y);
                    out.println("Результат деления x на y: " + b2);
                    break;
                } else {
                    out.print("Повторите ввод: ");
                    in.next();
                }
            } else {
                out.print("Повторите ввод: ");
                in.next();
            }
        }


        out.print("Задание 2.4. Введите 2 числа: ");
        String b4 = "";
        while (true) {
            if (in.hasNextInt()) {
                int x = in.nextInt();
                if (in.hasNextInt()) {
                    int y = in.nextInt();
                    b4 = m.makeDecision(x, y);
                    out.println("Ответ: " + b4);
                    break;
                } else {
                    out.print("Повторите ввод: ");
                    in.next();
                }
            } else {
                out.print("Повторите ввод: ");
                in.next();
            }
        }

        out.print("Задание 2.6. Введите три числа: ");
        int ch1, ch2, ch3;
        while (true) {
            if (in.hasNextInt()) {
                ch1 = in.nextInt();
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
                continue;
            }
            if (in.hasNextInt()) {
                ch2 = in.nextInt();
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
                continue;
            }

            if (in.hasNextInt()) {
                ch3 = in.nextInt();
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
                continue;
            }
            break;
        }
        boolean b6 = m.sum3(ch1, ch2, ch3);
        out.println("Можно ли сложить два числа и получить третье? " + b6);

        out.print("Задание 2.8. Введите число: ");
        int age;
        while (true) {
            if (in.hasNextInt()) {
                age = in.nextInt();
                String b8 = m.age(age);
                out.println("Возраст: " + b8);
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
            }
        }
        in.nextLine(); // читает символ перевода из буфера
        out.print("Задание 2.10. Введите день недели: ");
        String day = in.nextLine();
        m.printDays(day);

        out.print("Задание 3.2. Введите число: ");
        int num;
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
            }
        }

        String c2 = m.reverseListNums(num);
        out.println("Числа по убыванию: " + c2);

        out.print("Задание 3.4. Введите 2 числа: ");
        int x4, y4;

        while (true) {
            if (in.hasNextInt()) {
                x4 = in.nextInt();
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
                continue;
            }
            if (in.hasNextInt()) {
                y4 = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
            }
        }
        out.println(x4 + " в степени " + y4 + " = " + m.pow(x4, y4));

        out.print("Задание 3.6. Все ли знаки в числе одинаковы? Введите число: ");
        int с6;

        while (true) {
            if (in.hasNextInt()) {
                с6 = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
            }
        }
        out.println(m.equalNum(с6));

        out.print("Задание 3.8. Введите число: ");
        int с8;
        
        while (true) {
            if (in.hasNextInt()) {
                с8 = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                in.next();
            }
        }
        m.leftTriangle(с8);

        out.println("Задание 3.10. Начнем игру!");
        m.guessGame(in);


        out.print("Задание 4.2. Сколько чисел в массиве ты хочешь? ");
        int n;
        while (true) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                    in.next();
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        int[] arr = new int[n];
        out.println("Хорошо! А какое число тебе нужно найти? ");
        int usern;

        while (true) {
            if (in.hasNextInt()) {
                usern = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        out.println(m.findLast(arr, usern));

        out.print("Задание 4.4. Сколько чисел в массиве ты хочешь? ");
        int n1;

        while (true) {
            if (in.hasNextInt()) {
                n1 = in.nextInt();
                if (n1 <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        int[] arr1 = new int[n1];
        out.print("Хорошо! А какое число тебе нужно вставить и на какую позицию? ");
        int usern1;

        while (true) {
            if (in.hasNextInt()) {
                usern1 = in.nextInt();
                break;
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        int pos;
        while (true) {
            if (in.hasNextInt()) {
                pos = in.nextInt();
                if (pos < 0 || pos > n1) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число от 0 до " + (n1 - 1) + ":");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }


        for (int i = 0; i < arr1.length; i++){
            arr1[i] = random.nextInt(100);
        }

        int[] newarr = m.add(arr1, usern1, pos);
        for (int i = 0; i < newarr.length; i++){
            out.print(newarr[i] + " ");
        }
        out.println();

        out.print("Задание 4.6. Сколько чисел в массиве ты хочешь? ");
        int n2;

        while (true) {
            if (in.hasNextInt()) {
                n2 = in.nextInt();
                if (n2 <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        out.println("Отлично! Вот результат! ");
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++){
            arr2[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++){
            out.print(arr2[i] + " ");
        }
        out.println();
        m.reverse(arr2);
        out.println();

        out.print("Задание 4.8. Сколько ты чисел хочешь в первом и втором массиве? ");
        int l1;

        while (true) {
            if (in.hasNextInt()) {
                l1 = in.nextInt();
                if (l1 <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        int l2;

        while (true) {
            if (in.hasNextInt()) {
                l2 = in.nextInt();
                if (l2 <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        out.println("Твои массивы: ");

        int[] mass1 = new int[l1];
        int[] mass2 = new int[l2];

        for (int i = 0; i < l1; i++){
            mass1[i] = random.nextInt(100);
            out.print(mass1[i] + " ");
        }
        out.println();
        for (int i = 0; i < l2; i++){
            mass2[i] = random.nextInt(100);
            out.print(mass2[i] + " ");
        }
        out.println();
        int[] newmass =  m.concat(mass1, mass2);
        for (int i = 0; i < l1 + l2; i++){
            out.print(newmass[i] + " ");
        }
        out.println();

        out.print("Задание 4.10. Сколько чисел в массиве ты хочешь? ");
        int l3;

        while (true) {
            if (in.hasNextInt()) {
                l3 = in.nextInt();
                if (l3 <= 0) {
                    out.println("Неправильный ввод. Пожалуйста, введите целое число больше 0:");
                } else {
                    break;
                }
            } else {
                out.println("Неправильный ввод. Пожалуйста, введите целое число:");
                in.next();
            }
        }

        out.println("Твой массив: ");
        int[] mass12 = new int[l3];

        for (int i = 0; i < l3; i++){
            mass12[i] = random.nextInt(100) - random.nextInt(100);
            out.print(mass12[i] + " ");
        }
        out.println("Результат: ");
        int[] newmass12 = m.deleteNegative(mass12);
        for (int i = 0; i < newmass12.length; i++){
            out.print(newmass12[i] + " ");
        }


        in.close();
    }
    // Задание 1. Методы
    // 2. Сложение двух последних знаков числа
    public int sumLastNums (int x){
        int x1 = x % 10;
        int x2 = x / 10 % 10;
        return x1 + x2;
    }
    // 4. Принимает число x и возвращает True, если оно положительное
    public boolean isPositive (int x){
        return x > 0;
    }
    // 6. Возвращает True, если x - это большая буква в диапазоне "A-Z"
    public boolean isUpperCase (char x){
        return x >= 'A' && x <= 'Z';
    }
    // 8. True, если любое из принятых чисел делит другое нацело
    public boolean isDivisor (int a, int b){
        return (a % b == 0) || (b % a == 0);
    }
    // 10. Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
    //двух чисел из разряда единиц. Выполнить с его помощью последовательного
    //сложения пяти чисел и результат вывести на экран.
    public int lastNumSum(int a, int b){
        int sum = (a % 10) + (b % 10);
        return sum % 10;
    }

    // Задание 2. Условия
    // 2. Деление x на y с исключением деления на 0
    public double safeDiv (int x, int y){
        if (y == 0){
            return 0.0;
        }
        else {
            return (double) x / y;
        }
    }
    // 4. Возвращает строку,
    //которая включает два принятых методом числа и корректно выставленный
    //знак операции сравнения (больше, меньше, или равно)
    public String makeDecision (int x, int y){
        if (x < y){
            return x + " < " + y;
        }
        else if (x > y){
            return x + " > " + y;
        }
        else {
            return x + " = " + y;
        }
    }
    // 6. Возвращает true, если двух чисел равна третьему
    public boolean sum3 (int x, int y, int z){
        if ((x + y == z) || (x + z == y) || (y + z == x)){
            return true;
        }
        else return false;
    }
    // 8. Необходимо реализовать метод таким образом, чтобы он возвращал строку,
    // в которой сначала будет число х, а затем одно из слов: год, года, лет.
    public String age (int x){
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;
        switch (lastDigit) {
            case 1:
                if (lastTwoDigits != 11) {
                    return x + " год";
                }
                break;
            case 2, 3, 4:
                if (lastTwoDigits < 10 || lastTwoDigits >= 20) {
                    return x + " года";
                }
                break;
            default:
                return x + " лет";
        }
        return x + " лет";
    }
    // 10. Вывести дни недели, начиная с введенного дня x
    public void printDays(String x) {
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        switch (x) {
            case "понедельник", "пн":
                printDaysIndex(week, 0);
                break;
            case "вторник", "вт":
                printDaysIndex(week, 1);
                break;
            case "среда", "ср":
                printDaysIndex(week, 2);
                break;
            case "четверг", "чт":
                printDaysIndex(week, 3);
                break;
            case "пятница", "пт":
                printDaysIndex(week, 4);
                break;
            case "суббота", "сб":
                printDaysIndex(week, 5);
                break;
            case "воскресенье", "вс":
                printDaysIndex(week, 6);
                break;
            default:
                out.println("это не день недели");
        }
    }

    private void printDaysIndex(String[] week, int index) {
        for (int i = index; i < week.length; i++) {
            out.println(week[i]);
        }
    }

    // Задание 3. Циклы
    // 2. Числа наоборот.
    //Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
    //которой будут записаны все числа от x до 0 (включительно).
    public String reverseListNums (int x){
        String result = "";
        for (int i = x; i >= 0; i--){
            result += i + " ";
        }
        return result.trim();
    }
    // 4. Необходимо реализовать метод таким образом,
    // чтобы он возвращал результат возведения x в степень y.
    public int pow(int x, int y){
        int step = 1;
        for (int i = 0; i < y; i++){
            step *= x;
        }
        return step;
    }
    // 6. Необходимо реализовать метод таким образом,
    // чтобы он возвращал true, если все знаки числа одинаковы, и false в ином случае.
    public boolean equalNum (int x){
        int firstDigit = x % 10;
        x = x / 10;
        while (x != 0) {
            int currentDigit = x % 10;
            if (currentDigit != firstDigit) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
    // 8. Необходимо реализовать метод таким образом, чтобы он выводил на экран
    //треугольник из символов ‘*’ у которого х символов в высоту, а количество
    //символов в ряду совпадает с номером строки.
    public void leftTriangle (int x){
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                out.print('*');
            }
            out.println();
        }
    }
    // 10. Необходимо реализовать метод таким образом,
    // чтобы он генерировал случайное число от 0 до 9,
    // далее считывал с консоли введенное пользователем число и выводил,
    // угадал ли пользователь то, что было загадано, или нет. Метод запускается до тех пор,
    // пока пользователь не угадает число. После этого выведите на экран количество попыток,
    // которое потребовалось пользователю, чтобы угадать число.
    public void guessGame(Scanner in){
        Random random = new Random();
        int r = random.nextInt(10);
        int count = 0;

        while (true) {
            out.print("Введите число от 0 до 9: ");
            while (!in.hasNextInt()) {
                out.println("Неправильный ввод. Пожалуйста, введите целое число от 0 до 9:");
                in.next();
            }
            int user = in.nextInt();
            if (user < 0 || user > 9) {
                out.println("Неправильный ввод. Пожалуйста, введите целое число от 0 до 9:");
                in.next();
                continue;
            }
            count++;

            if (user == r) {
                out.println("Вы угадали!");
                out.println("Вы отгадали число за " + count + " попытки");
                break;
            } else {
                out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }
    }
    // Задание 4. Массивы
    // 2. Необходимо реализовать метод таким образом,
    // чтобы он возвращал индекс последнего вхождения числа x в массив arr.
    public int findLast (int[] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // 4. Необходимо реализовать метод таким образом,
    // чтобы он возвращал новый массив, который будет содержать все элементы массива arr,
    // однако в позицию pos будет вставлено значение x.
    public int[]add (int[] arr, int x, int pos){
        int[] newarr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newarr, 0, pos);
        newarr[pos] = x;
        System.arraycopy(arr, pos, newarr, pos + 1, arr.length - pos);

        return newarr;

    }
    // 6. Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
    //После проведенных изменений массив должен быть записан задом-наперед.
    public void reverse (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++){
            out.print(arr[i] + " ");
        }
    }
    // 8. Необходимо реализовать метод таким образом,
    // чтобы он возвращал новый массив, в котором сначала идут элементы первого массива (arr1),
    // а затем второго (arr2).
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
    // 10. Необходимо реализовать метод таким образом,
    // чтобы он возвращал новый массив, в котором записаны все
    // элементы массива arr кроме отрицательных.
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
