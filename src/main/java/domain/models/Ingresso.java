package domain.models;

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

    public String mostrarResumo(){
        return nome + cpf + "Dados do evento: "+ evento.getNome() + evento.getData().toString();
    }

    public String imprimirValor(){
        return tipo + calcularValor();
    }

    public double calcularValor(){
        return evento.getValor();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Evento getEvento() {
        return evento;
    }
}
