// Name: Abhiram Ruthala
// Computing Id:kas4kj
// HW 3 - Soccer
// Resources used: https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb, https://www.geeksforgeeks.org/dsa/sorting-algorithms/

public class Team {

    Player[] Team;

    public Team(Player[] DallasMavs){
        this.Team = DallasMavs;

    }

    public Player[] getTeam() {
        return Team;
    }
    public void setTeam(Player[] Team) {
        this.Team = Team;
    }

    //equals method
    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < Team.length; i++){
            str = Team[i].name + Team[i].position + Team[i].minutes_played + Team[i].assists + Team[i].goals + Team[i].sog_percentage;
            //return Team[i].name + Team[i].position + Team[i].minutes_played + Team[i].assists + Team[i].goals + Team[i].sog_percentage;
        }

        return str;
    }

    public double SOGAverage(){
        double numerator = 0;
        for(int i = 0; i < Team.length; i++){
            numerator += Team[i].sog_percentage;
        }

        return numerator/Team.length;
    }

    public int positionCount(String positionValue){
        int counter = 0;
        for(int i = 0; i < Team.length; i++){
            if(Team[i].position.equals(positionValue)){
                counter++;
            } else {
                counter = 0;
            }
        }

        return counter;
    }

    public Player[] sort(){
        Player[] newList = new Player[Team.length];
        for(int i = 0; i < Team.length-1; i++){
            if(Team[i].minutes_played > Team[i+1].minutes_played){
                newList[0] = Team[i];
            }
        }

        return newList;

    }

    public Player[] sortByMinutes(){
//        Player maxValue = new Player();
//        int maxSeason = 0;
        int season = 0;
        Player[] newList = Team;
        for(int i = 0; i < Team.length-1; i++){
            if(newList[i].minutes_played < newList[i+1].minutes_played){
                season = newList[i+1].minutes_played;
                newList[i+1].minutes_played = newList[i].minutes_played;
                newList[i].minutes_played = season;
            }
            for(int j = 0; j < Team.length-1; j++){
                if(newList[j].minutes_played < newList[j+1].minutes_played){
                    int newseason = newList[j+1].minutes_played;
                    newList[j+1].minutes_played = newList[j].minutes_played;
                    newList[j].minutes_played = newseason;
                }
                for(int k = 0; k < Team.length-1; k++){
                    if(newList[k].minutes_played < newList[k+1].minutes_played){
                        season = newList[k+1].minutes_played;
                        newList[k+1].minutes_played = newList[k].minutes_played;
                        newList[k].minutes_played = season;
                    }

                }

            }

        }

//        newList[0] = maxValue;

        return newList;
    }

    public boolean onTeam(String nameSeason){
        boolean sense = false;
        for(int i = 0; i < Team.length; i++){
            if(Team[i].name.equals(nameSeason)){
                sense = true;
                //return true;
            } else{
                sense = false;
               // return false;
            }
        }

        return sense;
    }

    public Player mostGoals(){
        int goals = 0;
        Player newPlayer = null;
        int playerChoiceGoals = 0;
        for(int i = 0; i < Team.length; i++){
            playerChoiceGoals = Team[i].goals;
            if(playerChoiceGoals > goals){
                goals = playerChoiceGoals;
            }
            if(Team[i].goals == goals){
                newPlayer = Team[i];
            }
        }

        return newPlayer;
    }

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
            System.out.println(player.name);
            for(int x = 0; x < thuggers.length; x++){
                if(thuggers[x].getName().contains(player.name)){
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
