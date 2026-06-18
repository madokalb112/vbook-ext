package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uob implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ je4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ vx1 t;
    public final /* synthetic */ a07 u;
    public final /* synthetic */ a07 v;
    public final /* synthetic */ a07 w;
    public final /* synthetic */ ib4 x;

    public uob(boolean z, boolean z2, int i, int i2, je4 je4Var, kb4 kb4Var, kb4 kb4Var2, vx1 vx1Var, a07 a07Var, a07 a07Var2, a07 a07Var3, ib4 ib4Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = je4Var;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = vx1Var;
        this.u = a07Var;
        this.v = a07Var2;
        this.w = a07Var3;
        this.x = ib4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tob] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        final boolean z = this.a;
        final boolean z2 = this.b;
        final int i = this.c;
        final int i2 = this.d;
        final je4 je4Var = this.e;
        final kb4 kb4Var = this.f;
        final kb4 kb4Var2 = this.s;
        final vx1 vx1Var = this.t;
        final a07 a07Var = this.u;
        final a07 a07Var2 = this.v;
        final a07 a07Var3 = this.w;
        Object objE = aaa.e(zx7Var, (tob) new kb4() { // from class: tob
            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                je4 je4Var2 = je4Var;
                cn7 cn7Var = je4Var2.i;
                cn7 cn7Var2 = je4Var2.j;
                eb7 eb7Var = (eb7) obj;
                boolean z3 = z;
                heb hebVar = heb.a;
                if (!z3 || !z2) {
                    return hebVar;
                }
                long j = eb7Var.a;
                int i3 = (int) (j >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                a07 a07Var4 = a07Var;
                boolean z4 = fIntBitsToFloat < ((float) (((Number) a07Var4.getValue()).intValue() / 2));
                p03 p03Var = z4 ? p03.b : p03.c;
                int iIntValue = z4 ? i : i2;
                zm7 zm7Var = je4Var2.o;
                zm7 zm7Var2 = je4Var2.l;
                boolean z5 = ((p03) cn7Var.getValue()) == p03Var && ((Number) cn7Var2.getValue()).intValue() > 0;
                int i4 = z5 ? 5 : iIntValue;
                if (z5) {
                    iIntValue = ((Number) cn7Var2.getValue()).intValue() + 5;
                }
                je4Var2.f.setValue(p03Var);
                je4Var2.g.setValue(Integer.valueOf(iIntValue));
                cn7Var.setValue(p03Var);
                cn7Var2.setValue(Integer.valueOf(iIntValue));
                cn7 cn7Var3 = je4Var2.h;
                Boolean bool = Boolean.TRUE;
                cn7Var3.setValue(bool);
                je4Var2.k.setValue(bool);
                je4Var2.m.i(((Number) a07Var4.getValue()).intValue() > 0 ? wx1.P(Float.intBitsToFloat(i3) / ((Number) a07Var4.getValue()).intValue(), 0.0f, 1.0f) : 0.5f);
                je4Var2.n.i(((Number) a07Var2.getValue()).intValue() > 0 ? wx1.P(Float.intBitsToFloat((int) (j & 4294967295L)) / ((Number) r2.getValue()).intValue(), 0.0f, 1.0f) : 0.5f);
                zm7Var2.i(zm7Var2.h() + 1);
                zm7Var.i(zm7Var.h() + 1);
                int iOrdinal = p03Var.ordinal();
                jt1 jt1Var2 = null;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        kb4Var.invoke(Integer.valueOf(i4));
                    } else {
                        if (iOrdinal != 2) {
                            mn5.g();
                            return null;
                        }
                        kb4Var2.invoke(Integer.valueOf(i4));
                    }
                }
                a07 a07Var5 = a07Var3;
                yd5 yd5Var = (yd5) a07Var5.getValue();
                if (yd5Var != null) {
                    yd5Var.cancel(null);
                }
                a07Var5.setValue(ah1.J(vx1Var, null, null, new dd9(je4Var2, jt1Var2, 25), 3));
                return hebVar;
            }
        }, (ke4) null, (gi9) null, new zr(15, this.x), jt1Var, 6);
        return objE == xx1.a ? objE : heb.a;
    }
}
