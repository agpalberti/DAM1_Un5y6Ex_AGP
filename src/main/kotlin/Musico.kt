//Una clase que utiliza un instrumento para representar una canción.
abstract class Musico(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Interprete {
    override val instrumento: Instrumento = instrumento
    //Utilizo el setter para incorporar la canción al instrumento
    override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Musico.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }
    //Utilizo un init para llamar al setter de partitura.
    init{
        partitura = unaCancion
    }
    /*Aunque no sea necesario ponerlo, ya que no estoy cambiando el método, lo hago para dejar claro que existe y
    aún no se ha implementado */

   abstract override fun interpretar()
}