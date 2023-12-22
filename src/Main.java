import java.util.Scanner;

public class Main {
    static boolean palindromik(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
            System.out.println(str+"  kelimesinin tersden okunuşu kendisi değildir");
                return false;
            }
            i++;
            j--;
        }
        System.out.println(str+"  kelimesinin tersden okunuşu kendisidir");
                 return true;
    }
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen palindromik durumu incelenecek kelimeyi girin");
        String a= klavye.next();
        System.out.println(palindromik(a));

    }
}