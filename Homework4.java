import java.util.Scanner;

public class Homework4 {

    int gcd(int num1,int num2){
        int h;

        if(num1==0){
            return num1;
        }
        else if(num1%num2==0){
            return num2;
        }
        else{
            num1=num1%num2;
            h=num2;
            num2=num1;
            num1=h;
            return gcd(num1,num2);
        }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        Homework4 result= new Homework4();

        System.out.println("두 수의 최대공약수는 " + result.gcd(m,n) + "입니다.");
    }
}
