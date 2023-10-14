class WordDictionary {

    Node root;

    public WordDictionary() {
        root = new Node("");
    }
    
    public void addWord(String word) {
        Node current = this.root;
        for(String character : word.split("")){
            if(current.children.isEmpty()) {
                Node newNode = new Node(character);
                current.children.add(newNode);
                current = newNode;
                continue;
            }
            boolean found = false;
            for(Node node : current.children){
                if(node.value.equals(character)){
                    found = true;
                    current = node;
                    break;
                }
            }

            if(!found) {
                Node newNode = new Node(character);
                current.children.add(newNode);
                current = newNode;
            }
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        if(word.equals("..")) System.out.println("------------------------");
        Node current = this.root;
        boolean found = false;
        String[] splittedWord = word.split("");
        for(int i = 0; i < splittedWord.length; i++){
            String character = splittedWord[i];
            if(current == null || current.children.isEmpty()) return false;

            for(Node node : current.children){
                String nextCharacter = splittedWord.length > i + 1 ? splittedWord[i + 1] : null;
                if(character.equals(node.value)){
                    found = true;
                    current = node;
                    break;
                }
                else if(character.equals(".")){
                    if(nextCharacter == null) {
                        if(node.isWord) {
                            return node.isWord;
                        } else {
                            continue;
                        }
                    }
                    if(node.children.isEmpty()) {
                        continue;
                    }
                    for(Node wildcardNode : node.children){
                        if(wildcardNode.value.equals(nextCharacter) || nextCharacter.equals(".")){
                            found = true;
                            current = wildcardNode;
                            i = i + 1;
                            break;
                        }
                    }
                    if(found) break;
                }
            }
            if(!found) return false;
        }
        if(word.equals("..")) System.out.println("isWord " + current.isWord);
        return current.isWord;
    }
}

class Node {
    String value;
    boolean isWord;
    List<Node> children;

    public Node(String character) {
        value = character;
        isWord = false;
        children = new ArrayList<Node>();
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */