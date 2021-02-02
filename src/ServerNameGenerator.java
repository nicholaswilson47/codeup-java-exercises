public class ServerNameGenerator {
    String[] nouns = {"apple", "camera", "waterbottle", "microphone", "window", "soylent", "ledlight", "ember", "billyclub", "lightsaber"};

    String[] adjectives = {"big", "small", "red", "blue", "fat", "skinny", "tall", "short", "gnarly", "cool"};

    public static void main(String[] words) {
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(words.length);
        int nounInt = randomizer.nextInt(10);

    }
}
