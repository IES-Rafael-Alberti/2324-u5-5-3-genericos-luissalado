class Pila<T> {
    private val elementos = mutableListOf<T>()


    //Tope: devuelve el elemento en la cabeza de la pila.
    //Push: Insertar o apilar
    //Pop: Eliminar o desapilar
    //Vacía: si está vacía (tope es nulo, o tamaño es 0) o llena (si existe tamaño máximo)
    fun push(elemento: T) {
        elementos.add(elemento)
    }

    fun pop(): T? {
        return if (!isEmpty()) elementos.removeAt(elementos.size - 1) else null
    }

    fun vacia(): Boolean {
        return elementos.isEmpty()
    }

    private fun isEmpty(): Boolean {
        return elementos.isEmpty()
    }
}

fun <T> reverse(lista: List<T>): List<T> {
    val pila = Pila<T>()
    val recorre = lista.iterator() //recorrer la lista

    while (recorre.hasNext()) {
        pila.push(recorre.next())
    }  //apila elementos en la pila

    val linvertida = mutableListOf<T>()

    while (!pila.vacia()) {
        linvertida.add(pila.pop()!!)  //Se añade el elemento desapilado
    }

    return linvertida
}

fun main() {

    //codigo entregado


    val numbers = listOf("one", "two", "three", "four")
    val numbersRev: List<String> = reverse(numbers)

    if (listOf("four", "three", "two", "one") != numbersRev) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(numbersRev)
}
