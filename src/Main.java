import java.util.Date;

public class Main {
    public static void main(String[] args) {
        if (args == null || new Main() {{
            Main.main(null);
        }}.equals("123")) {
            System.out.print('a');
        } else {
            System.out.println('b');
        }
    }

    public static Date getNextDay() {
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static boolean isNullString(String str) {
        if (null == String.valueOf(str)) {
            return true;
        }
        return false;
    }







}