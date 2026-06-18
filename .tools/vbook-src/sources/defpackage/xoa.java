package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xoa implements PointerInputEventHandler {
    public final /* synthetic */ jka a;
    public final /* synthetic */ st5 b;
    public final /* synthetic */ nca c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ int s;
    public final /* synthetic */ zb4 t;

    public xoa(jka jkaVar, st5 st5Var, nca ncaVar, a07 a07Var, a07 a07Var2, a07 a07Var3, int i, zb4 zb4Var) {
        this.a = jkaVar;
        this.b = st5Var;
        this.c = ncaVar;
        this.d = a07Var;
        this.e = a07Var2;
        this.f = a07Var3;
        this.s = i;
        this.t = zb4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        t19 t19VarD = this.a.d();
        xx1 xx1Var = xx1.a;
        a07 a07Var = this.f;
        a07 a07Var2 = this.e;
        a07 a07Var3 = this.d;
        heb hebVar = heb.a;
        t19 t19Var = t19.a;
        jka jkaVar = this.a;
        st5 st5Var = this.b;
        if (t19VarD != t19Var) {
            Object objE = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new pm0(jkaVar, st5Var, this.c, a07Var3, a07Var2, a07Var, 8), jt1Var, 7);
            if (objE == xx1Var) {
                return objE;
            }
        } else {
            Object objA0 = wx1.a0(new qoa(zx7Var, new woa(jkaVar, st5Var, this.c, zx7Var, this.s, this.t, a07Var3, a07Var2, a07Var), null, 1), jt1Var);
            if (objA0 != xx1Var) {
                objA0 = hebVar;
            }
            if (objA0 == xx1Var) {
                return objA0;
            }
        }
        return hebVar;
    }
}
