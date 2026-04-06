package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("paint", 60);
        myHashTable.set("bolts", 200);

        
        System.out.println(myHashTable.keys());

        // System.out.println(myHashTable.get("tile"));
        // System.out.println(myHashTable.get("bolts"));

    
        // myHashTable.printTable();
    }
}
