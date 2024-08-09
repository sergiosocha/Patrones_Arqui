import java.util.ArrayList;
import java.util.List;

public class Heroe implements HeroePrototipo{

    private String name;
    private int exp;
    private int level;
    private List<String> skills;
    private int skillExp;

    public Heroe(String name, int exp, int level, List<String> skills, int skillExp){
        this.name = name;
        this.exp = exp;
        this.level = level;
        this.skills = new ArrayList<>(skills);
        this.skillExp = skillExp;
    }

    public Heroe clone(){
        return new Heroe(name, exp, level, skills, skillExp);
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public List<String> getSkills() {
        return skills;
    }

    public int getSkillExp() {
        return skillExp;
    }


}
