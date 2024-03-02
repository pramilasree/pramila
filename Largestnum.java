import java.util.Scanner;
class Largestnum{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a1=scan.nextInt();
        System.out.println("Enter the second number");
        int b1=scan.nextInt();
        System.out.println("Enter the third number");
        int c1=scan.nextInt();
        greatest(a1,b1,c1);
     }
    static void greatest(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a+" "+"is greatest");
        }
        else if (b>a && b>c){
            System.out.println(b+" "+"is greatest");
        }
        else if(c>a && c>b){
            System.out.println(c+" "+" is greatest");
        }
        else{
            System.out.println("no num is greatest");
        }

    }

}
