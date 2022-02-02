//Es un instrumento de cuerda que interpreta las notas con su resonancia típica.
class Violin:Instrumento() {

    //Recorreremos las notas y las interpretaremos, como en el piano.
    override fun play() {
        println("===> Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reggg ")
                Nota.MI -> print("miggg ")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("soggg ")
                Nota.LA -> print("laggg ")
                Nota.SI -> print("siggg ")
            }
        }
        println("")
    }
}