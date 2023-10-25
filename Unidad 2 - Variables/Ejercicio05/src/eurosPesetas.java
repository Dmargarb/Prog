public class eurosPesetas {
    public static void main(String[] args) throws Exception {
        int euros;
        int pesetas;
        pesetas = 100000;
        euros = (int) (pesetas / 166.386);
        System.out.println(+pesetas + " pesetas son " + euros + " euros.");
    }
}
