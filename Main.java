public class Main{
    public static void main(String[] args) {
        Market first = new MarketBehaviour();
        Market second = new MarketBehaviour();

        System.out.println("Queue check before push");
        //push
        first.getPeopleInQueue();
        ((MarketBehaviour) first).push();
        System.out.println("Queue check after push to 1st");
        first.getPeopleInQueue();
        ((MarketBehaviour) second).push();
        System.out.println("Queue check after push to 2st");
        second.getPeopleInQueue();

        System.out.println("------------------------------------");
        System.out.println("Queue check before pop");
        //pop
        ((MarketBehaviour) first).pop();
        System.out.println("Queue check after pop to 1st");
        first.getPeopleInQueue();
        ((MarketBehaviour) second).pop();
        System.out.println("Queue check after push to 2st");
        second.getPeopleInQueue();
    }
}