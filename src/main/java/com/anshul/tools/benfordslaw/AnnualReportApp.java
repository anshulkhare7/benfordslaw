package com.anshul.tools.benfordslaw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * Benford's Law
 *
 */
public class AnnualReportApp {
    public static void main( String[] args ){
		String content = "";
		String filePath = "/Users/data/reliance-AR.txt";	
		
		try{
	        content = new String (Files.readAllBytes(Paths.get(filePath)));
	        List<String> rawWordList = getWords(content);
	        
	        
	        Long zeroDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("0")).count();
	        Long oneDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("1")).count();
	        Long twoDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("2")).count();
	        Long threeDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("3")).count();
	        Long fourDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("4")).count();
	        Long fiveDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("5")).count();
	        Long sixDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("6")).count();
	        Long sevenDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("7")).count();
	        Long eightDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("8")).count();
	        Long nineDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("9")).count();
	       
	        System.out.println("Total count of numbers: "+rawWordList.size());
	        System.out.println("Number of digits starting with 0: "+zeroDigitwordsCount);
	        System.out.println("Number of digits starting with 1: "+oneDigitwordsCount);
	        System.out.println("Number of digits starting with 2: "+twoDigitwordsCount);
	        System.out.println("Number of digits starting with 3: "+threeDigitwordsCount);
	        System.out.println("Number of digits starting with 4: "+fourDigitwordsCount);
	        System.out.println("Number of digits starting with 5: "+fiveDigitwordsCount);
	        System.out.println("Number of digits starting with 6: "+sixDigitwordsCount);
	        System.out.println("Number of digits starting with 7: "+sevenDigitwordsCount);
	        System.out.println("Number of digits starting with 8: "+eightDigitwordsCount);
	        System.out.println("Number of digits starting with 9: "+nineDigitwordsCount);
	        
	    }catch (IOException e) {
	    		e.printStackTrace();
		}
    }
    
	public static List<String> getWords(String text) {
	    List<String> words = new ArrayList<String>();
	    BreakIterator breakIterator = BreakIterator.getWordInstance();
	    breakIterator.setText(text);
	    int lastIndex = breakIterator.first();
	    while (BreakIterator.DONE != lastIndex) {
	        int firstIndex = lastIndex;
	        lastIndex = breakIterator.next();	        
	        if (lastIndex != BreakIterator.DONE && Character.isDigit(text.charAt(firstIndex))) {
	        		String word = text.substring(firstIndex, lastIndex).toLowerCase();	        		
	        		words.add(word);
	        }
	    }

	    return words;
	}

}
