import java.util.LinkedList;
public class AddressBook {
    LinkedList<BuddyInfo> collection = new LinkedList<>();
    BuddyInfo buddy1 = new BuddyInfo();
    BuddyInfo buddy2 = new BuddyInfo();
    BuddyInfo buddy3 = new BuddyInfo();

    private void addBuddy(BuddyInfo buddy){
        collection.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy){
        collection.remove(buddy);
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
