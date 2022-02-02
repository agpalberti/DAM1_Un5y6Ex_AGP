class Violinista(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0))
    : Musico(instrumento, unaCancion) {

    override fun interpretar() {
        i("Violinista.Interpretar", "se ejecuta fun interpretar")
        println("####### - SOY VIOLINISTA")
        instrumento.play()
        println("")
        i("Violinista.Interpretar", "se termina la ejecución de fun interpretar")
    }
}