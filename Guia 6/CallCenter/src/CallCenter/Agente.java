package CallCenter;
/**
 *
 * @author gduba
 */
public class Agente implements Runnable {

	private Usuario cliente;
	private long initialTime;

	public Agente(Usuario cliente, long initialTime) {
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

   

	@Override
	public void run() {
		System.out.println("El agente " + Thread.currentThread().getName() 
				+ " da informacion de la compañia a la linea " + this.cliente.getNombre() 
				+ " con un tiempo de " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

		for (int i = 0; i < this.cliente.getServicioPlan().length; i++) { 			
                    // Se procesa el pedido en X segundos 
                    this.esperarXsegundos(cliente.getServicioPlan()[i]);
               	    System.out.println("Generando la solucion de red " + (i + 1) + " del " + this.cliente.getNombre()+ 
                    "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
		}

		System.out.println("El agente " + Thread.currentThread().getName() + " ha finalizado el servicio " 
				+ this.cliente.getNombre() + " con un tiempo de: "
				+ (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
}
        
