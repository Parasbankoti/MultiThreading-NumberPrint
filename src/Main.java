//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintEvenOdd obj = new PrintEvenOdd();
        Thread evenThread = new Thread(()-> obj.printEven());
        Thread oddThread = new Thread(() -> obj.printOdd());

        evenThread.setName("Even-Thread");
        oddThread.setName("Odd-Thread");

        evenThread.start();
        oddThread.start();

    }
}