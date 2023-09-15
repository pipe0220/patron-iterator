package iterator;

public class NotificationIterator implements Iterator {
    Notification [] notificationsList;
    int pos = 0;

    public NotificationIterator(Notification[] notificationsList){
        this.notificationsList = notificationsList;
    }

    public Object next() {
        Notification notification = notificationsList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext(){
        if (pos >= notificationsList.length || notificationsList[pos] == null){
            return false;
        }else {
            return true;
        }
    }
    
}
