public class dadoDePoker {

  public static void main(String[] args) {
    String figura = "";
    int tiradas = 5;

    do {
      switch ((int) (Math.random() * 6)) {
        case 0:
          figura = "As";
          break;
        case 1:
          figura = "K";
          break;
        case 2:
          figura = "Q";
          break;
        case 3:
          figura = "J";
          break;
        case 4:
          figura = "7";
          break;
        case 5:
          figura = "8";
          break;
        default:
      }
      System.out.print(figura+" ");
      tiradas--;
    } while (!(tiradas == 0));
  }
}
