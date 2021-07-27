import java.util.List;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {

        // Node node = new Node();
        Trie trie = new Trie();

        // SongItem song = new SongItem("bob");

        System.out.println("made it");

        trie.addString("stania", "stania");
        trie.addString("seeve", "seeve");
        trie.addString("s teeve", "s teeve");
        trie.addString("steeve", "steeve");
        trie.addString("9zbobbzzz", "9zbobbzzz");
        trie.addString("z bob bzzz190", "z bob bzzz190");


        // char c = 's';

        // System.out.println((int)c - 96);
        // System.out.println((char)(1 + 96));
        ArrayList<Node> nodes = trie.getChildNodes();

        System.out.println(nodes.size());

        for(Node n : nodes){

            // System.out.println("looping");
            System.out.println(n);
        }

        nodes = trie.search("st");

        System.out.println(nodes.size());

        System.out.println("results");
        for(Node n : nodes){

            System.out.println(n);
        }

        System.out.println(trie.getIndex('a'));
        System.out.println(trie.getIndex('b'));
        System.out.println(trie.getIndex('y'));
        System.out.println(trie.getIndex('z'));
        System.out.println(trie.getIndex(' '));
        System.out.println(trie.getIndex('0'));
        System.out.println(trie.getIndex('1'));
        System.out.println(trie.getIndex('2'));
        System.out.println(trie.getIndex('8'));
        System.out.println(trie.getIndex('9'));


    }
}
