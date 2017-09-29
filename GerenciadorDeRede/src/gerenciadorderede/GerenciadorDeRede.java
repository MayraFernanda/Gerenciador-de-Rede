/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorderede;
import java.io.*; 
import java.net.*; 

/**
 *
 * @author u14189
 */
public class GerenciadorDeRede {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
    { 
      DatagramSocket clientSocket = new DatagramSocket(); 
      String adresses[] = new String[8];
      
      
      adresses[0] = "177.220.18.76";
      adresses[1] = "177.220.18.77";
      adresses[2] = "177.220.18.78";
      adresses[3] = "177.220.18.79";
      adresses[4] = "177.220.18.80";
      adresses[5] = "177.220.18.81";
      adresses[6] = "177.220.18.82";
      adresses[7] = "177.220.18.83";
      
      for(int i=0; i<adresses.length; i++){
        InetAddress IPAddress = InetAddress.getByName(adresses[i]);        
        
        if (IPAddress.isReachable(2000))
            System.out.println("O endereço: "+adresses[i]+" está conectado.");        
        else
            System.out.println("O endereço: "+adresses[i]+" não está conectado.");
      }  
    }
    
}
}
