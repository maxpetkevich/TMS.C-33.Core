package lesson2.homework;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Task 1");
        getTaskOne();
        System.out.println("Task 2");
        getTaskTwo();
        System.out.println("Task 3");
        getTaskThree();
        System.out.println("Task 4");
        getTaskFour();
        System.out.println("Task 5");
        getTaskFive();
        System.out.println("Task 6");
        getTaskSix();
    }
    public static void getTaskOne(){
        int a, b=5,c=10;
        a=4*(b+c-1)/2;
        System.out.println(a + "\n");
    }
    public static void getTaskTwo(){
        int n = 99, firstValue, secondValue,result;
        firstValue=n / 10;
        secondValue=n % 10;
        result= firstValue + secondValue;
        System.out.println(firstValue + "+" + secondValue+ "=" + result + "\n");

    }
    public static void getTaskThree() {
        int n = 123, firstValue, secondValue,thirdValue, result;
        firstValue = n / 100;
        secondValue = (n/10) % 10;
        thirdValue = n % 10;
        result = firstValue + secondValue + thirdValue;
        System.out.println(firstValue + "+" + secondValue + "+"+ thirdValue + "=" + result + "\n");
    }
    public static void getTaskFour(){
        double n = 32.5;
        int result = (int)(n + 0.5);
        System.out.println(result + "\n");

    }
    public static void getTaskFive(){
        int q = 21, w = 8, result, remainder;
        result = q / w;
        remainder=q % w;
        System.out.println("21 / 8 = " +result + " and " + remainder + " in the remainder\n");

    }
    public static void getTaskSix(){
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
