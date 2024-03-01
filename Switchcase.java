import java.util.Scanner;
class Switchcase{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Add,2.Sub,3.Mul,4.div");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
              add();
              break;
            case 2:
              sub();
              break;
            case 3:
              mul();
              break;
            case 4:
            div();
            break;
            default:
            System.out.println("invalid index");

        }
    }
static void add(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first num=");
    int n1=scan.nextInt();
    System.out.print("Enter the second num=");
    int n2=scan.nextInt();
    int n3=n1+n2;
    System.out.println("Additionn="+n3);
}
static void sub(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first num=");
    int n4=scan.nextInt();
    System.out.print("Enter the second num=");
    int n5=scan.nextInt();
    int n6=n5-n4;
    System.out.println("Subtraction="+n6);
}
static void mul(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first num=");
    int n7=scan.nextInt();
    System.out.print("Enter the second num=");
    int n8=scan.nextInt();
    int n9=n7*n8;
    System.out.println("Multipication="+n9);
}
static void div(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the first num=");
    int n10=scan.nextInt();
    System.out.print("Enter the second num=");
    int n11=scan.nextInt();
    int n12=n11/n10;
    System.out.println("Division="+n12);
}

    }
    


