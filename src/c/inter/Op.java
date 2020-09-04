package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Op extends Expr{

    Lexer l;
    public Op(Lexer l,Token tok, Type p){
        super(l,tok,p);
        this.l = l;
    }

    public Expr reduce(){
        Expr x = gen();
        Temp t = new Temp(l,type);
        emit(t.toString() + " = " + x.toString());
        return t;
    }
}