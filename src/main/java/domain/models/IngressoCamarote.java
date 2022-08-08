package domain.models;

import domain.constants.TipoIngresso;

public class IngressoCamarote extends Ingresso{
    public IngressoCamarote(String nome, String cpf, Evento evento) {
        super(TipoIngresso.CAMAROTE, nome, cpf, evento);
    }

    @Override
    public double calcularValor() {
        double valor = super.calcularValor();
        valor += valor * 0.6;
        return valor;
    }
}
