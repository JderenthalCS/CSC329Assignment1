public class PQList{

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
     *  Copy Constructor - Deep
     * @param other
     */
    public PQList(PQList other){
        head = other.head;
        tail = other.tail;
        size = other.size;
    }

    /**
     * createClone method
     * @param head
     * @param tail
     * @param size
     * @return
     */
    public PQList createClone(Node head, Node tail, int size){
        PQList clone = new PQList();
        clone.head = head;
        clone.tail = tail;
        clone.size = size;

        return clone;
    }


    /**
     * Creates newNode at tail or tail.next depending on null
     * @param player
     */
    public void add(Player player){
        //Creating a new node
        Node newNode = new Node(player);

        if(tail == null){
            tail = newNode;
        } else{
            tail.next = newNode;
        }
    }

    /**
     *
     * @return Total nodes within linkedList
     */
    public int getSize(){
        return size;
    }

}
