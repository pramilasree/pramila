import java.util.Scanner;
import java.math.BigInteger;
class BiggerNum{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String num1=scan.nextLine();
        BigInteger first =new BigInteger(num1); 
        System.out.println("enter the string");
        String num2=scan.nextLine();
        BigInteger second=new BigInteger(num2);
        BigInteger sum;
        sum=first.add(second);
        System.out.println(sum);
    }
}
