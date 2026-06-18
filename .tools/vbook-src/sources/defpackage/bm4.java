package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bm4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm4(Object obj, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new bm4((cm4) this.c, this.b, jt1Var, 0);
            case 1:
                bm4 bm4Var = new bm4(this.b, jt1Var);
                bm4Var.c = obj;
                return bm4Var;
            case 2:
                return new bm4(this.b, (mib) this.c, jt1Var, 2);
            case 3:
                return new bm4((f07) this.c, this.b, jt1Var, 3);
            case 4:
                return new bm4((joa) this.c, this.b, jt1Var, 4);
            case 5:
                return new bm4((hra) this.c, this.b, jt1Var, 5);
            case 6:
                return new bm4((s4b) this.c, this.b, jt1Var, 6);
            case 7:
                bm4 bm4Var2 = new bm4((Context) this.c, jt1Var);
                bm4Var2.b = ((Boolean) obj).booleanValue();
                return bm4Var2;
            default:
                return new bm4(this.b, (zob) this.c, jt1Var, 8);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                ((bm4) create((xu4) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 2:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 4:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 5:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 6:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((bm4) create(bool, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((bm4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                e11.e0(obj);
                cm4 cm4Var = (cm4) this.c;
                ((sd8) cm4Var.f).a.e.e(zc8.q[3], Boolean.valueOf(this.b));
                fr9 fr9Var = cm4Var.s;
                boolean z = this.b;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, zl4.a((zl4) value, 0, 0, false, false, false, z, null, 191)));
                }
                break;
            case 1:
                xu4 xu4Var = (xu4) this.c;
                e11.e0(obj);
                xu4Var.f.a(gs4.c, new lp3(1, this.b));
                break;
            case 2:
                e11.e0(obj);
                if (this.b) {
                    ((mib) this.c).j();
                }
                break;
            case 3:
                e11.e0(obj);
                f07 f07Var = (f07) this.c;
                f07Var.c.setValue(Boolean.valueOf(this.b));
                break;
            case 4:
                e11.e0(obj);
                joa joaVar = (joa) this.c;
                ((zna) joaVar.s).a.e.e(rna.m[4], Boolean.valueOf(this.b));
                fr9 fr9Var2 = joaVar.x;
                boolean z2 = this.b;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, tla.a((tla) value2, 0.0f, 0.0f, 0L, false, z2, 0.0f, null, 223)));
                }
                joaVar.d.getClass();
                d6a d6aVar = vg3.a;
                vg3.a(ela.a);
                break;
            case 5:
                e11.e0(obj);
                hra hraVar = (hra) this.c;
                ((xba) hraVar.L).a.b.e(zia.A[3], Boolean.valueOf(this.b));
                fr9 fr9Var3 = hraVar.j0;
                boolean z3 = this.b;
                if (fr9Var3 != null) {
                    while (true) {
                        Object value4 = fr9Var3.getValue();
                        boolean z4 = z3;
                        if (!fr9Var3.j(value4, yba.a((yba) value4, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, z4, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -262145, 1))) {
                            z3 = z4;
                        }
                    }
                }
                break;
            case 6:
                e11.e0(obj);
                s4b s4bVar = (s4b) this.c;
                s4bVar.A = this.b;
                fr9 fr9Var4 = s4bVar.t;
                if (fr9Var4 != null) {
                    do {
                        value3 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value3, k4b.b((k4b) value3, null, null, null, s4bVar.A, 0, null, null, null, 2031)));
                }
                break;
            case 7:
                e11.e0(obj);
                hj7.a((Context) this.c, RescheduleReceiver.class, this.b);
                break;
            default:
                e11.e0(obj);
                boolean z5 = this.b;
                zob zobVar = (zob) this.c;
                if (!z5) {
                    zobVar.d();
                } else {
                    zobVar.a();
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm4(Context context, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 7;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm4(boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm4(boolean z, Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
