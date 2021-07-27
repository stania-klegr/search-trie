import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Trie {

	private Node root;

    public Trie() {
        root = new Node(-1);
    }


    public boolean addString(String s, String song){//TODO songhitem could just end up as in entry in a hash table, making duplicates easier

        Node current = root;

        //loop for each char in the string
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            int index = getIndex(c);

            if(current.children[index] != null){

                // System.out.println("not null");
                current = current.children[index];
            }
            else
            {
                // System.out.println("null");

                current.children[index] = new Node(index);
                current = current.children[index];
            }
        }

        //if is new/song dosen't already exist
        current.songs.add(song);//TODO is an arraylist actually needed???
        return true;
        //else deal with it somehow
    }

    public ArrayList<Node> search(String s){

        Node current = root;

        //loop for each char in the string
        int i = 0;

        while(i < s.length()){
            char c = s.charAt(i);

            int index = getIndex(c);

            if(current.children[index] != null){

                // System.out.println("not null");
                current = current.children[index];
            }
            else {
                break;
            }

            i++;
        }
        if(i == s.length())
            return getChildNodes(current);
        return new ArrayList<Node>();
    }


    ////////////////////////////////////////////////////////////////////////////
    ArrayList<Node> nodes = new ArrayList<Node>();

    public ArrayList<Node> getChildNodes(Node node){
        nodes.clear();
        getChildNodesInner(node);
        return nodes;
    }

    public ArrayList<Node> getChildNodes(){

        getChildNodes(root);
        return nodes;
    }

    public void getChildNodesInner(Node node){
        if(node != null){

            if(!node.songs.isEmpty())
                nodes.add(node);

            for(Node n : node.children){
                getChildNodesInner(n);
            }
        }
    }


    public int getIndex(char c){

        int x = (int)c - 97;

        if(x >= 0 && x <= 26)
            return x;

        //else
        if(c == ' ')//if space
            return 26;

        return Character.getNumericValue(c) + 27;

    }
}
