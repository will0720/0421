import java.util.*;

public class A1113302_0421_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        
        Boolean correctEmail; 
        do {
            correctEmail = true;
            System.out.println("請輸入您的電子郵件信箱:");
            String str = sc.next();

            if (str.matches("[a-z]+@[a-z]+")) {
                System.out.println("格式正確");  
            } else {
                System.out.println("格式錯誤，請重新輸入");
                correctEmail = false;
            }
        } while (!correctEmail);
    }
}
