
package Pila;

/**
 *
 * @author estudiante
 */
public interface PilaInterface {
    
    void push(Object elemento); 
    Object pop();
    Object peek(); 
    boolean isEmpty(); 
    int size(); 
    
    
    //Instrucciones -------------------------------------------------------------------
//Push: Inserta un elemento en la parte superior de la pila.
//Pop: Elimina y devuelve el elemento que está en la parte superior de la pila.
//Peek: Obtiene el elemento que está en la parte superior de la pila sin eliminarlo.
//isEmpty: Verifica si la pila está vacía.
//Size: Obtiene el número de elementos presentes en la pila.
//search: Busca un elemento en particular= search(x);
    
    
}
