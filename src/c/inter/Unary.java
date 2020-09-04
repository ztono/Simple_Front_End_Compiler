package c.inter;

import c.lexer.Lexer;
import c.lexer.Token;
import c.symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Unary extends Op {
    public Expr expr;
    Lexer l;

    public Unary(Lexer l, Token tok, Expr x) {
        super(l, tok, null);
        this.l = l;
        expr = x;
        type = Type.max(Type.Int, expr.type);
        if (type == null) {
            error("type error");
        }
    }

    public Expr gen() {
        return new Unary(l, op, expr.reduce());
    }

    public String toString() {
        return op.toString() + " " + expr.toString();
    }
}
