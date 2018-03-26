package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        String [] listOfWordsToCompare = {"test","Test","purpose"};

        /*String text = "I would like to discuss test approaches for testing of tests, test?,test, end. New sentence to.";
        String [] words = (text + " ").split("[^a-zA-Z]+");
                for (String word: words){
                    System.out.println("Text separated into words: ");
                    System.out.println(word);

                }*/
        String resultText ="";

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Бодя\\IdeaProjects\\WordCount\\src\\com\\company\\TestText.txt"))) {
            resultText = br.lines().collect(Collectors.joining("\n"));
            System.out.println(resultText + "---- Text from the read file");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


        String[] words = (resultText + " ").split("[^a-zA-Z]+");
        System.out.println("Text separated into words: ");
        for (String word: words){
            System.out.println(word);
        }

        for (int i = 0; i<words.length; i++) {
            for (int j = 0; j<listOfWordsToCompare.length; j++){
                if (listOfWordsToCompare[j].equals(words[i])){
                    int wordCount = 0;
                    System.out.println(listOfWordsToCompare[j]+" count: "+(wordCount+1));
                }
            }
        }

    }
}