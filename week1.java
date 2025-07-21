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
