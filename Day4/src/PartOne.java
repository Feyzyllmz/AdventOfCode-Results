import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class PartOne {
    public static void main(String[] args) throws IOException {
        int firstOfFisrt=0;
        int SecondOfFirst=0;
        int FirstOfSecond=0;
        int SecondOfSecond=0;
        int total=0;
        try
        {
            File file=new File("puzzleInput.txt");
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String line;
            while((line=br.readLine())!=null)
            {
                String parts[] = line.split(" ");
                for(int i=0; i< parts.length; i++){
                    String firstValue= "";
                    String secondValue= "";
                    String firstValue2= "";
                    String secondValue2= "";
                    boolean firstPart= false;
                    boolean isComma = false;
                    for(int j=0; j<parts[i].length(); j++){
                        if(!isComma){
                            if(!firstPart){
                                if(parts[i].charAt(j)!='-'){
                                    firstValue = firstValue + parts[i].charAt(j);

                                }else if(parts[i].charAt(j)=='-'){
                                    firstPart = true;
                                }
                            }else{
                                if(parts[i].charAt(j)==','){
                                    isComma=true;
                                    firstPart=false;
                                }else{
                                    secondValue = secondValue + parts[i].charAt(j);
                                }
                            }
                        }else if(isComma){
                            if(!firstPart){
                                if(parts[i].charAt(j)!='-'){
                                    firstValue2 = firstValue2 + parts[i].charAt(j);

                                }else if(parts[i].charAt(j)=='-'){
                                    firstPart = true;
                                }
                            }else{
                                secondValue2 = secondValue2 + parts[i].charAt(j);
                            }
                        }

                    }
                    int firstPair=Integer.parseInt(firstValue);
                    int secondPair=Integer.parseInt(secondValue);
                    int firstPair2=Integer.parseInt(firstValue2);
                    int secondPair2=Integer.parseInt(secondValue2);

                    if(firstPair<=firstPair2 && secondPair>=secondPair2){
                        total++;
                    }else if(firstPair2<=firstPair && secondPair2>=secondPair){
                        total++;
                    }

                }
                sb.append(line);
                sb.append("\n");
            }
            System.out.println(total);
            fr.close();
            //System.out.println(sb.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}