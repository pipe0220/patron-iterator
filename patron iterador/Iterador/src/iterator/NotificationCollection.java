package iterator;


public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationsList;

    public NotificationCollection() {
        notificationsList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Full");
        } else {
            notificationsList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator(){
        return new NotificationIterator(notificationsList);
    }

}
