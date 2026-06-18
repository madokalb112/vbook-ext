package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class voa implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ st5 b;
    public final /* synthetic */ jka c;
    public final /* synthetic */ jj4 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ a07 t;
    public final /* synthetic */ a07 u;
    public final /* synthetic */ a07 v;
    public final /* synthetic */ a07 w;
    public final /* synthetic */ a07 x;
    public final /* synthetic */ a07 y;

    public voa(boolean z, st5 st5Var, jka jkaVar, jj4 jj4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5, a07 a07Var6, a07 a07Var7, a07 a07Var8, a07 a07Var9) {
        this.a = z;
        this.b = st5Var;
        this.c = jkaVar;
        this.d = jj4Var;
        this.e = a07Var;
        this.f = a07Var2;
        this.s = a07Var3;
        this.t = a07Var4;
        this.u = a07Var5;
        this.v = a07Var6;
        this.w = a07Var7;
        this.x = a07Var8;
        this.y = a07Var9;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        boolean z = this.a;
        heb hebVar = heb.a;
        if (z) {
            st5 st5Var = this.b;
            jka jkaVar = this.c;
            jj4 jj4Var = this.d;
            a07 a07Var = this.e;
            a07 a07Var2 = this.f;
            a07 a07Var3 = this.s;
            a07 a07Var4 = this.t;
            a07 a07Var5 = this.u;
            a07 a07Var6 = this.v;
            a07 a07Var7 = this.w;
            a07 a07Var8 = this.x;
            a07 a07Var9 = this.y;
            Object objA0 = wx1.a0(new u9a(zx7Var, new i49(st5Var, jkaVar, jj4Var, a07Var, a07Var2, a07Var3, a07Var4, a07Var5, a07Var6, a07Var7, a07Var8, a07Var9), new ma0(25, jkaVar, a07Var8, a07Var6), new o39(jkaVar, 24), new fu1(st5Var, jkaVar, a07Var, a07Var2, a07Var3, a07Var4, a07Var8, a07Var7, a07Var6, a07Var9), null, 3), jt1Var);
            xx1 xx1Var = xx1.a;
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
