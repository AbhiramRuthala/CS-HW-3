// Name: Abhiram Ruthala
// Computing ID: kas4kj
// HW 3 - Soccer
// Resources used: https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb, https://www.geeksforgeeks.org/dsa/sorting-algorithms/, ChatGPT 4 for Debugging, Claude Sonnet 4 for Debugging

public class Team {

    private Player[] Team;

    public Team(Player[] team){
        Player[] FC = new Player[team.length];
        FC.getClass().getName();

        for(int i = 0; i < team.length; i++){
            FC[i] = team[i];

            
            

        }

            if(FC[0] == team[0]){
                this.Team = FC;
            } else {
                this.Team = team.clone();
            }
                
        

//        if(team == null){
//            this.Team = new Player[0];
//        } else {
//            this.Team = team.clone();
//        }

    }

    public Player[] getTeam() {
        return Team.clone();
    }

    public void setTeam(Player[] team) {
        //deep copy
        Player[] FC = new Player[team.length];

        for(int i = 0; i < team.length; i++){
            FC[i] = Team[i];

        }
        this.Team = FC;

        //this.Team = team;
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
            str = Team[i].getName() + Team[i].getPosition() + Team[i].getMinutes() + Team[i].getAssists() + Team[i].getGoals() + Team[i].getSOG();
            //return Team[i].name + Team[i].position + Team[i].minutes_played + Team[i].assists + Team[i].goals + Team[i].sog_percentage;
        }

        return str;
    }

    public double SOGAverage(){
        double numerator = 0;
        for(int i = 0; i < Team.length; i++){
            numerator += Team[i].getSOG();
        }

        return numerator/Team.length;
    }

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
