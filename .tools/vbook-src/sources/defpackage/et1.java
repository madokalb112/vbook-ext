package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class et1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et1(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    private final Object m(Object obj) {
        Object pm8Var;
        Object value;
        hl3 hl3Var;
        String message;
        Object value2;
        Object value3;
        il3 il3Var = (il3) this.d;
        fr9 fr9Var = il3Var.e;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                if (fr9Var != null) {
                    do {
                        value3 = fr9Var.getValue();
                    } while (!fr9Var.j(value3, hl3.a((hl3) value3, true, false, "", null, 8)));
                }
                ou2 ou2Var = il3Var.d;
                String str = il3Var.c;
                this.c = null;
                this.b = 1;
                obj = ((uu2) ou2Var).e(str, this);
                xx1 xx1Var = xx1.a;
                if (obj == xx1Var) {
                    return xx1Var;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
            }
            pm8Var = (fl3) obj;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (!(pm8Var instanceof pm8)) {
            fl3 fl3Var = (fl3) pm8Var;
            if (fr9Var != null) {
                do {
                    value2 = fr9Var.getValue();
                } while (!fr9Var.j(value2, hl3.a((hl3) value2, false, false, null, fl3Var, 4)));
            }
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA != null && fr9Var != null) {
            do {
                value = fr9Var.getValue();
                hl3Var = (hl3) value;
                message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
            } while (!fr9Var.j(value, hl3.a(hl3Var, false, true, message, null, 8)));
        }
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r0 == r6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[LOOP:0: B:25:0x0086->B:57:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d A[EDGE_INSN: B:60:0x015d->B:58:0x015d BREAK  A[LOOP:0: B:25:0x0086->B:57:0x0157], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et1.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        String str = (String) this.d;
        qp3 qp3Var = ((wo3) this.c).c;
        int i = this.b;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        if (i == 0) {
            e11.e0(obj);
            wp3 wp3VarE = ((cq3) qp3Var).e(str);
            this.b = 1;
            obj = cx1.N(wp3VarE, this);
            if (obj != xx1Var) {
            }
            return xx1Var;
        }
        if (i != 1) {
            if (i == 2) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        vm3 vm3Var = (vm3) obj;
        if (vm3Var != null) {
            boolean z = !vm3Var.v;
            this.b = 2;
            ((cq3) qp3Var).j(str, z);
            if (hebVar == xx1Var) {
                return xx1Var;
            }
        }
        return hebVar;
    }

    private final Object p(Object obj) {
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
        gr3 gr3Var = ((pp3) this.c).c;
        String str = (String) this.d;
        this.b = 1;
        n92 n92Var = ((jr3) gr3Var).a.z;
        n92Var.getClass();
        str.getClass();
        ((qj) ((yf1) n92Var).a).q(-1894397068, "DELETE FROM DbExtensionSource\nWHERE path = ?", new e82(str, 12));
        n92Var.w(-1894397068, new sa2(24));
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    private final Object q(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        qp3 qp3Var = ((sr3) this.c).c;
        String str = ((fr3) this.d).b;
        this.b = 1;
        Serializable serializableD = ((cq3) qp3Var).d(str, this);
        xx1 xx1Var = xx1.a;
        return serializableD == xx1Var ? xx1Var : serializableD;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new et1((ft1) this.c, (List) obj2, jt1Var, 0);
            case 1:
                et1 et1Var = new et1((pt1) obj2, jt1Var, 1);
                et1Var.c = obj;
                return et1Var;
            case 2:
                return new et1((zx7) this.c, (kga) obj2, jt1Var, 2);
            case 3:
                et1 et1Var2 = new et1((t02) obj2, jt1Var, 3);
                et1Var2.c = obj;
                return et1Var2;
            case 4:
                return new et1((yd5) this.c, (j22) obj2, jt1Var, 4);
            case 5:
                et1 et1Var3 = new et1((List) obj2, jt1Var, 5);
                et1Var3.c = obj;
                return et1Var3;
            case 6:
                return new et1((a52) this.c, (ff6) obj2, jt1Var, 6);
            case 7:
                return new et1((yb4) this.c, (o32) obj2, jt1Var, 7);
            case 8:
                et1 et1Var4 = new et1((a52) obj2, jt1Var, 8);
                et1Var4.c = obj;
                return et1Var4;
            case 9:
                return new et1((hg2) this.c, (hl2) obj2, jt1Var, 9);
            case 10:
                return new et1((ir2) obj2, jt1Var, 10);
            case 11:
                return new et1((ir2) this.c, (Integer) obj2, jt1Var, 11);
            case 12:
                return new et1((nv2) this.c, (String) obj2, jt1Var, 12);
            case 13:
                return new et1((px2) obj2, jt1Var, 13);
            case 14:
                et1 et1Var5 = new et1((xz2) obj2, jt1Var, 14);
                et1Var5.c = obj;
                return et1Var5;
            case 15:
                return new et1((xz2) this.c, (List) obj2, jt1Var, 15);
            case 16:
                return new et1((n83) obj2, jt1Var, 16);
            case 17:
                return new et1((za3) this.c, (String) obj2, jt1Var, 17);
            case 18:
                return new et1((za3) this.c, (List) obj2, jt1Var, 18);
            case 19:
                return new et1((bc3) this.c, (v93) obj2, jt1Var, 19);
            case 20:
                return new et1((vf3) obj2, jt1Var, 20);
            case 21:
                et1 et1Var6 = new et1((il3) obj2, jt1Var, 21);
                et1Var6.c = obj;
                return et1Var6;
            case 22:
                return new et1((em3) obj2, jt1Var, 22);
            case 23:
                return new et1((String) this.c, (String) obj2, jt1Var, 23);
            case 24:
                return new et1((yn3) this.c, (String) obj2, jt1Var, 24);
            case 25:
                return new et1((wo3) this.c, (String) obj2, jt1Var, 25);
            case 26:
                return new et1((pp3) this.c, (String) obj2, jt1Var, 26);
            case 27:
                return new et1((kr3) this.c, (wq5) obj2, jt1Var, 27);
            case 28:
                return new et1((sr3) this.c, (fr3) obj2, jt1Var, 28);
            default:
                return new et1((ys3) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 4:
                ((et1) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((et1) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:375:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:560:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:377:0x0916 -> B:379:0x0919). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et1(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
    }
}
