/**
 * Descripción:
 *
 * La clase Pila<T> representa una pila genérica en la cual se pueden almacenar elementos de tipo T. Siguiendo el principio LIFO (Last In, First Out), los elementos que se añaden más recientemente son los primeros en ser retirados.
 * Propiedades
 *
 *
 * Métodos:
 * - tope(): T?
 * - push(elemento: T)
 * - pop(): T?
 * - vacia(): Boolean
 * - iterator(): Iterator<T>
 *
 * @property elementos: Una lista mutable que almacena los elementos de la pila.
 *
 * @author Natalia
 */
class Pila<T> : Iterable<T> {
    private val elementos = mutableListOf<T>()

    /**
     *  Descripción:
     *  - Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     *  Retorno:
     *  - El elemento en la cima de la pila o null si la pila está vacía.
     *
     * @return
     */
    fun tope(): T? {
        return elementos.lastOrNull()
    }

    /**
     * Descripción:
     * - Añade un elemento a la cima de la pila.
     *
     * Parámetros:
     *  - @param elemento: El elemento que se va a añadir a la pila.
     */
    fun push(elemento: T) {
        elementos.add(elemento)
    }

    /**
     * Descripción:
     * - Retira y devuelve el elemento en la cima de la pila.
     *
     * Retorno:
     * - @return El elemento retirado de la cima de la pila o null si la pila está vacía.
     */
    fun pop(): T? {
        return if (elementos.isNotEmpty()) elementos.removeAt(elementos.size - 1) else null
    }

    /**
     * Descripción:
     * - Verifica si la pila está vacía.
     *
     * Retorno:
     * - @return true si la pila está vacía, false en caso contrario.
     */
    fun vacia(): Boolean {
        return elementos.isEmpty()
    }

    /**
     * Descripción:
     * - Implementa la interfaz Iterable permitiendo la iteración sobre los elementos de la pila.
     *
     * Retorno:
     * - @return Un iterador que puede ser utilizado para recorrer los elementos de la pila.
     */
    override fun iterator(): Iterator<T> {
        return elementos.iterator()
    }
}
