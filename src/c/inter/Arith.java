package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Arith extends Op{
    public Expr expr1, expr2;
    Lexer l;

    public Arith(Lexer l, Token tok, Expr x1, Expr x2){
        super(l, tok,null);
        this.l = l;
        expr1 = x1;
        expr2 = x2;
        type = Type.max(expr1.type,expr2.type);
        if(type == null){
            error("type error");
        }
    }

    public Expr gen(){
        return new Arith(l,op,expr1.reduce(),expr2.reduce());
    }

    public String toString(){
        return expr1.toString() + " " + op.toString() + " " + expr2.toString();
    }

}
