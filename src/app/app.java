package app;
//https://github.com/acenelio

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {


        //use \\ porque o \ é prefrixo de caracteres especiais, para indicar que vc quer usar o \ vc usa o \\ <2
        File file = new File("C:\\Users\\danie\\Downloads\\JAVINHAS2\\Arquivos\\teste.txt");
        Scanner in = null;
        try {
            //instanciar scanner a partir do arquivo
            in = new Scanner(file);
            //tester se ainda existe uma niva linha no arquivo
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());

            }
        } catch (IOException e) {
            //ao abrir o arquivo pode gerar uma exceção
            System.out.println("Error: " + e.getMessage());
        } finally {
            //fechar o scanner aqui no finally para garantir que será fechado, mesmo o try falhando
            if (in != null) {
                in.close();
            }

        }
    }

}
