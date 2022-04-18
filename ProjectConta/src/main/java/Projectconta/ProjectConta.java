/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Projectconta;

import Entidades.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author jvmat
 */
public class ProjectConta {

    static ContaCorrente Conta = new ContaCorrente();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double deposito = 0;
        double saque = 0;
        String nomeUsuario = new String();

        int options = 0;

        do {
            System.out.println("----------------------MENU----------------");
            System.out.println("ola Cliente");

            System.out.println("1  =>  Cadastrar Contas ");
            System.out.println("2  =>  Listar Contas  ");
            System.out.println("3  =>  Excluir Contas ");
            System.out.println("4  =>  Efetuar Depósitos  ");
            System.out.println("5  =>  Efetuar Saques ");
            System.out.println("6  =>  Consultar Conta ");
            System.out.println("7  =>  Efetuar transferência entre contas ");
            System.out.println("8  =>  Sair ");
            System.out.println("-------------------------------------------");
            System.out.println("Qual Sua Opção:");
            options = s.nextInt();

            switch (options) {

                case 1:
                    System.out.println("------------Cadastro--------");
                    System.out.println("Seu nome: ");
                    nomeUsuario = s.next();
                    System.out.println("----------------------------");
                    
                    Conta.Cadastrar(nomeUsuario);

                    break;

                case 2:
                  
                    System.out.println("Contas Listadas");
                    break;

                case 3:
                    Conta.DeletarContas();
                    System.out.println("Conta excluida");
                    break;

                case 4:
                    System.out.println("----------------------Depósito--------------------");
                    System.out.println("Quanto quer Depositar: ");
                    deposito = s.nextFloat();
                    Conta.deposita(deposito);
                    System.out.println("Seu Saldo Atual é: " + Conta.getSaldoConta());
                    System.out.println("--------------------------------------------------");
                    break;

                case 5:
                    System.out.println("-------------------Saque-------------------");
                    System.out.println("Quanto quer Sacar: ");
                    saque = s.nextDouble();
                    Conta.saqueConta(saque);
                    System.out.println("Seu Saldo Atual e: " + Conta.getSaldoConta());
                    System.out.println("-------------------------------------------");
                    break;

                case 6:
                    Conta.ConsultaDados();
                    break;

                case 7:
                    System.out.println("Transeferencia feita  com sucesso :)");
                    break;

                case 8:
                    System.out.println("Tchau :)");
                    break;
            }
        } while (options != 8);

    }

}
