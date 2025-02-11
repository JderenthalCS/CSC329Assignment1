public interface PriorityQueue {

    /**
     * Adds Player object to priorityQueue
     * @param a - New Player object
     */
    void add(Player a);

    /**
     * Gets player with highest score.
     * Highest score determines priority
     * @return - Player with highest score
     * @throws Exception
     */
    Player getHighestScorePlayer();

    /**
     * Clears all Players from priority queue
     */
    void clear();

    /**
     * Returns number of players stored in priority queue.
     * @return ^
     */
    int getSize();

    /**
     *
     * @return - True if priorityQueue is empty | False if not
     */
    boolean isEmpty();
}
