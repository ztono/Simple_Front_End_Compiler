package c.inter;

import c.lexer.Lexer;
import c.lexer.Word;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Temp extends Expr {

    static int count = 0;

    int number = 0;

    public Temp(Lexer l, Type p){
        super(l,Word.temp,p);
        number = ++count;
    }
    public String toString(){
        return "t" + number;
    }

}
