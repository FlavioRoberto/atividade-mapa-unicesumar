package domain.models;

import domain.objects.DomainException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private final String nome;
    private final Date data;
    private final double valor;
    private final int capacidadeMaxima;
    private final ArrayList<Ingresso> ingressosVendidos;

    public Evento(String nome, Date data, double valor, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressosVendidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        var df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(data);
    }

    public double getValor() {
        return valor;
    }

    public long getQuantidadeIngressosVendidos() {
        return ingressosVendidos.size();
    }

    public void venderIngresso(Ingresso ingresso) throws DomainException {
        if (ingressosVendidos.size() >= capacidadeMaxima)
            throw new DomainException("Não foi possível realizar a venda do ingresso. Pois, a capacidade máxima do evento atingida");

        if (!ingresso.getEvento().nome.equals(nome))
            throw new DomainException("Não foi possível realizar a venda do ingresso. Pois, o ingresso selecionado não corresponde ao evento.");

        ingressosVendidos.add(ingresso);
    }

}
