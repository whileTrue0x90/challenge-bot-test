import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
    }

    public static Date getNextDay() {
        try {
            Thread.sleep(24 * 60 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date();
    }

}