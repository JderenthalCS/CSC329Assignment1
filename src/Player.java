/**
 * Player object w/ name, score
 */
public class Player {
        String name;
        int score;

    /**
     * Default Constructor
      */
    public Player(){

    }

    /**
     * Constructor which takes all member variables as parameters
     * @param name Player Name
     * @param score Player Score
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Deep copyConstructor
     * @param other New instance of Player object
     */
    public Player(Player other){
        this.name = other.name;
        this.score = other.score;
    }

    /**
     * createClone method which creates a new Player
     * @param name Attributes name to new player
     * @param score Attributes score to new player
     * @return new Player with attributed name and score
     */
    public Player createClone(String name, int score){

        return new Player(this.name, this.score);
    }

    /**
     * Compares new object and Player object
     * If objects are same memory location, return true
     * If new object (player2) is not object of Player return False
     * Compare names
     * @param player2
     * @return
     */
    @Override
    public boolean equals(Object player2){
        if (player2 == this){ //If objects are the same, True (Same instance = equals)
            return true;
        }
        if (!(player2 instanceof Player)){ //If object is not Player, False
            return false;
        }
        Player tempPlayer = (Player) player2; //Typecast player2 to Player(object)

        return this.name.equals(tempPlayer.name); //Compares names
    }

    /**;
     * getName: retrieves player name
     * @return player name
     */
    public String getName() {
        return name;
    }

    /**
     * setName: sets players name
     * @param name sets this.name as players name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getScore: gets players score
     * @return players score
     */
    public int getScore() {
        return score;
    }

    /**
     * setScore: sets players score
     * @param score sets this.score equal to players score
     */
    public void setScore(int score) {
        this.score = score;
    }




}


