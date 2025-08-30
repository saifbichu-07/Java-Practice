package File_Handling;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException{
        File file = new File("Study.easy.txt");
        file.createNewFile();
        System.out.println("File created");
    }


}
