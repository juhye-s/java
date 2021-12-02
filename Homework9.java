package java_programming.java_programming;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

class Homework9{
    public static void main(String[] args) {


        Map<String, String> wc = new HashMap<String, String>();
        String str;
        try{
            Scanner sc = new Scanner(new File("db.txt"));
            while(sc.hasNext()) {

                String id = sc.next();
                String password = sc.next();
                wc.put(id,password);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        while(true) { 
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: "); 
            Scanner sc2 = new Scanner(System.in);
            String id = sc2.next();

            if (wc.containsKey(id)) {
                System.out.print("password: ");
               
                String password = sc2.next();

                if (wc.get(id).equals(password)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }

        }
    }


}



