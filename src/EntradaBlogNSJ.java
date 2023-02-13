/** Clase para manejar las entradas de un blog.
 *
 * @author La clase se creó el 21/3/1999 por Ana López.
 * @version Esta es la versión 2.3
 *
 * Modificado por Nuria Sánchez Jordán 13/02/2023
 */
//Modificar.
public class EntradaBlogNSJ {


    /**
     * Separador es el carácter que separa ENTRADA DE del nombre del autor.
     */
    public static char separador=':';
    private final int id;
    private final String texto;
    private final String autor;

    /**
     * Constructor de la clase.
     * Se recibe el numero de entrada, el nombre del autor de la entrada y el texto que contiene la entrada.
     * si el numero de entrada es negativo, lanza una excepción.
     */

    public EntradaBlogNSJ (int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * @return Devuelve el número de la entrada.
     */

    public int getId(){
        return this.id;
    }

    /**
     * @return Devuelve el texto completo de la entrada.
     */

    public String getTexto(){
        return this.texto;
    }

    /**
     * @return Devuelve el nombre del autor de la entrada en mayúsculas.
     */

    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /*
      @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
    *
    *public String devuelveAutor(){
    *    return this.autor;
    }*/

    /**
     * Modification el 13/02/2023
     *
     * @author Modificada por: Nuria Sánchez Jordán.
     */

    public static void main(String[] args) {

        EntradaBlogNSJ e1=new EntradaBlogNSJ (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
