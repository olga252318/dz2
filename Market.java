import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> queue;
    
    
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        return;
    }

    @Override
    public void takeOrders() {
        super.isMakeOrder = makeOrder;

        }
    

    @Override
    public void giveOrders() {
        super.isTakeOrder = takeOrders;
    }

    @Override
    public void releaseFromQueue() {
        final List<Actor> queue = new List<Actor> queue {
            isTakeOrder();
        };
    }

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        
    }

    @Override
    public void uptade() {
       boolean isTakeOrder();
       boolean isMakeOrder();

    }

}
