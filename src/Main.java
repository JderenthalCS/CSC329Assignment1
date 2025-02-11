import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        //fileReader
        try{
            FileReader fr = new FileReader("players.txt");
            Scanner infile = new Scanner(fr);
            String name;
            int score;

            while(infile.hasNext()){
                name = infile.nextLine();
                score = Integer.parseInt(infile.nextInt());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //priorityQueue instance creation
        PriorityQueue pq = new PriorityQueue() {
            @Override
            public void add(Player a) {

            }

            @Override
            public Player getHighestScorePlayer() {
                return null;
            }

            @Override
            public void clear() {

            }

            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        }
    }
}