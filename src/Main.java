import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Git!");
        // ALU OPERATIONS //

//        int num1=2,num2=5,num3=4,  num5 = 0;
//        num5=num1+num2;
//        num1+=num1+num2;
//        System.out.println(num1);
//        System.out.println(num5);

        //--OPERATORS--//

        // &&=true or false//
        // &=number //

//        int num1 = 4;
//        int num2= 2;
//        int res=num1 & num2;
//        int res2=num1 | num2;
//        int res3=num1 ^ num2;
//        System.out.println(res);
//        System.out.println(res2);
//        System.out.println(~res);
//        System.out.println(res3);
//
//        //ROTATION MAARO MKB AAAAAGGGGG//
//        int num4=9;
//        int rotation =2;
//        System.out.println(2<<9);
//        System.out.println(9>>2);
//
//        String isEvenOdd=num2%2==0?"Even":"Odd";
//        int age =17;
//        System.out.println(age>18?"Old":"Minor");
//
//         if (age<18){
//             System.out.println("minor");
//         } else if (age>18 && age<60) {
//             System.out.println("adult");
//         }
//         else {
//             System.out.println("old");
//         }
//
//        Scanner Sc = new Scanner(System.in);
//        System.out.print("Number De: ");
//        int sc = Sc.nextInt();
//
//        if(sc % 3 == 0 && sc % 5 == 0){
//            System.out.println("FizzBuzz");
//        }else if(sc % 3 == 0){
//            System.out.println("Fizz");
//        }else if(sc % 5 == 0){
//            System.out.println("Buzz");
//        }else{
//            System.out.println(sc);

//            int num=0;
//          while (num<=10) {
//              System.out.println(num);
//
//            num++;

//
//                Scanner sc = new Scanner(System.in);
//
//
//                System.out.print("Enter first number: ");
//                double num1 = sc.nextDouble();
//
//
//                System.out.print("Enter operator (+, -, *, /): ");
//                char operator = sc.next().charAt(0);
//
//                // Input second number
//                System.out.print("Enter second number: ");
//                double num2 = sc.nextDouble();
//
//                double result;
//
//                // Perform calculation
//                switch (operator) {
//                    case '+':
//                        result = num1 + num2;
//                        break;
//
//                    case '-':
//                        result = num1 - num2;
//                        break;
//
//                    case '*':
//                        result = num1 * num2;
//                        break;
//
//                    case '/':
//                        if (num2 != 0) {
//                            result = num1 / num2;
//                        } else {
//                            System.out.println("Error: Division by zero is not allowed.");
//                            return;
//                        }
//                        break;
//
//                    default:
//                        System.out.println("Error: Invalid operator.");
//                        return;
//                }
//
//                // Output result
//                System.out.println("Result: " + result);
//
//                sc.close();
//        System.out.println(hello);


//                int a = 5;
//                int b;
//
//                // Post-increment
//                b = a++;
//                System.out.println("Post-increment (a++): a = " + a + ", b = " + b);
//
//                // Pre-increment
//                a = 5;
//                b = ++a;
//                System.out.println("Pre-increment (++a): a = " + a + ", b = " + b);
//
//                // Post-decrement
//                a = 5;
//                b = a--;
//                System.out.println("Post-decrement (a--): a = " + a + "


//        int num=0;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num>5);

//        int num=0;
//        for(;;){
//            System.out.println(num);
//            num++;    // infinite loop
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Divisors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                System.out.print("hello");

            }
        }
    }
}




