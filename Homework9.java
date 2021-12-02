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



        while(true) { //c는1 ,java는 true java는 1을 true로 인식하지 않는다.
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: "); //여기까지 하면 프롬프트창에 입력이 안됨
            Scanner sc2 = new Scanner(System.in);
            String id = sc2.next(); //이게 되야 입력이 됨

            if (wc.containsKey(id)) {
                System.out.print("password: ");
                //scanner 또 쓸필요 없다
                String password = sc2.next();

                if (wc.get(id).equals(password)) {//key 에 해당하는 value를 가져올때는 get을 씀 /변수명이니까password괄화안해됨 /key:Id
                    //equals가 함수라서 ()안에 password넣어야함
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                } else {
                    System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }

        }
    }


}



