
class Pianista(instrumento: Instrumento,unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0))
    : Musico(instrumento, unaCancion) {

    override fun interpretar(){
        println("####### - SOY PIANISTA")
        instrumento.play()
        println("")
    }
}