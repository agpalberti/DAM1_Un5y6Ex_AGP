
abstract class Musico(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Interprete {
    override val instrumento: Instrumento = instrumento
    override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Musico.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    abstract override fun interpretar()
}