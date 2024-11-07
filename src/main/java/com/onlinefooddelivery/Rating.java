public class Rating {
    private Long id;
    private Long customerId;
    private Long driverId;
    private int score;
    private String comment;
    private DateTime timestamp;

    public boolean validate() {
        return score >= 1 && score <= 5;
    }

    public String getRatingDetails() {
        return "Rating ID: " + id + ", Customer ID: " + customerId + ", Driver ID: " + driverId + 
               ", Score: " + score + ", Comment: " + comment + ", Timestamp: " + timestamp;
    }
}