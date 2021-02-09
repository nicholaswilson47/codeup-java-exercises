import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get("languages.txt");
        if (! Files.exists(filepath)) {
            Files.createFile(filepath);
        }
        List<String> languages = Arrays.asList(
                "HTML",
                "CSS",
                "Javascript",
                "Java",
                "SQL"
        );
        Files.write(filepath, languages);
        List<String> lines = Files.readAllLines(filepath);

        for (String line : lines){
            System.out.println("Here is a language I like: "+ line);
            if (line.equals("Javascript")){
                System.out.println("This is my favorite language!");
            }
        }
    }

}
