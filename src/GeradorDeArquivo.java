import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class GeradorDeArquivo {
    public  void salvaJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreva = new FileWriter(endereco.cep() + ".json");
        escreva.write(gson.toJson(endereco));
        escreva.close();


    }
}
