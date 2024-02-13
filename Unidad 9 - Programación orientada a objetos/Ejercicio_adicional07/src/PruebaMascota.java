/**
 * PruebaMascota.java
 * Programa que prueba la interfaz Mascota
 * 
 * 
 */
public class PruebaMascota {
    public static void main(String[] args) {
      
      Mascota garfield = new Gatos(Sexos.MACHO, "34569");
      Mascota lisa = new Gatos(Sexos.HEMBRA, "96059");
      Mascota kuki = new Perros(Sexos.HEMBRA, "234678");
      Mascota ayo = new Perros(Sexos.MACHO, "778950");
      
      System.out.println(garfield.getCodigo());
      System.out.println(lisa.getCodigo());
      System.out.println(kuki.getCodigo());
      System.out.println(ayo.getCodigo());
      garfield.come("pescado");
      lisa.come("hamburguesa");
      kuki.come("pescado");
      lisa.peleaCon((Gatos)garfield);
      ayo.peleaCon((Perros)kuki);
    }
  }
  