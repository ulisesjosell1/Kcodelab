fun main() {
    // Definición de varias listas
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")

    // Crear una lista de listas
    val mylist = listOf(mysports, myplayers, mycities) // list of lists

    // Imprimir el resultado después de aplicar flatten()
    println("-----")
    println("Flat: ${mylist.flatten()}")
}
