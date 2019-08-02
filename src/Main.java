import io.ReadFile;

import java.nio.file.Paths;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String path="C:\\Users\\work\\Desktop\\name.csv".replace("\\","/");
        ReadFile outFile=new ReadFile();
        List<String> text;
        text=outFile.readFile(Paths.get(path));



        /*for (int i=0;i<text.size(); i++){
            System.out.println(text.get(i));
        }*/



    }
}
