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

        //Printing Highest to Lowest - Scoreboard
        System.out.println("Players: Highest to Lowest");
        while(!pq.isEmpty()){
            Player topPlayer = pq.getHighestScorePlayer();
            System.out.println(topPlayer.getName() + "Score: " + topPlayer.getScore());

        }

        //isEmpty
        System.out.println("Empty Status: " + pq.isEmpty());


    }
}

/** Questions:
 *  1. Should main recieve Javadoc?
 *  2. Are javadoc's correct?
 *  3. FileReader issues!!!!
 *  4. Are inMethod comments okay, as they assist me while coding.
 */