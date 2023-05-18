
package com.mycompany.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacao {
    
    private String nomeOperacao;
    private float valorOperado;
    private LocalDateTime data;

    public Operacao (String nomeOperacao, float valorOperado) {
        this.nomeOperacao = nomeOperacao;
        this.valorOperado = valorOperado;
        this.data = LocalDateTime.now();
    }

    public String getNomeOperacao() {
        return nomeOperacao;
    }

    public void setNome(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

    public double getValor() {
        return valorOperado;
    }

    public void setValor(float valor) {
        this.valorOperado = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nomeOperacao + ", Valor Operado = " + valorOperado + ", Data = " + data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "\n";
    }

    
}
