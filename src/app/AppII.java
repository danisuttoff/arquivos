package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppII {

    public static void main(String[] args)  {
        //cria uma variávels String pra dizer o caminho
        String path = "C:\\Users\\danie\\Downloads\\JAVINHAS2\\Arquivos\\teste.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //  br = new BufferedReader(new FileReader(path));


            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }


    }
}

