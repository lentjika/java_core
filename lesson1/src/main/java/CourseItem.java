public class CourseItem {
    private String name;
    private int skillToPass;

    public CourseItem(String name, int skillToPass) {
        this.name = name;
        this.skillToPass = skillToPass;
    }

    public int getSkillToPass() {
        return skillToPass;
    }

    public void setSkillToPass(int skillToPass) {
        this.skillToPass = skillToPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
