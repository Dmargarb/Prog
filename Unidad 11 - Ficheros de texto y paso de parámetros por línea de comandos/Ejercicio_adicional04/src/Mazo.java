public class Mazo {

    private String nombre;
    private String colores;
    private String destinado;
    private String tipo;

    public Mazo(String datos) {
        this.deserializar(datos);
    }

    public Mazo(String nombre, String colores, String destinado, String tipo) {
        this.nombre = nombre;
        this.colores = colores;
        this.destinado = destinado;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getDestinado() {
        return destinado;
    }

    public void setDestinado(String destinado) {
        this.destinado = destinado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String serializar() {
        return String.format("%s;%s;%s;%s", this.nombre, this.colores, this.destinado, this.tipo);
    }

    public void deserializar(String datos) {
        String[] datosMazo = datos.split(";");
        this.nombre = datosMazo[0];
        this.colores = datosMazo[1];
        this.destinado = datosMazo[2];
        this.tipo = datosMazo[3];
    }

    public String toString() {
        String nombreFormatted = String.format("| %-23s |", "Nombre:");
        String coloresFormatted = String.format("| %-23s |", "Colores:");
        String destinadoFormatted = String.format("| %-23s |", "Destinado a:");
        String tipoFormatted = String.format("| %-23s |", "Tipo:");

        String nombreValueFormatted = String.format(" %-26s |", this.nombre);
        String coloresValueFormatted = String.format(" %-26s |", this.colores);
        String destinadoValueFormatted = String.format(" %-26s |", this.destinado);
        String tipoValueFormatted = String.format(" %-26s |", this.tipo);

        return "+-------------------------+----------------------------+\n" +
                nombreFormatted + nombreValueFormatted + "\n" +
                coloresFormatted + coloresValueFormatted + "\n" +
                destinadoFormatted + destinadoValueFormatted + "\n" +
                tipoFormatted + tipoValueFormatted + "\n" +
                "+-------------------------+----------------------------+\n";
    }

}
