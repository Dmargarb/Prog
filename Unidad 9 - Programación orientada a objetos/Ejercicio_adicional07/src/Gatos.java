/**
 * Gatos.java
 * Definición de la clase Gato
 * 
 * 
 */
public class Gatos extends Animales implements Mascota {

    private String codigo;

    public Gatos(Sexos s, String c) {
        super(s);
        this.codigo = c;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Hace que el gato emita sonidos.
     */
    @Override
    public void hazRuido() {
        this.maulla();
        this.ronronea();
    }

    /**
     * Hace que el gato maulle.
     */
    public void maulla() {
        System.out.println("Miauuuu");
    }

    /**
     * Hace que el gato ronronee
     */
    public void ronronea() {
        System.out.println("mrrrrrr");
    }

    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     * 
     * @param comida la comida que se le ofrece al gato
     */
    @Override
    public void come(String comida) {

        if (comida.equals("pescado")) {
            super.come();
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    /**
     * Pone a pelear al gato contra otro animal.
     * Solo se van a pelear dos machos entre sí.
     * 
     * @param contrincante es el animal contra el que pelear
     */
    @Override
    public void peleaCon(Animales contrincante) {
        if (this.getSexo() == Sexos.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexos.HEMBRA) {
                System.out.println("no peleo contra hembras");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
}
