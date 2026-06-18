package defpackage;

import android.os.Bundle;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lb extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(nb nbVar, hl2 hl2Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.a = 0;
        this.c = nbVar;
        this.d = hl2Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 3;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return new lb((nb) this.c, (hl2) this.d, (jt1) obj3).invokeSuspend(hebVar);
            case 1:
                lb lbVar = new lb(i2, 1, (jt1) obj3);
                lbVar.c = (c24) obj;
                lbVar.d = (Throwable) obj2;
                return lbVar.invokeSuspend(hebVar);
            case 2:
                lb lbVar2 = new lb(i2, 2, (jt1) obj3);
                lbVar2.c = (ct7) obj;
                lbVar2.d = obj2;
                return lbVar2.invokeSuspend(hebVar);
            case 3:
                lb lbVar3 = new lb(i2, i2, (jt1) obj3);
                lbVar3.c = (ct7) obj;
                lbVar3.d = (hv4) obj2;
                return lbVar3.invokeSuspend(hebVar);
            case 4:
                lb lbVar4 = new lb((Bundle) this.d, (jt1) obj3, 4);
                lbVar4.c = (ju) obj2;
                return lbVar4.invokeSuspend(hebVar);
            case 5:
                lb lbVar5 = new lb((String) this.d, (jt1) obj3, 5);
                lbVar5.c = (ju) obj2;
                return lbVar5.invokeSuspend(hebVar);
            case 6:
                lb lbVar6 = new lb((is4) this.d, (jt1) obj3, 6);
                lbVar6.c = (ct7) obj;
                return lbVar6.invokeSuspend(hebVar);
            case 7:
                lb lbVar7 = new lb((ac4) this.d, (jt1) obj3, 7);
                lbVar7.c = (ct7) obj;
                return lbVar7.invokeSuspend(hebVar);
            case 8:
                lb lbVar8 = new lb((yb4) this.d, (jt1) obj3, 8);
                lbVar8.c = (ct7) obj;
                return lbVar8.invokeSuspend(hebVar);
            default:
                lb lbVar9 = new lb((bc4) this.d, (jt1) obj3, 9);
                lbVar9.c = (ct7) obj;
                return lbVar9.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        wh7 qk2Var;
        Object objC;
        Object objK;
        int i = this.a;
        int i2 = 2;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                mb mbVar = ((nb) this.c).a;
                hl2 hl2Var = (hl2) this.d;
                this.b = 1;
                return hl2Var.invoke(mbVar, this) == xx1Var ? xx1Var : hebVar;
            case 1:
                c24 c24Var = (c24) this.c;
                Throwable th = (Throwable) this.d;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                String message = th.getMessage();
                if (message == null) {
                    message = "Cbz export failed";
                }
                rm3 rm3Var = new rm3(om3.t, 0, 0, pm3.c, message, 38);
                this.c = null;
                this.d = null;
                this.b = 1;
                return c24Var.b(rm3Var, this) == xx1Var ? xx1Var : hebVar;
            case 2:
                ct7 ct7Var = (ct7) this.c;
                Object obj2 = this.d;
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                Object obj3 = ct7Var.a;
                if (((xu4) obj3).c.p("Accept") == null) {
                    ((xu4) obj3).c.h("Accept", "*/*");
                }
                xu4 xu4Var = (xu4) obj3;
                as1 as1VarZ = tu1.z(xu4Var);
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (as1VarZ == null) {
                        as1VarZ = zr1.a;
                    }
                    qk2Var = new zba(str, as1VarZ);
                } else if (obj2 instanceof byte[]) {
                    qk2Var = new pk2(as1VarZ, obj2);
                } else if (obj2 instanceof ut0) {
                    qk2Var = new qk2(ct7Var, as1VarZ, obj2);
                } else if (obj2 instanceof wh7) {
                    qk2Var = (wh7) obj2;
                } else {
                    xu4Var.getClass();
                    obj2.getClass();
                    qk2Var = obj2 instanceof InputStream ? new qk2(xu4Var, as1VarZ, obj2) : null;
                }
                if ((qk2Var != null ? qk2Var.b() : null) == null) {
                    return hebVar;
                }
                fk4 fk4Var = xu4Var.c;
                fk4Var.getClass();
                ((Map) ((yf1) fk4Var).a).remove("Content-Type");
                sk2.a.j("Transformed with default transformers request body for " + xu4Var.a + " from " + ug8.a(obj2.getClass()));
                this.c = null;
                this.d = null;
                this.b = 1;
                return ct7Var.d(this, qk2Var) == xx1Var ? xx1Var : hebVar;
            case 3:
                ct7 ct7Var2 = (ct7) this.c;
                hv4 hv4Var = (hv4) this.d;
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                bbb bbbVar = hv4Var.a;
                Object obj4 = hv4Var.b;
                if (!(obj4 instanceof ut0) || !bbbVar.a.equals(ug8.a(InputStream.class))) {
                    return hebVar;
                }
                hv4 hv4Var2 = new hv4(bbbVar, new mh0(new mh0((ut0) obj4, 0), i2));
                this.c = null;
                this.d = null;
                this.b = 1;
                return ct7Var2.d(this, hv4Var2) == xx1Var ? xx1Var : hebVar;
            case 4:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                ju juVar = (ju) this.c;
                Bundle bundle = (Bundle) this.d;
                this.b = 1;
                juVar.getClass();
                Object objE = juVar.e(new cu(bundle), this);
                if (objE != xx1Var) {
                    objE = hebVar;
                }
                return objE == xx1Var ? xx1Var : hebVar;
            case 5:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                ju juVar2 = (ju) this.c;
                String str2 = (String) this.d;
                this.b = 1;
                juVar2.getClass();
                Object objE2 = juVar2.e(new bu(str2), this);
                if (objE2 != xx1Var) {
                    objE2 = hebVar;
                }
                return objE2 == xx1Var ? xx1Var : hebVar;
            case 6:
                ct7 ct7Var3 = (ct7) this.c;
                int i9 = this.b;
                try {
                    if (i9 == 0) {
                        e11.e0(obj);
                        this.c = ct7Var3;
                        this.b = 1;
                        objC = ct7Var3.c(this);
                        if (objC == xx1Var) {
                            return xx1Var;
                        }
                    } else {
                        if (i9 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        e11.e0(obj);
                        objC = obj;
                    }
                    return hebVar;
                } catch (Throwable th2) {
                    gi8 gi8Var = ((is4) this.d).u;
                    ((ks4) ct7Var3.a).d();
                    gi8Var.getClass();
                    dx1.y(((wv1) gi8Var.a).a(s91.d));
                    throw th2;
                }
            case 7:
                ct7 ct7Var4 = (ct7) this.c;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                ac4 ac4Var = (ac4) this.d;
                af7 af7Var = new af7();
                Object obj5 = ct7Var4.a;
                Object objB = ct7Var4.b();
                this.c = null;
                this.b = 1;
                return ac4Var.g(af7Var, obj5, objB, this) == xx1Var ? xx1Var : hebVar;
            case 8:
                ct7 ct7Var5 = (ct7) this.c;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                yb4 yb4Var = (yb4) this.d;
                Object obj6 = ct7Var5.a;
                this.c = null;
                this.b = 1;
                return yb4Var.invoke(obj6, this) == xx1Var ? xx1Var : hebVar;
            default:
                ct7 ct7Var6 = (ct7) this.c;
                int i12 = this.b;
                if (i12 == 0) {
                    e11.e0(obj);
                    bc4 bc4Var = (bc4) this.d;
                    e3b e3bVar = new e3b();
                    Object obj7 = ct7Var6.a;
                    Object objB2 = ct7Var6.b();
                    bbb bbbVar2 = (bbb) ((xu4) ct7Var6.a).f.e(nk8.a);
                    this.c = ct7Var6;
                    this.b = 1;
                    objK = bc4Var.k(e3bVar, obj7, objB2, bbbVar2, this);
                    if (objK != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                objK = obj;
                wh7 wh7Var = (wh7) objK;
                if (wh7Var == null) {
                    return hebVar;
                }
                this.c = null;
                this.b = 2;
                if (ct7Var6.d(this, wh7Var) != xx1Var) {
                    return hebVar;
                }
                return xx1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(Object obj, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.d = obj;
    }
}
