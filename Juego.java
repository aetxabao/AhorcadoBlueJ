 /**
  * Clase con el 'game loop' o 'bucle del juego'
  */
 public class Juego {
 
    // palabra clave
    private String palabraClave;
    // palabra adivinada
    private String palabraAdivinada;
    // letras falladas
    private String letrasFalladas;
    // numero de fallos
    private int numeroFallos;
    // letra introducida
    private char letraIntroducida;
    // si ha finalizado el juego
    private boolean estaFinalizado;

    public Juego() {
        //TODO: Inicializar el juego en el constructor
        estaFinalizado = false;
    }
    
    /**
     * Bucle del juego.
     * Representa el estado inicial al empezar.
     * Mientras está jugando representa el estado de juego,
     * procesa la entrada y actualiza el juego.
     * Al finalizar representa si se ha ganado, perdido o salido.
     */
    public void jugar() throws InterruptedException {
        empezar_juego();
        while (!estaFinalizado) {
            Thread.sleep(1000);
            representar_juego();
            procesar_entrada();
            actualizar_juego();
        }
        terminar_juego();
    }

    private void empezar_juego() {
        //TODO: representar el inicio y empezar
        System.out.println("empezar_juego");
        estaFinalizado = false;
        Diccionario dic = new Diccionario();
        palabraClave = dic.creaPalabraAleatoria();
    }

    private void representar_juego() {
        //TODO: representar el juego
        System.out.println("representar_juego");
    }

    private void procesar_entrada() {
        //TODO: procesar la entrada
        System.out.println("procesar_entrada");
        Entrada teclado = new Entrada();
        letraIntroducida = teclado.leerCaracter();
    }

    private void actualizar_juego() {
        //TODO: actualizar el juego y cambiar el estado si es necesario
        System.out.println("actualizar_juego");
        if (letraIntroducida=='0'){
            estaFinalizado = true;
        }
    }

    private void terminar_juego() {
        //TODO: dependiendo del estado del juego representar el resultado
        System.out.println("terminar_juego");
    }
    
}