public class Horse implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse(Integer legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    public Horse(Horse horse) {
        this.legs = horse.legs;
        this.sound = horse.sound;
        this.food = horse.food;
        this.color = horse.color;
    }


    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getsound() {
        return sound;
    }

    public void setsound(String sound) {
        this.sound = sound;
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
        System.out.println(this.sound);
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
