package sample;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String site = "https://dou.ua/";
        File urlFile = new File("links.txt");

        String code = "";
        try {
            code = NetworkService.getStringFromURL(site, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            NetworkService.saveURLToFile(code, urlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            NetworkService.checkURL(urlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}