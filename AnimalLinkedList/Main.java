public class Main{
    public static void main(String[] args){

        LinkedList zoo = new LinkedList();

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

        zoo.AddTail(a2);
        zoo.AddTail(a3);
        zoo.AddTail(a4);
        zoo.AddTail(a5);
        zoo.AddTail(a6);
        zoo.AddTail(a7);
        zoo.AddTail(a8);
        zoo.AddTail(a9);
        zoo.AddTail(a10);
        zoo.AddHead(a1);

        System.out.println("Zoo List:\n" + zoo.ToList());

        Animal result = zoo.RemoveHead();
        System.out.println("Removed Head: " + result.description());
        System.out.println("New Version of ZooList: ");
        System.out.println(zoo.ToList());

    }
}