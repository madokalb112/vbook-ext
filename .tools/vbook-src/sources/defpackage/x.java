package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x extends kc4 implements kb4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object value;
        Object value2;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        switch (i2) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                e0 e0Var = (e0) this.receiver;
                cz6 cz6Var = e0Var.P;
                if (!zBooleanValue) {
                    if (e0Var.C != null) {
                        Object[] objArr3 = cz6Var.c;
                        long[] jArr = cz6Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            i = i7;
                                            objArr2 = objArr3;
                                            ah1.J(e0Var.S0(), null, null, new c0(e0Var, (c28) objArr3[(i6 << 3) + i9], (jt1) null, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i7;
                                        }
                                        j >>= i;
                                        i9++;
                                        i7 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i8 == i7) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        c28 c28Var = e0Var.R;
                        if (c28Var != null) {
                            ah1.J(e0Var.S0(), null, null, new c0(e0Var, c28Var, (jt1) null, 1), 3);
                        }
                    }
                    cz6Var.a();
                    e0Var.R = null;
                    e0Var.p1();
                } else {
                    e0Var.o1();
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                e71 e71Var = (e71) this.receiver;
                e71Var.getClass();
                za1 za1VarA = vtb.a(e71Var);
                aj2 aj2Var = rw2.a;
                e71Var.g(za1VarA, nh2.c, new w(e71Var, str, jt1Var, 25));
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                e71 e71Var2 = (e71) this.receiver;
                e71Var2.getClass();
                Long lN = iw9.N(e71Var2.c);
                if (lN != null) {
                    long jLongValue = lN.longValue();
                    if (bw9.a0(((t61) e71Var2.s.getValue()).A)) {
                        za1 za1VarA2 = vtb.a(e71Var2);
                        aj2 aj2Var2 = rw2.a;
                        e71Var2.g(za1VarA2, nh2.c, new x61(e71Var2, str2, jLongValue, (jt1) null));
                    }
                }
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                e71 e71Var3 = (e71) this.receiver;
                e71Var3.getClass();
                fr9 fr9Var = e71Var3.s;
                Set setD1 = fc1.d1(((t61) fr9Var.getValue()).z);
                if (!setD1.add(str3)) {
                    setD1.remove(str3);
                }
                if (fr9Var != null) {
                    while (true) {
                        Object value3 = fr9Var.getValue();
                        Set set = setD1;
                        if (!fr9Var.j(value3, t61.a((t61) value3, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, set, null, 0, null, null, 2080374783))) {
                            setD1 = set;
                        }
                    }
                }
                break;
            case 6:
                long jLongValue2 = ((Number) obj).longValue();
                e71 e71Var4 = (e71) this.receiver;
                e71Var4.getClass();
                za1 za1VarA3 = vtb.a(e71Var4);
                aj2 aj2Var3 = rw2.a;
                e71Var4.g(za1VarA3, nh2.c, new v61(e71Var4, jLongValue2, (jt1) null));
                break;
            case 7:
                g73 g73Var = (g73) obj;
                g73Var.getClass();
                break;
            case 8:
                g73 g73Var2 = (g73) obj;
                g73Var2.getClass();
                break;
            case 9:
                g73 g73Var3 = (g73) obj;
                g73Var3.getClass();
                break;
            case 10:
                g73 g73Var4 = (g73) obj;
                g73Var4.getClass();
                break;
            case 11:
                g73 g73Var5 = (g73) obj;
                g73Var5.getClass();
                break;
            case 12:
                g73 g73Var6 = (g73) obj;
                g73Var6.getClass();
                break;
            case 13:
                g73 g73Var7 = (g73) obj;
                g73Var7.getClass();
                break;
            case 14:
                g73 g73Var8 = (g73) obj;
                g73Var8.getClass();
                break;
            case 15:
                g73 g73Var9 = (g73) obj;
                g73Var9.getClass();
                break;
            case 16:
                g73 g73Var10 = (g73) obj;
                g73Var10.getClass();
                break;
            case 17:
                g73 g73Var11 = (g73) obj;
                g73Var11.getClass();
                break;
            case 18:
                g73 g73Var12 = (g73) obj;
                g73Var12.getClass();
                break;
            case 19:
                g73 g73Var13 = (g73) obj;
                g73Var13.getClass();
                break;
            case 20:
                g73 g73Var14 = (g73) obj;
                g73Var14.getClass();
                break;
            case 21:
                g73 g73Var15 = (g73) obj;
                g73Var15.getClass();
                break;
            case 22:
                g73 g73Var16 = (g73) obj;
                g73Var16.getClass();
                break;
            case 23:
                g73 g73Var17 = (g73) obj;
                g73Var17.getClass();
                break;
            case 24:
                g73 g73Var18 = (g73) obj;
                g73Var18.getClass();
                break;
            case 25:
                int iIntValue = ((Number) obj).intValue();
                mo1 mo1Var = (mo1) this.receiver;
                mo1Var.getClass();
                qtb.h(mo1Var, vtb.a(mo1Var), new lo1(mo1Var, iIntValue, jt1Var, i3));
                break;
            case 26:
                int iIntValue2 = ((Number) obj).intValue();
                mo1 mo1Var2 = (mo1) this.receiver;
                mo1Var2.getClass();
                qtb.h(mo1Var2, vtb.a(mo1Var2), new lo1(mo1Var2, iIntValue2, jt1Var, i4));
                break;
            case 27:
                int iIntValue3 = ((Number) obj).intValue();
                mo1 mo1Var3 = (mo1) this.receiver;
                mo1Var3.getClass();
                qtb.h(mo1Var3, vtb.a(mo1Var3), new lo1(mo1Var3, iIntValue3, jt1Var, i5));
                break;
            case 28:
                String str4 = (String) obj;
                str4.getClass();
                t02 t02Var = (t02) this.receiver;
                t02Var.getClass();
                fr9 fr9Var2 = t02Var.e;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, s02.a((s02) value, false, false, false, false, false, str4, null, null, null, 479)));
                }
                break;
            default:
                String str5 = (String) obj;
                str5.getClass();
                t02 t02Var2 = (t02) this.receiver;
                t02Var2.getClass();
                fr9 fr9Var3 = t02Var2.e;
                if (fr9Var3 != null) {
                    do {
                        value2 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value2, s02.a((s02) value2, false, false, false, false, false, null, str5, null, null, 447)));
                }
                break;
        }
        return hebVar;
    }
}
