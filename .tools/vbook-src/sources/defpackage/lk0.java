package defpackage;

import android.net.NetworkRequest;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lk0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(Object obj, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new lk0((rk0) obj2, z, jt1Var, 0);
            case 1:
                return new lk0((f07) obj2, z, jt1Var, 1);
            case 2:
                return new lk0((yn3) obj2, z, jt1Var, 2);
            case 3:
                return new lk0((sr3) obj2, z, jt1Var, 3);
            case 4:
                return new lk0((y54) obj2, z, jt1Var, 4);
            case 5:
                return new lk0((ro4) obj2, z, jt1Var, 5);
            case 6:
                return new lk0((i45) obj2, z, jt1Var, 6);
            case 7:
                return new lk0((tb9) obj2, z, jt1Var, 7);
            case 8:
                return new lk0((kga) obj2, z, jt1Var, 8);
            case 9:
                return new lk0((hra) obj2, z, jt1Var, 9);
            case 10:
                return new lk0((t4b) obj2, z, jt1Var, 10);
            default:
                return new lk0((h49) obj2, z, jt1Var, 11);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((lk0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objP;
        ga1 ga1Var;
        int i = this.a;
        int i2 = 0;
        boolean z = this.c;
        xx1 xx1Var = xx1.a;
        Object obj2 = this.d;
        heb hebVar = heb.a;
        int i3 = 1;
        bp bpVarJ = null;
        switch (i) {
            case 0:
                rk0 rk0Var = (rk0) obj2;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1 || i4 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    rk0Var.l();
                    String str = rk0Var.y;
                    if (z) {
                        this.b = 1;
                        Object objA0 = wx1.a0(new ok0(rk0Var, str, bpVarJ, i2), this);
                        if (objA0 != xx1Var) {
                            objA0 = hebVar;
                        }
                        if (objA0 == xx1Var) {
                        }
                    } else {
                        this.b = 2;
                        Object objA02 = wx1.a0(new ok0(rk0Var, str, bpVarJ, i3), this);
                        if (objA02 != xx1Var) {
                            objA02 = hebVar;
                        }
                        if (objA02 == xx1Var) {
                        }
                    }
                }
                break;
            case 1:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.b = 1;
                    if (tw1.H(10L, this) == xx1Var) {
                    }
                }
                ((f07) obj2).c.setValue(Boolean.valueOf(z));
                break;
            case 2:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    yn3 yn3Var = (yn3) obj2;
                    qp3 qp3Var = yn3Var.d;
                    String str2 = yn3Var.c;
                    this.b = 1;
                    ((cq3) qp3Var).j(str2, z);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 3:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    io3 io3Var = ((sr3) obj2).e;
                    this.b = 1;
                    jo3 jo3Var = (jo3) io3Var;
                    jo3Var.a.S.e(qt.T[45], Boolean.valueOf(z));
                    fr9 fr9Var = jo3Var.e;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    fr9Var.getClass();
                    fr9Var.l(null, boolValueOf);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 4:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    vfb vfbVar = ((y54) obj2).f;
                    this.b = 1;
                    am0 am0Var = ((wfb) vfbVar).a;
                    xl7[] xl7VarArr = {new xl7("extra_is_force", Boolean.TRUE), new xl7("extra_only_follow", Boolean.valueOf(z))};
                    c81 c81Var = new c81(1);
                    while (i2 < 2) {
                        xl7 xl7Var = xl7VarArr[i2];
                        c81Var.c(xl7Var.b, (String) xl7Var.a);
                        i2++;
                    }
                    n32 n32VarB = c81Var.b();
                    if7 if7Var = new if7(AndroidBookUpdateWorker.class);
                    ((d2c) ((q) if7Var).b).e = n32VarB;
                    ((d2c) ((q) if7Var).b).j = new tp1(new p57((NetworkRequest) null), w57.b, false, false, false, false, -1L, -1L, fc1.e1(new LinkedHashSet()));
                    r1c.b(am0Var.a).a("book_update_work_force", bj3.a, if7Var.a());
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 5:
                ro4 ro4Var = (ro4) obj2;
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1 || i9 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    ro4Var.k();
                    String str3 = ro4Var.s;
                    if (z) {
                        this.b = 1;
                        Object objA03 = wx1.a0(new po4(ro4Var, str3, bpVarJ, i2), this);
                        if (objA03 != xx1Var) {
                            objA03 = hebVar;
                        }
                        if (objA03 == xx1Var) {
                        }
                    } else {
                        this.b = 2;
                        Object objA04 = wx1.a0(new po4(ro4Var, str3, bpVarJ, i3), this);
                        if (objA04 != xx1Var) {
                            objA04 = hebVar;
                        }
                        if (objA04 == xx1Var) {
                        }
                    }
                }
                break;
            case 6:
                i45 i45Var = (i45) obj2;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aw5 aw5Var = i45Var.d;
                    String str4 = i45Var.c;
                    this.b = 1;
                    ((uw5) aw5Var).m(str4, z);
                    if (hebVar == xx1Var) {
                    }
                }
                i45Var.i(i45Var.L, z ? k05.a : l05.a);
                break;
            case 7:
                tb9 tb9Var = (tb9) obj2;
                aw5 aw5Var2 = tb9Var.e;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        e11.e0(obj);
                        objP = obj;
                    } else if (i11 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    wp3 wp3VarG = ((uw5) aw5Var2).g(tb9Var.c);
                    this.b = 1;
                    objP = cx1.P(wp3VarG, this);
                    if (objP == xx1Var) {
                    }
                }
                zv5 zv5Var = (zv5) objP;
                if (zv5Var != null) {
                    zv5 zv5VarA = zv5.a(zv5Var, null, null, null, null, 0, null, null, 0, 0.0d, this.c, false, -8388609);
                    this.b = 2;
                    ((uw5) aw5Var2).j(zv5VarA);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            case 8:
                kga kgaVar = (kga) obj2;
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    if (!pja.d(kgaVar.n().b) && !(kgaVar.f instanceof wn7)) {
                        bpVarJ = tn9.j(kgaVar.n());
                        if (z) {
                            int iF = pja.f(kgaVar.n().b);
                            kgaVar.c.invoke(kga.e(kgaVar.n().a, zk9.h(iF, iF)));
                            kgaVar.q(cj4.a);
                        }
                    }
                    if (bpVarJ != null && (ga1Var = kgaVar.h) != null) {
                        fa1 fa1VarE0 = h67.E0(bpVarJ);
                        this.b = 1;
                        if (ga1Var.c(fa1VarE0, this) == xx1Var) {
                        }
                    }
                }
                break;
            case 9:
                hra hraVar = (hra) obj2;
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aw5 aw5Var3 = hraVar.I;
                    String str5 = hraVar.H;
                    this.b = 1;
                    ((uw5) aw5Var3).m(str5, z);
                    if (hebVar == xx1Var) {
                    }
                }
                hraVar.i(hraVar.i0, z ? sea.a : hfa.a);
                break;
            case 10:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    f4b f4bVar = ((t4b) obj2).c;
                    this.b = 1;
                    j4b j4bVar = (j4b) f4bVar;
                    j4bVar.b.b.e(e4b.f[0], Boolean.valueOf(z));
                    fr9 fr9Var2 = j4bVar.e;
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    fr9Var2.getClass();
                    fr9Var2.l(null, boolValueOf2);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            default:
                h49 h49Var = (h49) obj2;
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aw5 aw5Var4 = h49Var.d;
                    String str6 = h49Var.c;
                    this.b = 1;
                    ((uw5) aw5Var4).m(str6, z);
                    if (hebVar == xx1Var) {
                    }
                }
                h49Var.i(h49Var.G, z ? rpb.a : spb.a);
                break;
        }
        return hebVar;
    }
}
