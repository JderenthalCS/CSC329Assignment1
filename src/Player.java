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
     *
     * @param player
     * @return
     */
    @Override
    public boolean equals(Player player){
        if(player.getName() == player.getName()){
            if(this.name.equals(player.getName())){
                    return true;
        }}
        if(player.getScore() == player.getScore()){
            return true;
        }
        else{return false;}
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


