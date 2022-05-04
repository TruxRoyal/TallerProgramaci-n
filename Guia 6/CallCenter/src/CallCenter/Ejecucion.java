package CallCenter;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author gduba
 */
public class Ejecucion {
    
    private static final int NumAgentes = 4;

    public static void main(String[] args) {

        ArrayList<Usuario>clientes = new ArrayList<Usuario>();
        clientes.add(new Usuario("Linea 1", new int[] { 2, 2 })); // 12 Seg
        clientes.add(new Usuario("Linea 2", new int[] { 1, 1})); //  9 Seg
        clientes.add(new Usuario("Linea 3", new int[] { 5, 3 })); // 16 Seg
        clientes.add(new Usuario("Linea 4", new int[] { 2, 4})); // 16 Seg
        clientes.add(new Usuario("Linea 5", new int[] { 1, 3 })); // 11 Seg
        clientes.add(new Usuario("Linea 6", new int[] { 4, 2 })); // 11 Seg
        clientes.add(new Usuario("Linea 7", new int[] { 3, 3 })); // 19 Seg
        clientes.add(new Usuario("Linea 8", new int[] { 6, 1 })); // 14 Seg
        // Tiempo total en procesar todos los pedidos = 108 segundos
        
        long init = System.currentTimeMillis();  // Instante inicial del procesamiento
        
        ExecutorService executor = Executors.newFixedThreadPool(NumAgentes);
        for (Usuario Linea: clientes) {
            Runnable cajera = new Agente(Linea, init);
            executor.execute(cajera);
        }
        executor.shutdown();	// Cierro el Executor
        while (!executor.isTerminated()) {
        	// Espero a que terminen de ejecutarse todos los procesos 
        	// para pasar a las siguientes instrucciones 
        }
        
        long fin = System.currentTimeMillis();	// Instante final del procesamiento
        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");
    }
}
