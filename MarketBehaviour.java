public class MarketBehaviour extends Market implements QueueBehavior {
    // помещает и удаляет человека из очереди
    public void push(){
        peopleInQueue++;
    }
    public void pop(){
        peopleInQueue--;
    }
}
