package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class d2a implements xd4 {
    public static final d2a a;
    private static final m39 descriptor;

    static {
        d2a d2aVar = new d2a();
        a = d2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncBook", d2aVar, 35);
        hx7Var.k("id", false);
        hx7Var.k("name", false);
        hx7Var.k("author", false);
        hx7Var.k("cover", false);
        hx7Var.k("type", false);
        hx7Var.k("format", false);
        hx7Var.k("category", false);
        hx7Var.k("language", false);
        hx7Var.k("path_id", false);
        hx7Var.k("path", false);
        hx7Var.k("source", false);
        hx7Var.k("extension_id", false);
        hx7Var.k("status", false);
        hx7Var.k("location", false);
        hx7Var.k("description", false);
        hx7Var.k("is_nsfw", false);
        hx7Var.k("last_read_chapter_name", false);
        hx7Var.k("last_read_chapter_id", false);
        hx7Var.k("last_read_chapter_index", false);
        hx7Var.k("last_read_chapter_percent", false);
        hx7Var.k("total_chapter", false);
        hx7Var.k("total_read_time", false);
        hx7Var.k("total_listened_time", false);
        hx7Var.k("follow", false);
        hx7Var.k("favorite", false);
        hx7Var.k("hidden", false);
        hx7Var.k("pined", false);
        hx7Var.k("new_update_count", false);
        hx7Var.k("translate", false);
        hx7Var.k("extras", false);
        hx7Var.k("read_score", false);
        hx7Var.k("last_update", false);
        hx7Var.k("last_read", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        f2a f2aVar = (f2a) obj;
        f2aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = f2a.J;
        md2VarV.Z(m39Var, 0, f2aVar.a);
        md2VarV.V(m39Var, 1, (oi5) dp5VarArr[1].getValue(), f2aVar.b);
        md2VarV.V(m39Var, 2, (oi5) dp5VarArr[2].getValue(), f2aVar.c);
        md2VarV.Z(m39Var, 3, f2aVar.d);
        md2VarV.Q(4, f2aVar.e, m39Var);
        md2VarV.Q(5, f2aVar.f, m39Var);
        md2VarV.V(m39Var, 6, (oi5) dp5VarArr[6].getValue(), f2aVar.g);
        md2VarV.Z(m39Var, 7, f2aVar.h);
        md2VarV.Z(m39Var, 8, f2aVar.i);
        md2VarV.Z(m39Var, 9, f2aVar.j);
        md2VarV.Z(m39Var, 10, f2aVar.k);
        md2VarV.U(m39Var, 11, tv9.a, f2aVar.l);
        md2VarV.Q(12, f2aVar.m, m39Var);
        md2VarV.Q(13, f2aVar.n, m39Var);
        md2VarV.V(m39Var, 14, (oi5) dp5VarArr[14].getValue(), f2aVar.o);
        md2VarV.F(m39Var, 15, f2aVar.p);
        md2VarV.Z(m39Var, 16, f2aVar.q);
        md2VarV.Z(m39Var, 17, f2aVar.r);
        md2VarV.Q(18, f2aVar.s, m39Var);
        md2VarV.M(m39Var, 19, f2aVar.t);
        md2VarV.Q(20, f2aVar.u, m39Var);
        md2VarV.S(m39Var, 21, f2aVar.v);
        md2VarV.S(m39Var, 22, f2aVar.w);
        md2VarV.F(m39Var, 23, f2aVar.x);
        md2VarV.F(m39Var, 24, f2aVar.y);
        md2VarV.F(m39Var, 25, f2aVar.z);
        md2VarV.F(m39Var, 26, f2aVar.A);
        md2VarV.Q(27, f2aVar.B, m39Var);
        md2VarV.V(m39Var, 28, (oi5) dp5VarArr[28].getValue(), f2aVar.C);
        md2VarV.V(m39Var, 29, (oi5) dp5VarArr[29].getValue(), f2aVar.D);
        md2VarV.S(m39Var, 30, f2aVar.E);
        md2VarV.S(m39Var, 31, f2aVar.F);
        md2VarV.S(m39Var, 32, f2aVar.G);
        md2VarV.S(m39Var, 33, f2aVar.H);
        md2VarV.S(m39Var, 34, f2aVar.I);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        dp5[] dp5VarArr;
        boolean z;
        int i;
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr2 = f2a.J;
        float fE = 0.0f;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        long jD4 = 0;
        long jD5 = 0;
        long jD6 = 0;
        long jD7 = 0;
        Map map = null;
        Map map2 = null;
        boolean z2 = true;
        List list = null;
        String str = null;
        Map map3 = null;
        int i2 = 0;
        int i3 = 0;
        String strK = null;
        Map map4 = null;
        Map map5 = null;
        String strK2 = null;
        int iR = 0;
        int iR2 = 0;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
        int iR3 = 0;
        int iR4 = 0;
        boolean z3 = false;
        String strK7 = null;
        String strK8 = null;
        int iR5 = 0;
        int iR6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iR7 = 0;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    dp5VarArr = dp5VarArr2;
                    z2 = false;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 0:
                    dp5VarArr = dp5VarArr2;
                    strK = am1VarT.k(m39Var, 0);
                    i2 |= 1;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 1:
                    dp5VarArr = dp5VarArr2;
                    map4 = (Map) am1VarT.q(m39Var, 1, (oi5) dp5VarArr[1].getValue(), map4);
                    i2 |= 2;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 2:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    map5 = (Map) am1VarT.q(m39Var, 2, (oi5) dp5VarArr[2].getValue(), map5);
                    i2 |= 4;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 3:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK2 = am1VarT.k(m39Var, 3);
                    i2 |= 8;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 4:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR = am1VarT.r(m39Var, 4);
                    i2 |= 16;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 5:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR2 = am1VarT.r(m39Var, 5);
                    i2 |= 32;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 6:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    list = (List) am1VarT.q(m39Var, 6, (oi5) dp5VarArr[6].getValue(), list);
                    i2 |= 64;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 7:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK3 = am1VarT.k(m39Var, 7);
                    i2 |= Token.CASE;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 8:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK4 = am1VarT.k(m39Var, 8);
                    i2 |= 256;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 9:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK5 = am1VarT.k(m39Var, 9);
                    i2 |= 512;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 10:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK6 = am1VarT.k(m39Var, 10);
                    i2 |= 1024;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 11:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    str = (String) am1VarT.x(m39Var, 11, tv9.a, str);
                    i2 |= 2048;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 12:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR3 = am1VarT.r(m39Var, 12);
                    i2 |= 4096;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 13:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR4 = am1VarT.r(m39Var, 13);
                    i2 |= 8192;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 14:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    map3 = (Map) am1VarT.q(m39Var, 14, (oi5) dp5VarArr[14].getValue(), map3);
                    i2 |= 16384;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 15:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    z3 = am1VarT.z(m39Var, 15);
                    i = 32768;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 16:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK7 = am1VarT.k(m39Var, 16);
                    i = Parser.ARGC_LIMIT;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 17:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    strK8 = am1VarT.k(m39Var, 17);
                    i = 131072;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 18:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR5 = am1VarT.r(m39Var, 18);
                    i = 262144;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 19:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    i2 |= 524288;
                    fE = am1VarT.e(m39Var, 19);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 20:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR6 = am1VarT.r(m39Var, 20);
                    i = 1048576;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 21:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    i2 |= 2097152;
                    jD = am1VarT.D(m39Var, 21);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 22:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    i2 |= 4194304;
                    jD2 = am1VarT.D(m39Var, 22);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 23:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    z4 = am1VarT.z(m39Var, 23);
                    i = 8388608;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 24:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    z5 = am1VarT.z(m39Var, 24);
                    i = 16777216;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 25:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    z6 = am1VarT.z(m39Var, 25);
                    i = 33554432;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 26:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    z7 = am1VarT.z(m39Var, 26);
                    i = 67108864;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 27:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    iR7 = am1VarT.r(m39Var, 27);
                    i = 134217728;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 28:
                    dp5VarArr = dp5VarArr2;
                    z = true;
                    map2 = (Map) am1VarT.q(m39Var, 28, (oi5) dp5VarArr[28].getValue(), map2);
                    i = 268435456;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 29:
                    z = true;
                    dp5VarArr = dp5VarArr2;
                    map = (Map) am1VarT.q(m39Var, 29, (oi5) dp5VarArr2[29].getValue(), map);
                    i = 536870912;
                    i2 |= i;
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 30:
                    i2 |= 1073741824;
                    dp5VarArr = dp5VarArr2;
                    jD3 = am1VarT.D(m39Var, 30);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 31:
                    i2 |= Integer.MIN_VALUE;
                    dp5VarArr = dp5VarArr2;
                    jD4 = am1VarT.D(m39Var, 31);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case 32:
                    i3 |= 1;
                    dp5VarArr = dp5VarArr2;
                    jD5 = am1VarT.D(m39Var, 32);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case Token.GETPROP /* 33 */:
                    i3 |= 2;
                    dp5VarArr = dp5VarArr2;
                    jD6 = am1VarT.D(m39Var, 33);
                    dp5VarArr2 = dp5VarArr;
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    i3 |= 4;
                    dp5VarArr = dp5VarArr2;
                    jD7 = am1VarT.D(m39Var, 34);
                    dp5VarArr2 = dp5VarArr;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new f2a(i2, i3, strK, map4, map5, strK2, iR, iR2, list, strK3, strK4, strK5, strK6, str, iR3, iR4, map3, z3, strK7, strK8, iR5, fE, iR6, jD, jD2, z4, z5, z6, z7, iR7, map2, map, jD3, jD4, jD5, jD6, jD7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = f2a.J;
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        mm0 mm0Var = mm0.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, dp5VarArr[1].getValue(), dp5VarArr[2].getValue(), tv9Var, la5Var, la5Var, dp5VarArr[6].getValue(), tv9Var, tv9Var, tv9Var, tv9Var, s32.J0(tv9Var), la5Var, la5Var, dp5VarArr[14].getValue(), mm0Var, tv9Var, tv9Var, la5Var, g14.a, la5Var, e66Var, e66Var, mm0Var, mm0Var, mm0Var, mm0Var, la5Var, dp5VarArr[28].getValue(), dp5VarArr[29].getValue(), e66Var, e66Var, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
