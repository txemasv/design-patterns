package structural.facade;

public class CharacterService {

    public Character createCharacter(String type, int resource) {
        switch (type) {
            case "Druid":
                return new Druid(resource);
            case "Fairy":
                return new Fairy(resource);
            case "Warrior":
                return new Warrior(resource);
            default:
                throw new RuntimeException("Character type does not exist");
        }
    }

    public void transfer(Character donor, Character receiver, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        if (donor.down(quantity)) {
            receiver.up(quantity);
        } else {
            throw new RuntimeException("donor have not enough resources to give " + quantity);
        }
    }
}
