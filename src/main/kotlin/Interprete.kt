interface Interprete {
    val instrumento:Instrumento
    var partitura: Array<Nota?>

    fun interpretar()
}