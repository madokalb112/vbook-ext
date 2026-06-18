package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class lw1 {
    public static String A(float f) {
        return f + "px";
    }

    public static String B(spa spaVar) {
        if (spaVar == null) {
            return null;
        }
        long j = spaVar.a;
        if ((1095216660480L & j) == 0) {
            return null;
        }
        if (spa.e(j)) {
            return spa.c(j) + "px";
        }
        if (!spa.d(j)) {
            return null;
        }
        return spa.c(j) + "em";
    }

    public static final void C(qv5 qv5Var) {
        iha ihaVar = qv5Var.e;
        if (ihaVar != null) {
            qv5Var.v.invoke(wga.a((wga) qv5Var.d.b, (bp) null, 0L, 3));
            fha fhaVar = ihaVar.a;
            AtomicReference atomicReference = fhaVar.b;
            while (true) {
                if (atomicReference.compareAndSet(ihaVar, null)) {
                    fhaVar.a.c();
                    break;
                } else if (atomicReference.get() != ihaVar) {
                    break;
                }
            }
        }
        qv5Var.e = null;
    }

    public static boolean D(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z = cursorQuery.getCount() > 0;
                t(cursorQuery);
                return z;
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
                t(cursorQuery);
                return false;
            }
        } catch (Throwable th) {
            t(cursorQuery);
            throw th;
        }
    }

    public static final kf8 E(kf8 kf8Var, kf8 kf8Var2) {
        kf8Var2.getClass();
        float f = kf8Var2.c - kf8Var2.a;
        float f2 = kf8Var.c - kf8Var.a;
        float f3 = kf8Var2.d - kf8Var2.b;
        float f4 = kf8Var.d - kf8Var.b;
        float fMin = Math.min(f / f2, f3 / f4);
        float f5 = f4 * fMin;
        return rw1.w(kf8Var.g(), (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2 * fMin) << 32));
    }

    public static String F(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((f2b) obj).a.g.o;
            if (dh6.o(str2)) {
                return "video/mp4";
            }
            if (dh6.k(str2)) {
                z = true;
            } else if (dh6.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static qj4 G(byte[] bArr, byte[] bArr2, vj4 vj4Var) {
        int i = vj4Var.a;
        if (bArr.length > i) {
            vj4Var.c();
            vj4Var.e = 0;
            vj4Var.f = 0L;
            vj4Var.g(bArr.length, bArr);
            bArr = vj4Var.e().a;
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[i];
            fw.R(bArr, 0, bArr3, 0, bArr.length);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr4[i2] = (byte) (bArr[i2] ^ 92);
        }
        byte[] bArr5 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr5[i3] = (byte) (bArr[i3] ^ 54);
        }
        vj4Var.c();
        vj4Var.e = 0;
        vj4Var.f = 0L;
        vj4Var.g(i, bArr5);
        vj4Var.g(bArr2.length, bArr2);
        byte[] bArr6 = vj4Var.e().a;
        vj4Var.c();
        vj4Var.e = 0;
        vj4Var.f = 0L;
        vj4Var.g(i, bArr4);
        vj4Var.g(bArr6.length, bArr6);
        return vj4Var.e();
    }

    public static ri5 H(fbb fbbVar) {
        return new ri5(ti5.a, fbbVar);
    }

    public static final void I(dd4 dd4Var, yb4 yb4Var) {
        yb4Var.getClass();
        fw.F(2, yb4Var);
        yb4Var.invoke(dd4Var, 1);
    }

    public static boolean J(Context context, Uri uri) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        ContentResolver contentResolver = context.getContentResolver();
        String string = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{"mime_type"}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        string = cursorQuery.getString(0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.w("DocumentFile", "Failed query: " + e);
                }
            } catch (Throwable th2) {
                th = th2;
                t(cursorQuery);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
            t(cursorQuery);
            throw th;
        }
        t(cursorQuery);
        return "vnd.android.document/directory".equals(string);
    }

    public static final void K(String str) {
        str.getClass();
        throw new IllegalArgumentException(xv5.p("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final void L(qv5 qv5Var, wga wgaVar, ob7 ob7Var) {
        oj9 oj9VarG = zib.g();
        kb4 kb4VarE = oj9VarG != null ? oj9VarG.e() : null;
        oj9 oj9VarI = zib.i(oj9VarG);
        try {
            rha rhaVarD = qv5Var.d();
            if (rhaVarD == null) {
                return;
            }
            iha ihaVar = qv5Var.e;
            if (ihaVar == null) {
                return;
            }
            ym5 ym5VarC = qv5Var.c();
            if (ym5VarC == null) {
                return;
            }
            ql9.w(wgaVar, qv5Var.a, rhaVarD.a, ym5VarC, ihaVar, qv5Var.b(), ob7Var);
        } finally {
            zib.k(oj9VarG, oj9VarI, kb4VarE);
        }
    }

    public static final rm7 M(Object... objArr) {
        return new rm7(2, new ArrayList((Collection) new sv(objArr, false)));
    }

    public static final void N(hh hhVar, zy5 zy5Var, float f, float f2) {
        hhVar.m();
        int iA = zy5Var.a();
        boolean z = true;
        for (int i = 0; i < iA; i++) {
            z12 z12Var = (z12) zy5Var.get(i);
            if (z) {
                float[] fArr = z12Var.a;
                hhVar.i(fArr[0], fArr[1]);
                z = false;
            }
            float[] fArr2 = z12Var.a;
            hhVar.f(fArr2[2], fArr2[3], fArr2[4], fArr2[5], z12Var.a(), z12Var.b());
        }
        hhVar.e();
    }

    public static ou6 O(ou6 ou6Var, uh uhVar) {
        return ou6Var.e(new px7(uhVar));
    }

    public static final it2 P(it2 it2Var, it2 it2Var2) {
        int iOrdinal = it2Var2.ordinal();
        it2 it2Var3 = it2.a;
        if (iOrdinal != 0) {
            it2 it2Var4 = it2.c;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return it2Var4;
                }
                mn5.g();
                return null;
            }
            int iOrdinal2 = it2Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return it2.b;
                }
                if (iOrdinal2 == 2) {
                    return it2Var4;
                }
                mn5.g();
                return null;
            }
        }
        return it2Var3;
    }

    public static final void Q(kb5 kb5Var, String str) {
        kb5Var.getClass();
        str.getClass();
        kb5Var.b.e = iw9.B(str);
    }

    public static final ia5 R(kf8 kf8Var) {
        return new ia5(Math.round(kf8Var.a), Math.round(kf8Var.b), Math.round(kf8Var.c), Math.round(kf8Var.d));
    }

    public static final kf8 S(kf8 kf8Var, hw hwVar) {
        kf8Var.getClass();
        float f = hwVar.a / hwVar.b;
        float fMax = Math.max(kf8Var.c - kf8Var.a, kf8Var.d - kf8Var.b);
        return s(E(rw1.w(0L, (((long) Float.floatToRawIntBits(f * fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L)), kf8Var), kf8Var);
    }

    public static final kf8 T(kf8 kf8Var, kf8 kf8Var2, long j) {
        kf8Var.getClass();
        float fIntBitsToFloat = kf8Var.a;
        float fIntBitsToFloat2 = kf8Var.b;
        float fIntBitsToFloat3 = kf8Var.c;
        float fIntBitsToFloat4 = kf8Var.d;
        if (Math.abs(kf8Var2.a - fIntBitsToFloat) < Math.abs(kf8Var2.c - fIntBitsToFloat3)) {
            fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32)) + fIntBitsToFloat;
        } else {
            fIntBitsToFloat = fIntBitsToFloat3 - Float.intBitsToFloat((int) (j >> 32));
        }
        if (Math.abs(kf8Var2.b - fIntBitsToFloat2) < Math.abs(kf8Var2.d - fIntBitsToFloat4)) {
            fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L)) + fIntBitsToFloat2;
        } else {
            fIntBitsToFloat2 = fIntBitsToFloat4 - Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return new kf8(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
    }

    public static final void U(fha fhaVar, qv5 qv5Var, wga wgaVar, l45 l45Var, ob7 ob7Var) {
        rg2 rg2Var = qv5Var.d;
        bw1 bw1Var = qv5Var.v;
        bw1 bw1Var2 = qv5Var.w;
        rg8 rg8Var = new rg8();
        cba cbaVar = new cba(2, rg2Var, bw1Var, rg8Var);
        xu7 xu7Var = fhaVar.a;
        xu7Var.d(wgaVar, l45Var, cbaVar, bw1Var2);
        iha ihaVar = new iha(fhaVar, xu7Var);
        fhaVar.b.set(ihaVar);
        rg8Var.a = ihaVar;
        qv5Var.e = ihaVar;
        L(qv5Var, wgaVar, ob7Var);
    }

    public static hh V(hv6 hv6Var, float f, hh hhVar) {
        hv6Var.getClass();
        zy5 zy5VarN = gc1.N();
        ArrayList arrayList = hv6Var.a;
        int size = arrayList.size();
        z12 z12Var = null;
        int i = 0;
        z12 z12Var2 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = kjb.b(((z12) ((xl7) arrayList.get(i)).a).a[i2], ((z12) ((xl7) arrayList.get(i)).b).a[i2], f);
            }
            z12 z12Var3 = new z12(fArr);
            if (z12Var2 == null) {
                z12Var2 = z12Var3;
            }
            if (z12Var != null) {
                zy5VarN.add(z12Var);
            }
            i++;
            z12Var = z12Var3;
        }
        if (z12Var != null && z12Var2 != null) {
            float[] fArr2 = z12Var.a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[3];
            float f6 = fArr2[4];
            float f7 = fArr2[5];
            float[] fArr3 = z12Var2.a;
            zy5VarN.add(rw1.b(f2, f3, f4, f5, f6, f7, fArr3[0], fArr3[1]));
        }
        N(hhVar, gc1.J(zy5VarN), 0.0f, 0.0f);
        return hhVar;
    }

    public static final long W(long j, long j2) {
        int iE;
        int iG = pja.g(j);
        int iF = pja.f(j);
        if ((pja.g(j2) < pja.f(j)) && (pja.g(j) < pja.f(j2))) {
            if ((pja.g(j2) <= pja.g(j)) && (pja.f(j) <= pja.f(j2))) {
                iG = pja.g(j2);
                iF = iG;
            } else {
                if ((pja.g(j) <= pja.g(j2)) && (pja.f(j2) <= pja.f(j))) {
                    iE = pja.e(j2);
                } else if (pja.a(iG, j2)) {
                    iG = pja.g(j2);
                    iE = pja.e(j2);
                } else {
                    iF = pja.g(j2);
                }
                iF -= iE;
            }
        } else if (iF > pja.g(j2)) {
            iG -= pja.e(j2);
            iE = pja.e(j2);
            iF -= iE;
        }
        return zk9.h(iG, iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059b A[PHI: r14 r19 r26
  0x059b: PHI (r14v22 l45) = (r14v12 l45), (r14v23 l45) binds: [B:271:0x0599, B:268:0x058a] A[DONT_GENERATE, DONT_INLINE]
  0x059b: PHI (r19v9 boolean) = (r19v3 boolean), (r19v11 boolean) binds: [B:271:0x0599, B:268:0x058a] A[DONT_GENERATE, DONT_INLINE]
  0x059b: PHI (r26v16 int) = (r26v3 int), (r26v17 int) binds: [B:271:0x0599, B:268:0x058a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0658 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0894  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final wga r65, defpackage.kb4 r66, ou6 r67, uka r68, yub r69, defpackage.kb4 r70, defpackage.yy6 r71, xk9 r72, boolean r73, int r74, int r75, l45 r76, nj5 r77, boolean r78, boolean r79, defpackage.zb4 r80, dd4 r81, int r82, int r83) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.a(wga, kb4, ou6, uka, yub, kb4, yy6, xk9, boolean, int, int, l45, nj5, boolean, boolean, zb4, dd4, int, int):void");
    }

    public static final void b(ou6 ou6Var, kga kgaVar, rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(2036174316);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i | (dd4Var.h(kgaVar) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, true);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            p7c.f(kgaVar, rj1Var, dd4Var, (i2 >> 3) & Token.ELSE);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(ou6Var, kgaVar, rj1Var, i, 12);
        }
    }

    public static final void c(gm3 gm3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, bc4 bc4Var, dd4 dd4Var, int i) {
        ou6 ou6Var;
        String strK;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(2107114642);
        int i2 = i | (dd4Var2.f(gm3Var) ? 4 : 2) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.g(z3) ? 2048 : 1024) | (dd4Var2.g(z4) ? 16384 : 8192) | (dd4Var2.g(z5) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.g(z6) ? 1048576 : 524288) | (dd4Var2.h(bc4Var) ? 8388608 : 4194304);
        if (dd4Var2.V(i2 & 1, (i2 & 4793475) != 4793474)) {
            Object[] objArr = new Object[0];
            boolean z7 = (458752 & i2) == 131072;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z7 || objQ == obj) {
                objQ = new lp3(3, z5);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var2, 0);
            Object[] objArr2 = new Object[0];
            boolean z8 = (i2 & 896) == 256;
            Object objQ2 = dd4Var2.Q();
            if (z8 || objQ2 == obj) {
                objQ2 = new lp3(4, z2);
                dd4Var2.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var2, 0);
            Object[] objArr3 = new Object[0];
            boolean z9 = (i2 & 7168) == 2048;
            Object objQ3 = dd4Var2.Q();
            if (z9 || objQ3 == obj) {
                objQ3 = new lp3(5, z3);
                dd4Var2.p0(objQ3);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var2, 0);
            Object[] objArr4 = new Object[0];
            boolean z10 = (57344 & i2) == 16384;
            Object objQ4 = dd4Var2.Q();
            if (z10 || objQ4 == obj) {
                objQ4 = new lp3(6, z4);
                dd4Var2.p0(objQ4);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr4, (ib4) objQ4, dd4Var2, 0);
            Object[] objArr5 = new Object[0];
            boolean z11 = (3670016 & i2) == 1048576;
            Object objQ5 = dd4Var2.Q();
            if (z11 || objQ5 == obj) {
                objQ5 = new lp3(7, z6);
                dd4Var2.p0(objQ5);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr5, (ib4) objQ5, dd4Var2, 0);
            ou6 ou6VarF = tg9.f(kc5.D(), 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarF);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarM0 = gjb.m0(xv5.h(lu6Var, 12.0f, dd4Var2, lu6Var, 1.0f), 16.0f, 8.0f);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            String strK2 = wn9.K((pv9) vu9.E.getValue(), dd4Var2);
            String strK3 = wn9.K((pv9) vu9.F.getValue(), dd4Var2);
            boolean zF = dd4Var2.f(a07Var2);
            Object objQ6 = dd4Var2.Q();
            if (zF || objQ6 == obj) {
                ou6Var = ou6VarM0;
                objQ6 = new ci6(a07Var2, 25);
                dd4Var2.p0(objQ6);
            } else {
                ou6Var = ou6VarM0;
            }
            e11.s(strK2, strK3, ou6Var, false, zBooleanValue, (kb4) objQ6, dd4Var2, 384);
            ou6 ou6VarM02 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean zBooleanValue2 = ((Boolean) a07Var3.getValue()).booleanValue();
            String strK4 = wn9.K((pv9) vu9.x.getValue(), dd4Var2);
            String strK5 = wn9.K((pv9) vu9.y.getValue(), dd4Var2);
            boolean zF2 = dd4Var2.f(a07Var3);
            Object objQ7 = dd4Var2.Q();
            if (zF2 || objQ7 == obj) {
                objQ7 = new ci6(a07Var3, 21);
                dd4Var2.p0(objQ7);
            }
            e11.s(strK4, strK5, ou6VarM02, false, zBooleanValue2, (kb4) objQ7, dd4Var2, 384);
            ou6 ou6VarM03 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean zBooleanValue3 = ((Boolean) a07Var4.getValue()).booleanValue();
            String strK6 = wn9.K((pv9) vu9.s.getValue(), dd4Var2);
            String strK7 = wn9.K((pv9) vu9.t.getValue(), dd4Var2);
            boolean zF3 = dd4Var2.f(a07Var4);
            Object objQ8 = dd4Var2.Q();
            if (zF3 || objQ8 == obj) {
                objQ8 = new ci6(a07Var4, 22);
                dd4Var2.p0(objQ8);
            }
            e11.s(strK6, strK7, ou6VarM03, false, zBooleanValue3, (kb4) objQ8, dd4Var2, 384);
            ou6 ou6VarM04 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean zBooleanValue4 = ((Boolean) a07Var.getValue()).booleanValue();
            String strK8 = wn9.K((pv9) vu9.C.getValue(), dd4Var2);
            String strK9 = wn9.K((pv9) vu9.D.getValue(), dd4Var2);
            boolean zF4 = dd4Var2.f(a07Var);
            Object objQ9 = dd4Var2.Q();
            if (zF4 || objQ9 == obj) {
                objQ9 = new ci6(a07Var, 23);
                dd4Var2.p0(objQ9);
            }
            e11.s(strK8, strK9, ou6VarM04, false, zBooleanValue4, (kb4) objQ9, dd4Var2, 384);
            ou6 ou6VarM05 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean zBooleanValue5 = ((Boolean) a07Var5.getValue()).booleanValue();
            String strK10 = wn9.K((pv9) vu9.q.getValue(), dd4Var2);
            String strK11 = wn9.K((pv9) vu9.r.getValue(), dd4Var2);
            boolean zF5 = dd4Var2.f(a07Var5);
            Object objQ10 = dd4Var2.Q();
            if (zF5 || objQ10 == obj) {
                objQ10 = new ci6(a07Var5, 24);
                dd4Var2.p0(objQ10);
            }
            e11.s(strK10, strK11, ou6VarM05, false, zBooleanValue5, (kb4) objQ10, dd4Var2, 384);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            if (gm3Var != null) {
                int i3 = gm3Var.b;
                int i4 = gm3Var.c;
                dd4Var2.f0(-1362773926);
                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2);
                eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, eq8VarA);
                un9.s(jmVar2, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL02);
                sdc.y(tg9.n(lu6Var, 28.0f), 0L, null, dd4Var, 6, 6);
                un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
                int iOrdinal = gm3Var.a.ordinal();
                if (iOrdinal == 0) {
                    dd4Var.f0(1990465374);
                    strK = wn9.K((pv9) vu9.T.getValue(), dd4Var);
                    dd4Var.q(false);
                } else if (iOrdinal == 1) {
                    dd4Var.f0(1990469236);
                    strK = wn9.L((pv9) vu9.L.getValue(), new Object[]{wn9.K((pv9) vu9.S.getValue(), dd4Var), Integer.valueOf(i4 > 0 ? (i3 * 100) / i4 : 0)}, dd4Var);
                    dd4Var.q(false);
                } else if (iOrdinal == 2) {
                    dd4Var.f0(1990478674);
                    strK = wn9.L((pv9) vu9.L.getValue(), new Object[]{wn9.K((pv9) vu9.U.getValue(), dd4Var), Integer.valueOf(i4 > 0 ? (i3 * 100) / i4 : 0)}, dd4Var);
                    dd4Var.q(false);
                } else if (iOrdinal == 3) {
                    dd4Var.f0(1990487901);
                    strK = wn9.K((pv9) vu9.Q.getValue(), dd4Var);
                    dd4Var.q(false);
                } else {
                    if (iOrdinal != 4) {
                        throw j39.e(1990463672, dd4Var, false);
                    }
                    dd4Var.f0(1990491550);
                    strK = wn9.K((pv9) vu9.R.getValue(), dd4Var);
                    dd4Var.q(false);
                }
                nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, 0, 0, 131070);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1361325823);
                p35 p35VarC = i25.c((m53) h53.h.getValue(), dd4Var2, 0);
                String strK12 = wn9.K((pv9) mu9.E0.getValue(), dd4Var2);
                ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2);
                boolean zF6 = ((i2 & 29360128) == 8388608) | dd4Var2.f(a07Var) | dd4Var2.f(a07Var2) | dd4Var2.f(a07Var3) | dd4Var2.f(a07Var4) | dd4Var2.f(a07Var5);
                Object objQ11 = dd4Var2.Q();
                if (zF6 || objQ11 == obj) {
                    objQ11 = new c51(bc4Var, a07Var, a07Var2, a07Var3, a07Var4, a07Var5);
                    dd4Var2.p0(objQ11);
                }
                kc5.n(p35VarC, strK12, false, null, ou6VarN02, null, null, null, (ib4) objQ11, dd4Var, 24576, 236);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            xv5.A(lu6Var, 8.0f, dd4Var2, true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pk6(gm3Var, z, z2, z3, z4, z5, z6, bc4Var, i);
        }
    }

    public static final void d(t27 t27Var, dd4 dd4Var, int i) {
        t27Var.getClass();
        dd4Var.h0(-1607211371);
        int i2 = 2;
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m84 m84Var = (m84) ((qtb) qx1.N(ug8.a(m84.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(m84Var.d, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = m84Var.e;
            boolean zF = dd4Var.f(m8Var) | ((i3 & 14) == 4);
            Object objQ = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ == vl1.a) {
                objQ = new q51(m8Var, t27Var, jt1Var, i2);
                dd4Var.p0(objQ);
            }
            wx1.e(pp1Var, null, (zb4) objQ, dd4Var, 0);
            gx1.p(wn9.K((pv9) iu9.g.getValue(), dd4Var), null, false, jf0.G(1777397265, new n74(t27Var, i2), dd4Var), null, jf0.G(-1728903585, new qs1(i2, m84Var, a07VarB), dd4Var), dd4Var, 199680, 22);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i, 3, t27Var);
        }
    }

    public static final void e(zy4 zy4Var, rj1 rj1Var, dd4 dd4Var, int i) {
        zy4Var.getClass();
        int i2 = zy4Var.d;
        dd4Var.h0(288432512);
        int i3 = (dd4Var.f(zy4Var) ? 4 : 2) | i;
        boolean zA = false;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            c73 c73Var = (c73) dd4Var.j(b73.a);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                long j = ((lc1) c73Var.a.getValue()).a;
                cm7 cm7Var = (cm7) c73Var.j.getValue();
                boolean zBooleanValue = ((Boolean) c73Var.f.getValue()).booleanValue();
                c73 c73Var2 = new c73(j, i2 != 0 ? i2 == 2 : c73Var.a(), ((Boolean) c73Var.d.getValue()).booleanValue(), c73Var.b(), zBooleanValue, cm7Var, ((Number) c73Var.h.getValue()).floatValue(), ((Number) c73Var.i.getValue()).floatValue(), (c64) c73Var.g.getValue());
                dd4Var.p0(c73Var2);
                objQ = c73Var2;
            }
            c73 c73Var3 = (c73) objQ;
            if (i2 == 0) {
                zA = c73Var.a();
            } else if (i2 == 2) {
                zA = true;
            }
            c73Var3.c.setValue(Boolean.valueOf(zA));
            b73.a(c73Var3, ((q96) dd4Var.j(s96.a)).c, false, (kb4) null, jf0.G(-1087738740, new tb0(rj1Var, 5), dd4Var), dd4Var, 24576, 12);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(zy4Var, rj1Var, i, 29);
        }
    }

    public static final ia5 f(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ia5(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(st5 st5Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, dd4 dd4Var, int i2, int i3) {
        int i4;
        int i5;
        br9 br9Var;
        ym7 ym7Var;
        br9 br9Var2;
        br9 br9Var3;
        Object obj;
        br9 br9Var4;
        int i6;
        br9 br9Var5;
        br9 br9Var6;
        ym7 ym7Var2;
        int i7;
        int i8;
        ym7 ym7Var3;
        boolean z2;
        st5 st5Var2;
        kb4 kb4Var;
        int i9;
        st5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-300893296);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(st5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(lu6.a) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.g(z) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.c(f) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.c(f2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.e(j2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.f(t89Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (dd4Var.d(ux8Var == null ? -1 : ux8Var.ordinal()) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.d(tx8Var != null ? tx8Var.ordinal() : -1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dd4Var.d(i) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.h((Object) null) ? 2048 : 1024;
        }
        int i10 = i4;
        if (dd4Var.V(i10 & 1, ((306783379 & i4) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = dk9.n(new e51(st5Var, 2));
                dd4Var.p0(objQ);
            }
            br9 br9Var7 = (br9) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj2) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var = (vx1) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj2) {
                objQ3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ3);
            }
            br9 br9Var8 = (a07) objQ3;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj2) {
                br9Var = br9Var8;
                objQ4 = new ym7(0.0f);
                dd4Var.p0(objQ4);
            } else {
                br9Var = br9Var8;
            }
            ym7 ym7Var4 = (ym7) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj2) {
                objQ5 = dk9.n(new e51(st5Var, 3));
                dd4Var.p0(objQ5);
            }
            br9 br9Var9 = (br9) objQ5;
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj2) {
                ym7Var = ym7Var4;
                objQ6 = dk9.n(new e51(st5Var, 4));
                dd4Var.p0(objQ6);
            } else {
                ym7Var = ym7Var4;
            }
            br9 br9Var10 = (br9) objQ6;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj2) {
                br9Var2 = br9Var9;
                objQ7 = dk9.n(new al3(22, st5Var, br9Var10));
                dd4Var.p0(objQ7);
            } else {
                br9Var2 = br9Var9;
            }
            br9 br9Var11 = (br9) objQ7;
            Object objQ8 = dd4Var.Q();
            int i11 = 14;
            if (objQ8 == obj2) {
                objQ8 = dk9.n(new ma0(i11, st5Var, br9Var10, br9Var11));
                dd4Var.p0(objQ8);
            }
            br9 br9Var12 = (br9) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj2) {
                objQ9 = dk9.n(new jp5(f2, br9Var12, 0));
                dd4Var.p0(objQ9);
            }
            br9 br9Var13 = (br9) objQ9;
            Object objQ10 = dd4Var.Q();
            if (objQ10 == obj2) {
                br9Var3 = br9Var12;
                obj = obj2;
                br9Var4 = br9Var10;
                i6 = i10;
                br9Var5 = br9Var7;
                br9Var6 = br9Var;
                ym7Var2 = ym7Var;
                objQ10 = dk9.n(new kp5(st5Var, br9Var4, f2, br9Var3, br9Var2));
                dd4Var.p0(objQ10);
            } else {
                br9Var3 = br9Var12;
                obj = obj2;
                br9Var4 = br9Var10;
                i6 = i10;
                br9Var5 = br9Var7;
                br9Var6 = br9Var;
                ym7Var2 = ym7Var;
            }
            br9 br9Var14 = (br9) objQ10;
            Object objQ11 = dd4Var.Q();
            if (objQ11 == obj) {
                i7 = 0;
                objQ11 = new lp5(br9Var13, ym7Var2, i7);
                dd4Var.p0(objQ11);
            } else {
                i7 = 0;
            }
            kb4 kb4Var2 = (kb4) objQ11;
            Object objQ12 = dd4Var.Q();
            if (objQ12 == obj) {
                i8 = i7;
                int i12 = i5;
                br9 br9Var15 = br9Var3;
                ym7Var3 = ym7Var2;
                i9 = i12;
                mp5 mp5Var = new mp5(kb4Var2, st5Var, vx1Var, ym7Var3, f2, br9Var15, br9Var4);
                kb4Var = kb4Var2;
                st5Var2 = st5Var;
                z2 = true;
                dd4Var.p0(mp5Var);
                objQ12 = mp5Var;
            } else {
                i8 = i7;
                ym7Var3 = ym7Var2;
                z2 = true;
                st5Var2 = st5Var;
                kb4Var = kb4Var2;
                i9 = i5;
            }
            kb4 kb4Var3 = (kb4) objQ12;
            Object objQ13 = dd4Var.Q();
            if (objQ13 == obj) {
                objQ13 = new tn4(br9Var6, 21);
                dd4Var.p0(objQ13);
            }
            kb4 kb4Var4 = (kb4) objQ13;
            boolean z3 = (st5Var2.j.a() || ((Boolean) br9Var6.getValue()).booleanValue()) ? z2 : i8;
            Object objQ14 = dd4Var.Q();
            if (objQ14 == obj) {
                objQ14 = new op0(br9Var5, 5);
                dd4Var.p0(objQ14);
            }
            ib4 ib4Var = (ib4) objQ14;
            boolean zBooleanValue = ((Boolean) br9Var6.getValue()).booleanValue();
            float fH = ym7Var3.h();
            boolean zBooleanValue2 = ((Boolean) br9Var2.getValue()).booleanValue();
            Object objQ15 = dd4Var.Q();
            if (objQ15 == obj) {
                objQ15 = new op0(br9Var13, 6);
                dd4Var.p0(objQ15);
            }
            ib4 ib4Var2 = (ib4) objQ15;
            Object objQ16 = dd4Var.Q();
            if (objQ16 == obj) {
                objQ16 = new op0(br9Var14, 7);
                dd4Var.p0(objQ16);
            }
            ib4 ib4Var3 = (ib4) objQ16;
            int i13 = i6 >> 3;
            i(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, zBooleanValue, fH, zBooleanValue2, ib4Var2, ib4Var3, z3, kb4Var, kb4Var3, kb4Var4, dd4Var, (i13 & 29360128) | (i13 & 14) | ((i6 >> 12) & Token.ASSIGN_MOD) | (i6 & 896) | ((i9 << 3) & 7168) | ((i6 >> 15) & 57344) | (458752 & (i6 << 3)) | (3670016 & i13) | ((i9 << 21) & 234881024) | ((i9 << 27) & 1879048192), ((i9 >> 9) & 14) | 907739184);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qp5(st5Var, z, f, pj7Var, f2, j, j2, t89Var, ux8Var, tx8Var, i, i2, i3);
        }
    }

    public static final void h(st5 st5Var, ou6 ou6Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, boolean z2, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        long j3;
        dd4 dd4Var2;
        boolean z3;
        float f3;
        t89 t89Var2;
        ux8 ux8Var2;
        tx8 tx8Var2;
        boolean z4;
        int i4;
        t89 t89Var3;
        float f4;
        ux8 ux8Var3;
        tx8 tx8Var3;
        boolean z5;
        boolean z6;
        st5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-1786953928);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(st5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i5 |= dd4Var.c(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            pj7Var2 = pj7Var;
            i5 |= dd4Var.f(pj7Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            pj7Var2 = pj7Var;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            j3 = j;
            i6 |= dd4Var.e(j3) ? 8388608 : 4194304;
        } else {
            j3 = j;
        }
        if ((100663296 & i2) == 0) {
            i6 |= dd4Var.e(j2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= 268435456;
        }
        if (dd4Var.V(i6 & 1, (306783379 & i6) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                i4 = i6 & (-1879048193);
                t89Var3 = tp8.a;
                f4 = 0.1f;
                ux8Var3 = ux8.a;
                tx8Var3 = tx8.a;
                z5 = true;
                z6 = true;
            } else {
                dd4Var.Y();
                f4 = f2;
                t89Var3 = t89Var;
                ux8Var3 = ux8Var;
                tx8Var3 = tx8Var;
                z6 = z2;
                i4 = i6 & (-1879048193);
                z5 = z;
            }
            dd4Var.r();
            if (z6) {
                dd4Var.f0(975974563);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                rj1Var.invoke(dd4Var, 6);
                z3 = z5;
                g(st5Var, z3, f, pj7Var2, f4, j3, j2, t89Var3, ux8Var3, tx8Var3, i, dd4Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), 3510);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                dd4Var.f0(975920561);
                rj1Var.invoke(dd4Var, 6);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
                z3 = z5;
            }
            f3 = f4;
            t89Var2 = t89Var3;
            ux8Var2 = ux8Var3;
            tx8Var2 = tx8Var3;
            z4 = z6;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            z3 = z;
            f3 = f2;
            t89Var2 = t89Var;
            ux8Var2 = ux8Var;
            tx8Var2 = tx8Var;
            z4 = z2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ip5(st5Var, ou6Var, z3, f, pj7Var, f3, j, j2, t89Var2, ux8Var2, tx8Var2, i, z4, rj1Var, i2, 0);
        }
    }

    public static final void i(pj7 pj7Var, boolean z, int i, t89 t89Var, float f, long j, long j2, tx8 tx8Var, ux8 ux8Var, ib4 ib4Var, boolean z2, float f2, boolean z3, ib4 ib4Var2, ib4 ib4Var3, boolean z4, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2, int i3) {
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        float f3;
        dd4Var.h0(949902905);
        int i7 = i2 & 6;
        lu6 lu6Var = lu6.a;
        if (i7 == 0) {
            i4 = (dd4Var.f(lu6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z;
            i4 |= dd4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.f(t89Var) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= dd4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.d(tx8Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= dd4Var.d(ux8Var.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (dd4Var.h((Object) null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z6 = z2;
            i6 |= dd4Var.g(z6) ? 256 : Token.CASE;
        } else {
            z6 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= dd4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= dd4Var.g(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.h(ib4Var2)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= dd4Var.h(ib4Var3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= dd4Var.g(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= dd4Var.h(kb4Var) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z7 = i11 == 32;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z7 || objQ == obj) {
                objQ = new x13(pj7Var.d());
                dd4Var.p0(objQ);
            }
            float f4 = ((x13) objQ).a;
            boolean z8 = i11 == 32;
            Object objQ2 = dd4Var.Q();
            if (z8 || objQ2 == obj) {
                x13 x13Var = new x13(pj7Var.a());
                dd4Var.p0(x13Var);
                objQ2 = x13Var;
            }
            sdc.e(gjb.p0(ou6VarF, 0.0f, f4, 0.0f, ((x13) objQ2).a, 5), null, jf0.G(-1947740253, new np5(pj7Var, z5, z6, j2, j, i, t89Var, f, tx8Var, z3, kb4Var2, f3, ux8Var, ib4Var2, ib4Var3, z4, ib4Var, kb4Var, kb4Var3, 0), dd4Var), dd4Var, 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new op5(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, z2, f2, z3, ib4Var2, ib4Var3, z4, kb4Var, kb4Var2, kb4Var3, i2, i3, 0);
        }
    }

    public static final void j(iq9 iq9Var, ou6 ou6Var, uu5 uu5Var, pj7 pj7Var, float f, kv kvVar, s04 s04Var, boolean z, ag agVar, kb4 kb4Var, dd4 dd4Var, int i) {
        ag agVar2;
        ag agVarA;
        int i2;
        dd4Var.h0(-578931208);
        int i3 = i | (dd4Var.f(iq9Var) ? 4 : 2) | (dd4Var.f(uu5Var) ? 256 : Token.CASE) | (dd4Var.f(pj7Var) ? 2048 : 1024) | (dd4Var.g(false) ? 16384 : 8192) | (dd4Var.c(f) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(kvVar) ? 1048576 : 524288) | (dd4Var.f(s04Var) ? 8388608 : 4194304) | (dd4Var.g(z) ? 67108864 : 33554432) | 268435456;
        int i4 = dd4Var.h(kb4Var) ? 4 : 2;
        if (dd4Var.V(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                agVarA = xi7.a(dd4Var);
                i2 = i3 & (-1879048193);
            } else {
                dd4Var.Y();
                i2 = i3 & (-1879048193);
                agVarA = agVar;
            }
            dd4Var.r();
            float fA = kvVar.a();
            int i5 = i2 >> 3;
            int i6 = (i2 & 14) | ((i2 >> 15) & Token.ASSIGN_MOD) | (i5 & 896);
            int i7 = i2;
            boolean z2 = ((((i6 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.f(kvVar)) || (i6 & 48) == 32) | ((((i6 & 14) ^ 6) > 4 && dd4Var.f(iq9Var)) || (i6 & 6) == 4) | ((((i6 & 896) ^ 384) > 256 && dd4Var.f(pj7Var)) || (i6 & 384) == 256);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new su5(new mt(18, pj7Var, iq9Var, kvVar));
                dd4Var.p0(objQ);
            }
            int i8 = i7 << 3;
            ag agVar3 = agVarA;
            rw1.l(uu5Var, (su5) objQ, ou6Var, pj7Var, s04Var, z, agVar3, f, fA, kb4Var, dd4Var, ((i7 >> 6) & 14) | 3120 | (57344 & i8) | (i8 & 458752) | (3670016 & i5) | (29360128 & i5) | ((i7 << 12) & 1879048192), (i4 << 3) & Token.ASSIGN_MOD);
            agVar2 = agVar3;
        } else {
            dd4Var.Y();
            agVar2 = agVar;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cu5(iq9Var, ou6Var, uu5Var, pj7Var, f, kvVar, s04Var, z, agVar2, kb4Var, i);
        }
    }

    public static final void k(boolean z, q5a q5aVar, kb4 kb4Var, bc4 bc4Var, dd4 dd4Var, int i) {
        q5aVar.getClass();
        kb4Var.getClass();
        bc4Var.getClass();
        dd4Var.h0(-358284670);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(q5aVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(bc4Var) ? 2048 : 1024);
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            rj1 rj1Var = jv3.f;
            gm3 gm3Var = q5aVar.g;
            z8.a(z, kb4Var, null, null, null, null, rj1Var, null, 0L, 0L, 0.0f, null, null, null, gm3Var == null, gm3Var == null, jf0.G(-1588814298, new xp5(9, q5aVar, bc4Var), dd4Var), dd4Var, (i2 & 14) | 1572864 | ((i2 >> 3) & Token.ASSIGN_MOD), 1572864, 16316);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z, q5aVar, kb4Var, bc4Var, i, 9);
        }
    }

    public static final void l(ija ijaVar, kb4 kb4Var, dd4 dd4Var, int i) {
        ijaVar.getClass();
        kb4Var.getClass();
        dd4Var.h0(-2113972799);
        int i2 = (dd4Var.f(ijaVar) ? 4 : 2) | i | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) ijaVar.a.getValue()).booleanValue();
            int i3 = 3;
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new e4(i3);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new e4(i3);
                dd4Var.p0(objQ2);
            }
            bx1.a(zBooleanValue, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), bv4.u, lc1.c(0.1f, lc1.b), false, false, (ou6) null, jf0.G(-2123726689, new qz0(i3, ijaVar, kb4Var), dd4Var), dd4Var, (i2 & Token.ASSIGN_MOD) | 805531008, 448);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xp5(ijaVar, kb4Var, i, 17);
        }
    }

    public static final void m(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        str.getClass();
        dd4Var.h0(-1314206847);
        int i2 = i & 1;
        if (dd4Var.V(i2, i2 != 0)) {
            ou6Var = lu6.a;
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l8(str, ou6Var, i, 3);
        }
    }

    public static final void n(kga kgaVar, boolean z, dd4 dd4Var, int i) {
        rha rhaVarD;
        dd4Var.h0(626339208);
        int i2 = (dd4Var.h(kgaVar) ? 4 : 2) | i | (dd4Var.g(z) ? 32 : 16);
        if (!dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            dd4Var.Y();
        } else if (z) {
            dd4Var.f0(1530097388);
            qv5 qv5Var = kgaVar.d;
            qha qhaVar = null;
            if (qv5Var != null && (rhaVarD = qv5Var.d()) != null) {
                qha qhaVar2 = rhaVarD.a;
                qv5 qv5Var2 = kgaVar.d;
                if (!(qv5Var2 != null ? qv5Var2.p : true)) {
                    qhaVar = qhaVar2;
                }
            }
            if (qhaVar == null) {
                dd4Var.f0(1530097387);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1530097388);
                if (pja.d(kgaVar.n().b)) {
                    dd4Var.f0(2110860558);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(2109807302);
                    int iW = kgaVar.b.w((int) (kgaVar.n().b >> 32));
                    int iW2 = kgaVar.b.w((int) (kgaVar.n().b & 4294967295L));
                    cl8 cl8VarA = qhaVar.a(iW);
                    cl8 cl8VarA2 = qhaVar.a(Math.max(iW2 - 1, 0));
                    qv5 qv5Var3 = kgaVar.d;
                    if (qv5Var3 == null || !((Boolean) qv5Var3.m.getValue()).booleanValue()) {
                        dd4Var.f0(2110490542);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(2110225306);
                        hn9.g(true, cl8VarA, kgaVar, dd4Var, ((i2 << 6) & 896) | 6);
                        dd4Var.q(false);
                    }
                    qv5 qv5Var4 = kgaVar.d;
                    if (qv5Var4 == null || !((Boolean) qv5Var4.n.getValue()).booleanValue()) {
                        dd4Var.f0(2110838734);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(2110574459);
                        hn9.g(false, cl8VarA2, kgaVar, dd4Var, ((i2 << 6) & 896) | 6);
                        dd4Var.q(false);
                    }
                    dd4Var.q(false);
                }
                qv5 qv5Var5 = kgaVar.d;
                if (qv5Var5 != null) {
                    cn7 cn7Var = qv5Var5.l;
                    if (!lc5.Q(kgaVar.u.a.b, kgaVar.n().a.b)) {
                        cn7Var.setValue(Boolean.FALSE);
                    }
                    if (qv5Var5.b()) {
                        if (((Boolean) cn7Var.getValue()).booleanValue()) {
                            kgaVar.r();
                        } else {
                            kgaVar.o();
                        }
                    }
                }
                dd4Var.q(false);
            }
            dd4Var.q(false);
        } else {
            dd4Var.f0(1989076778);
            dd4Var.q(false);
            kgaVar.o();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y31(kgaVar, z, i);
        }
    }

    public static final void o(kga kgaVar, dd4 dd4Var, int i) {
        bp bpVarM;
        dd4Var.h0(-1436003720);
        int i2 = 2;
        int i3 = (dd4Var.h(kgaVar) ? 4 : 2) | i;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            qv5 qv5Var = kgaVar.d;
            if (qv5Var == null || !((Boolean) qv5Var.o.getValue()).booleanValue() || (bpVarM = kgaVar.m()) == null || bpVarM.b.length() <= 0) {
                dd4Var.f0(-2111042550);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-2112351432);
                boolean zF = dd4Var.f(kgaVar);
                Object objQ = dd4Var.Q();
                Object obj = vl1.a;
                if (zF || objQ == obj) {
                    objQ = new hga(kgaVar);
                    dd4Var.p0(objQ);
                }
                tda tdaVar = (tda) objQ;
                pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
                ob7 ob7Var = kgaVar.b;
                long j = kgaVar.n().b;
                int i4 = pja.c;
                int iW = ob7Var.w((int) (j >> 32));
                qv5 qv5Var2 = kgaVar.d;
                rha rhaVarD = qv5Var2 != null ? qv5Var2.d() : null;
                rhaVarD.getClass();
                qha qhaVar = rhaVarD.a;
                kf8 kf8VarC = qhaVar.c(wx1.Q(iW, 0, qhaVar.a.a.b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((pn2Var.k0(2.0f) / 2.0f) + kf8VarC.a)) << 32) | (((long) Float.floatToRawIntBits(kf8VarC.d)) & 4294967295L);
                boolean zE = dd4Var.e(jFloatToRawIntBits);
                Object objQ2 = dd4Var.Q();
                if (zE || objQ2 == obj) {
                    objQ2 = new iw1(jFloatToRawIntBits);
                    dd4Var.p0(objQ2);
                }
                qb7 qb7Var = (qb7) objQ2;
                boolean zH = dd4Var.h(tdaVar) | dd4Var.h(kgaVar);
                Object objQ3 = dd4Var.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new kw1(0, tdaVar, kgaVar);
                    dd4Var.p0(objQ3);
                }
                ou6 ou6VarB = r1a.b(lu6.a, tdaVar, (PointerInputEventHandler) objQ3);
                boolean zE2 = dd4Var.e(jFloatToRawIntBits);
                Object objQ4 = dd4Var.Q();
                if (zE2 || objQ4 == obj) {
                    objQ4 = new ve(jFloatToRawIntBits, i2);
                    dd4Var.p0(objQ4);
                }
                xe.a(qb7Var, a29.c(ou6VarB, false, (kb4) objQ4), 0L, dd4Var, 0);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ah(kgaVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(u1a r6, defpackage.vc0 r7) {
        /*
            boolean r0 = r7 instanceof io8
            if (r0 == 0) goto L13
            r0 = r7
            io8 r0 = (io8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            io8 r0 = new io8
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            u1a r6 = r0.a
            defpackage.e11.e0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.e11.e0(r7)
        L31:
            r0.a = r6
            r0.c = r2
            nx7 r7 = nx7.b
            java.lang.Object r7 = r6.c(r7, r0)
            xx1 r1 = defpackage.xx1.a
            if (r7 != r1) goto L40
            return r1
        L40:
            mx7 r7 = (mx7) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            ux7 r5 = (ux7) r5
            boolean r5 = vv1.p(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.p(u1a, vc0):java.lang.Object");
    }

    public static final ra0 q(Iterable iterable) {
        Object objPrevious;
        List listR0 = fc1.R0(new k54(18), iterable);
        ListIterator listIterator = listR0.listIterator(listR0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            qa0 qa0Var = ((ra0) objPrevious).c;
            ra0.e[0].getClass();
            if (((Boolean) qa0Var.b).booleanValue()) {
                break;
            }
        }
        return (ra0) objPrevious;
    }

    public static final void r(oca ocaVar, Context context, boolean z, CharSequence charSequence, long j) {
        if (pja.d(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) vm7.v.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        ocaVar.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            ocaVar.a.a(new yca(new j38(i), resolveInfo.loadLabel(packageManager).toString(), 0, new lu5(context, resolveInfo, z, charSequence, j)));
        }
        ocaVar.a();
    }

    public static final kf8 s(kf8 kf8Var, kf8 kf8Var2) {
        kf8Var2.getClass();
        return kf8Var.k(Float.intBitsToFloat((int) (kf8Var2.d() >> 32)) - Float.intBitsToFloat((int) (kf8Var.d() >> 32)), Float.intBitsToFloat((int) (kf8Var2.d() & 4294967295L)) - Float.intBitsToFloat((int) (kf8Var.d() & 4294967295L)));
    }

    public static void t(Cursor cursor) {
        if (cursor != null) {
            try {
                tw2.y(cursor);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final long u(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float fMin = Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat(i2));
        if (fMin >= 1.0f) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i) * fMin;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) * fMin)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final kf8 v(kf8 kf8Var, kf8 kf8Var2) {
        kf8Var.getClass();
        long jG = kf8Var.g();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
        float f = kf8Var.c;
        float f2 = kf8Var2.c;
        if (f > f2) {
            fIntBitsToFloat += f2 - f;
        }
        float f3 = kf8Var.d;
        float f4 = kf8Var2.d;
        if (f3 > f4) {
            fIntBitsToFloat2 += f4 - f3;
        }
        float f5 = kf8Var2.a;
        if (fIntBitsToFloat < f5) {
            fIntBitsToFloat += f5 - fIntBitsToFloat;
        }
        float f6 = kf8Var2.b;
        if (fIntBitsToFloat2 < f6) {
            fIntBitsToFloat2 += f6 - fIntBitsToFloat2;
        }
        return rw1.w((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), kf8Var.f());
    }

    public static cx1 w(int i) {
        return i != 0 ? i != 1 ? new up8() : new q22() : new up8();
    }

    public static void x(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        so9.m(file, "Unable to create parent directories of ");
    }

    public static String y(long j) {
        if (lc1.d(j, lc1.j)) {
            return "";
        }
        int iM = t96.M(lc1.i(j) * 255.0f);
        int iM2 = t96.M(lc1.h(j) * 255.0f);
        int iM3 = t96.M(lc1.f(j) * 255.0f);
        float fE = lc1.e(j);
        float fM = t96.M(fE * r8) / ((float) Math.pow(10.0d, 2.0d));
        StringBuilder sbT = xv5.t(iM, iM2, "rgba(", ", ", ", ");
        sbT.append(iM3);
        sbT.append(", ");
        sbT.append(fM);
        sbT.append(")");
        return sbT.toString();
    }

    public static String z(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(entry.getKey() + ": " + entry.getValue() + ";");
        }
        return fc1.D0(arrayList, " ", null, null, null, 62);
    }
}
