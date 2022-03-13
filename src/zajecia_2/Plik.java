package zajecia_2;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plik {

    public static void main(String[] args) throws IOException {

        File plik = new File("plik_tekstowy.txt");
        if(plik.createNewFile()){
            System.out.println("Plik został stworzony");
        }
        else {
            if (plik.exists()){
                System.out.println("Plik już istnieje");
            }
            else{
                System.out.println("");
            }
        }
        FileWriter plik_1 = new FileWriter("plik_tekstowy.txt");
        plik_1.write("zapiszemy coś w pliku");
        plik_1.write("\n zapiszemy jeszcze coś w pliku");
        plik_1.close();
    }
}
