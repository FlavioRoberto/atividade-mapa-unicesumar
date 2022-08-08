package presentation;

import domain.models.Evento;
import domain.models.IngressoCamarote;
import domain.models.IngressoVip;

import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args){
        var evento = new Evento("Teste", Calendar.getInstance().getTime(), 23, 30, null);
        var ingresso = new IngressoCamarote("Flávio", "cpf", evento);
        var ingresso2 = new IngressoVip("Flávio", "cpf", evento);

    }
}
