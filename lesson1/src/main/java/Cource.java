import java.util.ArrayList;
import java.util.List;

public class Cource {
    private List<CourseItem> items;

    public Cource() {
        items = new ArrayList<>();
        items.add(new CourseItem("Block1", 1));
        items.add(new CourseItem("Block2", 2));
        items.add(new CourseItem("Block3", 3));
        items.add(new CourseItem("Block4", 4));
    }

    public void TakeTeam(Team team) {
        for (var member : team.getMembers()) {
            var skill = member.getSkill();
            boolean canPass = true;
            for (var item : items) {
                if (item.getSkillToPass() > skill) {
                    canPass = false;
                    break;
                }
            }
            if(canPass)
                member.setPassDistance(true);
        }
    }

    public List<CourseItem> getItems() {
        return items;
    }

    public void setItems(List<CourseItem> items) {
        this.items = items;
    }
}
