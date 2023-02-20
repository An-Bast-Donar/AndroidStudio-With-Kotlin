# AndroidStudio With Kotlin

Aprende Andoird Studio con Kotlin de cero a master

## Bases de Kotlin

- Variables y tipos de datos: en Kotlin, se utilizan las palabras clave var y val para declarar variables. var se utiliza para variables mutables (que pueden cambiar de valor), mientras que val se utiliza para variables inmutables (que no pueden cambiar de valor). Algunos tipos de datos en Kotlin incluyen Int, Double, Boolean, String y Any.

- Funciones: en Kotlin, se utilizan las palabras clave fun para declarar funciones. Las funciones pueden tener parámetros y pueden devolver un valor.

- Clases y objetos: en Kotlin, se utiliza la palabra clave class para declarar una clase. Una clase es una plantilla que define los atributos y comportamientos de un objeto. Se utiliza la palabra clave object para declarar un objeto. Un objeto es una instancia de una clase.

- Null Safety: Kotlin tiene soporte integrado para la seguridad nula, lo que significa que el compilador verifica si se intenta acceder a valores nulos en tiempo de compilación en lugar de tiempo de ejecución.

- Extensiones: en Kotlin, se pueden agregar funciones adicionales a una clase existente utilizando extensiones. Esto permite extender la funcionalidad de una clase sin tener que crear una nueva clase.

- Lambdas: en Kotlin, se utilizan las expresiones lambda para crear funciones anónimas. Las lambdas se utilizan a menudo en combinación con las funciones de orden superior (funciones que toman otras funciones como argumentos) para escribir código más conciso y expresivo.

### Datos nulos y cualquier objeto

En Kotlin, existen dos tipos de datos que pueden tener cualquier valor: Any y Any?. Any representa cualquier objeto, incluyendo los tipos primitivos de Kotlin, como Int, Boolean, etc. Any? representa cualquier objeto o un valor nulo. El operador ?. verifica si la variable es nula o no, y si no es nula, accede a la propiedad solicitada de la cadena. Si la variable es nula, la expresión entera devuelve null.

### Funciones de nivel intermedio

En Kotlin, puedes definir funciones de nivel medio, también conocidas como funciones de orden superior o funciones que reciben funciones como argumentos o devuelven funciones como resultado. Estas funciones son muy útiles cuando necesitas encapsular un comportamiento que se puede parametrizar con una función, en lugar de escribir el mismo código repetidamente.

### Retorno de datos

En Kotlin, una función puede devolver un valor utilizando la palabra clave return seguida del valor que se debe devolver. También es posible omitir la palabra clave return y simplemente colocar el valor de retorno al final de la función

### Infix

En Kotlin, una función puede ser declarada como infix, lo que significa que se puede llamar como un operador infix en lugar de como una función regular utilizando paréntesis y un punto.

### Arreglo de argumentos

En Kotlin, es posible definir una función que reciba un número variable de argumentos utilizando la sintaxis de arreglo de argumentos (vararg).

### Bucle for y while

Los bucles en Kotlin se utilizan para repetir una sección de código varias veces. Hay dos tipos principales de bucles en Kotlin: for y while. El bucle for se utiliza para iterar sobre una colección de elementos (como un arreglo o una lista), mientras que el bucle while se utiliza para repetir un bloque de código mientras se cumpla una condición.

### Sentencia when

La sentencia when en Kotlin se utiliza para evaluar una expresión y ejecutar una sección de código dependiendo del valor de dicha expresión. Es similar a la sentencia switch en otros lenguajes de programación.

### Const

En Kotlin, se puede usar la palabra clave const para declarar una variable que sea constante en tiempo de compilación. Una constante debe ser inicializada con un valor y su valor no puede ser cambiado durante la ejecución del programa.
