// Name: Abhiram Ruthala
// Computing Id:kas4kj
// HW 3 - Soccer
// Resources used: https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb, https://www.geeksforgeeks.org/dsa/sorting-algorithms/, ChatGPT 4 for Debugging

public class Player {
    String name;
    String position;
    int minutes_played;
    int goals;
    int assists;
    double sog_percentage;

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
        this.position = position;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.sog_percentage = sog_percentage;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void setPosition(String position){
        this.position = position;

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
        return super.equals(other);
//        if (name.equals(other.getName()) && position.equals(other.getPosition()) && minutes_played == other.getMinutes() && sog_percentage == other.getSOG()){
//            return true;
//        } else {
//            return false;
//        }

    }

}
