package domain.model.champion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Lelental on 07.02.2017
 */
@Component
public class Champion implements IHaveSkill {

    private String name;
    private String info;
    private Role role;
    private Position position;
    private AttributesOfChampion attributesOfChampion;


    public Champion() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Role getRole() {
        return role;
    }
    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    public Position getPosition() {
        return position;
    }
    @Autowired
    public void setPosition(Position position) {
        this.position = position;
    }

    public AttributesOfChampion getAttributesOfChampion() {
        return attributesOfChampion;
    }

    @Autowired
    public void setAttributesOfChampion(AttributesOfChampion attributesOfChampion) {
        this.attributesOfChampion = attributesOfChampion;
    }
    @Autowired
    public Skill passiveSkill(String skillName, String description) {
        return new Skill(skillName, description);
    }

    @Autowired
    public ActiveSkill firstActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }
    @Autowired
    public ActiveSkill secondActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }@Autowired

    public ActiveSkill thirdActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }
    @Autowired
    public ActiveSkill ultimateSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }

}
