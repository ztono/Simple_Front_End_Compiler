package inter;

/**
 * Created by Mac on 2018/6/17.
 */
public class Seq extends Stmt{
    Stmt stmt1; Stmt stmt2;
    public Seq(Stmt s1, Stmt s2){
        stmt1 = s1; stmt2 = s2;
    }

    public void gen(int b, int a){
        if(stmt1 == Stmt.Null){
            stmt2.gen(b,a);
        }else if(stmt2 == Stmt.Null){
            stmt1.gen(b,a);
        }else{
            int lable  = newlabel();
            stmt1.gen(b,lable);
            emitlabel(lable);
            stmt2.gen(lable,a);
        }
    }
}