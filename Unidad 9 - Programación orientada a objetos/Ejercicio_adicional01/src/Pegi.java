public enum Pegi {

    PEGI_3(3),PEGI_12(12),PEGI_16(16);
    
    int valor;
    Pegi(int valor){
        this.valor = valor;
    }
    public String toString() {
        return ""+valor;
      }

}
