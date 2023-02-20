package com.technicaltestjuanrondon.myapplicationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Declaración de una constante
    val PI = 3.14159

    // Declaración de una variable
    var x = 5

    // Declaración de una constante con tipo de datos especificado
    val message: String = "Hola, mundo!"

    // Declaración de una variable con tipo de datos especificado
    var y: Int = 10

    // Kotlin infiere que "z" es de tipo Int
    val z = 15

    // Kotlin infiere que "greeting" es de tipo String
    var greeting = "¡Hola!"

    // Variable que puede ser nula
    var miVariable: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Busca la referencia del TextView con el ID "myTextView"
        val myTextView = findViewById<TextView>(R.id.myTextView)

        // Calcula el resultado de la suma y actualiza el texto del TextView
        val result = sum(5, 3)
        myTextView.text = "El resultado de la suma es: $result"

        val resultC = sum(5, 3)
        Log.d("MainActivity", "El resultado de la suma es: $resultC") // Imprime "El resultado de la suma es: 8"

        // Funcion infix
        val a = 10
        val b = 5
        val resulted = a esMayorQue b
        println(resulted)

        // Arreglo de argumentos
        val resultado = adicion(1, 2, 3, 4)
        println(resultado) // imprime 10

        // Bucle for
        val numeros = intArrayOf(1, 2, 3, 4, 5)
        for (numero in numeros) {
            println(numero)
        }

        // Bucle while
        var contador = 1
        while (contador <= 5) {
            println(contador)
            contador++
        }

        // Sentencia when
        val dia = 3
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> println("Día inválido")
        }

        // Crear una instancia de la data class
        val persona = MiDataClass("Juan", 25)

        // Acceder a las propiedades
        println(persona.nombre) // Imprime "Juan"
        println(persona.edad) // Imprime 25

        // Crear una copia de la instancia
        val persona2 = persona.copy()

        // Comparar dos instancias de la data class
        val persona3 = MiDataClass("Juan", 25)
        println(persona == persona3) // Imprime true

        // Desestructurar una instancia de la data class
        var (nombre, edad) = persona
        println(nombre) // Imprime "Juan"
        println(edad) // Imprime 25

        // Utilizar una enum class en una sentencia when
        val estadoCivil = EstadoCivil.CASADO
        when (estadoCivil) {
            EstadoCivil.SOLTERO -> println("Estás soltero.")
            EstadoCivil.CASADO -> println("Estás casado.")
            EstadoCivil.DIVORCIADO -> println("Estás divorciado.")
            EstadoCivil.VIUDO -> println("Estás viudo.")
        }

        // Acceder a las propiedades de la enum class
        println(EstadoCivil.CASADO.ordinal) // Imprime 1
        println(EstadoCivil.SOLTERO.name) // Imprime "SOLTERO"

        // Utilizar una enum class en una función
        fun esFinDeSemana(dia: DiaSemana) = dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO
        println(esFinDeSemana(DiaSemana.LUNES)) // Imprime false
        println(esFinDeSemana(DiaSemana.SABADO)) // Imprime true

        with(persona) {
            println("El nombre de la persona es $nombre")
            println("La edad de la persona es $edad")
        }

        persona.apply {
            edad = 31
        }.let {
            println("La edad actualizada de la persona es ${it.edad}")
        }

        val lista = listOf("elemento1", "elemento2", "elemento3")
        val listaVacia = mutableListOf<String>()
        listaVacia.add("elemento1")
        listaVacia.add("elemento2")
        lista.forEach { elemento ->
            println(elemento)
        }

        val mapa = mutableMapOf("clave1" to "valor1", "clave2" to "valor2", "clave3" to "valor3")
        val valor1 = mapa["clave1"]
        val valor2 = mapa["clave2"]
        val valor3 = mapa["clave3"]
        mapa.forEach { (clave, valor) ->
            println("La clave $clave tiene el valor $valor")
        }

    }

    private fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    private fun sum(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    private fun adicion(vararg numeros: Int): Int {
        var resultadop = 0
        for (num in numeros) {
            resultadop += num
        }
        return resultadop
    }

    infix fun Int.esMayorQue(numero: Int): Boolean {
        return this > numero
    }
}

class NombreDeLaClase {
    // propiedades y métodos de la clase
}

open class ClaseBase {
    // propiedades y métodos de la clase base
}

class ClaseDerivada : ClaseBase() {
    // propiedades y métodos adicionales de la clase derivada
}

open class Persona(val nombre: String, var edad: Int) {
    open fun hablar(mensaje: String) {
        println("$nombre dice: $mensaje")
    }

    fun caminar(pasos: Int) {
        println("$nombre caminó $pasos pasos")
    }
}

class Estudiante(nombre: String, edad: Int, val codigoEstudiante: String) : Persona(nombre, edad) {
    fun estudiar(materia: String) {
        println("$nombre está estudiando $materia")
    }

    override fun hablar(mensaje: String) {
        super.hablar("Estudiante $codigoEstudiante dice: $mensaje")
    }
}

interface NombreDeLaInterfaz {
    // métodos de la interfaz
}

interface Movable {
    fun mover(distancia: Double)
}

data class MiDataClass(val nombre: String, val edad: Int)

enum class EstadoCivil {
    SOLTERO,
    CASADO,
    DIVORCIADO,
    VIUDO
}

enum class DiaSemana { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO }
