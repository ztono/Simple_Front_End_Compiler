package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/16.
 */
public class Expr extends Node{

    public Token op;
    public Type type;
    Expr(Lexer l,Token tok, Type p){
        super(l);
        op = tok;
        type = p;
    }

    public Expr(Token tok, Type p) {
    }

    public Expr gen(){
        return this;
    }

    public Expr reduce(){
        return this;
    }

    public void jumping(int t, int f){
        emitjumps(toString(),t,f);
    }

    public void emitjumps(String test, int t, int f){
        if(t != 0 && f != 0){
            emit("if " + test + " goto L" + t);
            emit("goto L" + f);
        }
        else if ( t != 0) emit("if " + test + " goto L" + t);
        else if ( f != 0) emit("iffalse " + test + " goto L" + f);
        else;
    }

    public String toString(){
        return op.toString();
    }

}