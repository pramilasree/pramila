import java.util.Scanner;
class Primenum{
    public static void main(String[] args){
    prime();
    }

static void prime(){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int m=num/2;
    int flag=0;
    if(num==0 && num==1){
        System.out.println( num + " is not a prime number");
    }
    else{
        for(int i=2;i<=m;i++){
            if(num%i==0){
                System.out.println( num + " is the num is not prime");
                 flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println( num + " is the num is prime");
        }
    }
}

}