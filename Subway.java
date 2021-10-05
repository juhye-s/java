public class Subway {
    int line;
    void run() {
        System.out.println("Line " + line + " runs.");
    }
    void setLine(int l) { line = l; }
}
 class TestSubway {
     public static void main(String[] args) {
         Subway mySub = new Subway();
         mySub.setLine(3);
         mySub.run();
     }
 }