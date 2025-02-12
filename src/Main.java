import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        //pq - Reference variable of PriorityQueue (Holds reference to instance of PQList)
        PriorityQueue pq = new PQList();

        //fileReader
        try{
            FileReader fr = new FileReader("players.txt");
            Scanner infile = new Scanner(fr);
            String name;
            int score;


            while(infile.hasNext()){
                name = infile.nextLine();
                score = Integer.parseInt(infile.nextLine());
                pq.add(new Player(name, score));//Adding player to PriorityQueue
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------");
        System.out.println("Size & Empty Status: With players & score");
        //getSize
        System.out.println("Current Size: " +pq.getSize());

        //isEmpty
        System.out.println("Empty Status: " + pq.isEmpty());
        System.out.println("------------------------");
        System.out.println(" ");

        //Printing Highest to Lowest - Scoreboard
        System.out.println("Players: Highest to Lowest");
        System.out.println("------------------------");
        while(!pq.isEmpty()){
            Player topPlayer = pq.getHighestScorePlayer();
            System.out.println(topPlayer.getName() + "Score: " + topPlayer.getScore());

        }
        //Manually adding: w/ size + empty
        System.out.println("\n--------------------------------------");
        System.out.println("Manually Adding 3 New Users");
        pq.add(new Player("Hoskey", 100));
        pq.add(new Player("Justin", 99));
        pq.add(new Player("Josh", 30));
        System.out.println("Size & Empty Status: After manual entry");
        //getSize2
        System.out.println("Current Size: " +pq.getSize());
        //isEmpty2
        System.out.println("Empty Status: " + pq.isEmpty());
        System.out.println("------------------------");


        //Copy Constructor:
        PriorityQueue copyList = new PQList((PQList) pq);
        System.out.println("\nConstructor Copied!");
        System.out.println("Copied List Size: " +copyList.getSize());


        //Creating Clone:
        PQList cloneList = ((PQList) pq).createClone();
        System.out.println("\nClone Created!");
        System.out.println("Cloned List Size: " +cloneList.getSize());


        //Clearing: w/ size + empty
        System.out.println("\n------------------------");
        System.out.println("Clearing Players & Scores: ");
        pq.clear();
        System.out.println("Size & Empty Status: After manual entry");
        //getSize3
        System.out.println("Current Size: " +pq.getSize());
        //isEmpty3
        System.out.println("Empty Status: " + pq.isEmpty());


    }
}

/** Questions:
 *  1. Should main recieve Javadoc?
 *  2. Are javadoc's correct?
 *  3. FileReader issues!!!!
 *  4. Are inMethod comments okay, as they assist me while coding.
 */