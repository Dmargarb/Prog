public class PalindromeChecker {

    public boolean esPalindromo(String cadena) {
        String cadenaAlReves = "";
        cadena = cadena
                .toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaAlReves = cadenaAlReves + cadena.charAt(i);
        }

        if (cadena.equals(cadenaAlReves))
            return true;
        else
            return false;
    }
}
