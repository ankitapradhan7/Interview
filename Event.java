import java.util.*;
public class Event {
    private int eventId;
    private String eventName;
    private Date currentDate;
    private String prize;
    public Event(int eventId, String eventName, Date currenDate, String prize)
    {
        this.eventId = eventId;
        this.eventName = eventName;
        this.currentDate = currenDate;
        this.prize = prize;
    }
    public int getEventId(){
        return eventId;
    }
    public String getEventName(){
        return eventName;
    }
    public String getPrize(){
        return prize;
    }
    public Date getDate(){
        return currentDate;
    }
}
