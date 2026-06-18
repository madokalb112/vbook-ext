package defpackage;

import androidx.glance.session.SessionWorker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b69 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b69(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    private final Object m(Object obj) {
        as2 as2Var;
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        y78 y78Var = ((hja) this.c).e;
        String str = (String) this.d;
        this.b = 1;
        c98 c98Var = (c98) y78Var;
        b92 b92Var = c98Var.a.F;
        int i2 = 0;
        dc2 dc2Var = (dc2) b92Var.X(0, str, "general").e();
        if (dc2Var != null) {
            b92Var.K(dc2Var.a);
        }
        ArrayList arrayListB = c98Var.f.b();
        int size = arrayListB.size();
        while (i2 < size) {
            Object obj2 = arrayListB.get(i2);
            i2++;
            ca8 ca8Var = (ca8) obj2;
            if (dc2Var == null || dc2Var.f != 0) {
                ca8Var.getClass();
                ca8Var.d.a();
                ld4 ld4Var = ca8Var.m;
                if (ld4Var != null && (as2Var = ld4Var.g) != null) {
                }
            } else {
                ca8Var.getClass();
                ca8Var.d.a();
                ld4 ld4Var2 = ca8Var.m;
                if (ld4Var2 != null) {
                    as2 as2Var2 = ld4Var2.f;
                    if (as2Var2 != null) {
                    }
                    as2 as2Var3 = ld4Var2.g;
                    if (as2Var3 != null) {
                    }
                }
            }
        }
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object n(Object obj) {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        lja ljaVar = (lja) this.c;
        y78 y78Var = ljaVar.t;
        String str = ljaVar.e;
        String str2 = (String) this.d;
        this.b = 1;
        ((c98) y78Var).r(str, str2);
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object o(Object obj) {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        nja njaVar = (nja) this.c;
        y78 y78Var = njaVar.t;
        String str = njaVar.e;
        String str2 = (String) this.d;
        this.b = 1;
        ((c98) y78Var).t(str, str2);
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new b69((SessionWorker) this.c, (ju) this.d, jt1Var, 0);
            case 1:
                b69 b69Var = new b69((SessionWorker) this.c, jt1Var);
                b69Var.d = obj;
                return b69Var;
            case 2:
                return new b69((x99) this.c, (kp9) this.d, jt1Var, 2);
            case 3:
                return new b69((sa9) this.c, (e59) this.d, jt1Var, 3);
            case 4:
                return new b69((tb9) this.c, (List) this.d, jt1Var, 4);
            case 5:
                b69 b69Var2 = new b69((yb9) this.d, jt1Var, 5);
                b69Var2.c = obj;
                return b69Var2;
            case 6:
                return new b69((jd9) this.c, (kd9) this.d, jt1Var, 6);
            case 7:
                return new b69((s16) this.d, jt1Var, 7);
            case 8:
                return new b69((yy6) this.c, (hk9) this.d, jt1Var, 8);
            case 9:
                return new b69((ii9) this.c, (hl2) this.d, jt1Var, 9);
            case 10:
                return new b69((fq9) this.c, (eq9) this.d, jt1Var, 10);
            case 11:
                b69 b69Var3 = new b69((fz9) this.d, jt1Var, 11);
                b69Var3.c = obj;
                return b69Var3;
            case 12:
                return new b69((as0) this.c, (ko) this.d, jt1Var, 12);
            case 13:
                return new b69((ox9) this.c, (ta5) this.d, jt1Var, 13);
            case 14:
                return new b69((oy9) this.c, (String) this.d, jt1Var, 14);
            case 15:
                b69 b69Var4 = new b69((p5a) this.d, jt1Var, 15);
                b69Var4.c = obj;
                return b69Var4;
            case 16:
                return new b69((p5a) this.c, (f4a) this.d, jt1Var, 16);
            case 17:
                return new b69((p5a) this.c, (vvb) this.d, jt1Var, 17);
            case 18:
                b69 b69Var5 = new b69((h8a) this.d, jt1Var, 18);
                b69Var5.c = obj;
                return b69Var5;
            case 19:
                return new b69((h8a) this.c, (List) this.d, jt1Var, 19);
            case 20:
                return new b69((yd5) this.c, (a28) this.d, jt1Var, 20);
            case 21:
                return new b69((sw8) this.c, (a07) this.d, jt1Var, 21);
            case 22:
                return new b69((a07) this.c, (hra) this.d, jt1Var, 22);
            case 23:
                return new b69((gea) this.c, (String) this.d, jt1Var, 23);
            case 24:
                b69 b69Var6 = new b69((gea) this.d, jt1Var, 24);
                b69Var6.c = obj;
                return b69Var6;
            case 25:
                return new b69((gja) this.c, (String) this.d, jt1Var, 25);
            case 26:
                return new b69((hja) this.c, (String) this.d, jt1Var, 26);
            case 27:
                return new b69((lja) this.c, (String) this.d, jt1Var, 27);
            case 28:
                return new b69((nja) this.c, (String) this.d, jt1Var, 28);
            default:
                return new b69((fma) this.d, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 6:
                ((b69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 11:
                ((b69) create((c24) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((b69) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r0.f(r33) == r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0769, code lost:
    
        if (defpackage.tw1.H(100, r33) == r12) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0848, code lost:
    
        if (r1.invoke(r2, r33) != r12) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0202, code lost:
    
        if (r0 == r12) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0840 A[PHI: r1 r2
  0x0840: PHI (r1v24 et1) = (r1v30 et1), (r1v37 et1) binds: [B:350:0x083d, B:346:0x0804] A[DONT_GENERATE, DONT_INLINE]
  0x0840: PHI (r2v19 java.lang.Object) = (r2v22 java.lang.Object), (r2v23 java.lang.Object) binds: [B:350:0x083d, B:346:0x0804] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:498:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [pa9] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7, types: [e59] */
    /* JADX WARN: Type inference failed for: r1v8, types: [e59] */
    /* JADX WARN: Type inference failed for: r2v7, types: [sa9] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v6, types: [iw0, vx1] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x0848 -> B:355:0x084c). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b69.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b69(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b69(SessionWorker sessionWorker, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.c = sessionWorker;
    }
}
