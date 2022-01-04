package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        Map<String, Integer> votes = new TreeMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] splited = line.split(",");
                String name = splited[0];
                Integer count = Integer.parseInt(splited[1]);

                if (votes.containsKey(name)){
                    int allVotes = votes.get(name);
                    votes.put(name, count + allVotes);
                }else{
                    votes.put(name,count);
                }
                line = br.readLine();
            }
            for(String x : votes.keySet()){
                System.out.println(x + ": "  + votes.get(x));
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());

        }

    }
}
