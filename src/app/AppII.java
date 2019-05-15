package app;
//https://github.com/acenelio
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppII {

    public static void main(String[] args)  {
        //cria uma variávels String pra dizer o caminho
        String path = "C:\\Users\\danie\\Downloads\\JAVINHAS2\\Arquivos\\teste.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            //  br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}

