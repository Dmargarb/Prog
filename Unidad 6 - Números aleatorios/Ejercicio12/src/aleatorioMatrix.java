public class aleatorioMatrix {

  public static void main(String[] args) throws InterruptedException {
  
    for(int i = 0; i < 5000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
    }
  }
}