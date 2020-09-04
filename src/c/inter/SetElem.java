package c.inter;

import c.symbols.Array;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class SetElem extends Stmt{

    public Id array;
    public Expr index;
    public Expr expr;

    public SetElem(Access x, Expr y){
        array = x.array;
        index = x.index;
        expr = y;
        if(ckeck(x.type,expr.type) == null) error("type error");
    }

    public Type ckeck(Type p1, Type p2){

        if(p1 instanceof Array || p2 instanceof  Array) return null;
        else if (p1 == p2) return p2;
        else if (Type.numeric(p1) && Type.numeric(p2)) return p2;
        else return null;
    }

    public void gen(int b, int a){
        String s1 = index.reduce().toString();
        String s2 = expr.reduce().toString();
        emit(array.toString() + " [ " + s1 + " ] = " + s2);
    }
}
