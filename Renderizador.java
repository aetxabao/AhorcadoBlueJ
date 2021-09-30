/**
 * Clase para representar el juego.
 */
public class Renderizador {

    public void dibujarInicio(){
        // TODO: Dibujar la situación de inicio (a)
        System.out.println("EL AHORCADO\n");
        System.out.println(
                            "      \n"+
                            "      \n"+
                            "      \n"+
                            "      \n"+
                            "      \n"+
                            "      \n"+
                            "======\n");
        System.out.println("_ _ _ _ _ _ _ _ _\n");
    }

    public void dibujarJugando(){
        // TODO: Dibujar la situación de juego (d)
        System.out.println("Te quedan 3 fallos.\n");
        System.out.println(
                            " +---+\n"+
                            " |   |\n"+
                            " 0   |\n"+
                            "/|\\  |\n"+
                            "     |\n"+
                            "     |\n"+
                            "======\n");
        System.out.println("a _ e a _ _ r _ _");
        System.out.println("Fallado: u n s h b c v");
    }

    public void dibujarFin(){
        // TODO: Dibujar la situación final (f)
        System.out.println("HAS PERDIDO.");
        System.out.println("a l e a t o r i o\n");
        System.out.println(
                        " +---+\n"+
                        " |   |\n"+
                        " 0   |\n"+
                        "/|\\  |\n"+
                        " |   |\n"+
                        "/ \\  |\n"+
                        "======\n");
        System.out.println("a _ e a _ _ r _ _");
        System.out.println("Fallado: u n s h b c v f x p");
    }

}