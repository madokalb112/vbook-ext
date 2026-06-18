package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k16 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ a07 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k16(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.s = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                k16 k16Var = new k16((ym) obj5, (List) obj3, (zm7) obj2, this.s, (ym) obj4, jt1Var);
                k16Var.b = obj;
                return k16Var;
            case 1:
                return new k16((j15) this.b, (l25) obj5, (e6c) obj4, (mv3) obj3, (q05) obj2, this.s, jt1Var, 1);
            default:
                return new k16((jka) this.b, (sw8) obj5, (nca) obj4, (a07) obj3, (a07) obj2, this.s, jt1Var, 2);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((k16) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((k16) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((k16) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ty9 ty9Var = null;
        Object[] objArr = 0;
        heb hebVar = heb.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f;
        ym7 ym7Var = this.s;
        switch (i) {
            case 0:
                e11.e0(obj);
                vx1 vx1Var = (vx1) this.b;
                ym ymVar = (ym) obj2;
                List list = (List) obj3;
                zm7 zm7Var = (zm7) obj5;
                ym7 ym7Var2 = ym7Var;
                ym ymVar2 = (ym) obj4;
                if (vx1Var.q().get(wfc.s) != null) {
                    j31.j();
                } else {
                    ah1.J(vx1Var, null, null, new yl0(ymVar, list, zm7Var, ym7Var2, null), 3);
                    ah1.J(vx1Var, null, null, new o81(ymVar2, objArr == true ? 1 : 0, 3), 3);
                }
                break;
            case 1:
                e11.e0(obj);
                l25 l25Var = (l25) obj2;
                ((zb4) ym7Var.getValue()).c(((j15) this.b).f, new Integer(l25Var.d), new Integer(l25Var.e));
                e6c e6cVar = (e6c) obj4;
                e6cVar.b.d(fta.a);
                o7c o7cVar = e6cVar.a;
                rc8 rc8Var = rc8.a;
                o7cVar.v.setValue(rc8Var);
                q6c q6cVar = o7cVar.c;
                q6cVar.getClass();
                sw1.h0();
                if (!lc5.Q(q6cVar.j, rc8Var)) {
                    q6cVar.j = rc8Var;
                    l46 l46Var = q6cVar.a;
                    l46Var.getClass();
                    g46 g46Var = g46.b;
                    if (l46Var.a(g46Var)) {
                        xg xgVar = l46Var.b;
                        String str = l46Var.a;
                        xgVar.getClass();
                        xg.a(g46Var, str, "ZoomableState. readMode=" + rc8Var);
                    }
                    q6c.e(q6cVar, "readModeChanged");
                }
                mv3 mv3Var = (mv3) obj3;
                q05 q05Var = (q05) obj5;
                oy9 oy9Var = e6cVar.b.e;
                if (mv3Var != null) {
                    oy9Var.getClass();
                    ty9Var = new ty9(new r25(mv3Var), q05Var);
                }
                oy9Var.h(ty9Var);
                break;
            default:
                a07 a07Var = (a07) obj5;
                nca ncaVar = (nca) obj4;
                a07 a07Var2 = (a07) obj3;
                sw8 sw8Var = (sw8) obj2;
                e11.e0(obj);
                jka jkaVar = (jka) this.b;
                t19 t19VarD = jkaVar.d();
                cn7 cn7Var = jkaVar.d;
                if (t19VarD == t19.c) {
                    yia yiaVarC = jkaVar.c();
                    roa roaVar = yoa.a;
                    kf8 kf8VarA = yoa.a(yiaVarC, ((Number) a07Var2.getValue()).intValue(), sw8Var.i().j().k, sw8Var.i().j().p, ncaVar.b);
                    float f = kf8VarA.a;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dx1.b(kf8VarA.c, f, 2.0f, f))) << 32) | (((long) Float.floatToRawIntBits(kf8VarA.b)) & 4294967295L);
                    float fFloatValue = ((Number) a07Var.getValue()).floatValue();
                    long jH = eb7.h(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(((Number) ym7Var.getValue()).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue) << 32));
                    kf8 kf8VarA2 = yoa.a(jkaVar.b(), ((Number) a07Var2.getValue()).intValue(), sw8Var.i().j().k, sw8Var.i().j().p, ncaVar.b);
                    float f2 = kf8VarA2.a;
                    float fB = dx1.b(kf8VarA2.c, f2, 2.0f, f2);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(kf8VarA2.d)) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                    float fFloatValue2 = ((Number) a07Var.getValue()).floatValue();
                    long jH2 = eb7.h(jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(((Number) ym7Var.getValue()).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue2) << 32));
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jH & 4294967295L));
                    float fJ = ((int) (sw8Var.j() & 4294967295L)) - Float.intBitsToFloat((int) (jH2 & 4294967295L));
                    cn7 cn7Var2 = jkaVar.e;
                    if (fIntBitsToFloat <= fJ) {
                        cn7Var2.setValue(s09.b);
                        cn7Var.setValue(new eb7(jH2));
                    } else {
                        cn7Var2.setValue(s09.a);
                        cn7Var.setValue(new eb7(jH));
                    }
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k16(ym ymVar, List list, zm7 zm7Var, ym7 ym7Var, ym ymVar2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.c = ymVar;
        this.e = list;
        this.f = zm7Var;
        this.s = ym7Var;
        this.d = ymVar2;
    }
}
