/**
 * Funcion que invierte una coleccion iterable ( mapas, listas, sets, etc... )
 *
 * @param T Hace que la función sea genérica
 * @param list Es el iterable que le vamos a pasar a la función
 * @return Devuelve el iterable invertido.
 */
fun <T> reverse(list: Iterable<T>): List<T> {
    val pila = Pila<T>()
    for (elemento in list) {
        pila.push(elemento)
    }
    val reversed = mutableListOf<T>()
    while (!pila.vacia()) {
        pila.pop()?.let { reversed.add(it) }
    }
    return reversed
}
fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = reverse(numbers)
    if (listOf("four", "three", "two", "one") != numbersRev)
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}