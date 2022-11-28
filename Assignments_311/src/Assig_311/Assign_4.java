package Assig_311;

abstract class Player
{
    String name;
    int matchesPlayed;
    int runsScored;

    Player(String name, int matchesPlayed, int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    
    
    void bat()
    {
    }

    void makeSomeRuns()
    {
    }

    void print()
    {
        System.out.print("Name:"+name  + "\n No.of Matches Played:" + matchesPlayed + "\n No.of Runs Scored:" + runsScored + ".");
    }
}

class Batsmen extends Player
{
    int numberOfCenturies;
    int numberOfHalfCenturies;

    Batsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
    }

    void openInnings()
    {
    }

    void makeCentury()
    {
    }
    
    void makeHalfCentury()
    {
    }

    void print()
    {    
        super.print();
        System.out.print("\n No of centuries:" + numberOfCenturies +  "\n No.of Half Centuries: " + numberOfHalfCenturies + ".");
    }
}


class Bowler extends Player
{
    int numberOfWickets;
    int numberOf5WicketInnings;
    
    Bowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfWickets= numberOfWickets;
        this.numberOf5WicketInnings = numberOf5WicketInnings;
    }

    void openInnings()
    {
    }

    void bowlYorkers()
    {
    }
    
    void takeWickets()
    {
    }

    void print()
    {    
        super.print();
        System.out.print("\n No.of Wickets: " + numberOfWickets + "\n numberOf5WicketInnings:" + numberOf5WicketInnings + " .");
    }

}

class WicketKeeper extends Player
{
    int numberOfCatches;
    int numberOfStumpings;
    
    WicketKeeper(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

    void keepWickets()
    {
    }
    
    void stumpBatsmen()
    {
    }
    
    void makeAppeals()
    {
    }

    void print()
    {    
        super.print();
        System.out.print("\n No.of Catches: " + numberOfCatches + " \n No.of Stumpings " + numberOfStumpings + ".");
    }
}

class Assign_4
{
    public static void main(String arg[])
    {
        Player players[] = new Player[11];
        
        players[0] = new Batsmen("Virat", 250, 11324, 100, 125);
        players[1] = new WicketKeeper("Dhoni", 153, 6021, 120, 67);
        players[2] = new Batsmen("KL Rahul", 110, 4341, 22, 40);
        players[3] = new Batsmen("Rishab Pant", 105, 6533, 15, 46);
        players[4] = new Batsmen("Dinesh Karthik", 75, 4003, 25, 60);
        players[5] = new Batsmen("Hardik Pandya", 34, 2600, 12, 19);
        players[6] = new Batsmen("Rohit", 205, 10560, 71, 90);
        players[7] = new Bowler("Harbhajan", 189, 1500, 320, 4);
        players[8] = new Bowler("bumrah", 150, 900, 220, 4);
        players[9] = new Bowler("Umesh", 25, 150, 105, 2);
        players[10] = new Bowler("CHahal", 15, 200, 60, 2);
        
        for(Player player : players)
        {
            player.print();
            System.out.println();
            System.out.println("\n_________________________________________\n");
        
        }    
    }
}
