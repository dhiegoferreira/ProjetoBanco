/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Dhiego
 */
public class Cliente {
    private int id_cliente;
    private String nome;
    private String Cpf;
    private int numeroconta;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public int getnumeroconta() {
        return numeroconta;
    }

    public void setnumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
    
    
    
    
    
}
