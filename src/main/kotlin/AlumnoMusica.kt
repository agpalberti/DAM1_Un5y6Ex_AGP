class AlumnoMusica(instrumento:Instrumento, partitura:Array<Nota?>):Interprete {
    override val instrumento = instrumento
    override var partitura = partitura
    init {
        instrumento.reset()
        partitura.forEach { nota ->
            i("AlumnoMusica.Init", "incorpora nota $nota de canción")
            nota?.let { instrumento.incorporaNota(nota) } }
    }
    override fun interpretar() {
        println("####### - SOY ALUMNO DE MUSICA")
        instrumento.play()
        println("")
    }

}