package defpackage;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wf1 extends i45 {
    public final String T;
    public final aw5 U;
    public final f4b V;
    public final w25 W;
    public final fr9 X;
    public final a15 Y;

    public wf1(String str, aw5 aw5Var, i13 i13Var, q15 q15Var, cm0 cm0Var, t0c t0cVar, f4b f4bVar, xy4 xy4Var, rd8 rd8Var, w25 w25Var) {
        super(str, aw5Var, i13Var, q15Var, cm0Var, t0cVar, f4bVar, xy4Var, rd8Var);
        this.T = str;
        this.U = aw5Var;
        this.V = f4bVar;
        this.W = w25Var;
        this.X = gr9.a(new uf1("", "", true, false, false));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new y(this, null, 22));
        this.Y = new a15(new lp8(this, 10), 104857600L, Context.VERSION_ES6);
    }

    @Override // defpackage.i45
    public final void A(boolean z) {
        fr9 fr9Var = this.X;
        if (fr9Var == null) {
            return;
        }
        while (true) {
            Object value = fr9Var.getValue();
            boolean z2 = z;
            if (fr9Var.j(value, uf1.a((uf1) value, false, null, z2, null, 22))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.i45
    public final a15 q() {
        return this.Y;
    }
}
