import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<TeamMember> members;

    public Team(String name) {
        this.name = name;
        members = new ArrayList<>();
        members.add(new TeamMember("member1", 2));
        members.add(new TeamMember("member2", 3));
        members.add(new TeamMember("member3", 4));
        members.add(new TeamMember("member4", 4));
    }

    public void PrintSuccessMembers() {
        members.stream().filter(TeamMember::isPassDistance).forEach(TeamMember::PrintInfo);
    }

    public void PrintAllMembers() {
        members.forEach(TeamMember::PrintInfo);
    }

    public List<TeamMember> getMembers() {
        return members;
    }

    public void setMembers(List<TeamMember> members) {
        this.members = members;
    }
}
