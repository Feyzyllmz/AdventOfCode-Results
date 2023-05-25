import java.io.*;
import java.util.ArrayList;

public class PartOne {
    public static void main(String[] args) {

        int totalPriority= 0;
        char sameComponent = 'a';
        try
        {


            File file3=new File("uppercase.txt");
            FileReader fr3=new FileReader(file3);
            BufferedReader br3=new BufferedReader(fr3);
            StringBuffer sb3=new StringBuffer();
            String line3;
            ArrayList<Character> uppercase = new ArrayList<>();
            while((line3=br3.readLine())!=null)
            {

                for(int i=0; i<line3.length(); i++){
                    uppercase.add(line3.charAt(i));
                }
                sb3.append(line3);
                sb3.append("\n");
            }
            fr3.close();

            File file2=new File("lowercase.txt");
            FileReader fr2=new FileReader(file2);
            BufferedReader br2=new BufferedReader(fr2);
            StringBuffer sb2=new StringBuffer();
            String line2;
            ArrayList<Character> lowercase = new ArrayList<>();
            while((line2=br2.readLine())!=null)
            {

                for(int i=0; i<line2.length(); i++){
                    lowercase.add(line2.charAt(i));
                }
                sb2.append(line2);
                sb2.append("\n");
            }
            fr2.close();

            File file=new File("puzzleInput.txt");
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String line;
            while((line=br.readLine())!=null)
            {
                int size = line.length();
                System.out.println(size);
                ArrayList<Character> firstPart = new ArrayList<>();
                ArrayList<Character> secondPart = new ArrayList<>();
                for(int i=0; i<(size/2)-1; i++){
                    firstPart.add(line.charAt(i));
                }

                for(int i = size/2; i< size; i++){
                    secondPart.add(line.charAt(i));
                }
                for(int i=0; i< firstPart.size(); i++){
                    for(int j=0; j<secondPart.size(); j++){
                        if(firstPart.get(i)==secondPart.get(j)){
                            sameComponent=firstPart.get(i);
                            break;
                        }
                    }
                }
                for(int i=0; i<firstPart.size(); i++){
                    System.out.println(firstPart.get(i));
                }
                for(int i=0; i<firstPart.size(); i++){
                    System.out.println(secondPart.get(i));
                }
                boolean isLower = false;
                for(int i=0; i<lowercase.size(); i++){
                    if(sameComponent==lowercase.get(i)){
                        totalPriority=totalPriority +i;
                        isLower=true;
                    }
                }
                if(!isLower){
                    for(int i=0; i<uppercase.size(); i++){
                        if(sameComponent==uppercase.get(i)){
                            totalPriority=totalPriority +i + 26;
                        }
                    }
                }

                sb.append(line);
                sb.append("\n");
            }

            System.out.println(totalPriority);
            fr.close();

            //System.out.println(sb.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}