/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancaria.classe;

/**
 *
 * @author vitor.kuhnen
 */
public class ContaCorrente {

    private String nomeCliente;
    private String numeroCont;
    private String senha;
    private double saldo;
    private String extrato;
    
    public ContaCorrente(){
        extrato = "";
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroCont() {
        return numeroCont;
    }

    public void setNumeroCont(String numeroCont) {
        this.numeroCont = numeroCont;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }
}
