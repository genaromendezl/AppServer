/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servers;

/**
 *
 * @author Alumno
 */
public class AppServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MultiThreadedServer server = new MultiThreadedServer(8080);
        new Thread(server).start();

        try {
            Thread.sleep(2000 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Deteniendo Servidor");
        server.stop();
        
        
        
    }
    
}
