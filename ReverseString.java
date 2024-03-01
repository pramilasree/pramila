import java.util.Scanner;
class ReverseString{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name="";
        char[] arr=name.toCharArray();
        char[] rev=new char[arr.length];
        reverse(arr,rev);
    }
static void reverse(char[] sum,char[] mus){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the String=");
    String name1=scan.nextLine();
    sum=name1.toCharArray();
    mus=new char[sum.length];
    int i=sum.length-1;
    int j=0;
    for(;i>=0;i--){
        mus[j]=sum[i];
        j++;
    }
    System.out.println (mus);
    }
 }