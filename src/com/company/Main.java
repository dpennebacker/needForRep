package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sysin = new Scanner(System.in);
        String word = sysin.nextLine();
	    int perc = (int)(Math.random() * word.length());
	    String fLetters = word.substring(0, perc);
	    String lLetters = word.substring(perc);
	    word = lLetters + fLetters;
	    String endWord = "";
	    int step = (int)(Math.random() * 5);
	    for(int i = 1; i < word.length(); i++) {
	        char letter = word.charAt(i);
	        if(step == 5)
	            step = 0;
	        if(step == 0)
	            endWord += Integer.toBinaryString((int)letter);
	        if(step == 1)
	            endWord += Integer.toOctalString((int)letter);
            if(step == 2)
                endWord += (int)letter;
            if(step == 3)
                endWord += Integer.toHexString((int)letter);
            if(step == 4)
                endWord += letter;
            step++;

        }
        System.out.println(endWord);

    }
}
