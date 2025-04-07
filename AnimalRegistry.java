public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Dolly");
        cowPrototype = new Cow(4, "Moo", "Grass");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Brown");
    }


    public Animal createSheep(String name) {
        Sheep sheep = (Sheep)sheepPrototype.animalClone();
        sheep.setName(name);
        return sheep;
    }

    public Animal createCow() {
        Cow cow = (Cow)cowPrototype.animalClone();
        return cow;
    }

    public Animal createHorse() {
        Horse horse = (Horse)horsePrototype.animalClone();
        return horse;
    }
}
