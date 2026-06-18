package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rm0 implements kb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rm0(kf8 kf8Var, xh7 xh7Var, sq0 sq0Var, float f, hh hhVar) {
        this.c = kf8Var;
        this.d = xh7Var;
        this.e = sq0Var;
        this.b = f;
        this.f = hhVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        y91 y91Var;
        long j;
        int i = this.a;
        float f = this.b;
        heb hebVar = heb.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                kf8 kf8Var = (kf8) obj5;
                xh7 xh7Var = (xh7) obj4;
                sq0 sq0Var = (sq0) obj3;
                hh hhVar = (hh) obj2;
                r43 r43Var = (r43) obj;
                float f2 = -kf8Var.a;
                float f3 = -kf8Var.b;
                ((lp8) r43Var.p0().b).D(f2, f3);
                try {
                    r43.q(r43Var, xh7Var.b, sq0Var, 0.0f, new jw9(f * 2.0f, 0.0f, 0, 0, (ih) null, 30), (qc1) null, 0, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (r43Var.f() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (r43Var.f() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
                    long jA0 = r43Var.A0();
                    y91 y91VarP0 = r43Var.p0();
                    long jG = y91VarP0.G();
                    y91VarP0.x().i();
                    try {
                        ((lp8) y91VarP0.b).y(fIntBitsToFloat, fIntBitsToFloat2, jA0);
                        j = jG;
                        y91Var = y91VarP0;
                    } catch (Throwable th) {
                        th = th;
                        y91Var = y91VarP0;
                        j = jG;
                    }
                    try {
                        r43.q(r43Var, hhVar, sq0Var, 0.0f, (s43) null, (qc1) null, 0, 28);
                        y91Var.x().q();
                        y91Var.d0(j);
                        return hebVar;
                    } catch (Throwable th2) {
                        th = th2;
                        y91Var.x().q();
                        y91Var.d0(j);
                        throw th;
                    }
                } finally {
                    ((lp8) r43Var.p0().b).D(-f2, -f3);
                }
            case 1:
                List list = (List) obj5;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5Var.c0(list.size(), (kb4) null, new js6(5, list), new rj1(new qt6(list, (String) obj4, f, (kb4) obj3), true, 802480018));
                at5.b0(at5Var, (String) null, new rj1(new h63(f, 1, (ib4) obj2), true, 1714000518), 3);
                return hebVar;
            default:
                long jLongValue = ((Long) obj).longValue();
                Object obj6 = ((rg8) obj5).a;
                obj6.getClass();
                uj9.m((jo) obj6, jLongValue, this.b, (fo) obj4, (qo) obj3, (kb4) obj2);
                return hebVar;
        }
    }

    public /* synthetic */ rm0(rg8 rg8Var, float f, fo foVar, qo qoVar, kb4 kb4Var) {
        this.c = rg8Var;
        this.b = f;
        this.d = foVar;
        this.e = qoVar;
        this.f = kb4Var;
    }

    public /* synthetic */ rm0(List list, String str, float f, kb4 kb4Var, ib4 ib4Var) {
        this.c = list;
        this.d = str;
        this.b = f;
        this.e = kb4Var;
        this.f = ib4Var;
    }
}
