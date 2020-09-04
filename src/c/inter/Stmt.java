package c.inter;

import c.lexer.Lexer;

/**
 * Created by Mac on 2018/6/17.
 */
public class Stmt extends Node{
    Lexer l;
    public Stmt(Lexer l){
        super(l);
        this.l = l;
    }

    public Stmt(){}
    public static Stmt Null = new Stmt();
    public void gen(int b, int a){}
    int after = 0;
    public static Stmt Enclosing = Stmt.Null;
}