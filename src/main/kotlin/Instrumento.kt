/**
 * La clase instrumento representa cualquier objeto que sea capaz de representar una melodía*/

abstract class Instrumento {
    /**
    * @property melodia Es una mutableList de las notas a representar por el instrumento. Mire [Nota] para más información. */
    //tabla que almacena las notas a interpretar
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
        reset()
        for( i in cancion.indices){
            cancion[i]?.let { melodia.add(it) }
        }
    }

    /**
     * Limpia [melodia] y borra todas las notas de la lista. Mire [Nota] para más información.*/
    fun reset() = melodia.clear()

    /**
     * Función que se encarga de reproducir un instrumento. Cada instrumento se encargará de especificar cómo hacerlo.*/
    abstract fun play()
}