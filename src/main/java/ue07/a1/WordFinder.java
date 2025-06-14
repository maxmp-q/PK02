package ue07.a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;


public class WordFinder {
    public String chooseRandomWordFromFile(int length){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> allWords = new ArrayList<>();
        Random rand = new Random();
        String file = "./src/main/java/ue07/a1/words.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
//          BufferedWriter bw = new BufferedWriter(new FileWriter("words.txt", false));

            while(br.readLine() != null){
                String word = br.readLine();
                if(word.length() == length){
                    words.add(word.trim());
                } else {
                    allWords.add(word.trim());
                }
            }

            if(words.isEmpty()){
                return "No words with the length: " + length;
            }

            String selectedWord = words.get(rand.nextInt(words.size()));

            words.remove(selectedWord);

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));

            for( String word : allWords){
                bw.write(word);
                bw.newLine();
            }

            for (String word : words) {
                bw.write(word);
                bw.newLine();
            }

            return selectedWord;

        } catch (Exception e){
            return "No file found!";
        }
    }
}
