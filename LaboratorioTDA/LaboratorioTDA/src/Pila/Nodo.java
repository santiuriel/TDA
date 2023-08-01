
package Pila;

/**
 *
 * @author estudiante
 */
public class Nodo {
    
    private Object elemento; // Atributo para almacenar el elemento del nodo
    private Nodo siguiente; // Atributo para almacenar la referencia al siguiente nodo

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    // GETTER AND SETTER -.-.-.-.-.-.-.-.-.
    
    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}
