public class Main {
    public static void main(String[] args) {

        Team team1 = new Team("Team1");
        Cource c = new Cource();
        c.TakeTeam(team1);
        System.out.println("----------show success members----------");
        team1.PrintSuccessMembers();
        System.out.println("----------show all members----------");
        team1.PrintAllMembers();
    }
}
