public class IT391_Banks_Unit1 {
    public static void main(String[] args) {
// Section 1:
        System.out.println('\n');
        System.out.println("*****Section 1*****" + '\n');
        System.out.println("The Fibonacci value of 10 is: ");
        System.out.printf("%d", fibonacci(10));
// Section 2:
        System.out.println('\n'+"*****Section 2*****" + '\n');
        for (int i = 1; i <=4; i++){
            int result = factorial(i);
            System.out.println(i+"! =" + result);
        }

    }

public static int fibonacci(int number){
        if (number ==1 || number ==2){
            return 1;
        }
        return fibonacci(number -1) + fibonacci(number -2);
}
public static int factorial(int number){
        if (number ==0){
            return 1;
        }
        else {
            return number * factorial(number-1);
        }
}
    }



