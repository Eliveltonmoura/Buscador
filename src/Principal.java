import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

         System.out.println("Digite um numero de Cep");
        var cep = input.nextLine();

        try {
            Endereco noveEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(noveEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(noveEndereco);

        }
        catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");

        }

    }

}
