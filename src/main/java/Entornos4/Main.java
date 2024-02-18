package Entornos4;

import java.util.random.RandomGenerator;

/***
 * Clase principal del programa
 * @author Rafael SGP
 */
public class Main {

    /***
     * Método main y punto de entrada del programa
     * @param args Parámetros obtenidos desde la línea de comandos
     */
    public static void main(String[] args) {

        NuevoMetodo();

    }

    /***
     * Método refactorizado extrayendo el código que estaba en main
     */
    public static void NuevoMetodo() {
        eCesta cesta;

        cesta = new eCesta("Apellidos del alumno", 100, "dni del alumno", 10);

        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }

        try {

            System.out.println(" Modificación 1");

            cesta.ActualizarBono(-50);

        } catch (Exception e) {

            System.out.print("Fallo…….");

        }
        
        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);
    }
    
    /***
     * Método que devuelve un pseudoaletorio utilizando un algoritmo más actual
     * @return Número pseudoaleatorio generado
     */
    public static long getRandom(){
        RandomGenerator g = RandomGenerator.of("L128X1024MixRandom");
        return g.nextLong();
    }
}
