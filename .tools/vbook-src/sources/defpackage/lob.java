package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lob implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lob(Object obj, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        final boolean z;
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                for (m2b m2bVar : (List) obj2) {
                    long j = m2bVar.a * 1000;
                    long j2 = m2bVar.b * 1000;
                    if (j2 > 0 && j2 > j) {
                        float f = this.b;
                        float fP = wx1.P(j / f, 0.0f, 1.0f);
                        float fP2 = wx1.P(j2 / f, 0.0f, 1.0f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32)) * fP;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() >> 32)) * (fP2 - fP);
                        if (fIntBitsToFloat2 > 0.0f) {
                            r43.J(r43Var, this.c, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)))) & 4294967295L), 0.0f, (jw9) null, 120);
                        }
                    }
                }
                return heb.a;
            default:
                final q6c q6cVar = (q6c) obj2;
                z2b z2bVar = q6cVar.r;
                long jC = q6cVar.c(eu8.b(z2bVar.a), ((fb7) obj).a);
                boolean z2 = jC == z2bVar.b;
                boolean z3 = !z2;
                if (z2) {
                    z = z3;
                } else {
                    final z2b z2bVarA = z2b.a(q6cVar.r, 0L, jC, 0L, 29);
                    l46 l46Var = q6cVar.a;
                    final long j3 = this.b;
                    final long j4 = this.c;
                    z = z3;
                    ib4 ib4Var = new ib4() { // from class: i6c
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            StringBuilder sb = new StringBuilder("ZoomableState. fling. running. velocity=");
                            q6cVar.getClass();
                            sb.append((Object) fb7.g(j3));
                            sb.append(". startUserOffset=");
                            sb.append(pu1.y0(j4));
                            sb.append(", currentUserOffset=");
                            sb.append(qn9.u(z2bVarA));
                            sb.append(", continue1=");
                            sb.append(z);
                            return sb.toString();
                        }
                    };
                    l46Var.getClass();
                    l46Var.b(g46.a, ib4Var);
                    q6cVar.j(z2bVarA);
                }
                return Boolean.valueOf(z);
        }
    }
}
