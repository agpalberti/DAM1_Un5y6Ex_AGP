/**
 * La clase instrumento representa cualquier objeto que sea capaz de representar una melodía*/

abstract class Instrumento {
    /**
    * @property melodia Es una mutableList de las notas a representar por el instrumento. Mire [Nota] para más información. */
    protected var melodia = mutableListOf<Nota>()

    /**
     * Añade una nota a [melodia].
     * @param nota Es una nota de DO a SI. Mire la clase [Nota] para más información.*/
    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    /**
     * Reemplaza o introduce directamente una serie de notas a [melodia].
     * @param cancion Array de [Nota].*/
    fun incorporaCancion(cancion: Array<Nota?>){
        i("Instrumento.incorporaCancion","Comienza la ejecución de incorporaCancion")
        reset()
        for( i in cancion.indices){
            i("Instrumento.incorporaCancion","Se añade la nota ${cancion[i]} a la melodia.")
            cancion[i]?.let { melodia.add(it) }
        }
        i("Instrumento.incorporaCancion","Termina la ejecución de incorporaCancion")
    }

    /**
     * Limpia [melodia] y borra todas las notas de la lista. Mire [Nota] para más información.*/
    fun reset() {melodia.clear(); i("Instrumento.reset","Se resetea la melodia del instrumento.")}

    /**
     * Función que se encarga de reproducir un instrumento. Cada instrumento se encargará de especificar cómo hacerlo.*/
    abstract fun play()
}