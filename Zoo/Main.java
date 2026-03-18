public class Main{
    public static void main(String[] args){

        Zoo zoo = new Zoo();

        Animal a1  = new Animal(1,"Frijol","Dog",Category.MAMMAL,Diet.OMNIVORE,95);
        Animal a2  = new Animal(2,"Tim","Clownfish",Category.AQUATIC,Diet.OMNIVORE,63);
        Animal a3  = new Animal(3,"Michael","Penguin",Category.BIRD, Diet.CARNIVORE,184);
        Animal a4  = new Animal(4,"Jake","Lion",Category.MAMMAL,Diet.CARNIVORE,273);
        Animal a5  = new Animal(5,"Robert","Giraffe",Category.MAMMAL,Diet.HERBIVORE,384);
        Animal a6  = new Animal(6,"Herky","Hornet",Category.BUG,Diet.HERBIVORE,163);
        Animal a7  = new Animal(7,"Lizzo","Lizard",Category.ECTOTHERM,Diet.CARNIVORE,223);
        Animal a8  = new Animal(8,"Ruben","Chimpanzee",Category.MAMMAL,Diet.OMNIVORE,190);
        Animal a9  = new Animal(9,"Hank","Unicorn",Category.OTHER,Diet.HERBIVORE,2304);
        Animal a10 = new Animal(10,"Hector","Elephant",Category.MAMMAL,Diet.HERBIVORE,260);

        zoo.add(a2);
        zoo.add(a3);
        zoo.add(a4);
        zoo.add(a5);
        zoo.add(a6);
        zoo.add(a7);
        zoo.add(a8);
        zoo.add(a9);
        zoo.add(a10);
        zoo.add(a1);

        System.out.println("Zoo List:\n" + zoo.ToList());
        System.out.println("Feeding Queue:");
        zoo.startFeeding();
        while(!zoo.doneFeeding()){
            Animal result = zoo.feedNext();
            System.out.println("Removed Head: " + result.description() + "\n");
        }
        System.out.println("Feeding Is Done!");
        
        System.out.println("Mammal Feeding Queue:");
        zoo.startFeeding(Category.MAMMAL);
        while(!zoo.doneFeeding()){
            Animal result = zoo.feedNext();
            System.out.println("Removed Head: " + result.description() + "\n");
        }
        System.out.println("Feeding Is Done For The Mammals!");
    }
}