package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gk implements ada {
    public final View a;
    public final kb4 b;
    public final ib4 c;
    public final p07 d = new p07();
    public final lk9 e = new lk9(new ak(this, 0));
    public final ak f = new ak(this, 1);
    public final ak g = new ak(this, 2);
    public ActionMode h;
    public fk i;
    public Runnable j;

    public gk(View view, kb4 kb4Var, ib4 ib4Var) {
        this.a = view;
        this.b = kb4Var;
        this.c = ib4Var;
    }

    @Override // defpackage.ada
    public final Object a(rca rcaVar, o1a o1aVar) {
        fb fbVar = new fb(this, rcaVar, null, 2);
        p07 p07Var = this.d;
        p07Var.getClass();
        Object objA0 = wx1.a0(new yl0(j07.a, p07Var, fbVar, null), o1aVar);
        return objA0 == xx1.a ? objA0 : heb.a;
    }
}
