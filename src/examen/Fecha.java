package examen;

/**
 * Clase encargada de valorar la fecha
 * @author Mario
 * @version 1.0
 */
public class Fecha {
    /**
     * Variable de tipo local que almacena la valided de la fecha
     */
    private static boolean fechaValida;

    /**
     * Funcion encarga de valorar la valided de la fecha introducida
     * @param anio
     * @param mes
     * @param dia
     * @return Devuelve si la fecha es valida o no
     */
    public static boolean validarFecha(int anio, int mes, int dia) {
        fechaValida = false;
        if ((dia > 0) && (mes > 0) && (anio > 0)) {
            if ((mes <= 12) && (dia <= 31)) {
                if (mes == 2) {
                    fechaValida = dia <= 28;
                } else if (mes % 2 == 0) {
                    fechaValida = dia <= 30;
                } else {
                    fechaValida = dia <= 31;
                }
            }
        }
        return fechaValida;
    }
}