package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fu1 implements kb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jka b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ fu1(st5 st5Var, jka jkaVar, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5, a07 a07Var6, a07 a07Var7, a07 a07Var8) {
        this.c = st5Var;
        this.b = jkaVar;
        this.d = a07Var;
        this.e = a07Var2;
        this.f = a07Var3;
        this.s = a07Var4;
        this.t = a07Var5;
        this.u = a07Var6;
        this.v = a07Var7;
        this.w = a07Var8;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        yia yiaVar;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.s;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                kb4 kb4Var = (kb4) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                List list = ((nca) obj10).b;
                vd1 vd1Var = new vd1(29);
                hu1 hu1Var = new hu1(0);
                at5Var.c0(list.size(), new f7(10, vd1Var, list), new f7(11, hu1Var, list), new rj1(new ol7(list, (co0) obj9, (lra) obj8, this.b, (aoa) obj7, (zja) obj6, (kba) obj5, (ib4) obj4, (kb4) obj3, kb4Var), true, 802480018));
                break;
            default:
                st5 st5Var = (st5) obj10;
                a07 a07Var = (a07) obj3;
                a07 a07Var2 = (a07) obj2;
                eb7 eb7Var = (eb7) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eb7Var.a >> 32));
                roa roaVar = yoa.a;
                float fFloatValue = fIntBitsToFloat - ((Number) ((a07) obj9).getValue()).floatValue();
                long j = eb7Var.a;
                yia yiaVarB = yoa.b(fFloatValue, Float.intBitsToFloat((int) (j & 4294967295L)) - ((Number) ((a07) obj8).getValue()).floatValue(), ((Number) ((a07) obj7).getValue()).intValue(), st5Var.j().k, st5Var.j().p, ((nca) ((a07) obj6).getValue()).b);
                int i2 = yiaVarB.c;
                t19 t19Var = t19.b;
                jka jkaVar = this.b;
                jkaVar.a.setValue(t19Var);
                Boolean bool = Boolean.TRUE;
                ((a07) obj5).setValue(bool);
                ((a07) obj4).setValue(new eb7(j));
                yia yiaVar2 = yia.d;
                if (!yiaVarB.equals(yiaVar2)) {
                    if (lc5.Q((yia) a07Var.getValue(), yiaVar2)) {
                        a07Var.setValue(Math.abs(i2 - jkaVar.c().c) > Math.abs(i2 - jkaVar.b().c) ? jkaVar.c() : jkaVar.b());
                    }
                    if (i2 > ((yia) a07Var.getValue()).c) {
                        yia yiaVar3 = (yia) a07Var.getValue();
                        a07Var2.setValue(Boolean.FALSE);
                        yiaVarB = yiaVar3;
                        yiaVar = yiaVarB;
                    } else {
                        a07Var2.setValue(bool);
                        yiaVar = (yia) a07Var.getValue();
                    }
                    yiaVarB.getClass();
                    jkaVar.b.setValue(yiaVarB);
                    yiaVar.getClass();
                    jkaVar.c.setValue(yiaVar);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ fu1(nca ncaVar, co0 co0Var, lra lraVar, jka jkaVar, aoa aoaVar, zja zjaVar, kba kbaVar, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2) {
        this.c = ncaVar;
        this.d = co0Var;
        this.e = lraVar;
        this.b = jkaVar;
        this.f = aoaVar;
        this.s = zjaVar;
        this.t = kbaVar;
        this.u = ib4Var;
        this.v = kb4Var;
        this.w = kb4Var2;
    }
}
