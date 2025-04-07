public class Sheep implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String name;
    public Sheep (Integer legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }
    public Sheep (Sheep sheep) {
        this.legs = sheep.legs;
        this.sound = sheep.sound;
        this.food = sheep.food;
        this.name = sheep.name;
    }
    public Integer getLegs() {
        return legs;
    }
    public void setLegs(Integer legs) {
        this.legs = legs;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }
    @Override
    public String getType() {
        return "Sheep";
    }
    @Override
    public Animal animalClone() {
        return new Sheep(this);
    }

    
}
