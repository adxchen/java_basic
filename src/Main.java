// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/**Main为类名，public为访问修饰符，表示该class为公开的
 *java中含有四种访问修饰符：访问权限由小至大依次为：private、default、protected、public。
 *访问权限的四个级别：同一个类、同一个包、不同包的子类、不同包的非子类
 *如果没有使用任何访问修饰符，那么默认使用的default修饰符。
 */

public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}