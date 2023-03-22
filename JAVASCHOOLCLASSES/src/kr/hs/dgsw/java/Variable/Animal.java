package kr.hs.dgsw.java.Variable;

public class Animal {
    String name;
    String kind;
    String food;
    int lifespan;
    String habitat;
    String color;
    String Characteristics;
    boolean aggression;
    boolean endangered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String isFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCharacteristics() {
        return Characteristics;
    }

    public void setCharacteristics(String characteristics) {
        Characteristics = characteristics;
    }

    public boolean isAggression() {
        return aggression;
    }

    public void setAggression(boolean aggression) {
        this.aggression = aggression;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }
}