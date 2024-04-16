package servico;

import java.rmi.*;
import java.rmi.server.*;

public class Server {

 public static void main(String args[]) {
	 System.setProperty("java.security.policy", "C:\Users\Totom\Downloads\rmi-main\RMI-SDTestes\thomas.policy");

      System.setSecurityManager(new RMISecurityManager());
      
   try{

      ImplServer obj = new ImplServer("OppMathServer");
      Naming.rebind("OppMathServer", obj);
// URL "rmi:\\host:porta\teste"

      System.out.println("Servidor de Opera��es Matem�ticas Registrado com Sucesso!");

    } catch (Exception e){ System.out.println(e.getMessage());}
                                
  }
}
