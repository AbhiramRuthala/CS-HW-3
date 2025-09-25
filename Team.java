// Name: Abhiram Ruthala
// Computing ID: kas4kj
// HW 3 - Soccer
// Resources used: https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb, https://www.geeksforgeeks.org/dsa/sorting-algorithms/, ChatGPT 4 for Debugging, Claude Sonnet 4 for Debugging, https://www.geeksforgeeks.org/java/overriding-equals-method-in-java/

public class Team {

    private Player[] Team;
    
// Constructor for the Team class that uses a deep copy as a means to create a seperate list entity that doesn't tamper with the input entity and instantiate that to the private Player[] Team variable.
    public Team(Player[] team){


        if(team == null){
            this.Team = new Player[0];
        } else {
            this.Team = new Player[team.length];
            for(int i = 0; i < team.length; i++){
                Player sense = team[i];
                this.Team[i] = new Player(sense.getName(), sense.getPosition(), sense.getMinutes(), sense.getGoals(), sense.getAssists(), sense.getSOG());
            }


        }



    }

    
// getTeam method that returns the Team.
    public Player[] getTeam() {
        return Team.clone();
    }

    //setTeam follows a similar fashion to the constructor, doing a deep copy and providing a separate list entity of new Player items as based on the input instead of doing a shallow copy and potentially tampering with the input list and its components.

    public void setTeam(Player[] team) {

        if(team == null){
            this.Team = new Player[0];
        } else {
            this.Team = new Player[team.length];
            for (int i = 0; i < team.length; i++){
                Player sense = team[i];
                this.Team[i] = new Player(sense.getName(), sense.getPosition(), sense.getMinutes(),  sense.getGoals(), sense.getAssists(), sense.getSOG());

            }
        }
    }

    //equals method that is to give it the capability of checking to see if something equals something else.
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    //toString method converts it into a readable string so that it is interpretable by the user instead of any random memory storage units that aren't the most useful in understanding the class.

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < Team.length; i++){
            str = Team[i].getName() + Team[i].getPosition() + Team[i].getMinutes() + Team[i].getAssists() + Team[i].getGoals() + Team[i].getSOG();
            //return Team[i].name + Team[i].position + Team[i].minutes_played + Team[i].assists + Team[i].goals + Team[i].sog_percentage;
        }

        return str;
    }

    //Sog average takes all players SOG from the team array and divides that by the number of players on the team.

    public double SOGAverage(){
        double numerator = 0;
        for(int i = 0; i < Team.length; i++){
            numerator += Team[i].getSOG();
        }

        return numerator/Team.length;
    }


    //positionCount checks which players in a list of players play a certain position. If so, return the number of players that play that certain position.
    public int positionCount(String positionValue){
        int counter = 0;
        for(int i = 0; i < Team.length; i++){
            if(Team[i].getPosition().equalsIgnoreCase(positionValue.toLowerCase())){
                counter++;
            }
        }
        if (counter > 0) {
            return counter;
        } else {
            return 0;
        }
        //return counter;
    }

//    public Player[] sort(){
//        Player[] newList = new Player[Team.length];
//        for(int i = 0; i < Team.length-1; i++){
//            if(Team[i].minutes_played > Team[i+1].minutes_played){
//                newList[0] = Team[i];
//            }
//        }
//
//        return newList;
//
//    }

    //Sort function checks to put the list of playesr in descending order using minutes played as the sorting key. This is created in a separate list entity and uses a Bubble Selection where it goes through 2 loops to ensure that the items next to each other are greater on the left hand side and lower on the right hand side. then the new array is returned.

    public Player[] sort(){
//        Player maxValue = new Player();
//        int maxSeason = 0;
        Player season;
        Player otherValue;
        Player[] newList = new Player[Team.length];
        for(int i = 0; i < Team.length; i++){
            newList[i] = Team[i];
        }
        // if(newList[i].minutes_played < newList[i+1].minutes_played){
        //     season = newList[i+1].minutes_played;
        //     newList[i+1].minutes_played = newList[i].minutes_played;
        //     newList[i].minutes_played = season;
        // }
        for(int x = 0; x < newList.length -1; x++){
            for(int j = 0; j < newList.length-x-1; j++){
                if(newList[j].getMinutes() < newList[j+1].getMinutes()){
                    season = newList[j+1];
//                    otherValue = newList[j];
                    newList[j+1] = newList[j];
                    newList[j] = season;

                }

            }

        }

        return newList;
    }

    //onTeam is a method that checks if some player is on the team by seeing if their name is on the list by using getName function of every element in the list and seeing if it matches the name passed as a parameter.

    public boolean onTeam(String nameSeason){
        boolean sense = false;
        for(int i = 0; i < Team.length; i++){
            if(Team[i].getName().equals(nameSeason)) {
                sense = true;
            }
            //return true;}
//            } else{
//                sense = false;
//               // return false;
//            }
        }

        return sense;
    }


    //mostGoals checks for the player that scored the most goals on the team. we want to return the player that scored the most goals by checking every element, seeing which element equals the maximum number of goals by using getGoals(), and then returning that player variable.
    public Player mostGoals(){
        int goals = 0;
        Player newPlayer = null;
        int playerChoiceGoals = 0;
        for(int i = 0; i < Team.length; i++){
            playerChoiceGoals = Team[i].getGoals();
            if(playerChoiceGoals > goals){
                goals = playerChoiceGoals;
            }
            if(Team[i].getGoals() == goals){
                newPlayer = Team[i];
            }
        }

        return newPlayer;
    }

    // equals function -- checks to see if 2 team lists are the same regardless of player order. this is checked by checking to see the player names on both lists and seeing if they ALL match. that would then return a true which would indicate that the two lists are the same.

    public boolean equals(Player[] thuggers){
        int counter = 0;

//        for(int i = 0; i < Team.length; i++){
//            if(thuggers[i].name.equals(Team[i].name)){
//
//                //players dont have to be in the same order - we need to change the conditional reqs inside the for loop.
//                counter++;
//            }
//        }

        for(Player player : Team){
            System.out.println(player.getName());
            for(int x = 0; x < thuggers.length; x++){
                if(thuggers[x].getName().equalsIgnoreCase(player.getName())){
                    counter++;
                }
            }

        }

        if (counter == Team.length){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }

    }

}
