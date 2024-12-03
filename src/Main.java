import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    public static void selecaoCandidatos() {
        String [] candidatos = {"KAIO", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;


        }

        System.out.println("Os candidatos selecionados são: ");
        for (int i = 0; i < candidatosSelecionados; i++) {
            System.out.println(candidatos[candidatosSelecionados]);
        }


    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
