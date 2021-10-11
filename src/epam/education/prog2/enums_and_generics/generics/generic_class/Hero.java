package epam.education.prog2.enums_and_generics.generics.generic_class;

import java.util.Objects;

/**
 * TODO docme.
 */
public class Hero {

    private String name;
    private String nickname;
    private String civilName;
    private int powerLevel;

    public Hero(String name, String nickname, String civilName, int powerLevel) {
        this.name = name;
        this.nickname = nickname;
        this.civilName = civilName;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCivilName() {
        return civilName;
    }

    public void setCivilName(String civilName) {
        this.civilName = civilName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Hero hero = (Hero) o;
        return powerLevel == hero.powerLevel && Objects.equals(name, hero.name) && Objects.equals(nickname, hero.nickname) && Objects.equals(civilName,
                hero.civilName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname, civilName, powerLevel);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", civilName='" + civilName + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
