// Name: Abhiram Ruthala
// Computing Id:kas4kj
// HW 3 - Soccer
// Resources used: https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb, https://www.geeksforgeeks.org/dsa/sorting-algorithms/, ChatGPT 4 for Debugging

public class Player {
    private String name;
    private String position;
    private int minutes_played;
    private int goals;
    private int assists;
    private double sog_percentage;

    public Player(){
        name = "";
        position = "";
        minutes_played = 0;
        goals = 0;
        assists = 0;
        sog_percentage = 0.0;
    }

    public Player(String name, String position, int minutes_played, int goals, int assists, double sog_percentage) {
        this.name = name;
        setPosition(position);

        if(minutes_played > 0){
            this.minutes_played = minutes_played;
        }

        if (goals > 0){
            this.goals = goals;
        }

        if  (assists > 0){
            this.assists = assists;
            
        }
        
        if  (sog_percentage > 0) {
            this.sog_percentage = sog_percentage;
        }

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void setPosition(String position){
        if (position.equals("defense") || position.equals("goalie") || position.equals("midfield") || position.equals("forward")){
            this.position = position;
        }

    }

    public String getPosition(){
        return position;
    }

    public int getMinutes(){
        return minutes_played;
    }

    public int getAssists(){
        return assists;
    }

    public int getGoals(){
        return goals;
    }

    public double getSOG(){
        return sog_percentage;
    }

    @Override
    public String toString(){
        return name + " " + position + " " + minutes_played + " " + goals + " " + assists + " " + sog_percentage;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Player){
            Player otherPlayer = (Player) other;
            return otherPlayer.getName().equals(this.getName()) && otherPlayer.getPosition().equals(this.getPosition()) && otherPlayer.getMinutes() == this.getMinutes() && otherPlayer.getSOG() == this.getSOG();
            
        } else {
            return false;
        }
    }

}
