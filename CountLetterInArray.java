import jikexueyuan.ch03.RandomCharacter;

import java.util.Scanner;

public class CountLetterInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char[] chars = createArray();

        //display the array
        System.out.println("The lower case letters are: ");
        displayArray(chars);

        //count the occurrences of each letter
        int[] counts = countLetters(chars);

        //dispaly counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);

    }

    private static void displayCounts(int[] counts) {
        for(int i=0; i<counts.length; i++){
            if((i+1)%10==0)
                System.out.println(counts[i] + " " + (char)(i+'a'));
            else
                System.out.print(counts[i]+ " " + (char)(i+'a')+ " ");
        }
    }

    private static int[] countLetters(char[] chars) {
        //Declare and create an array of 26 int
        int[] counts = new int[26];

        //for each lowercase letter in the array, count it
        for(int i = 0; i <chars.length; i++){
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static char[] createArray() {
        //Declare an array of characters and create it
        char[] chars = new char[100];

        //create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        }
        return chars;
    }

    public static void displayArray(char[] chars){
        //display the characters in the array 20 on each line
        for (int i=0; i<chars.length;i++){

            if((i+1)%20 ==0){
                System.out.println(chars[i]);
            }else {
                System.out.print(chars[i] + " ");
            }

        }
    }


}

