package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bo8 implements cc4 {
    public final /* synthetic */ zn8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ta5 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ pj7 e;
    public final /* synthetic */ yb4 f;

    public bo8(String str, zn8 zn8Var, boolean z, ta5 ta5Var, yb4 yb4Var, pj7 pj7Var, boolean z2, uka ukaVar, yb4 yb4Var2) {
        this.a = zn8Var;
        this.b = z;
        this.c = ta5Var;
        this.d = yb4Var;
        this.e = pj7Var;
        this.f = yb4Var2;
    }

    @Override // defpackage.cc4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        float fFloatValue = ((Number) obj).floatValue();
        long j = ((lc1) obj2).a;
        long j2 = ((lc1) obj3).a;
        float fFloatValue2 = ((Number) obj4).floatValue();
        dd4 dd4Var = (dd4) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.c(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.e(j) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= dd4Var.e(j2) ? 256 : Token.CASE;
        }
        if ((iIntValue & 3072) == 0) {
            i |= dd4Var.c(fFloatValue2) ? 2048 : 1024;
        }
        if (dd4Var.V(i & 1, (i & 9363) != 9362)) {
            dd4Var.f0(296608919);
            dd4Var.q(false);
            dd4Var.f0(297621752);
            dd4Var.q(false);
            boolean zG = dd4Var.g(false) | dd4Var.f("Invalid input");
            Object objQ = dd4Var.Q();
            if (zG || objQ == vl1.a) {
                objQ = new f48(15);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarC = a29.c(lu6.a, false, (kb4) objQ);
            zn8 zn8Var = this.a;
            zn8Var.getClass();
            ta5 ta5Var = this.c;
            ta5Var.getClass();
            a07 a07VarL = ny1.l(ta5Var, dd4Var, 0);
            boolean z = this.b;
            long j3 = ((lc1) dk9.A(new lc1(!z ? zn8Var.m : ((Boolean) a07VarL.getValue()).booleanValue() ? zn8Var.k : zn8Var.l), dd4Var).getValue()).a;
            dd4Var.f0(298206938);
            dd4Var.q(false);
            long j4 = ((lc1) dk9.A(new lc1(!z ? zn8Var.q : ((Boolean) ny1.l(ta5Var, dd4Var, 0).getValue()).booleanValue() ? zn8Var.o : zn8Var.p), dd4Var).getValue()).a;
            dd4Var.f0(298508537);
            dd4Var.q(false);
            long j5 = ((lc1) dk9.A(new lc1(!z ? zn8Var.A : ((Boolean) ny1.l(ta5Var, dd4Var, 0).getValue()).booleanValue() ? zn8Var.y : zn8Var.z), dd4Var).getValue()).a;
            dd4Var.f0(298831743);
            dd4Var.q(false);
            dd4Var.f0(299069793);
            y86.m(ou6VarC, this.d, null, null, null, null, fFloatValue, jf0.G(1019550308, new v8(this.f, 5, (byte) 0), dd4Var), null, this.e, dd4Var, ((i << 21) & 29360128) | 100663296);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
