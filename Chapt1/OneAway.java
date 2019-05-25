import java.util.HashMap;
import java.lang.Math;

class OneAway {
    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bae"));
    }

    static boolean isOneAway(String word1, String word2){

        // counter for number of differences, index for second word (i for
        // first), and placeholder for shortest word to avoid out of bounds in
        // for loop
        int numDifferences = 0;
        int j = 0;
        String shortestWord;

        // length check is a quick check for more than 1 insertion/deletion
        // situations
        if (Math.abs(word1.length() - word2.length()) > 1){
            return false;
        }
        else{
            if(word1.length() > word2.length()){
                shortestWord = word2;
            }
            else{
                shortestWord = word1;
            }
        }

        for(int i = 0; i < shortestWord.length(); i++){

            if (numDifferences > 1){
                return false;
            }
            if (!(word1.charAt(i) == word2.charAt(j))){
                if (word1.length() == word2.length()){
                    // replacement found
                    numDifferences += 1;
                }
                else if (word1.charAt(i) == word2.charAt(j+1)){
                    // insertion/deletion found
                    numDifferences += 1;
                    j+=1;
                }
                else if (word2.charAt(j) == word1.charAt(i+1)){
                    // insertion/deletion found
                    numDifferences += 1;
                    i+=1;
                }
                else {
                    return false;
                }
            }
            j++;
        }
        return true;
    }

}

// 23, 97, 130
