import java.util.LinkedList;
public class AddressBook {
    LinkedList<BuddyInfo> collection = new LinkedList<>();

    public void addBuddy(BuddyInfo buddy){
        collection.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        collection.remove(buddy);
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook book = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Tom", "Carleton", 613);
        book.addBuddy(buddy1);
        book.removeBuddy(buddy1);
        // test comment for git
    }
}
