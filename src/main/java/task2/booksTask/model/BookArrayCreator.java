package task2.booksTask.model;

import java.util.Random;

public class BookArrayCreator {
    private final static String[] TITLES = {"Storm's Day", "Apprentice Lucky", "The Grandfather Tree", "Realms of Survival", "The Grandfather", "Tree", "The Ruthless Detail", "The Weight of the King", "A Prince's Paradise", "The Dweller in the Shadow", "Biography: Kamal Howe", "The Master of the Heron", "The Pirate and the Deed", "The Crimes of Legend", "Shy Masque", "A Remembrance for Heartache", "Fog for a Lifetime", "The Cat of Jericho", "Shadow and Breakfast", "The Mountain Variations", "A Practical Engagement", "The Devil in the Passage", "An Extraordinary Thief", "Answer with Fire", "The Lucky Failure", "The Mark of the House", "Island in the Light", "The Vagabond Armor", "Safe in Maternity", "Body of Thought", "The Princess of Passage", "Century's Downfall", "The Minister's Hoard", "The Fortunes of Valhalla", "Druid's Knock", "Rumpole Pretence", "Ghosts of Silence", "Planets of Yesterday", "The Babe and the Jewel", "A Captain's Tale", "The Melting Cabal", "Tangled Kindness", "The Firefighter's Quadrille", "Matters of the Titanic", "The Rule of the Circle", "Captives of the Shaman", "Model Mass", "The Dirty Temptation", "Heartbreak and Martyr", "Prescription for Piano"};
    private final static String[] AUTHORS = {"Hania Meza", "Jazmine Mclellan", "Kathryn Kirk", "Ailish Franks", "Clementine Heaton", "Liam Mccormack", "Johanna Bowden", "Mitchell Hood", "Mitchel Phelps", "Alfie-James Padilla", "Khalid Bradshaw", "Eoin Wolf", "Arfa Chamberlain", "Steven Choi", "Casper Bean", "Lilith Roth", "Izabel Day", "Laylah Flower", "Roseanne Reid", "Felicia Schmitt"};
    private final static String[] PUBLISHERS = {"Yap Reading", "Interactive Library", "Libraryify", "Genrepad", "Noveldo", "Urban Story", "Absolute Reading", "Libraryvio"};

    private Book generateBookObject() {
        Random random = new Random();
        return new Book(TITLES[random.nextInt(50)],
                AUTHORS[random.nextInt(20)],
                PUBLISHERS[random.nextInt(8)],
                random.nextInt(100) + 1920,
                random.nextInt(1000) + 1,
                random.nextDouble() * 100);
    }

    public Book[] createSetOfBooks() {
        Random random = new Random();
        Book[] books = new Book[random.nextInt(20) + 10];
        for (int i = 0; i < books.length; i++) {
            books[i] = generateBookObject();
        }
        return books;
    }

}
