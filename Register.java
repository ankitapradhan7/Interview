import java.util.Arrays;
public class Register {
    String memberName;
    String eventName;
    int memberId;
    int eventId;
    int[] bids = new int[5];
    int availableCoin;
    public Register(Member member, Event event)
    {
        this.memberId = member.getMemberId();
        this.eventId = event.getEventId();
        this.availableCoin = member.getSuperCoin();
    }
    public void submitBid(int mId, int eId, int b1, int b2, int b3, int b4, int b5)
    {
        bids[0] = b1;
        bids[1] = b2;
        bids[2] = b3;
        bids[3] = b4;
        bids[4] = b5;
        Arrays.sort(bids);
        if(this.memberId == mId && this.availableCoin >= bids[4]){
            this.availableCoin -= bids[4];
            System.out.println("BIDS submitted successfully"); 
        }
        else{
            System.out.println("member " + mId + "not registered!");
        }
    }
}
