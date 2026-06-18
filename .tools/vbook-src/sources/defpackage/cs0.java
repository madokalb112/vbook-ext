package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class cs0 {
    public static final rj7 a;
    public static final rj7 b;
    public static final float c;
    public static final float d;

    static {
        float f = sdc.y;
        float f2 = sdc.z;
        a = new rj7(f, 8.0f, f2, 8.0f);
        gjb.p(16.0f, 8.0f, f2, 8.0f);
        b = new rj7(12.0f, 8.0f, 12.0f, 8.0f);
        gjb.p(12.0f, 8.0f, 16.0f, 8.0f);
        c = 58.0f;
        cn7 cn7Var = zz7.a;
        d = ((Boolean) cn7Var.getValue()).booleanValue() ? 36.0f : 40.0f;
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).getClass();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
        ((Boolean) cn7Var.getValue()).booleanValue();
    }

    public static bs0 a(long j, long j2, long j3, long j4, dd4 dd4Var, int i) {
        long j5 = (i & 4) != 0 ? lc1.j : j3;
        long j6 = (i & 8) != 0 ? lc1.j : j4;
        bs0 bs0VarB = b(((q96) dd4Var.j(s96.a)).a);
        long j7 = j != 16 ? j : bs0VarB.a;
        long j8 = j2 != 16 ? j2 : bs0VarB.b;
        if (j5 == 16) {
            j5 = bs0VarB.c;
        }
        if (j6 == 16) {
            j6 = bs0VarB.d;
        }
        return new bs0(j7, j8, j5, j6);
    }

    public static bs0 b(ad1 ad1Var) {
        bs0 bs0Var = ad1Var.W;
        if (bs0Var != null) {
            return bs0Var;
        }
        bs0 bs0Var2 = new bs0(dd1.d(ad1Var, vo1.r), dd1.d(ad1Var, vo1.x), lc1.c(vo1.t, dd1.d(ad1Var, vo1.s)), lc1.c(vo1.v, dd1.d(ad1Var, vo1.u)));
        ad1Var.W = bs0Var2;
        return bs0Var2;
    }
}
