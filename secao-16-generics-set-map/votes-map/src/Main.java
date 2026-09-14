
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            HashMap<String, Integer> myCandidate = new HashMap<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Integer votes = Integer.valueOf(fields[1]);

                myCandidate.put(username, myCandidate.getOrDefault(username, 0) + votes);

                line = br.readLine();
            }
            for (String key : myCandidate.keySet()) {
                System.out.println(key + ": " + myCandidate.get(key));
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}