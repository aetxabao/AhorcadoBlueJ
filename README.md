# EL AHORCADO

1. [ Introducción ](#intro)
2. [ Aplicación de consola ](#consola)
    * [ Tarea 1 ](#tarea1)
3. [ Cómo funciona el juego (game loop) ](#gameloop)
    * [ Tarea 2 ](#tarea2)
4. [ Qué atributos necesita el Juego ](#atributos-juego)
    * [ Tarea 3 ](#tarea3)
    * [ Tarea 4 ](#tarea4)

<a name="intro"></a>
## 1. Introducción

El juego del ahorcado es un juego típico para jugar con papel y lápiz entre dos personas. Vamos a hacer que una persona pueda jugar de forma similar contra el ordenador. Para ello el ordenador habrá de obtener una palabra al azar que el jugador deberá descubrir.

El juego empieza con un espacio para poder dibujar una horca de la que cuelgue una persona y una serie de guiones bajos por cada una de las letras de la palabra que hay que adivinar.

El ordenador pedirá que el jugador escriba una letra, comprobará si existe en la palabra a adivinar y si existe escribirá sobre los guiones la letra tantas veces como aparezca en su posición correcta. En caso de que no existiese el ordenador dibujará el mástil de la horca y anotaremos que se ha cometido un fallo.

Por cada fallo al intentar adivinar una letra de la palabra el ordenador irá dibujando una parte de la horca con una persona colgando. Se establecerán diez pasos hasta que el dibujo esté completado y si no se ha adivinado la palabra el juego finalizará indicando que se ha perdido y cuál era la palabra que se tenía que adivinar.

Para ayudar al jugador y que no repita las letras que ha podido intentar se puede mostrar qué letras se han probado y no están, además de las letras que aparecen en la palabra a adivinar.

<a name="consola"></a>
## 2. Aplicación de consola

Primero se va ha desarrollar la aplicación para ser ejecutada en un terminal. Después se podrá contemplar como hacer la versión gráfica con el mínimo posible de cambios.

<a name="tarea1"></a>
**Tarea 1.** Dibuja las siguientes situaciones del juego (qué es lo que ve el jugador en cada momento):

    a) El ordenador obtiene la palabra clave (p.ej. “aleatorio”) que el jugador debe adivinar 
    y le muestra los guiones bajos correspondientes por cada una de las letras. 
    Deja un espacio para dibujar la horca (dibuja sólo el suelo) y debajo los guiones bajos para 
    las letras. Debajo de los guiones deberán aparecer las letras que se intenten y no existan 
    dentro de la palabra clave (de momento ninguna). Finalmente pon un prompt (un texto/carácter 
    que solicita la entrada) para que el usuario escriba la primera letra. Supongamos que escribe 
    la letra ‘a’ (sin comillas).

                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        

    b) Tras haber introducido la letra ‘a’ el ordenador obtiene que existe en la palabra a descubrir 
    (p.ej. “aleatorio”) y representa la horca como estaba y la palabra a adivinar con los guiones bajos 
    y las letras adivinadas en su posición (p.ej. “a _ _ a _ _ _ _ _”). Deja un hueco (una línea vacía) 
    para las letras que luego se intenten y no estén en la palabra a adivinar. De nuevo pon el promt 
    y supón que está vez el jugador escribe una letra que no existe en la palabra clave, 
    p ej. la letra ‘u’ sin comillas.

                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        

    c) Dibuja sobre el suelo el mástil de la horca, la palabra a adivinar con los guiones bajos (p.ej. 
    “a _ _ a _ _ _ _ _”). Debajo la letra introducida que no existe (“u”) y el prompt.


                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        

    d) Dibuja el estado en el que se han introducido las siguientes letras si la palabra clave a 
    adivinar es “aleatorio”: a, u, e, r, n, s, h, b, c. Representación de la palabra a adivinar: 
    “a _ e a _ _ r _ _” y las letras intentadas que no están en la palabra clave: “u n s h b c”

                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        

    e) Si ganas. Por ejemplo tras introducir: a, u, e, r, n, s, h, b, c, i, o, m, d, o, i, t, l

                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        

    f) Si pierdes. Por ejemplo tras introducir: a, u, e, r, n, s, h, b, c, i, o, m, d, o, i, p, j

                        .
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        .

<a name="gameloop"></a>
## 3. Cómo funciona el juego (game loop)

Para jugar el juego del ahorcado se va a seguir el mismo planteamiento de bucle de juego (game loop) habitual de los juegos. Cuando se invoca el método jugar de la clase Juego estas son las  acciones que se van a realizar:

    - iniciar el juego

    - mientras no haya finalizado

        - procesar la entrada
        - actualizar el juego
        - renderizar el juego

    - finalizar el juego


<a name="tarea2"></a>
**Tarea 2.** Escribe la signatura de los métodos de la clase Juego. Sólo el método jugar tendrá una visibilidad pública, el resto será privado (exceptuando también el método constructor). En principio los métodos no necesitan parámetros.

    .
    
    
    
     
    
    
    .
    
<a name="atributos-juego"></a>
## 4. Qué atributos necesita el Juego

- palabra clave (palabra obtenida por el ordenador que el jugador tiene que adivinar)
- palabra adivinada (representación con guiones bajos de la palabra que se está formando)
- letras falladas (conjunto de letras que el jugador ha introducido pero no están en la palabra clave)
- numero de fallos (por cada letra intentada que no existe en la palabra clave)
- letra introducida (habrá que leer del teclado)
- si ha finalizado el juego (inicialmente el valor es falso)

<a name="tarea3"></a>
**Tarea 3.** Escribe el nombre de los atributos de la clase Juego cuya visibilidad será private y cuyos tipos serán tipos primitivos o String. 

    // palabra clave
    
    // palabra adivinada
    
    // letras falladas
    
    // numero de fallos
    
    // letra introducida
    
    // si ha finalizado el juego
    .
    
<a name="tarea4"></a>
**Tarea 4.** Crea la clase Juego con los métodos y atributos definidos en las tareas anteriores. Implementa el código del método jugar() según el game loop. Introduce en cada método privado de la clase Juego: System.out.println("nombre_metodo");  En el bucle del método jugar introduce la sentencia Thread.sleep(1000); y modifica la signatura del método: public void jugar() throws InterruptedException En el método constructor haz que el atributo que indica si ha finalizado el juego se inicie con valor false. Prueba la clase Juego en BlueJ (reinícialo al final, se bloquea).

     /**
      * Clase con el 'game loop' o 'bucle del juego'
      */
     
