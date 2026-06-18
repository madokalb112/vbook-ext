package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hd7 implements xd4 {
    public static final hd7 a;
    private static final m39 descriptor;

    static {
        hd7 hd7Var = new hd7();
        a = hd7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncExtension", hd7Var, 34);
        hx7Var.k("id", true);
        hx7Var.k("name", true);
        hx7Var.k("author", true);
        hx7Var.k("version", true);
        hx7Var.k("source", true);
        hx7Var.k("icon", true);
        hx7Var.k("regexp", true);
        hx7Var.k("description", true);
        hx7Var.k("last_update", true);
        hx7Var.k("url", true);
        hx7Var.k("local", true);
        hx7Var.k("language", true);
        hx7Var.k("type", true);
        hx7Var.k("enabled", true);
        hx7Var.k("priority", true);
        hx7Var.k("tag", true);
        hx7Var.k("agent", true);
        hx7Var.k("debug", true);
        hx7Var.k("last_use", true);
        hx7Var.k("search_index", true);
        hx7Var.k("delay_connect", true);
        hx7Var.k("num_connect", true);
        hx7Var.k("discovery", true);
        hx7Var.k("home", true);
        hx7Var.k("detail", true);
        hx7Var.k("page", true);
        hx7Var.k("site", true);
        hx7Var.k("toc", true);
        hx7Var.k("chap", true);
        hx7Var.k("search", true);
        hx7Var.k("genre", true);
        hx7Var.k("data", true);
        hx7Var.k("config", true);
        hx7Var.k("encrypt", true);
        descriptor = hx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    @Override // defpackage.oi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.md2 r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.b(md2, java.lang.Object):void");
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        int i;
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i2 = 0;
        int i3 = 0;
        int iR = 0;
        boolean z = false;
        int iR2 = 0;
        boolean z2 = false;
        int iR3 = 0;
        int iR4 = 0;
        boolean z3 = false;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
        String strK7 = null;
        String strK8 = null;
        String strK9 = null;
        String strK10 = null;
        String strK11 = null;
        String strK12 = null;
        String strK13 = null;
        String strK14 = null;
        String strK15 = null;
        String strK16 = null;
        String strK17 = null;
        String strK18 = null;
        String strK19 = null;
        String strK20 = null;
        String strK21 = null;
        String strK22 = null;
        String strK23 = null;
        String strK24 = null;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z4 = true;
        while (z4) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z4 = false;
                    continue;
                case 0:
                    strK = am1VarT.k(m39Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strK2 = am1VarT.k(m39Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strK3 = am1VarT.k(m39Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    iR = am1VarT.r(m39Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strK4 = am1VarT.k(m39Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strK5 = am1VarT.k(m39Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strK6 = am1VarT.k(m39Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strK7 = am1VarT.k(m39Var, 7);
                    i2 |= Token.CASE;
                    continue;
                case 8:
                    i2 |= 256;
                    jD = am1VarT.D(m39Var, 8);
                    continue;
                case 9:
                    strK8 = am1VarT.k(m39Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strK9 = am1VarT.k(m39Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strK10 = am1VarT.k(m39Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strK11 = am1VarT.k(m39Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    z = am1VarT.z(m39Var, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    iR2 = am1VarT.r(m39Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strK12 = am1VarT.k(m39Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strK13 = am1VarT.k(m39Var, 16);
                    i = Parser.ARGC_LIMIT;
                    break;
                case 17:
                    z2 = am1VarT.z(m39Var, 17);
                    i = 131072;
                    break;
                case 18:
                    i2 |= 262144;
                    jD2 = am1VarT.D(m39Var, 18);
                    continue;
                case 19:
                    iR3 = am1VarT.r(m39Var, 19);
                    i = 524288;
                    break;
                case 20:
                    i2 |= 1048576;
                    jD3 = am1VarT.D(m39Var, 20);
                    continue;
                case 21:
                    iR4 = am1VarT.r(m39Var, 21);
                    i = 2097152;
                    break;
                case 22:
                    strK14 = am1VarT.k(m39Var, 22);
                    i = 4194304;
                    break;
                case 23:
                    strK15 = am1VarT.k(m39Var, 23);
                    i = 8388608;
                    break;
                case 24:
                    strK16 = am1VarT.k(m39Var, 24);
                    i = 16777216;
                    break;
                case 25:
                    strK17 = am1VarT.k(m39Var, 25);
                    i = 33554432;
                    break;
                case 26:
                    strK18 = am1VarT.k(m39Var, 26);
                    i = 67108864;
                    break;
                case 27:
                    strK19 = am1VarT.k(m39Var, 27);
                    i = 134217728;
                    break;
                case 28:
                    strK20 = am1VarT.k(m39Var, 28);
                    i = 268435456;
                    break;
                case 29:
                    strK21 = am1VarT.k(m39Var, 29);
                    i = 536870912;
                    break;
                case 30:
                    strK22 = am1VarT.k(m39Var, 30);
                    i = 1073741824;
                    break;
                case 31:
                    strK23 = am1VarT.k(m39Var, 31);
                    i = Integer.MIN_VALUE;
                    break;
                case 32:
                    strK24 = am1VarT.k(m39Var, 32);
                    i3 |= 1;
                    continue;
                case Token.GETPROP /* 33 */:
                    z3 = am1VarT.z(m39Var, 33);
                    i3 |= 2;
                    continue;
                default:
                    sy3.c(iF);
                    return null;
            }
            i2 |= i;
        }
        am1VarT.n(m39Var);
        return new jd7(i2, i3, strK, strK2, strK3, iR, strK4, strK5, strK6, strK7, jD, strK8, strK9, strK10, strK11, z, iR2, strK12, strK13, z2, jD2, iR3, jD3, iR4, strK14, strK15, strK16, strK17, strK18, strK19, strK20, strK21, strK22, strK23, strK24, z3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        e66 e66Var = e66.a;
        mm0 mm0Var = mm0.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, la5Var, tv9Var, tv9Var, tv9Var, tv9Var, e66Var, tv9Var, tv9Var, tv9Var, tv9Var, mm0Var, la5Var, tv9Var, tv9Var, mm0Var, e66Var, la5Var, e66Var, la5Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, mm0Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
