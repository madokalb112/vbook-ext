package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class l28 extends dc1 {
    public final k28 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l28(oi5 oi5Var) {
        super(oi5Var);
        oi5Var.getClass();
        this.b = new k28(oi5Var.e());
    }

    @Override // defpackage.dc1, defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        int i = i(obj);
        k28 k28Var = this.b;
        k28Var.getClass();
        md2 md2VarV = md2Var.v(k28Var);
        p(md2VarV, obj, i);
        md2VarV.a0(k28Var);
    }

    @Override // defpackage.h0, defpackage.oi5
    public final Object c(yd2 yd2Var) {
        return j(yd2Var);
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return this.b;
    }

    @Override // defpackage.h0
    public final Object f() {
        return (j28) l(o());
    }

    @Override // defpackage.h0
    public final int g(Object obj) {
        j28 j28Var = (j28) obj;
        j28Var.getClass();
        return j28Var.d();
    }

    @Override // defpackage.h0
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.h0
    public final Object m(Object obj) {
        j28 j28Var = (j28) obj;
        j28Var.getClass();
        return j28Var.a();
    }

    @Override // defpackage.dc1
    public final void n(int i, Object obj, Object obj2) {
        ((j28) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(md2 md2Var, Object obj, int i);
}
