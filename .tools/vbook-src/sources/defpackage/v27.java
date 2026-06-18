package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v27 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v27(float f, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kb4 kb4Var = (kb4) obj2;
                pn pnVar = (pn) obj;
                break;
            case 1:
                xr9 xr9Var = (xr9) obj2;
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                r43.k(r43Var, xr9Var.i, -90.0f, 360.0f, true, 0L, 0L, 0.0f, (jw9) null, 1008);
                long j = xr9Var.g;
                float f2 = this.b;
                r43.k(r43Var, j, -90.0f, f2, true, 0L, 0L, 0.0f, (jw9) null, 1008);
                r43.k(r43Var, xr9Var.h, f2 - 90.0f, 360.0f - f2, true, 0L, 0L, 0.0f, (jw9) null, 1008);
                break;
            default:
                p3b p3bVar = (p3b) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = p3bVar.g();
                an7 an7Var = p3bVar.g;
                if (!zG) {
                    if (an7Var.h() == Long.MIN_VALUE) {
                        an7Var.i(jLongValue);
                        ((cn7) p3bVar.a.a).setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - an7Var.h();
                    if (f != 0.0f) {
                        jH = t96.N(jH / ((double) f));
                    }
                    p3bVar.n(jH);
                    p3bVar.h(jH, f == 0.0f);
                }
                break;
        }
        return hebVar;
    }
}
