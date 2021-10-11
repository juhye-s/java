import java.util.Scanner;

public class Homework3{
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("수를 입력하세요:");
        for(int i=0; i<arr.length; i++)
            arr[i]=scanner.nextInt();
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]) { min = arr[i]; }
            if(max < arr[i]) { max = arr[i]; } }
        System.out.print("최대값: " +max + "\n최소값: " + min);
        scanner.close();

    }
}