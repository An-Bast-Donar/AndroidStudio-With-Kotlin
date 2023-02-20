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