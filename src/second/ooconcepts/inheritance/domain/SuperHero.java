package second.ooconcepts.inheritance.domain;

import java.util.Objects;

public class SuperHero {

    private String name;
    private int age;
    private String ability;
    private String nickName;
    private int strength;

    public SuperHero(String name, int age, String ability, String nickName, int strength) {
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.nickName = nickName;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SuperHero superHero = (SuperHero) o;
        return age == superHero.age && strength == superHero.strength && Objects.equals(name, superHero.name) && Objects.equals(ability,
                superHero.ability) && Objects.equals(nickName, superHero.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ability, nickName, strength);
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ability='" + ability + '\'' +
                ", nickName='" + nickName + '\'' +
                ", strength=" + strength +
                '}';
    }
}
