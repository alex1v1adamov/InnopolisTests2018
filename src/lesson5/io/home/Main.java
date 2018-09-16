package lesson5.io.home;

public class Main {

    public static void main(String[] args) {
        String pathToRave = "d://";
        int fileCount = 1;
        boolean gaussianSentenceCount = false;

        int wordArrayLenght = 1_000;
        int wordMaxLenght = 15;

        String[] words = RaveGenerator.generateWordsArray(wordArrayLenght, wordMaxLenght);

        RaveGenerator.getFiles(pathToRave, fileCount, gaussianSentenceCount, words);
    }
}