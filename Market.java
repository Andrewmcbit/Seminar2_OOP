public class Market{
    //реализовать класс и все методы которые он должен реализовывать
    static Integer peopleInQueue = 0;

    public Market(){}
    
    public void getPeopleInQueue(){
        System.out.println("People in queue: " + peopleInQueue);
    }

    @Override
    public String toString(){
        return String.format("People in queue: %d", peopleInQueue);
    }
}  