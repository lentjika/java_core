public class TeamMember {
    private String name;
    private boolean isPassDistance;
    private int skill;

    public TeamMember(String name, int skill) {
        this.name = name;
        this.skill = skill;
        this.isPassDistance = false;
    }

    public void PrintInfo() {
        if (isPassDistance)
            System.out.println("Team member " + name + " pass distance successfully");
        else
            System.out.println("Team member " + name + " didn't pass distance");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPassDistance() {
        return isPassDistance;
    }

    public void setPassDistance(boolean passDistance) {
        isPassDistance = passDistance;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
