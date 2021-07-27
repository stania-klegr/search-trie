import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Node {
    int id = -1;

    // SongItem item = null;
    ArrayList<String> songs = new ArrayList<String>();


    Node[] children = new Node[37];


    public Node(int id) {
        this.id = id;//not needed just for testing
    }

    public String toString() {

        String out = "";

        for (String s : songs) {
            out = out + s + ", ";
        }

        return "id is: " + id + "\tsong is: " + out;
    }
}
