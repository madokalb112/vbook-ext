package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xia extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xia(List list, int i, int i2, int i3, int i4, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new xia((List) obj2, this.b, this.c, this.d, this.e, jt1Var);
            default:
                return new xia((hra) obj2, this.e, jt1Var);
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
        return ((xia) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i;
        Integer numL;
        Integer numL2;
        int i2;
        int i3;
        int i4;
        int i5;
        Object objF0;
        Object value;
        int iA;
        Object value2;
        st5 st5Var;
        int i6 = this.a;
        int i7 = this.e;
        Object obj2 = this.f;
        int iIntValue = 0;
        switch (i6) {
            case 0:
                e11.e0(obj);
                ap apVar = (ap) fc1.x0((List) obj2);
                int i8 = this.b;
                int i9 = this.c;
                int i10 = this.d;
                String strW0 = bw9.w0((String) apVar.a, "=");
                String str = (String) apVar.a;
                String strS0 = bw9.s0(str, "=", str);
                int iHashCode = strW0.hashCode();
                if (iHashCode != 104387) {
                    if (iHashCode != 93166550) {
                        if (iHashCode == 112202875 && strW0.equals("video")) {
                            i3 = (i10 * 9) / 16;
                            i = i3;
                            iIntValue = i10;
                        }
                        i = 0;
                    } else {
                        if (strW0.equals("audio")) {
                            i3 = i10 / 5;
                            i = i3;
                            iIntValue = i10;
                        }
                        i = 0;
                    }
                } else if (strW0.equals("img")) {
                    List listP0 = bw9.p0(bw9.u0(str, " ", str), new String[]{"x"});
                    String str2 = (String) fc1.z0(listP0);
                    int iIntValue2 = (str2 == null || (numL2 = iw9.L(10, str2)) == null) ? 0 : numL2.intValue();
                    String str3 = (String) fc1.F0(listP0);
                    if (str3 != null && (numL = iw9.L(10, str3)) != null) {
                        iIntValue = numL.intValue();
                    }
                    strS0 = bw9.y0(strS0, " ");
                    i = iIntValue;
                    iIntValue = iIntValue2;
                } else {
                    i = 0;
                }
                if (iIntValue <= 0 || iIntValue == i10) {
                    i10 = iIntValue;
                } else {
                    i = (i * i10) / iIntValue;
                }
                if (i > i7) {
                    i10 = (i10 * i7) / i;
                    i2 = i7;
                } else {
                    i2 = i;
                }
                int i11 = i10;
                return new uia(i8, i9, i11, i2, null, new via(new kf8(0.0f, 0.0f, i11, i2), strW0, strS0));
            default:
                hra hraVar = (hra) obj2;
                int i12 = this.d;
                if (i12 == 0) {
                    e11.e0(obj);
                    qba qbaVar = hraVar.L;
                    fr9 fr9Var = hraVar.o0;
                    ((xba) qbaVar).a.a.e(zia.A[0], Integer.valueOf(i7));
                    fr9 fr9Var2 = hraVar.j0;
                    if (fr9Var2 != null) {
                        do {
                            value = fr9Var2.getValue();
                        } while (!fr9Var2.j(value, yba.a((yba) value, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, this.e, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -524289, 1)));
                    }
                    i4 = ((xja) fr9Var.getValue()).b;
                    i5 = ((xja) fr9Var.getValue()).c;
                    hraVar.C0.b();
                    int i13 = hraVar.J0;
                    this.b = i4;
                    this.c = i5;
                    this.d = 1;
                    objF0 = hra.f0(hraVar, i13, this);
                    xx1 xx1Var = xx1.a;
                    if (objF0 == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i14 = this.c;
                    int i15 = this.b;
                    e11.e0(obj);
                    i5 = i14;
                    i4 = i15;
                    objF0 = obj;
                }
                List list = (List) objF0;
                Iterator it = list.iterator();
                int i16 = 0;
                while (true) {
                    iA = -1;
                    if (it.hasNext()) {
                        tj7 tj7Var = (tj7) it.next();
                        if (!(tj7Var instanceof pia) || tj7Var.b != hraVar.J0) {
                            i16++;
                        }
                    } else {
                        i16 = -1;
                    }
                }
                if (i16 >= 0) {
                    Object obj3 = list.get(i16);
                    obj3.getClass();
                    iA = xv5.a(((pia) obj3).f, i4, i5, i16);
                } else {
                    Iterator it2 = list.iterator();
                    int i17 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((tj7) it2.next()).b == hraVar.J0) {
                                iA = i17;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                fr9 fr9Var3 = hraVar.n0;
                if (fr9Var3 != null) {
                    do {
                        value2 = fr9Var3.getValue();
                        st5Var = new st5(iA, 2, 0);
                        ((nca) value2).getClass();
                    } while (!fr9Var3.j(value2, nca.a(st5Var, list)));
                }
                return heb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xia(hra hraVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = hraVar;
        this.e = i;
    }
}
