/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author jvmat
 */
public class ContaCorrente {

    static ContaCorrente[] lista_Conta = new ContaCorrente[20];

    Random aleatorio = new Random();
    int numberConta;
    String nomeCliente;
    double saldoConta;
    float creditoEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(int numberConta) {
        this.numberConta = numberConta;
    }

    public int getNumberConta() {
        return numberConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public float getCreditoEspecial() {
        return creditoEspecial;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCreditoEspecial(float creditoEspecial) {
        this.creditoEspecial = creditoEspecial;
    }

    public boolean deposita(double quantidade) {
        if (this.nomeCliente == null) {
            System.out.println("Nao Ha nenhum Usuario");
            return false;
        } else {
            this.saldoConta = this.saldoConta + quantidade;
            System.out.println("Seu Saldo Atual e: "  +  this.saldoConta);
            return true;
        }
      
    }

    public boolean saqueConta(double quantidade) {
        if (this.nomeCliente == null || this.saldoConta == 0) {
            System.out.println("Operacao não pode ser realizada");
            return false;
        }
        if (this.saldoConta < quantidade) {
            return false;
        } else {
            this.saldoConta = this.saldoConta - quantidade;
            return true;
        }

    }

    public void Cadastrar(String nome) {
        System.out.println("---------------CADASTRO----------------------");
        this.nomeCliente = nome;
        System.out.println("Seu nome: " + this.nomeCliente);
        this.numberConta = aleatorio.nextInt();
        System.out.println("O numero da Sua conta: " + this.numberConta);
        System.out.println("Saldo na sua conta: " + this.saldoConta);
        System.out.println("---------------------------------------------");
    }

    public void ConsultaDados() {
        if (this.nomeCliente == null) {
            System.out.println("Nao Ha nenhum Usuario");
        } else {
            System.out.println("-----------------Consulta--------------");
            System.out.println("Usuario: " + this.nomeCliente);
            System.out.println("Numero da Conta: " + this.numberConta);
            System.out.println("Saldo atual: " + this.saldoConta);
            System.out.println("---------------------------------------");
        }

    }

    public void DeletarContas( ) {
      this.numberConta = 0 ;
      this.nomeCliente = "";
      this.saldoConta = 0;
      
   
    }
}
