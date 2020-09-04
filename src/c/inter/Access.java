package c.inter;

import c.lexer.Lexer;
import c.lexer.Tag;
import c.lexer.Word;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Access extends Op{
    public Id array;
    public Expr index;

    Lexer l;
    public Access (Lexer l,Id a, Expr i, Type p){
        super(l,new Word("[]", Tag.INDEX),p);
        array = a;
        index = i;
    }

    public Expr gen() {
        return new Access(l,array,index.reduce(),type);
    }

    public void jumping(int t, int f){
        emitjumps(reduce().toString(),t,f);
    }

    public String toString(){
        return array.toString() + " [ " + index.toString() + " ]";
    }
}
