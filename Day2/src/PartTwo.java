import java.io.*;
import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) throws IOException {
        int currentScore =0;
        int totalScore = 0;

        try {
            FileInputStream fis=new FileInputStream("PuzzleInput.txt");
            Scanner sc=new Scanner(fis);
            while(sc.hasNextLine())
            {
                String currentLine = sc.nextLine();
                if(currentLine.charAt(0) == 'A'){
                    if(currentLine.charAt(2) == 'X')
                        currentScore = 4;
                    else if(currentLine.charAt(2) == 'Z')
                        currentScore = 3;
                    else
                        currentScore = 8;
                }
                else if(currentLine.charAt(0) == 'B'){
                    if(currentLine.charAt(2) == 'X')
                        currentScore = 1;
                    else if(currentLine.charAt(2) == 'Z')
                        currentScore = 9;
                    else
                        currentScore = 5;
                }
                else if(currentLine.charAt(0) == 'C'){
                    if(currentLine.charAt(2) == 'X')
                        currentScore = 7;
                    else if(currentLine.charAt(2) == 'Z')
                        currentScore = 6;
                    else
                        currentScore = 2;
                }
                totalScore=totalScore + currentScore;
                currentScore = 0;

            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(totalScore);
    }
}
