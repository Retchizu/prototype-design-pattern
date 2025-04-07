class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Kevin");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        sheep1.makeSound();
        cow1.makeSound();
        horse1.makeSound();

        System.out.println(sheep1.getType());
        System.out.println(cow1.getType());
        System.out.println(horse1.getType());
    }
}