enum  Category{
    BUG, BIRD, AQUATIC, MAMMAL, ECTOTHERM, OTHER
}

enum  Diet{
    HERBIVORE, CARNIVORE, OMNIVORE
}

public class Animal {
    private int id;
    private String name;
    private String species;
    private Category category;
    private Diet diet;
    private int cost;

    public Animal(int id, String name, String species, Category category, Diet diet, int cost){// Animal constructor 
        this.id = id;
        this.name = name;
        this.species = species;
        this.category = category;
        this.diet = diet;
        this.cost = cost;
        }

    public String nickname(){ //returns nickname (ex: Herky the Hornet)
            return name + " the " + species;
        }

    public String description(){ //returns Description (ex:The lion named Jake is a MAMMAL whose CARNIVORE diet costs $273 dollars a month.)
            return "The " + species.toLowerCase() + " named " + name + " is a " + category + " whose " + diet + " diet costs $" + cost + " dollars a month.";
        }
}
