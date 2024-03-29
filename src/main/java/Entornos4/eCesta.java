package Entornos4;

/***
 * Esta clase representa una cesta de compra y unas operaciones básicas 
 * asociadas
 * 
 * @author Rafael SGP
 * @version 1.0 Snapshot
 */
public class eCesta {

    private String comercio;

    private double bono;

    private String usuario;

    /***
     * Constructor sin argumentos
     */
    public eCesta() {

    }

    /***
     * Constructor parametrizado
     * @param c El nombre del comercio
     * @param b El valor del bono
     * @param u El nombre del usuario
     * @param extra Parámetro extra añadido durante el ejercicio
     */
    public eCesta(String c, double b, String u, double extra) {

        comercio = c;

        bono = b + 10;

        usuario = u;

    }
    
    /***
     * Este método permite establecer el nombre del comercio
     * @param nombre El nuevo nombre del comercio
     */
    public void AsignarComercio(String nombre) {

        comercio = nombre;

    }

    /***
     * Devuelve el usuario de la cesta
     * @return El nombre del usuario
     */
    public String Titular() {

        return usuario;

    }

    /***
     * Este método devuelve la bonificación aplicada
     * @return La bonificación aplicada a la cesta
     */
    public double bonificacion() {

        return bono;

    }

    /***
     * Este método permite actualizar la bonificación que se aplica a la cesta
     * @param n La bonificación a aplicar
     * @throws IllegalArgumentException En caso de la bonificación ser un 
     * negativo, el método devuelve una excepción.
     */
    public void ActualizarBono(double n) throws IllegalArgumentException {

        if (n < 0) {
            throw new IllegalArgumentException("No es posible actualizar bono");
        }

        bono = bono + n;

    }
    
    /***
     * Este método consolida las compras establecidas en la cesta, restando el
     * total al bono.
     * @param total La cantidad total de la compra
     * @throws Exception Este método devuelve una excepción en caso de que la
     * compra sea inferior a cero o que la compra exceda la bonificación.
     */
    public void comprar(double total) throws Exception {

        if (total <= 0) {
            throw new Exception("Imposible la compra");
        }

        if (bonificacion() < total) {
            throw new Exception("Su bono es insuficiente para la compra");
        }

        bono = bono - total;

    }

    /***
     * Este método devuelve el usuario de la cesta
     * @return El nombre del usuario
     */
    public String identificacionUsuario() {

        return usuario;

    }

    /***
     * Devuelve el nombre del comercio
     * 
     * @return El nombre del comercio
     */
    public String getComercio() {
        return comercio;
    }

    /***
     * Método para establecer el nombre del comercio
     * @param comercio El nuevo nombre del comercio
     */
    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    /***
     * Establece el valor del bono
     * @param bono El valor deseado
     */
    public void setBono(double bono) {
        this.bono = bono;
    }

    /***
     * Establece el nombre del usuario
     * @param usuario Nuevo nombre del usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
