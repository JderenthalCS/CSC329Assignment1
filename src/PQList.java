/**
 * linkedList implementation of PriorityQueue, storing players(name, score)
 *
 */
public class PQList implements PriorityQueue{
    private Node head;
    private Node tail;
    private int size;

    /**
     * Default Constructor
     */
    public PQList(){
        head = null;
        tail = null;
        size = 0;
    }

    /**
     *  Deep Copy Constructor:
     *  Creates empty list, iterates through given list creating new player object at each node (Deep Copy)
     *
     * @param other
     */
    public PQList(PQList other){
        this.head = null;
        this.tail = null;
        this.size = 0;

        Node pointer = other.head;
        while(pointer != null){ //Runs through the linkedList
            this.add(new Player(pointer.player)); //Creates deepCopy of each player
            pointer = pointer.next;
        }
    }

    /**
     * createClone method:
     * Creates new PQList via PQList(PQList other) Deep Copy Constructor
     * @return
     */
    public PQList createClone(){
        return new PQList(this);
    }


    /**
     * If list is empty, newNode = head, tail
     * else newNode is created
     * @param player
     */
    public void add(Player player){
        //Creating a new node
        Node newNode = new Node(player);

        if(head == null){ //If head is null, linkedList is empty
            //New node is both head & tail
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
        size++; //Increment size as new node is created
    }

    /**
     *
     * @return Total nodes within linkedList
     */
    public int getSize() {
        return size;
    }

    /**
     * getHighestScorePlayer()
     * Iterate through list, find highest score player
     * remove highest player node from list and return player
     *
     * @return
     */
    @Override
    public Player getHighestScorePlayer(){
    if (head == null) return null; //Checks is list is empty

        Node currentScore = head;
        Node highestScore = head;
        Node prevScore = null;
        Node prevHighScore = null;

        while(currentScore != null){
            if(currentScore.player.getScore() > highestScore.player.getScore()){
                highestScore = currentScore;
                prevHighScore = prevScore;
            }
            prevScore = currentScore;
            currentScore = currentScore.next;
        }
        //If highscore is at head of the list, move head to next
        if(prevHighScore == null){
            head = head.next;
            //if list is empty after removal, set tail to null (emptying list)
            if(head == null){
                tail = null;
            }
        } else {
            prevHighScore.next = highestScore.next; //removes node by jumping over it
            //If highscore is last node, make tail previous node (removing node before last)
            if(highestScore == tail){
                tail = prevHighScore;
            }
        }
        size--;
        return highestScore.player;


    }

    /**
     * Removes all elements from linkedList
     */
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * If head is null, return true. If not return false (proving linkedList emptiness)
     * @return
     */
    @Override
    public boolean isEmpty(){
        return head == null;
    }
}
