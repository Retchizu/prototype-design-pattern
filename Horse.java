public class Horse implements Animal{
    private Integer legs;
    private String sounds;
    private String food;
    private String color;

    public Horse(Integer legs, String sounds, String food, String color) {
        this.legs = legs;
        this.sounds = sounds;
        this.food = food;
        this.color = color;
    }

    public Horse(Horse horse) {
        this.legs = horse.legs;
        this.sounds = horse.sounds;
        this.food = horse.food;
        this.color = horse.color;
    }


    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSounds() {
        return sounds;
    }

    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    public String getfood() {
        return food;
    }

    public void setfood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Neigghh!");
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public Animal animalClone() {
        return new Horse(this);
    }

    
}
