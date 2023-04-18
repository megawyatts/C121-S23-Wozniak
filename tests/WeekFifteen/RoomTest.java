package WeekFifteen;

import static org.junit.Assert.*;
public class RoomTest {
    private Room hall=new Room("Hall");
    public void getName(){
        assertEquals("Hall",hall.getName());
    }
}