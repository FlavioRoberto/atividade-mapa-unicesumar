package domain.models;

import domain.objects.DomainException;

public abstract class Ingresso {
    private final String tipo;
    private final String nome;
    private final String cpf;
    private final Evento evento;

    public Ingresso(String tipo, String nome, String cpf, Evento evento) {
        this.tipo = tipo;
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
    }

    public String mostrarResumo() throws DomainException {
        if (evento == null)
            throw new DomainException("Venda não realizada para esse ingresso!");

        return "Nome: " + nome + "" +
                "\nCpf: " + cpf +
                "\nDados do evento: " + evento.getNome() +
                "\nData:" + evento.getData();
    }

    public String imprimirValor() {
        return "Tipo ingresso: " + tipo + "\nValor: " + calcularValor();
    }

    public double calcularValor() {
        return evento.getValor();
    }

    public Evento getEvento() {
        return evento;
    }
}
