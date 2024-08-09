import java.util.List;

public class Arquero extends Heroe {

    public Arquero(String name, int exp, int level, List<String> skills, int skillExp){
        super(name, exp, level, skills, skillExp);
    }
    @Override
    public Arquero clone(){
        return new Arquero(getName(), getExp(), getLevel(), getSkills(),  getSkillExp());
    }

}
