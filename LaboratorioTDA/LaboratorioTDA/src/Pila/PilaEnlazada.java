
package Pila;

/**
 *
 * @author estudiante
 */
public class PilaEnlazada implements PilaInterface {

        private Nodo top; // Referencia al nodo superior de la pila

    public PilaEnlazada(Nodo top) {
        this.top = null;    
    }

    PilaEnlazada() {
           this.top = null;
    }

    
    
    
    
    
    
    
    
    
    //Metodos de PilaInterface.java
    @Override
    public void push(Object elemento) {
        
          Nodo nuevoNodo = new Nodo(elemento); // Crear un nuevo nodo con el elemento
        if (isEmpty()) {
            top = nuevoNodo; // Si la pila está vacía, el nuevo nodo se convierte en el nodo superior
        } else {
            nuevoNodo.setSiguiente(top); // Establecer el siguiente del nuevo nodo como el nodo superior actual
            top = nuevoNodo; // El nuevo nodo se convierte en el nodo superior
        }
        
          
    }
    
    
    
    

    @Override
    public Object pop() {
        
        if (isEmpty()) {
        throw new IllegalStateException("La pila está vacía"); // Lanzar una excepción si la pila está vacía
        }
        Object elemento = top.getElemento(); // Obtener el elemento del nodo superior
        top = top.getSiguiente(); // Mover el puntero al siguiente nodo (nodo inferior)
        return elemento; // Devolver el elemento
        
    }

    
    
    
    @Override
    public Object peek() {
        
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía"); // Lanzar una excepción si la pila está vacía
        }
        return top.getElemento(); // Devolver el elemento del nodo superior sin eliminarlo
        
        
    }

    
    
    
    @Override
    public boolean isEmpty() {
        
          return top == null; // Verificar si la pila está vacía (el nodo superior es nulo)

        
    }

    @Override
    public int size() {
        int count = 0;
        Nodo nodoActual = top;
        while (nodoActual != null) {
            count++;
            nodoActual = nodoActual.getSiguiente();
        }
        return count; // Contar el número de elementos en la pila
    }
        
        
    }
    
    
    
    

