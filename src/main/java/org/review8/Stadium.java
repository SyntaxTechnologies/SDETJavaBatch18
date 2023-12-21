package org.review8;

public class Stadium {

    public static void main(String[] args) {

        Sport sport=new Sport("Soccer", "Man City");
        System.out.println(sport.type +" and team name is "+sport.teamName);
        System.out.println(sport.numberOfPlayers);

        Sport sport1=new Sport("Basketball", "Chicago Bulls", 15, "Chicago", "Billy Donovan");
    }
}
