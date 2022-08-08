package domain.models;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private final String nome;
    private final Date data;
    private final double valor;
    private final int capacidadeMaxima;
    private final ArrayList<Ingresso> ingressosVendidos;

    public Evento(String nome, Date data, double valor, int capacidadeMaxima, ArrayList<Ingresso> ingressosVendidos) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressosVendidos = ingressosVendidos;
    }

    public String getNome() {
        return nome;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public ArrayList<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }
}
