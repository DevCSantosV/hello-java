package basic.c0_santos_practice.c00_05_exercises;

import java.io.PrintStream;

public class HelloWorldExercises {
    // Códigos ANSI para colores
    public static final String ANSI_RESET = "\u001B[0m";     // Restablece el color
    public static final String ANSI_RED = "\u001B[31m";     // Rojo
    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola Cristofer Santos!");


        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");


        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // El ejercicio 1 imprime un saludo personalizado, y el ejercicio 2 imprime "Hola" y "Mundo" en líneas separadas.


        // 4. Crea un comentario en varias líneas.

        /*
         * Este es un comentario de varias líneas.
           Aquí puedes escribir más de una línea de comentarios
           sin necesidad de usar "//" al inicio de cada línea.
           Esto es útil para explicar secciones más largas de código
           o para dejar notas para ti mismo o para otros programadores.
           Recuerda cerrar el comentario con el asterisco diagonal al final.
           Los comentarios no afectan la ejecución del programa.

         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
//        System.out.println("Edad: 23 años Color favorito: Azul Ciudad: Zamora Michoacan");


        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
//        System.err.println("Este es un mensaje de error.");
//        System.exit(0);
//        System.gc();
//        System.getProperty("java.version");
//        System.getProperty("os.name");
//        System.getProperty("user.name");
//        System.getProperty("java.home");
//        System.getProperty("java.class.path");
//        System.in;
//        System.out.printf("Hola %s, tienes %d años.\n", "Cristofer", 23);

        //Explica el uso de System.out.flush(); y porque si pones .err se imprime mal.
//        // No redirigimos System.err
//                System.out.println("Edad: 23 años Color favorito: Azul Ciudad: Zamora Michoacán");
//                System.out.flush(); // Asegura que System.out complete su impresión antes de usar System.err
//
//                System.err.println("Este es un mensaje de error.");
//                System.err.flush(); // Sincronizar después de err (opcional)
//
//                System.out.printf("Hola %s, tienes %d años.\n", "Cristofer", 23);
//                System.out.flush(); // Asegurar de que se imprima completamente
        // Redirigimos System.err al mismo flujo que System.out
        System.setErr(new PrintStream(System.out));

        // Imprime directamente al flujo estándar
        System.out.println("Edad: 23 años Color favorito: Azul Ciudad: Zamora Michoacán");
        System.err.println("Este es un mensaje de error."); // Ahora aparece como texto normal
        System.out.printf("Hola %s, tienes %d años.\n", "Cristofer", 23);
        // Simula un mensaje de error con texto en rojo
        System.out.println(ANSI_RED + "Este es un mensaje de error." + ANSI_RESET);

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Hola");
        System.out.println("Mundo");
        System.out.println("¡Bienvenido a la programación en Java!");


        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println("  ^_^  ");
        System.out.println(" (o o) ");
        System.out.println("  \\_/  ");
        System.out.println("  / \\  ");
        System.out.println(" /   \\ ");
        System.out.println("  \\_/  ");
        System.out.println("  ^_^  ");


        // 9. Intenta ejecutar el programa sin el metodo main y observa el error.
        // El metodo main es el punto de entrada del programa. Sin él, el programa no se ejecutará.



        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // El nombre del archivo debe coincidir con el nombre de la clase pública. Si no coincide, obtendrás un error de compilación.
    }
}
