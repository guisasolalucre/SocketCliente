
package logica;

import java.io.IOException;
import sockets.Cliente;

public class SocketCliente {

    public static void main(String[] args) throws IOException {
        
        //creo una instancia del cliente
        Cliente cliente = new Cliente();
        
        System.out.println("Iniciando el cliente...");
        
        //inicio el cliente
        cliente.iniciar();
    }
    
}
