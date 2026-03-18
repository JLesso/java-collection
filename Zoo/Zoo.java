public class Zoo {
    private LinkedList animals;
    private LinkedList feedingQueue;
    public Zoo(){
        animals = new LinkedList();
        feedingQueue = null;
    }
    public void add(Animal an){
        animals.AddTail(an);
    }
    public String ToList(){
        return animals.ToList();
    }
    public void startFeeding(){
        feedingQueue = animals.duplicate();
    }
    public void startFeeding(Category cat){
        feedingQueue = animals.duplicate(cat);
    }
    public Animal feedNext(){

        if(feedingQueue != null){
            return feedingQueue.RemoveHead();
        }
        return null;
    }
    public boolean doneFeeding(){
        if(feedingQueue == null){
            return true;
        }
        return feedingQueue.IsEmpty();
    }
}
