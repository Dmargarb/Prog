import java.util.Scanner;

public class Escaparate {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Juego minecraft = new Juego(Pegi.PEGI_3,"minecraft",20);
        
        Juego gow = new Juego(Pegi.PEGI_16,"GOW",50);
        System.out.println(minecraft);
        System.out.println(gow);
        s.close();
    }
}
