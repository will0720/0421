import java.util.*;

public class A1113302_0421_2 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        
        Boolean correctDate; 
        do {
            correctDate = true;
            System.out.println("請輸入日期(請以YYYY/MM/DD或MM/DD/YYYY的格式輸入):");
            String str = sc.next();

            if (str.matches("[0-9]{4}[/][0-1][1-9][/][0-3][1-9]")) {
                String year = str.substring(0,4);
                String month = str.substring(5,7);
                String date = str.substring(8,10);
                System.out.println("日期為" + year + "年" + month + "月" + date + "日");  
            } else if (str.matches("[0-1][1-9][/][0-3][1-9][/][0-9]{4}")) {
                String year = str.substring(6,10);
                String month = str.substring(0,2);
                String date = str.substring(3,5);
                System.out.println("日期為" + year + "年" + month + "月" + date + "日");
            } else {
                System.out.println("格式錯誤，請重新輸入");
                correctDate = false;
            }
        } while (!correctDate);
    }
}