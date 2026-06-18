package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sc7 implements xd4 {
    public static final sc7 a;
    private static final m39 descriptor;

    static {
        sc7 sc7Var = new sc7();
        a = sc7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncBook", sc7Var, 34);
        hx7Var.k("book_id", true);
        hx7Var.k("extension_id", true);
        hx7Var.k("name", true);
        hx7Var.k("author", true);
        hx7Var.k("name_trans", true);
        hx7Var.k("author_trans", true);
        hx7Var.k("cover", true);
        hx7Var.k("path", true);
        hx7Var.k("reference_path", true);
        hx7Var.k("book_source", true);
        hx7Var.k("book_location", true);
        hx7Var.k("percent", true);
        hx7Var.k("last_index", true);
        hx7Var.k("last_position", true);
        hx7Var.k("last_chapter", true);
        hx7Var.k("last_chapter_trans", true);
        hx7Var.k("timestamp", true);
        hx7Var.k("total_reading_time", true);
        hx7Var.k("total_tts_time", true);
        hx7Var.k("support_update", true);
        hx7Var.k("book_folder", true);
        hx7Var.k("last_update", true);
        hx7Var.k("last_new_chap", true);
        hx7Var.k("follow_new_chap", true);
        hx7Var.k("book_type", true);
        hx7Var.k("book_status", true);
        hx7Var.k("chapter_count", true);
        hx7Var.k("is_new", true);
        hx7Var.k("nsfw", true);
        hx7Var.k("hide_chap_name", true);
        hx7Var.k("tags", true);
        hx7Var.k("enable_trans", true);
        hx7Var.k("favorite", true);
        hx7Var.k("config", true);
        descriptor = hx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    @Override // defpackage.oi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.md2 r43, java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc7.b(md2, java.lang.Object):void");
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        int i;
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i2 = 0;
        int i3 = 0;
        int iR = 0;
        int iR2 = 0;
        boolean z = false;
        boolean z2 = false;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
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
        float fE = 0.0f;
        float fE2 = 0.0f;
        long j = 0;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        long jD4 = 0;
        long jD5 = 0;
        boolean z8 = true;
        while (z8) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z8 = false;
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
                    strK4 = am1VarT.k(m39Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strK5 = am1VarT.k(m39Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strK6 = am1VarT.k(m39Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strK7 = am1VarT.k(m39Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strK8 = am1VarT.k(m39Var, 7);
                    i2 |= Token.CASE;
                    continue;
                case 8:
                    strK9 = am1VarT.k(m39Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strK10 = am1VarT.k(m39Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    iR = am1VarT.r(m39Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    i2 |= 2048;
                    fE = am1VarT.e(m39Var, 11);
                    continue;
                case 12:
                    iR2 = am1VarT.r(m39Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    i2 |= 8192;
                    fE2 = am1VarT.e(m39Var, 13);
                    continue;
                case 14:
                    strK11 = am1VarT.k(m39Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strK12 = am1VarT.k(m39Var, 15);
                    i = 32768;
                    break;
                case 16:
                    long jD6 = am1VarT.D(m39Var, 16);
                    i2 |= Parser.ARGC_LIMIT;
                    j = jD6;
                    continue;
                case 17:
                    i2 |= 131072;
                    jD = am1VarT.D(m39Var, 17);
                    continue;
                case 18:
                    i2 |= 262144;
                    jD2 = am1VarT.D(m39Var, 18);
                    continue;
                case 19:
                    z = am1VarT.z(m39Var, 19);
                    i = 524288;
                    break;
                case 20:
                    i2 |= 1048576;
                    jD3 = am1VarT.D(m39Var, 20);
                    continue;
                case 21:
                    i2 |= 2097152;
                    jD4 = am1VarT.D(m39Var, 21);
                    continue;
                case 22:
                    i2 |= 4194304;
                    jD5 = am1VarT.D(m39Var, 22);
                    continue;
                case 23:
                    z2 = am1VarT.z(m39Var, 23);
                    i = 8388608;
                    break;
                case 24:
                    iR3 = am1VarT.r(m39Var, 24);
                    i = 16777216;
                    break;
                case 25:
                    iR4 = am1VarT.r(m39Var, 25);
                    i = 33554432;
                    break;
                case 26:
                    iR5 = am1VarT.r(m39Var, 26);
                    i = 67108864;
                    break;
                case 27:
                    z3 = am1VarT.z(m39Var, 27);
                    i = 134217728;
                    break;
                case 28:
                    z4 = am1VarT.z(m39Var, 28);
                    i = 268435456;
                    break;
                case 29:
                    z5 = am1VarT.z(m39Var, 29);
                    i = 536870912;
                    break;
                case 30:
                    strK13 = am1VarT.k(m39Var, 30);
                    i = 1073741824;
                    break;
                case 31:
                    z6 = am1VarT.z(m39Var, 31);
                    i = Integer.MIN_VALUE;
                    break;
                case 32:
                    z7 = am1VarT.z(m39Var, 32);
                    i3 |= 1;
                    continue;
                case Token.GETPROP /* 33 */:
                    strK14 = am1VarT.k(m39Var, 33);
                    i3 |= 2;
                    continue;
                default:
                    sy3.c(iF);
                    return null;
            }
            i2 |= i;
        }
        am1VarT.n(m39Var);
        return new uc7(i2, i3, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, strK10, iR, fE, iR2, fE2, strK11, strK12, j, jD, jD2, z, jD3, jD4, jD5, z2, iR3, iR4, iR5, z3, z4, z5, strK13, z6, z7, strK14);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        g14 g14Var = g14.a;
        e66 e66Var = e66.a;
        mm0 mm0Var = mm0.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, la5Var, g14Var, la5Var, g14Var, tv9Var, tv9Var, e66Var, e66Var, e66Var, mm0Var, e66Var, e66Var, e66Var, mm0Var, la5Var, la5Var, la5Var, mm0Var, mm0Var, mm0Var, tv9Var, mm0Var, mm0Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
