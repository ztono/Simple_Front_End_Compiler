package c.inter;

import c.lexer.Lexer;
import c.lexer.Num;
import c.lexer.Token;
import c.lexer.Word;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Constant extends Expr{


    public Constant(Lexer l,Token tok, Type p){
        super(l,tok,p);
    }

    public Constant(Token tok, Type p){
        super(tok,p);
    }

    public Constant(Lexer l, int i){
        super(l,new Num(i),Type.Int);
    }

    public static final Constant
        True = new Constant (Word.True,Type.Bool),
        False = new Constant (Word.False,Type.Bool);

    public void jumping(int t, int f){

        if(this == True && t != 0){
            emit("goto L" +  t);
        }else if(this == False && f!= 0){
            emit("goto L" + f);
        }


    }

}
