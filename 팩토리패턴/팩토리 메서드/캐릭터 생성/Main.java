public class Main {
    public static void main(String[] args) {
        CharacterCreator warriorCreator = new WarriorCreator();
        Character warrior = warriorCreator.createCharacter();
        warrior.attack();

        CharacterCreator mageCreator = new MageCreator();
        Character mage = mageCreator.createCharacter();
        mage.attack();
    }
}
