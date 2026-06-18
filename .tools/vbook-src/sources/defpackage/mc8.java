package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class mc8 implements ix1, pa1, t91, lv, ig0, iu8, qa1, t67 {
    public final /* synthetic */ int a;
    public static final mc8 b = new mc8(1);
    public static final gp c = new gp(28);
    public static final mc8 d = new mc8(3);
    public static final /* synthetic */ mc8 e = new mc8(4);
    public static final /* synthetic */ mc8 f = new mc8(5);
    public static final mc8 s = new mc8(6);
    public static final mc8 t = new mc8(7);
    public static final /* synthetic */ mc8 u = new mc8(8);
    public static final qi2 v = new qi2();
    public static final /* synthetic */ mc8 w = new mc8(9);
    public static final qc8 x = new qc8();
    public static final mc8 y = new mc8(10);
    public static final mc8 z = new mc8(11);
    public static final mc8 A = new mc8(13);

    public /* synthetic */ mc8(int i) {
        this.a = i;
    }

    public static final int n(String str) {
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        return lowerCase;
    }

    public static final boolean o(byte b2) {
        int i = b2 & 255;
        return i == 234 || i == 237 || i == 239 || i == 243 || i == 245;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a5 -> B:29:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(bp r13, uka r14, kk r15, java.util.List r16, int r17, int r18, int r19, defpackage.kt1 r20) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc8.p(bp, uka, kk, java.util.List, int, int, int, kt1):java.lang.Object");
    }

    public static xl7 v(uia uiaVar, int i, float f2) {
        int i2;
        int i3 = uiaVar.a;
        jk jkVar = uiaVar.e;
        if (f2 >= 0.0f || jkVar == null) {
            i2 = i3;
        } else {
            ArrayList arrayList = jkVar.a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if ((jkVar.b(i4) + ((tha) arrayList.get(i4)).d) / 2.0f > (-f2)) {
                    i2 = ((tha) arrayList.get(i4)).a + i3;
                    break;
                }
            }
            i2 = i3;
        }
        int i5 = uiaVar.b;
        float f3 = i;
        if (uiaVar.d + f2 > f3 && jkVar != null) {
            float f4 = (-f2) + f3;
            ArrayList arrayList2 = jkVar.a;
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (-1 >= size2) {
                    break;
                }
                if (jkVar.b(size2) <= f4) {
                    i5 = (((tha) arrayList2.get(size2)).b + i3) - 1;
                    break;
                }
            }
        }
        return new xl7(Integer.valueOf(i2), Integer.valueOf(i5));
    }

    public static zn8 x(long j, dd4 dd4Var, int i) {
        long jV0 = (i & 1) != 0 ? s32.V0(ah1.X, dd4Var) : j;
        bd1 bd1Var = ah1.H;
        return new zn8(jV0, lc1.c(0.38f, s32.V0(bd1Var, dd4Var)), s32.V0(ah1.E, dd4Var), s32.V0(ah1.D, dd4Var), s32.V0(ah1.N, dd4Var), (cka) dd4Var.j(dka.a), s32.V0(ah1.S, dd4Var), s32.V0(ah1.C, dd4Var), s32.V0(ah1.M, dd4Var), lc1.c(0.38f, s32.V0(ah1.G, dd4Var)), s32.V0(ah1.U, dd4Var), s32.V0(ah1.a0, dd4Var), lc1.c(0.38f, s32.V0(ah1.J, dd4Var)), s32.V0(ah1.P, dd4Var), s32.V0(ah1.W, dd4Var), s32.V0(ah1.c0, dd4Var), lc1.c(0.38f, s32.V0(ah1.L, dd4Var)), s32.V0(ah1.R, dd4Var), s32.V0(ah1.T, dd4Var), s32.V0(ah1.Z, dd4Var), lc1.c(0.38f, s32.V0(ah1.I, dd4Var)), s32.V0(ah1.O, dd4Var), s32.V0(ah1.Y, dd4Var), lc1.c(0.38f, s32.V0(bd1Var, dd4Var)), s32.V0(ah1.V, dd4Var), s32.V0(ah1.b0, dd4Var), lc1.c(0.38f, s32.V0(ah1.K, dd4Var)), s32.V0(ah1.Q, dd4Var));
    }

    public float a() {
        return 0.0f;
    }

    public boolean b(nu6 nu6Var) {
        return false;
    }

    public int c() {
        return 8;
    }

    public boolean d(nu6 nu6Var) {
        return vm7.X(ww1.x(vw1.S(nu6Var), false));
    }

    public void e(pn2 pn2Var, int i, int[] iArr, zm5 zm5Var, int[] iArr2) {
        if (zm5Var == zm5.a) {
            pv.b(i, iArr, iArr2, false);
        } else {
            pv.b(i, iArr, iArr2, true);
        }
    }

    public void g(sn5 sn5Var, long j, gm4 gm4Var, int i, boolean z2) {
        z70 z70Var = sn5Var.S;
        x67 x67Var = (x67) z70Var.e;
        bn8 bn8Var = x67.b0;
        ((x67) z70Var.e).k1(x67.f0, x67Var.c1(j, true), gm4Var, 1, z2);
    }

    public boolean h(gm4 gm4Var, sn5 sn5Var) {
        return false;
    }

    public boolean i(sn5 sn5Var) {
        w19 w19VarY = sn5Var.y();
        boolean z2 = false;
        if (w19VarY != null && w19VarY.d) {
            z2 = true;
        }
        return !z2;
    }

    public hu8 j(long j, long j2, long j3, ur1 ur1Var, float f2, float f3) {
        ur1Var.getClass();
        return new hu8(0.5f, 1.0f, 1.5f);
    }

    @Override // defpackage.qa1
    public p95 k() {
        p95 p95Var = p95.c;
        return ny1.G(System.currentTimeMillis());
    }

    public hu8 l(long j, long j2, long j3, ur1 ur1Var, float f2, float f3) {
        ur1Var.getClass();
        return new hu8(0.5f, 1.0f, 1.5f);
    }

    public void m(String str, yb4 yb4Var, boolean z2, ta5 ta5Var, t89 t89Var, zn8 zn8Var, pj7 pj7Var, yb4 yb4Var2, dd4 dd4Var, int i) {
        String str2;
        int i2;
        yb4 yb4Var3;
        boolean z3;
        ta5 ta5Var2;
        xub xubVar = js8.y;
        yb4Var.getClass();
        ta5Var.getClass();
        dd4Var.h0(1025457586);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (dd4Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            yb4Var3 = yb4Var;
            i2 |= dd4Var.h(yb4Var3) ? 32 : 16;
        } else {
            yb4Var3 = yb4Var;
        }
        int i3 = i & 384;
        int i4 = Token.CASE;
        if (i3 == 0) {
            z3 = z2;
            i2 |= dd4Var.g(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(xubVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            ta5Var2 = ta5Var;
            i2 |= dd4Var.f(ta5Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            ta5Var2 = ta5Var;
        }
        if ((i & 1572864) == 0) {
            i2 |= dd4Var.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= dd4Var.h((Object) null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= dd4Var.h((Object) null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= dd4Var.h((Object) null) ? 536870912 : 268435456;
        }
        int i5 = (dd4Var.h((Object) null) ? 4 : 2) | 1769472 | (dd4Var.h((Object) null) ? 32 : 16);
        if (dd4Var.f(t89Var)) {
            i4 = 256;
        }
        int i6 = i5 | i4 | (dd4Var.f(zn8Var) ? 2048 : 1024) | (dd4Var.f(pj7Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, ((306783379 & i2) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            int i7 = i2 << 3;
            int i8 = i2 >> 9;
            int i9 = i6 << 21;
            do8.a(str2, yb4Var3, z3, ta5Var2, pj7Var, zn8Var, yb4Var2, dd4Var, (i7 & 896) | (i7 & Token.ASSIGN_MOD) | 6 | ((i2 >> 3) & 7168) | (i8 & 57344) | (458752 & i8) | (3670016 & i8) | (29360128 & i9) | (i9 & 234881024) | ((i2 << 18) & 1879048192), ((i6 << 3) & 57344) | ((i2 >> 15) & Token.ASSIGN_MOD) | ((i2 >> 6) & 14) | (i8 & 896) | ((i6 >> 3) & 7168) | 196608);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao8(this, str, yb4Var, z2, ta5Var, t89Var, zn8Var, pj7Var, yb4Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.lang.Long r18, defpackage.as1 r19, defpackage.ek4 r20, defpackage.ut0 r21, defpackage.kt1 r22) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc8.q(java.lang.Long, as1, ek4, ut0, kt1):java.lang.Object");
    }

    public void r(pn2 pn2Var, int i, int[] iArr, int[] iArr2) {
        pv.b(i, iArr, iArr2, false);
    }

    public String s(String str) {
        ut7.a.getClass();
        Map map = (Map) tt7.d.getValue();
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return (String) map.get(upperCase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        is4Var.getClass();
        is4Var.d.g(ru4.j, new lb((yb4) o1aVar, (jt1) null, 8));
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "Arrangement#SpaceBetween";
            case 18:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable u(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.k36
            if (r0 == 0) goto L13
            r0 = r5
            k36 r0 = (defpackage.k36) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k36 r0 = new k36
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.b
            int r5 = r0.d
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L2e
            if (r5 != r2) goto L28
            te5 r5 = r0.a
            defpackage.e11.e0(r4)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r1
        L2e:
            defpackage.e11.e0(r4)
            te5 r5 = defpackage.ue5.d
            r0.a = r5
            r0.d = r2
            ur9 r4 = defpackage.tl8.a
            java.lang.String r4 = "composeResources/com.reader.resources/files/all_language.json"
            java.lang.Object r4 = defpackage.lf2.b(r4)
            xx1 r0 = defpackage.xx1.a
            if (r4 != r0) goto L44
            return r0
        L44:
            byte[] r4 = (byte[]) r4
            java.lang.String r4 = defpackage.iw9.z(r4)
            mf5 r4 = r5.c(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            we5 r4 = defpackage.nf5.e(r4)
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r4.next()
            mf5 r0 = (defpackage.mf5) r0
            java.lang.String r0 = i12.G(r0)
            if (r0 != 0) goto L70
            goto L5d
        L70:
            r2 = 95
            r3 = 45
            java.lang.String r0 = defpackage.j39.k(r0, r2, r3)
            int r2 = r0.length()
            if (r2 != 0) goto L7f
            goto L87
        L7f:
            java.lang.String r2 = "und"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L88
        L87:
            r0 = r1
        L88:
            if (r0 != 0) goto L8c
            r2 = r1
            goto La3
        L8c:
            f36 r2 = new f36     // Catch: java.lang.Throwable -> L96
            bbc r0 = defpackage.tw1.n(r0)     // Catch: java.lang.Throwable -> L96
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L96
            goto L9c
        L96:
            r0 = move-exception
            pm8 r2 = new pm8
            r2.<init>(r0)
        L9c:
            boolean r0 = r2 instanceof defpackage.pm8
            if (r0 == 0) goto La1
            r2 = r1
        La1:
            f36 r2 = (defpackage.f36) r2
        La3:
            if (r2 != 0) goto La6
            goto L5d
        La6:
            r5.add(r2)
            goto L5d
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc8.u(kt1):java.io.Serializable");
    }

    public Signature[] w(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public long f(long j) {
        return j;
    }
}
