public class App {

  public static void main(String[] args) {
    int a = 5;
    int b = 1;

    for (int i = 0; i < 10; i++) {
      System.out.print(i == a ? b : " ");
    }
  }
}
