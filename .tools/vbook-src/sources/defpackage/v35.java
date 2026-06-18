package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v35 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i45 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v35(i45 i45Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = i45Var;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        i45 i45Var = this.b;
        switch (i) {
            case 0:
                return new v35(i45Var, this.c, jt1Var, 0);
            case 1:
                return new v35(i45Var, this.c, jt1Var, 1);
            case 2:
                return new v35(i45Var, this.c, jt1Var, 2);
            case 3:
                return new v35(i45Var, this.c, jt1Var, 3);
            case 4:
                return new v35(4, jt1Var, i45Var);
            case 5:
                return new v35(5, jt1Var, i45Var);
            case 6:
                return new v35(6, jt1Var, i45Var);
            default:
                return new v35(7, jt1Var, i45Var);
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
                ((v35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((v35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((v35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((v35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((v35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        rz4 rz4Var;
        Object value5;
        Object value6;
        rz4 rz4Var2;
        Object objN;
        int i = this.a;
        int i2 = 2;
        xx1 xx1Var = xx1.a;
        int i3 = 1;
        i45 i45Var = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((yy4) i45Var.v).b.d.e(m15.k[3], Integer.valueOf(this.c));
                fr9 fr9Var = i45Var.M;
                int i4 = this.c;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, zy4.a((zy4) value, 0, 0, 0.0f, i4, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097143)));
                }
                break;
            case 1:
                e11.e0(obj);
                ((yy4) i45Var.v).b.e.e(m15.k[4], Integer.valueOf(this.c));
                fr9 fr9Var2 = i45Var.M;
                int i5 = this.c;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, zy4.a((zy4) value2, 0, 0, 0.0f, 0, i5, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097135)));
                }
                break;
            case 2:
                e11.e0(obj);
                ((yy4) i45Var.v).b.b.e(m15.k[1], Integer.valueOf(this.c));
                fr9 fr9Var3 = i45Var.Q;
                if (fr9Var3 != null) {
                    do {
                        value4 = fr9Var3.getValue();
                        rz4Var = (rz4) value4;
                    } while (!fr9Var3.j(value4, rz4.b(rz4Var, new st5(rz4Var.a.h(), 2, 0), null, 2)));
                }
                fr9 fr9Var4 = i45Var.M;
                int i6 = this.c;
                if (fr9Var4 != null) {
                    do {
                        value3 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value3, zy4.a((zy4) value3, 0, i6, 0.0f, 0, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097149)));
                }
                break;
            case 3:
                e11.e0(obj);
                ((yy4) i45Var.v).b.a.e(m15.k[0], Integer.valueOf(this.c));
                fr9 fr9Var5 = i45Var.Q;
                if (fr9Var5 != null) {
                    do {
                        value6 = fr9Var5.getValue();
                        rz4Var2 = (rz4) value6;
                    } while (!fr9Var5.j(value6, rz4.b(rz4Var2, new st5(rz4Var2.a.h(), 2, 0), null, 2)));
                }
                fr9 fr9Var6 = i45Var.M;
                int i7 = this.c;
                if (fr9Var6 != null) {
                    do {
                        value5 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value5, zy4.a((zy4) value5, i7, 0, 0.0f, 0, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097150)));
                }
                break;
            case 4:
                int i8 = this.c;
                if (i8 != 0) {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    this.c = 1;
                    if (i45.k(i45Var, this) == xx1Var) {
                    }
                }
                break;
            case 5:
                int i9 = this.c;
                if (i9 != 0) {
                    if (i9 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    cm0 cm0Var = i45Var.s;
                    String str = i45Var.c;
                    hm0 hm0Var = (hm0) cm0Var;
                    hm0Var.getClass();
                    str.getClass();
                    b92 b92Var = hm0Var.a.c;
                    b92Var.getClass();
                    g92 g92Var = g92.a;
                    pp1 pp1VarR = qx1.R(new g82(b92Var, str, new d92(b92Var, i2)));
                    aj2 aj2Var = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR, nh2.c);
                    oz4 oz4Var = new oz4(i45Var, i3);
                    this.c = 1;
                    Object objA = y34VarE.a(new gm0(oz4Var, 0), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                }
                break;
            case 6:
                int i10 = this.c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        objN = obj;
                    }
                    break;
                } else {
                    e11.e0(obj);
                    u31 u31Var = new u31(i45Var.B, 2);
                    this.c = 1;
                    objN = cx1.N(u31Var, this);
                    if (objN == xx1Var) {
                    }
                }
                List list = (List) objN;
                fr9 fr9Var7 = i45Var.S;
                if (fr9Var7 != null) {
                    while (true) {
                        Object value7 = fr9Var7.getValue();
                        py4 py4Var = (py4) value7;
                        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                            bm0 bm0Var = (bm0) it.next();
                            String str2 = bm0Var.a;
                            String str3 = bm0Var.b;
                            int i11 = bm0Var.c;
                            arrayList.add(new oy4(str2, str3, i11, i45Var.m(i11), bm0Var.f, bm0Var.h, bm0Var.i, bm0Var.j, bm0Var.k));
                            list = list;
                        }
                        List list2 = list;
                        py4Var.getClass();
                        if (!fr9Var7.j(value7, new py4(arrayList))) {
                            list = list2;
                        }
                    }
                }
                break;
            default:
                int i12 = this.c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    q15 q15Var = i45Var.f;
                    String str4 = i45Var.c;
                    int i13 = i45Var.H;
                    long jC = r95.a.k().c();
                    this.c = 1;
                    ((v15) q15Var).a.f.w0(i13, str4, jC);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v35(int i, jt1 jt1Var, i45 i45Var) {
        super(2, jt1Var);
        this.a = i;
        this.b = i45Var;
    }
}
