package defpackage;

import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class r3a implements xd4 {
    public static final r3a a;
    private static final m39 descriptor;

    static {
        r3a r3aVar = new r3a();
        a = r3aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncExtension", r3aVar, 24);
        hx7Var.k("id", false);
        hx7Var.k("name", false);
        hx7Var.k("author", false);
        hx7Var.k("version", false);
        hx7Var.k("source", false);
        hx7Var.k("path", false);
        hx7Var.k("regex", false);
        hx7Var.k("icon", false);
        hx7Var.k("description", false);
        hx7Var.k("language", false);
        hx7Var.k("type", false);
        hx7Var.k("nsfw", false);
        hx7Var.k("development", false);
        hx7Var.k("draft", false);
        hx7Var.k("encrypt", false);
        hx7Var.k("script_metadata", false);
        hx7Var.k("setting_metadata", false);
        hx7Var.k("script_data", false);
        hx7Var.k("setting_data", false);
        hx7Var.k("translate_data", false);
        hx7Var.k("pined_at", false);
        hx7Var.k("last_use", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        t3a t3aVar = (t3a) obj;
        t3aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = t3a.y;
        md2VarV.Z(m39Var, 0, t3aVar.a);
        md2VarV.Z(m39Var, 1, t3aVar.b);
        md2VarV.Z(m39Var, 2, t3aVar.c);
        md2VarV.Q(3, t3aVar.d, m39Var);
        md2VarV.Z(m39Var, 4, t3aVar.e);
        md2VarV.Z(m39Var, 5, t3aVar.f);
        md2VarV.Z(m39Var, 6, t3aVar.g);
        md2VarV.Z(m39Var, 7, t3aVar.h);
        md2VarV.Z(m39Var, 8, t3aVar.i);
        md2VarV.Z(m39Var, 9, t3aVar.j);
        md2VarV.Q(10, t3aVar.k, m39Var);
        md2VarV.F(m39Var, 11, t3aVar.l);
        md2VarV.F(m39Var, 12, t3aVar.m);
        md2VarV.F(m39Var, 13, t3aVar.n);
        md2VarV.F(m39Var, 14, t3aVar.o);
        md2VarV.V(m39Var, 15, (oi5) dp5VarArr[15].getValue(), t3aVar.p);
        md2VarV.V(m39Var, 16, (oi5) dp5VarArr[16].getValue(), t3aVar.q);
        md2VarV.V(m39Var, 17, (oi5) dp5VarArr[17].getValue(), t3aVar.r);
        md2VarV.V(m39Var, 18, (oi5) dp5VarArr[18].getValue(), t3aVar.s);
        md2VarV.V(m39Var, 19, (oi5) dp5VarArr[19].getValue(), t3aVar.t);
        md2VarV.S(m39Var, 20, t3aVar.u);
        md2VarV.S(m39Var, 21, t3aVar.v);
        md2VarV.S(m39Var, 22, t3aVar.w);
        md2VarV.S(m39Var, 23, t3aVar.x);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        dp5[] dp5VarArr;
        int i;
        dp5[] dp5VarArr2;
        boolean z;
        int i2;
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr3 = t3a.y;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        long jD4 = 0;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean z2 = true;
        Map map4 = null;
        Map map5 = null;
        int i3 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        int iR = 0;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
        String strK7 = null;
        String strK8 = null;
        String strK9 = null;
        int iR2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    strK = am1VarT.k(m39Var, 0);
                    i3 |= 1;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 1:
                    dp5VarArr = dp5VarArr3;
                    strK2 = am1VarT.k(m39Var, 1);
                    i3 |= 2;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 2:
                    dp5VarArr = dp5VarArr3;
                    strK3 = am1VarT.k(m39Var, 2);
                    i3 |= 4;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 3:
                    dp5VarArr = dp5VarArr3;
                    iR = am1VarT.r(m39Var, 3);
                    i3 |= 8;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 4:
                    dp5VarArr = dp5VarArr3;
                    strK4 = am1VarT.k(m39Var, 4);
                    i3 |= 16;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 5:
                    dp5VarArr = dp5VarArr3;
                    strK5 = am1VarT.k(m39Var, 5);
                    i3 |= 32;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 6:
                    dp5VarArr = dp5VarArr3;
                    strK6 = am1VarT.k(m39Var, 6);
                    i3 |= 64;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 7:
                    dp5VarArr = dp5VarArr3;
                    strK7 = am1VarT.k(m39Var, 7);
                    i3 |= Token.CASE;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 8:
                    dp5VarArr = dp5VarArr3;
                    strK8 = am1VarT.k(m39Var, 8);
                    i3 |= 256;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 9:
                    dp5VarArr = dp5VarArr3;
                    strK9 = am1VarT.k(m39Var, 9);
                    i3 |= 512;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 10:
                    dp5VarArr = dp5VarArr3;
                    iR2 = am1VarT.r(m39Var, 10);
                    i3 |= 1024;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 11:
                    dp5VarArr = dp5VarArr3;
                    z3 = am1VarT.z(m39Var, 11);
                    i3 |= 2048;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 12:
                    dp5VarArr = dp5VarArr3;
                    z4 = am1VarT.z(m39Var, 12);
                    i3 |= 4096;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 13:
                    dp5VarArr = dp5VarArr3;
                    z5 = am1VarT.z(m39Var, 13);
                    i3 |= 8192;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 14:
                    dp5VarArr = dp5VarArr3;
                    z6 = am1VarT.z(m39Var, 14);
                    i3 |= 16384;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 15:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    map4 = (Map) am1VarT.q(m39Var, 15, (oi5) dp5VarArr2[15].getValue(), map4);
                    i2 = 32768;
                    i3 |= i2;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 16:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    map5 = (Map) am1VarT.q(m39Var, 16, (oi5) dp5VarArr2[16].getValue(), map5);
                    i2 = Parser.ARGC_LIMIT;
                    i3 |= i2;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 17:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    map3 = (Map) am1VarT.q(m39Var, 17, (oi5) dp5VarArr2[17].getValue(), map3);
                    i2 = 131072;
                    i3 |= i2;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 18:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    map2 = (Map) am1VarT.q(m39Var, 18, (oi5) dp5VarArr2[18].getValue(), map2);
                    i2 = 262144;
                    i3 |= i2;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 19:
                    dp5VarArr2 = dp5VarArr3;
                    z = z2;
                    map = (Map) am1VarT.q(m39Var, 19, (oi5) dp5VarArr2[19].getValue(), map);
                    i2 = 524288;
                    i3 |= i2;
                    dp5VarArr3 = dp5VarArr2;
                    z2 = z;
                    break;
                case 20:
                    dp5VarArr = dp5VarArr3;
                    jD = am1VarT.D(m39Var, 20);
                    i = 1048576;
                    i3 |= i;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 21:
                    dp5VarArr = dp5VarArr3;
                    jD2 = am1VarT.D(m39Var, 21);
                    i = 2097152;
                    i3 |= i;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 22:
                    dp5VarArr = dp5VarArr3;
                    jD3 = am1VarT.D(m39Var, 22);
                    i = 4194304;
                    i3 |= i;
                    dp5VarArr3 = dp5VarArr;
                    break;
                case 23:
                    dp5VarArr = dp5VarArr3;
                    jD4 = am1VarT.D(m39Var, 23);
                    i = 8388608;
                    i3 |= i;
                    dp5VarArr3 = dp5VarArr;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new t3a(i3, strK, strK2, strK3, iR, strK4, strK5, strK6, strK7, strK8, strK9, iR2, z3, z4, z5, z6, map4, map5, map3, map2, map, jD, jD2, jD3, jD4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = t3a.y;
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        mm0 mm0Var = mm0.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, la5Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, la5Var, mm0Var, mm0Var, mm0Var, mm0Var, dp5VarArr[15].getValue(), dp5VarArr[16].getValue(), dp5VarArr[17].getValue(), dp5VarArr[18].getValue(), dp5VarArr[19].getValue(), e66Var, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
