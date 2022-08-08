package domain.models;

import domain.constants.TipoIngresso;

public class IngressoVip extends Ingresso{
    public IngressoVip(String nome, String cpf, Evento evento) {
        super(TipoIngresso.VIP, nome, cpf, evento);
    }

    @Override
    public double calcularValor() {
        double valor = super.calcularValor();
        valor += valor * 0.3;
        return valor;
    }
}
