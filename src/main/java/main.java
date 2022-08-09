import domain.models.*;
import domain.objects.DomainException;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        var evento = new Evento("Teste", Calendar.getInstance().getTime(), 23, 3);

        var ingressoCamarote = new IngressoCamarote("Flávio", "cpf", evento);

        var ingressoVip = new IngressoVip("Flávio 2", "cpf 2", evento);

        var ingressoPista = new IngressoPista("Flávio 3", "cpf 3", evento);

        venderIngresso(evento, ingressoCamarote);
        venderIngresso(evento, ingressoVip);
        venderIngresso(evento, ingressoPista);

        venderIngresso(evento, ingressoCamarote);
    }

    private static void venderIngresso(Evento evento, Ingresso ingresso) {
        try {
            System.out.println(ingresso.imprimirValor());
            evento.venderIngresso(ingresso);
            var quantidadeIngressosVendidos = evento.getQuantidadeIngressosVendidos();
            System.out.println(ingresso.mostrarResumo());
            System.out.println("Ingressos vendidos: " + quantidadeIngressosVendidos);
            System.out.println("\n");
        } catch (DomainException e) {
            System.out.println("\n");
            System.out.println(e.getMessage());
        }
    }
}
