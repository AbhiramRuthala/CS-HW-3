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

    //no-arg constructor. just associates values to the variables that were created earlier.

    public Player(){
        name = "";
        position = "";
        minutes_played = 0;
        goals = 0;
        assists = 0;
        sog_percentage = 0.0;
    }

    //arg constructor. this validates the variables but also sets conditions, because there are certain conditions for the soccer team. you cant have negative goals or a position that isn't what's listed in a soccer team (i.e. what's relevant to this homework), so you need to set conditons here to validate accurate values.

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

    //setName. validates name variable.

    public void setName(String name){
        this.name = name;
    }

    //getName returns name for any player varialbe.
    public String getName(){
        return name;

    }

    //set position validates positon, also sets conditiosn here to meet all possible position values relevant to this homework for any player varialbe.
    public void setPosition(String position){
        if (position.equals("defense") || position.equals("goalie") || position.equals("midfield") || position.equals("forward")){
            this.position = position;
        }

    }


    //retusn the position value for any player varialbe.
    public String getPosition(){
        return position;
    }

    //returns minutes value for any player varialbe.

    public int getMinutes(){
        return minutes_played;
    }


    //returns assits value for any player varialbe.
    public int getAssists(){
        return assists;
    }


    //returns goals value for any player varialbe.
    public int getGoals(){
        return goals;
    }

    //returns shots on goal value for any player varialbe.

    public double getSOG(){
        return sog_percentage;
    }


    //toString method gives an object a proper string to work with rather than just printing memory storage systems for each part. when calling for a new object and passing in values in the cosntructor, you can get a proper string that represents all of them thanks to this method.
    @Override
    public String toString(){
        return name + " " + position + " " + minutes_played + " " + goals + " " + assists + " " + sog_percentage;
    }


    //equals function. uses object o and checks to see if it makes the instance of a player. if it doenst, return fase, but if it does, check to see if name, position, minutes, and sog are the same. if they are, return true, else return false.
    @Override
    public boolean equals(Object o){

        if(o == this){
            return true;
        }
        
        if(!(o instanceof Player)){
            return false;
            
        }
        
        Player otherSeason = (Player) o;
        return otherSeason.getName().equalsIgnoreCase(this.getName()) && otherSeason.getPosition().equalsIgnoreCase(this.getPosition()) && otherSeason.getMinutes() == this.getMinutes() && otherSeason.getSOG() == this.getSOG();

    }

}
