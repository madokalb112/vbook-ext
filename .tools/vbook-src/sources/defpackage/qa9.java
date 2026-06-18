package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sa9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa9(sa9 sa9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = sa9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        sa9 sa9Var = this.c;
        switch (i) {
            case 0:
                qa9 qa9Var = new qa9(sa9Var, jt1Var, 0);
                qa9Var.b = obj;
                return qa9Var;
            default:
                qa9 qa9Var2 = new qa9(sa9Var, jt1Var, 1);
                qa9Var2.b = obj;
                return qa9Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        e59 e59Var = (e59) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((qa9) create(e59Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.a;
        sa9 sa9Var = this.c;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                e11.e0(obj);
                e59 e59Var = (e59) this.b;
                sa9Var.d.getClass();
                return e59.a(e59Var, null, iua.a(), null, 5);
            default:
                e11.e0(obj);
                e59 e59Var2 = (e59) this.b;
                d38 d38Var = sa9Var.f;
                boolean zE = sa9Var.e(e59Var2);
                Map mapB = e59Var2.c;
                if (mapB != null) {
                    d38Var.getClass();
                    z = false;
                    if (!d38Var.f) {
                        ArrayList arrayListA = y3.a(d38Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = arrayListA.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayListA.get(i2);
                            i2++;
                            e38 e38Var = (e38) obj2;
                            b38 b38Var = (b38) mapB.get(e38Var.a);
                            xl7 xl7Var = b38Var != null ? new xl7(e38Var, b38Var) : null;
                            if (xl7Var != null) {
                                arrayList.add(xl7Var);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                xl7 xl7Var2 = (xl7) obj3;
                                e38 e38Var2 = (e38) xl7Var2.a;
                                b38 b38Var2 = (b38) xl7Var2.b;
                                boolean zQ = lc5.Q(d38Var.a(), e38Var2.a);
                                int i4 = e38Var2.b;
                                if (zQ) {
                                    if (i4 != b38Var2.a || !lc5.Q((String) d38Var.d.getValue(), b38Var2.b)) {
                                    }
                                } else if (i4 != b38Var2.a) {
                                }
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean zD = sa9Var.d(e59Var2);
                if (z) {
                    mapB = d38Var.b(mc3.a);
                } else if (zD) {
                    mapB = d38Var.b(mapB);
                }
                i59 i59Var = z ? null : e59Var2.a;
                if (!zE && !z) {
                    return zD ? e59.a(e59Var2, null, null, d38Var.b(mapB), 3) : e59Var2;
                }
                i59 i59VarA = sa9Var.b.a(i59Var);
                m59 m59Var = sa9Var.c;
                ah1.J(wx1.b(m59Var.e), null, null, new yw(m59Var, i59VarA, jt1Var, 2), 3);
                d38Var.f = true;
                return new e59(i59VarA, null, mapB);
        }
    }
}
