import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
        int index=0;
        String st="not pangram";
        String st1="pangram";
        boolean[] visited=new boolean[26];
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if('a'<=s.charAt(i)&&s.charAt(i)<='z')
            {
                index=s.charAt(i)-'a';
            }
            else if('A'<=s.charAt(i)&&s.charAt(i)<='Z')
            {
                index=s.charAt(i)-'A';
            }
            visited[index]=true;
        }
        for(int j=0;j<26;j++)
        {
            if(visited[j]!=true)
            {
                return st;
            }
        } 
        return st1;
        
    }

}

public class Solutions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
