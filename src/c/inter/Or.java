package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;

/**
 * Created by Mac on 2018/6/17.
 */
public class Or extends Logical{
    public Or(Lexer l,Token tok, Expr x1, Expr x2){
        super(l,tok,x1,x2);
    }

    public void jumping(int t, int f){
        int label = t!= 0? t : newlabel();
        expr1.jumping(label,0);
        expr2.jumping(t,f);
        if(t == 0){
            emitlabel(label);
        }
    }

}
