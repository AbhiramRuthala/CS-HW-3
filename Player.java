public class Player {
    String name;
    String position;
    int minutes_played;
    int goals;
    int assists;
    double sog_percentage;

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
        return name + position + minutes_played + goals + assists + sog_percentage;
    }

    public boolean equals(Player other){
        if (name.equals(other.getName()) && position.equals(other.getPosition()) && minutes_played == other.getMinutes() && sog_percentage == other.getSOG()){
            return true;
        } else {
            return false;
        }

    }

}
