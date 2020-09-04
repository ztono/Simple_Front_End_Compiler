package c.inter;

import c.lexer.Lexer;
import c.lexer.Word;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/16.
 */
public class Id extends Expr{

    public int offset;
    public Id(Lexer l,Word id, Type p, int b){
        super(l,id,p);
        offset = b;
    }

}
