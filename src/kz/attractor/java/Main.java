package kz.attractor.java;

import kz.attractor.java.lesson44.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            new Lesson44Server("localhost", 9889).start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
