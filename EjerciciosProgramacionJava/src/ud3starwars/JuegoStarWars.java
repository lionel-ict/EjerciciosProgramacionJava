package ud3starwars;

import java.util.Scanner;

public class JuegoStarWars {

    public static void main(String[] args) {

        // Interruptor para controlar si continua jugando o ha perdido
        boolean continuarJugando = true;
        
        // Interruptor para controlar si mostramos la solución
        boolean mostrarSolucion = true;
        
        // Variable para guardar la solución y la respuesta del usuario
        int solucion;
        int respuesta;

        // Mensajes de respuesta correcta e incorrecta
        String mensajeOk = "¡CORRECTO!";
        String mensajeMal = "¡NOOOOOOO! :(";
        
        // Scanner para entrada por teclado
        Scanner entrada = new Scanner(System.in);
        
        /*****************************
        / INICIO
        *****************************/
        // Mostramos texto de la etapa
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke");
        System.out.println("Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada");
        System.out.println("en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio");
        System.out.println("está construyendo para destruirla. (Presiona Intro para continuar)");
        
        // Esperamos a que presione intro      
        entrada.nextLine();
                
        /*****************************
        / NIVEL 1
        *****************************/
        if (continuarJugando) {
            
            // Números aleatorios
            int s1 = (int) (1 + Math.random() * (10 - 1 + 1));
            int s2 = (int) (20 + Math.random() * (30 - 20 + 1));

            // Mostramos texto de la etapa
            System.out.println("=== NIVEL 1 ===");
            System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al");
            System.out.println("sistema " + s1 + " en el sector " + s2 + ", pero el sistema de navegación está estropeado y el");
            System.out.println("computador tiene problemas para calcular parte de las coordenadas de salto.");
            System.out.println("Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.");
            System.out.println("Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que");
            System.out.println("calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).");
            System.out.println("¿Qué debe introducir?");

            // Calculamos la solución
            solucion = 0;
            for (int i = s1; i <= s2; i++) {
                solucion += i;
            }

            // Mostrar solución
            if (mostrarSolucion)
                System.out.println("***Respuesta correcta: " + solucion);

            // Leemos por teclado la respuesta del usuario
            respuesta = entrada.nextInt();

            // Si es correcta -> continua jugando, si no -> perder
            if (respuesta == solucion) {
                System.out.println(mensajeOk);
            }
            else {
                System.out.println(mensajeMal);
                continuarJugando = false;
            }
        }
        
        /*****************************
        / NIVEL 2
        *****************************/
        if (continuarJugando) {
            
            // Números aleatorios
            int p1 = (int) (1 + Math.random() * (7 - 1 + 1));
            int p2 = (int) (8 + Math.random() * (12 - 8 + 1));
            
            // Mostramos texto de la etapa
            System.out.println("");
            System.out.println("=== NIVEL 2 ===");
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella");
            System.out.println("de la muerte. Como van en una nave imperial robada se aproximan lentamente con");
            System.out.println("la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí");
            System.out.println("agente de espaciopuerto " + p1 + " contactando con nave imperial " + p2 + ". No están destinados");
            System.out.println("en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh…");
            System.out.println("tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para");
            System.out.println("atracar y reparar la nave”. El agente, que no se anda con tonterías, responde");
            System.out.println("“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el");
            System.out.println("manual del piloto que estaba en la guantera y da con la página correcta. El código");
            System.out.println("es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).");
            System.out.println("¿Cual es el código?");
                        
            // Calculamos la solución
            solucion = 1;
            for (int i = p1; i <= p2; i++) {
                solucion *= i;
            }

            // Mostrar solución
            if (mostrarSolucion)
                System.out.println("***Respuesta correcta: " + solucion);

            // Leemos por teclado la respuesta del usuario
            respuesta = entrada.nextInt();

            // Si es correcta -> continua jugando, si no -> perder
            if (respuesta == solucion) {
                System.out.println(mensajeOk);
            }
            else {
                System.out.println(mensajeMal);
                continuarJugando = false;
            }
        }
        
        /*****************************
        / NIVEL 3
        *****************************/
        if (continuarJugando) {
            
            // Número aleatorio
            int n = (int) (50 + Math.random() * (100 - 50 + 1));
            
            // Mostramos texto de la etapa
            System.out.println("");
            System.out.println("=== NIVEL 3 ===");
            System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se");
            System.out.println("equipan con trajes de soldados imperiales que encuentran en la nave para pasar");
            System.out.println("desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + n + " existentes se");
            System.out.println("encuentra el reactor principal. Se dirigen al primer panel computerizado que");
            System.out.println("encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita");
            System.out.println("introducir una clave de acceso. Entonces recuerda la información que le proporcionó");
            System.out.println("Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10");
            System.out.println("(redondeando N hacia abajo), donde N es el nº de niveles”.");
            System.out.println("¿Cual es el nivel correcto?");
                                    
            // Calculamos la solución
            solucion = 1;
            for (int i = 1; i <= n/10; i++) {
                solucion *= i;
            }

            // Mostrar solución
            if (mostrarSolucion)
                System.out.println("***Respuesta correcta: " + solucion);

            // Leemos por teclado la respuesta del usuario
            respuesta = entrada.nextInt();

            // Si es correcta -> continua jugando, si no -> perder
            if (respuesta == solucion) {
                System.out.println(mensajeOk);
            }
            else {
                System.out.println(mensajeMal);
                continuarJugando = false;
            }
        }
            
        /*****************************
        / NIVEL 4
        *****************************/
        if (continuarJugando) {
            
            // Número aleatorio
            int p  = (int) (10 + Math.random() * (100 - 10 + 1));
            
            // Mostramos texto de la etapa
            System.out.println("");
            System.out.println("=== NIVEL 4 ===");
            System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta");
            System.out.println("acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para");
            System.out.println("intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita");
            System.out.println("verificar si el número " + p + " es primo o no. Si es primo introduce un 1, si no lo es");
            System.out.println("introduce un 0.");
                                    
            // Calculamos la solución
            solucion = 1;
            for (int i = 2; i <= p/2; i++) {
                if ( (p % i) == 0)
                    solucion = 0;
            }

            // Mostrar solución
            if (mostrarSolucion)
                System.out.println("***Respuesta correcta: " + solucion);

            // Leemos por teclado la respuesta del usuario
            respuesta = entrada.nextInt();

            // Si es correcta -> continua jugando, si no -> perder
            if (respuesta == solucion) {
                System.out.println(mensajeOk);
            }
            else {
                System.out.println(mensajeMal);
                continuarJugando = false;
            }
        }
        
        /*****************************
        / NIVEL 5
        *****************************/
        if (continuarJugando) {
            
            // Número aleatorio
            int m = (int) (10 + Math.random() * (10 - 5 + 1));
            int s = (int) (10 + Math.random() * (10 - 5 + 1));
            
            // Mostramos texto de la etapa
            System.out.println("");
            System.out.println("=== NIVEL 5 ===");
            System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,");
            System.out.println("programe el temporizador y salir de allí corriendo. Necesita programarlo para que");
            System.out.println("explote en exactamente " + m + " minutos y " + s + " segundos, el tiempo suficiente para escapar");
            System.out.println("antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y");
            System.out.println("desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto");
            System.out.println("peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar");
            System.out.println("el factorial de " + m + " y el factorial de " + s + ". ¿Qué valor debe introducir?");
                                    
            // Calculamos factorial de M
            int factM = 1;
            for (int i = 1; i <= m; i++) {
                factM *= i;
            }
            // Calculamos factorial de S
            int factS = 1;
            for (int i = 1; i <= s; i++) {
                factS *= i;
            }
            // Calculamos la solución
            solucion = factM + factS;

            // Mostrar solución
            if (mostrarSolucion)
                System.out.println("***Respuesta correcta: " + solucion);

            // Leemos por teclado la respuesta del usuario
            respuesta = entrada.nextInt();

            // Si es correcta -> continua jugando, si no -> perder
            if (respuesta == solucion) {
                System.out.println(mensajeOk);
            }
            else {
                System.out.println(mensajeMal);
                continuarJugando = false;
            }
        }
        
        /*****************************
        / GANAR
        *****************************/
        if (continuarJugando) {
            // Mostramos texto de la etapa
            System.out.println("");
            System.out.println("=== HAS GANADO ===");
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a");
            System.out.println("sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se");
            System.out.println("convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea");
            System.out.println("consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan");
            System.out.println("observan por la ventana la imagen de la colosal estrella de la muerte explotando en");
            System.out.println("el silencio del espacio, desapareciendo para siempre junto a los restos del malvado");
            System.out.println("imperio.");
            System.out.println("");
            System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
        }
        
        /*****************************
        / PERDER
        *****************************/
        if (!continuarJugando) {
            // Mostramos texto de la etapa
            System.out.println("=== HAS PERDIDO ===");
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(");
            System.out.println("Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }
        
        /*****************************
        / FIN
        *****************************/
        System.out.println("Gracias por jugar :D");
        
    }

}
