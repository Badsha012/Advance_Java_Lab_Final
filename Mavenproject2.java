abstract class FootballPlayer {
    String name;

    FootballPlayer(String name) {
        this.name = name;
    }

    abstract void showLeague();
}

class LaLigaPlayer extends FootballPlayer {
    LaLigaPlayer(String name) {
        super(name);
    }

    @Override
    void showLeague() {
        System.out.println(name + " plays in La Liga");
    }
}

class PremierLeaguePlayer extends FootballPlayer {
    PremierLeaguePlayer(String name) {
        super(name);
    }

    @Override
    void showLeague() {
        System.out.println(name + " plays in Premier League");
    }
}

public class Mavenproject2 {
    public static void main(String[] args) {
        // মেসি লা লিগা প্লেয়ার
        LaLigaPlayer messi = new LaLigaPlayer("Messi");
        // রনালদো প্রিমিয়ার লিগ প্লেয়ার
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo");
        
        messi.showLeague();
        ronaldo.showLeague();
    }
}