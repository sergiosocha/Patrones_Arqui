import java.util.List;

public class Guerrero extends Heroe {
    public Guerrero(String name, int exp, int level, List<String> skills, int skillExp){
        super(name, exp, level, skills, skillExp);
    }
    @Override
    public Guerrero clone(){
        return new Guerrero(getName(), getExp(), getLevel(), getSkills(),  getSkillExp());
    }

}
