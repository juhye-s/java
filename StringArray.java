public class StringArray {
    public static void main(String[] args){
        String[] browsers1 = {"Google Chrome",
        "Microsoft Edge","Mozilla Firefox","Naver Whale"};

        String[] browsers2= new String[4];
        browsers2[0]= "Google Chrome";
        browsers2[1]= "Microsoft Edge";
        browsers2[2]= new String("Mozilla Firefox");
        browsers2[3]= new String ("Naver Whale");
        System.out.println("browsers1 출력");
        System.out.printf("%s의 문자열 길이: %d \n", browsers1[0],browsers1[0].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers1[1],browsers1[1].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers1[2],browsers1[2].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers1[3],browsers1[3].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers2[0],browsers2[0].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers2[1],browsers2[1].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers2[2],browsers2[2].length());
        System.out.printf("%s의 문자열 길이: %d \n", browsers2[3],browsers2[3].length());





    }
}
