package defpackage;

import android.app.RemoteAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class o39 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o39(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // defpackage.ib4
    public final Object invoke() {
        ib4 ib4Var;
        int i = 1;
        switch (this.a) {
            case 0:
                p39 p39Var = (p39) this.b;
                return Integer.valueOf(tu1.Q(p39Var, p39Var.k));
            case 1:
                h49 h49Var = (h49) this.b;
                za1 za1VarA = vtb.a(h49Var);
                aj2 aj2Var = rw2.a;
                h49Var.g(za1VarA, nh2.c, new qoa(h49Var, (jt1) null, 21));
                return heb.a;
            case 2:
                eyb eybVar = (eyb) this.b;
                return Boolean.valueOf(x13.b(eybVar.a, eybVar.b) > 0);
            case 3:
                qt qtVar = ((i79) this.b).a;
                return gr9.a((String) qtVar.b.c(qt.T[0], qtVar));
            case 4:
                m89 m89Var = (m89) this.b;
                cn7 cn7Var = m89Var.c;
                if (((fg9) cn7Var.getValue()).a == 9205357640488583168L || fg9.e(((fg9) cn7Var.getValue()).a)) {
                    return null;
                }
                return m89Var.a.c(((fg9) cn7Var.getValue()).a);
            case 5:
                return Float.valueOf(((ob9) this.b).h / 100.0f);
            case 6:
                ii9 ii9Var = (ii9) this.b;
                if (!((Boolean) ii9Var.n.getValue()).booleanValue() && (ib4Var = ii9Var.b) != null) {
                    ib4Var.invoke();
                }
                return heb.a;
            case 7:
                boolean z = true;
                boolean z2 = false;
                lk9 lk9Var = (lk9) this.b;
                while (true) {
                    synchronized (lk9Var.g) {
                        try {
                            if (!lk9Var.c) {
                                lk9Var.c = z;
                                try {
                                    g07 g07Var = lk9Var.f;
                                    Object[] objArr = g07Var.a;
                                    int i2 = g07Var.c;
                                    for (?? r5 = z2; r5 < i2; r5++) {
                                        kk9 kk9Var = (kk9) objArr[r5];
                                        uz6 uz6Var = kk9Var.g;
                                        kb4 kb4Var = kk9Var.a;
                                        Object[] objArr2 = uz6Var.b;
                                        long[] jArr = uz6Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            ?? r11 = z2;
                                            while (true) {
                                                long j = jArr[r11];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i3 = 8 - ((~(r11 - length)) >>> 31);
                                                    for (?? r15 = z2; r15 < i3; r15++) {
                                                        if ((j & 255) < 128) {
                                                            kb4Var.invoke(objArr2[(r11 << 3) + r15]);
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i3 == 8) {
                                                    }
                                                }
                                                if (r11 != length) {
                                                    r11++;
                                                }
                                            }
                                        }
                                        uz6Var.b();
                                    }
                                    lk9Var.c = z2;
                                } catch (Throwable th) {
                                    lk9Var.c = z2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!lk9Var.c()) {
                        return heb.a;
                    }
                    z2 = false;
                    z = true;
                }
                break;
            case 8:
                Integer num = 4;
                int iOrdinal = ((bl9) this.b).ordinal();
                if (iOrdinal == 0) {
                    return zk9.j(gc1.Z(new blb(-1.0f, -1.0f, -1.0f), new blb(1.0f, -1.0f, -1.0f), new blb(1.0f, 1.0f, -1.0f), new blb(-1.0f, 1.0f, -1.0f), new blb(-1.0f, -1.0f, 1.0f), new blb(1.0f, -1.0f, 1.0f), new blb(1.0f, 1.0f, 1.0f), new blb(-1.0f, 1.0f, 1.0f)), gc1.Z(gc1.Z(0, 3, 2, 1), gc1.Z(num, 5, 6, 7), gc1.Z(0, 1, 5, num), gc1.Z(3, 7, 6, 2), gc1.Z(0, num, 7, 3), gc1.Z(1, 2, 6, 5)));
                }
                if (iOrdinal == 1) {
                    float fSqrt = (float) Math.sqrt(0.6666666865348816d);
                    float fSqrt2 = ((float) Math.sqrt(2.0d)) / 3.0f;
                    blb blbVar = new blb(0.0f, 1.0f, 0.0f);
                    blb blbVar2 = new blb(fSqrt * 2.0f, -0.33333334f, 0.0f);
                    float f = -fSqrt;
                    return zk9.j(gc1.Z(blbVar, blbVar2, new blb(f, -0.33333334f, ((float) Math.sqrt(3.0d)) * fSqrt2), new blb(f, -0.33333334f, (-((float) Math.sqrt(3.0d))) * fSqrt2)), gc1.Z(gc1.Z(0, 1, 2), gc1.Z(0, 2, 3), gc1.Z(0, 3, 1), gc1.Z(1, 3, 2)));
                }
                if (iOrdinal == 2) {
                    return zk9.j(gc1.Z(new blb(0.0f, 1.0f, 0.0f), new blb(1.0f, 0.0f, 0.0f), new blb(0.0f, 0.0f, 1.0f), new blb(-1.0f, 0.0f, 0.0f), new blb(0.0f, 0.0f, -1.0f), new blb(0.0f, -1.0f, 0.0f)), gc1.Z(gc1.Z(0, 1, 2), gc1.Z(0, 2, 3), gc1.Z(0, 3, num), gc1.Z(0, num, 1), gc1.Z(5, 2, 1), gc1.Z(5, 3, 2), gc1.Z(5, num, 3), gc1.Z(5, 1, num)));
                }
                if (iOrdinal == 3) {
                    float fSqrt3 = (((float) Math.sqrt(5.0d)) + 1.0f) / 2.0f;
                    float fSqrt4 = 1.0f / ((float) Math.sqrt((fSqrt3 * fSqrt3) + 1.0f));
                    float f2 = fSqrt3 * fSqrt4;
                    float f3 = -fSqrt4;
                    float f4 = -f2;
                    return zk9.j(gc1.Z(new blb(0.0f, fSqrt4, f2), new blb(0.0f, f3, f2), new blb(0.0f, fSqrt4, f4), new blb(0.0f, f3, f4), new blb(fSqrt4, f2, 0.0f), new blb(f3, f2, 0.0f), new blb(fSqrt4, f4, 0.0f), new blb(f3, f4, 0.0f), new blb(f2, 0.0f, fSqrt4), new blb(f4, 0.0f, fSqrt4), new blb(f2, 0.0f, f3), new blb(f4, 0.0f, f3)), gc1.Z(gc1.Z(num, 0, 5), gc1.Z(num, 5, 2), gc1.Z(num, 2, 10), gc1.Z(num, 10, 8), gc1.Z(num, 8, 0), gc1.Z(0, 8, 1), gc1.Z(0, 1, 9), gc1.Z(0, 9, 5), gc1.Z(5, 9, 11), gc1.Z(5, 11, 2), gc1.Z(2, 11, 3), gc1.Z(2, 3, 10), gc1.Z(10, 3, 6), gc1.Z(10, 6, 8), gc1.Z(8, 6, 1), gc1.Z(7, 1, 6), gc1.Z(7, 6, 3), gc1.Z(7, 3, 11), gc1.Z(7, 11, 9), gc1.Z(7, 9, 1)));
                }
                if (iOrdinal != 4) {
                    mn5.g();
                    return null;
                }
                ArrayList arrayList = new ArrayList(6);
                int i4 = 0;
                for (int i5 = 6; i4 < i5; i5 = 6) {
                    double d = ((((i4 % 3) * 2.0f) * 3.1415927f) / 3.0f) - 0.5235988f;
                    arrayList.add(new blb(((float) Math.cos(d)) * 1.0f, i4 < 3 ? -0.9f : 0.9f, ((float) Math.sin(d)) * 1.0f));
                    i4++;
                    i = i;
                    num = num;
                }
                Integer num2 = num;
                List listZ = gc1.Z(2, 1, 0);
                List listZ2 = gc1.Z(3, num2, 5);
                List listZ3 = gc1.Z(0, 1, num2, 3);
                List listZ4 = gc1.Z(1, 2, 5, num2);
                List listZ5 = gc1.Z(2, 0, 3, 5);
                List[] listArr = new List[5];
                listArr[0] = listZ;
                listArr[i] = listZ2;
                listArr[2] = listZ3;
                listArr[3] = listZ4;
                listArr[4] = listZ5;
                return zk9.j(arrayList, gc1.Z(listArr));
            case 9:
                return ww1.k0(((lm9) this.b).a).n;
            case 10:
                om9 om9Var = (om9) this.b;
                av0 av0Var = av0.d;
                StringBuilder sb = new StringBuilder();
                int[] iArr = om9.d;
                for (int i6 = 0; i6 < 13; i6++) {
                    int i7 = iArr[i6];
                    String strValueOf = i7 > 99 ? String.valueOf(i7) : dx1.f(i7, "0");
                    strValueOf.getClass();
                    sb.append((char) Integer.parseInt(new StringBuilder((CharSequence) strValueOf).reverse().toString()));
                }
                String string = sb.toString();
                av0 av0Var2 = av0.d;
                return ra1.s(ra1.s(string + om9Var.a + om9Var.b).c("MD5").e()).c("SHA-256").r();
            case 11:
                wa2 wa2Var = ((gn9) this.b).a;
                return new om9(wa2Var.e, wa2Var.c);
            case 12:
                ln9 ln9Var = (ln9) this.b;
                za1 za1VarA2 = vtb.a(ln9Var);
                aj2 aj2Var2 = rw2.a;
                ln9Var.g(za1VarA2, nh2.c, new h97(ln9Var, null));
                return heb.a;
            case 13:
                ox9 ox9Var = (ox9) this.b;
                jh4 jh4Var = ox9Var.H;
                if (jh4Var != null) {
                    return jh4Var;
                }
                jh4 jh4VarC = vw1.Q(ox9Var).c();
                ox9Var.H = jh4VarC;
                return jh4VarC;
            case 14:
                ty9 ty9Var = (ty9) this.b;
                return ty9Var.a.getKey() + "&imageInfo=" + ty9Var.b;
            case 15:
                nx9 nx9Var = new nx9((oaa) this.b, i);
                yp8 yp8Var = new yp8();
                nx9Var.invoke(yp8Var);
                return new ob5(yp8Var);
            case 16:
                bba bbaVar = (bba) this.b;
                bbaVar.Q = null;
                vw1.G(bbaVar);
                pu1.k0(bbaVar);
                ex1.U(bbaVar);
                return Boolean.TRUE;
            case 17:
                return dk9.x(Boolean.valueOf(((yba) this.b).B));
            case 18:
                return Boolean.valueOf(x13.b(((pj7) this.b).d(), 0.0f) > 0);
            case 19:
                tm5.g((RemoteAction) this.b);
                return heb.a;
            case 20:
                hda hdaVar = (hda) this.b;
                return ((nu6) hdaVar).z ? uj9.h(hdaVar) : qca.b;
            case 21:
                return new ea5(((ia5) this.b).d());
            case 22:
                ska skaVar = (ska) this.b;
                skaVar.L = null;
                vw1.G(skaVar);
                pu1.k0(skaVar);
                ex1.U(skaVar);
                return Boolean.TRUE;
            case 23:
                ym7 ym7Var = (ym7) this.b;
                ur9 ur9Var = zma.a;
                ym7Var.i(0.0f);
                return heb.a;
            case 24:
                return Boolean.valueOf(((jka) this.b).d() != t19.a);
            case 25:
                ((cwa) this.b).a0.invoke(Boolean.valueOf(!r0.Z));
                return heb.a;
            case 26:
                mn8 mn8Var = (mn8) this.b;
                vn9 vn9Var = new vn9(0L, wn9.x(24), (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65533);
                mn8Var.getClass();
                mn8Var.a.t(vn9Var);
                return heb.a;
            case 27:
                uhb uhbVar = (uhb) this.b;
                if (!uhbVar.s && uhbVar.t) {
                    uhbVar.j();
                }
                return heb.a;
            case 28:
                return Float.valueOf(((je4) this.b).b.h());
            default:
                return Float.valueOf(((otb) this.b).b()[0]);
        }
    }
}
