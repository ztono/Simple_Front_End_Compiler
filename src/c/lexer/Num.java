package c.lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Num extends Token {
    public final int value;
    public Num(int v){
        super(Tag.NUM);
        value = v;
    }

    public String toString(){
        return "" + value;
    }
}
