import java.util.ArrayList;
import java.util.Scanner;

public class week1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Code Executing !");
        armstrongNumber(args);
    }

    public static void naturalSum(String[] args) {
        int n ;
        System.out.print("Enter The range of N natural numbers : ");
        n = scanner.nextInt();
        int sum;
        sum = (n*(n+1))/2;
        System.out.printf("The Sum of %d Natural numbers : %d ",n,sum);
    }

    public static void prime(String[] args) {
        int start ;
        int end;
        ArrayList<Integer> prime = new ArrayList<>();

        System.out.print("Enter The Starting range : ");
        start = scanner.nextInt();
        System.out.print("Enter the ending range : ");
        end = scanner.nextInt();

        for(int num=start; num<=end; num++){
            boolean isPrime = true;
            if(num == 1){
                continue;
            }
            else if(num == 2){
                prime.add(num);
            }
            else{
                for(int i=2; i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    prime.add(num);
                }
            }
        }
        System.out.printf("\nThere are totally %d prime numbers inbetween %d to %d",prime.size(),start,end);
        System.out.printf("\nThe Prime Numbers from %d to %d are : ",start,end);
        System.out.println(prime);
    }

<<<<<<< HEAD
=======
    public static void sumOfDigits(String[] args) {
        int n ;
        int sum = 0;
        System.out.print("Enter the digit : ");
        n = scanner.nextInt();
        int temp = n;
        while(temp!=0){
            sum += (temp%10);
            temp /= 10;
        }
        System.out.println("The sum of the number " + n + " is " + sum );
    }

    public static void reverseNumber(String[] args) {
        int n ;
        int reverse = 0;
        System.out.print("Enter the digit : ");
        n = scanner.nextInt();
        int temp = n;
        while(temp!=0){
            reverse = (reverse*10) + (temp%10);
            temp /= 10;
        }
        System.out.println("The reverse of the number " + n + " is " + reverse );
    }

    public static void armstrongNumber(String[] args){
        int n=0;
        int arm ;
        System.out.print("Enter the number : ");
        n = scanner.nextInt();

        int len = Integer.toString(n).length();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int lastDigit = temp%10;
            sum += Math.pow(lastDigit,len);
            temp /= 10;
        }
        if(sum==n){
            System.out.println("The Number " + n + " is a Armstrong Number");
        }
        else{
            System.out.println("The Number Is ");
        }
    }

    public static void fibonacciSeries(String[] args) {
        System.out.print("Enter the length of the fibonacci series");
        int n = scanner.nextInt();
        

    }
    
>>>>>>> 1c4df129e1572c341ec8bf14ad04db4731adc6f7
}
