package c.inter;

import c.lexer.Lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Node {
    int lexline = 0;

    Node(Lexer l){
        lexline = l.getLine();
    }

    Node()
    {

    }

    void error(String s){
        throw new Error("near line " + lexline + ": " + s);
    }

    static int labels = 0;

    public int newlabel(){return ++labels;}

    public void emitlabel(int i){
        System.out.print("L" + i + ":");
    }

    public void emit(String s){
        System.out.println("\t" + s);
    }
}
