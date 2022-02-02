
class Pianista(instrumento: Instrumento,unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0))
    : Musico(instrumento, unaCancion) {

    override fun interpretar(){
        i("Pianista.Interpretar", "se ejecuta fun interpretar")
        println("####### - SOY PIANISTA")
        instrumento.play()
        println("")
        i("Pianista.Interpretar", "se termina la ejecución de fun interpretar")
    }
}