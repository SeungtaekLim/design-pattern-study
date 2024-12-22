public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        warrior.attack();

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        mage.attack();
    }
}
