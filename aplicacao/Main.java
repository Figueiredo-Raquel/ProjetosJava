package aplicacao;

import java.util.Scanner;

import entidades.ContaBancaria;
import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Main {
   public static void main(String[] args) {
      Scanner scanf = new Scanner(System.in);
      ContaBancaria conta;
      int opcao;
      
      
      
      System.out.println("**********BANCO ITA�************\n");
      System.out.println("QUE TIPO DE CONTA DESEJA ACESSAR?");
      System.out.println();
      System.out.println("1 - CONTA POUPAN�A");
      System.out.println("2 - CONTA CORRENTE");
      System.out.println("3 - CONTA EMPRESA");
      System.out.println("4 - CONTA ESPECIAL");
      System.out.print("DIGITE SUA OP��O: ");
      opcao = scanf.nextInt();
 

      if(opcao == 1) {
    	  
    	  conta = new ContaPoupanca();	  
    	 
    	  
    	  
      }
      else if(opcao == 2) {
    	  conta = new ContaCorrente();
      }
      else if(opcao == 3) {
    	  conta = new ContaEmpresa();
      }
      else if(opcao == 4) {
    	  conta = new ContaEspecial();
      }
      else {
    	  System.out.println("\nOp��o inv�lida!");
 
      }
      
     
    	  
    	  
    	  
    	  
      
      scanf.close();
   }
}
