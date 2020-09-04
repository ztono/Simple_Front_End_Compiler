package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;
import c.symbols.Array;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Rel extends Logical{
    public Rel(Lexer l,Token tok, Expr x1, Expr x2){
        super(l,tok, x1, x2);
    }

    public Type check(Type p1, Type p2){
        if( p1 instanceof Array || p2 instanceof Array){
            return null;
        }else if(p1 == p2){
            return Type.Bool;
        }else return null;
    }


    public void jumping(int t, int f){
        Expr a = expr1.reduce();
        Expr b = expr2.reduce();
        String test = a.toString() + " " + op.toString() + " " + b.toString();
        emitjumps(test,t,f);
    }
}
