package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;

/**
 * Created by Mac on 2018/6/17.
 */
public class Not extends Logical{
    public Not(Lexer l,Token tok, Expr x2){
        super(l,tok,x2,x2);
    }

    public void jumping(int t, int f){
        expr2.jumping(f,t);
    }

    public String toString(){
        return op.toString() + " " + expr2.toString();
    }

}
