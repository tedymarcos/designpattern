package testingskills;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.isNull;

public class Main {

    public static void main(String[] args) {

        Map<String, Supplier<Car>> veiculos = new HashMap<>();

        veiculos.put("passeio", CarroPasseioStrategy::new);
        veiculos.put("caminhonete", CaminhoneteStrategy::new);

        String tipo = "passeio";

        var veiculo = veiculos.getOrDefault(tipo, () -> null ).get();

        if (isNull(veiculo)) {
            System.out.println("Carro desconhecido");
        } else {
            System.out.println("Tração: " + veiculo.trace());
            System.out.println("Portas: " + veiculo.portas());
        }

    }
}
