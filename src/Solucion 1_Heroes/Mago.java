import java.util.List;

public class Mago  extends Heroe {

    public Mago(String name, int exp, int level, List<String> skills, int skillExp){
        super(name, exp, level, skills, skillExp);
    }
    @Override
    public Mago clone(){
        return new Mago(getName(), getExp(), getLevel(), getSkills(),  getSkillExp());
    }

}
