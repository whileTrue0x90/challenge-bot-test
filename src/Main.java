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
}