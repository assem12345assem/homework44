package kz.attractor.java.lesson44;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH_Book = Paths.get("");

    public static List<Book> readFile() {
        List<Book> books = new ArrayList<>();
        String json;
        try {
            json = Files.readString(PATH_Book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        books = GSON.fromJson(json, List.class);
        return books;
    }
    public static void writeFile(List<Book> books) {
        String json =GSON.toJson(books);
        try {
            byte[] arr = json.getBytes();
            Files.write(PATH_Book, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static List<Book> readFile() {
//        Type itemsMapType = new TypeToken<Map<String, List<Movie>>>() {
//        }.getType();
//        String json;
//        try {
//            json = Files.readString(PATH);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Map<String, List<Movie>> moviesMap = GSON.fromJson(json, itemsMapType);
//        return moviesMap.get("movies");
//    }
}
