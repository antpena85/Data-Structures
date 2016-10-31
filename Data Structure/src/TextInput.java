
import java.util.ArrayList;
import java.util.List;

class TextInput {
    public List<Character> ls = new ArrayList<Character>();
    public void add(char a){
            ls.add(a);
    }
    public String getValue(){
        String value = "";
        for (char x : ls){
            value += x;
        }
        return value;
    }
}

