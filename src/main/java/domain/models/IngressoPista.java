package domain.models;

import domain.constants.TipoIngresso;

public class IngressoPista extends Ingresso{
    public IngressoPista(String nome, String cpf, Evento evento) {
        super(TipoIngresso.PISTA, nome, cpf, evento);
    }
}
