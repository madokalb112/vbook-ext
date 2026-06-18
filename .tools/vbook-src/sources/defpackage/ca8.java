package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ca8 implements v5b {
    public static final yg8 q = new yg8("^(第(.+)\\s*([章节幕回折])\\s\\d+\\.)(\\s)(.+)");
    public static final yg8 r = new yg8("^(第?\\s*([零〇一二两三四五六七八九十百千]+|\\d+)\\s*([章节幕回]?))([,.:，。：．、\\s]*)(.*)$");
    public final String a;
    public final rs2 b;
    public final x78 c;
    public final v98 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final t07 l;
    public ld4 m;
    public y28 n;
    public s16 o;
    public final ArrayList p;

    public ca8(String str, rs2 rs2Var, x78 x78Var, v98 v98Var) {
        str.getClass();
        this.a = str;
        this.b = rs2Var;
        this.c = x78Var;
        this.d = v98Var;
        this.e = x78Var.b();
        this.f = x78Var.k();
        this.g = x78Var.f();
        this.h = x78Var.e();
        this.i = x78Var.c();
        this.j = x78Var.i();
        this.k = x78Var.l();
        this.l = u07.a();
        this.p = gc1.E(new r5b("zh", "Tiếng Trung", true, false), new r5b("vp", "Việt (VP)", false, true), new r5b("hv", "Hán Việt", false, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(java.util.List r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.d(java.util.List, boolean):java.util.ArrayList");
    }

    public static String e(String str) {
        int iW;
        return (str.length() <= 0 || (iW = bw9.W(str, (char) 166, 0, 6)) == -1) ? str : bw9.z0(iW, str);
    }

    public static String k(String str) {
        if (str == null) {
            return "Chương";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 21367) {
            return !str.equals("卷") ? "Chương" : "Quyển";
        }
        if (iHashCode == 22238) {
            return !str.equals("回") ? "Chương" : "Hồi";
        }
        if (iHashCode == 24149) {
            return !str.equals("幕") ? "Chương" : "Màn";
        }
        if (iHashCode == 25240) {
            return !str.equals("折") ? "Chương" : "Chiết";
        }
        if (iHashCode != 31456) {
            return iHashCode != 33410 ? (iHashCode == 38598 && str.equals("集")) ? "Tập" : "Chương" : !str.equals("节") ? "Chương" : "Tiết";
        }
        str.equals("章");
        return "Chương";
    }

    public static List m(String str) {
        return bw9.o0(str, new char[]{166}, 0, 6);
    }

    public static ArrayList z(ca8 ca8Var, String str) {
        ArrayList arrayList;
        ld4 ld4Var;
        ArrayList arrayList2 = new ArrayList();
        if (str.length() != 0) {
            ArrayList arrayListU = js8.u(str, '\n', 65533);
            Map map = null;
            if (ca8Var.j == 0 && (ld4Var = ca8Var.m) != null) {
                map = ld4Var.k;
            }
            if (map == null) {
                map = mc3.a;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int size = arrayListU.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListU.get(i2);
                i2++;
                xl7 xl7Var = (xl7) obj;
                sb.setLength(i);
                sb2.setLength(i);
                Object obj2 = xl7Var.a;
                Object obj3 = xl7Var.b;
                String str2 = (String) obj2;
                int length = str2.length();
                int i3 = i;
                int i4 = i3;
                boolean z = true;
                while (i3 < length) {
                    char cCharAt = str2.charAt(i3);
                    Character ch = (Character) map.get(Character.valueOf(cCharAt));
                    if (ch != null) {
                        arrayList = arrayListU;
                        if (z) {
                            sb.setLength(0);
                            sb2.setLength(0);
                            z = false;
                        }
                        sb2.append(cCharAt);
                        sb.append(ch.charValue());
                    } else {
                        arrayList = arrayListU;
                        if (!z) {
                            arrayList2.addAll(ca8Var.v(str2.substring(i4, i3 - sb2.length())));
                            arrayList2.add(new w98(4, sb2.toString(), sb.toString(), false));
                            sb.setLength(0);
                            sb2.setLength(0);
                            i4 = i3;
                            z = true;
                        }
                    }
                    i3++;
                    arrayListU = arrayList;
                }
                ArrayList arrayList3 = arrayListU;
                if (!z) {
                    arrayList2.addAll(ca8Var.v(str2.substring(i4, str2.length() - sb2.length())));
                    arrayList2.add(new w98(4, sb2.toString(), sb.toString(), false));
                } else if (i4 < str2.length()) {
                    arrayList2.addAll(ca8Var.v(str2.substring(i4)));
                }
                if (obj3 != null) {
                    arrayList2.add(new w98(0, String.valueOf(obj3), String.valueOf(obj3), false));
                    i = 0;
                    arrayListU = arrayList3;
                } else {
                    arrayListU = arrayList3;
                    i = 0;
                }
            }
        }
        return arrayList2;
    }

    public final void A(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d.a();
        ld4 ld4Var = this.m;
        if (ld4Var != null) {
            as2 as2Var = ld4Var.f;
            if (as2Var != null) {
            }
            as2 as2Var2 = ld4Var.g;
            if (as2Var2 != null) {
            }
        }
    }

    public final void B(String str, String str2, String str3) {
        y28 y28Var;
        j39.v(str, str2, str3);
        this.d.a();
        if (!lc5.Q(this.a, str) || (y28Var = this.n) == null) {
            return;
        }
        y28Var.b.a(str2, str3);
    }

    public final void C(String str, String str2, String str3) {
        y28 y28Var;
        j39.v(str, str2, str3);
        this.d.a();
        if (!lc5.Q(this.a, str) || (y28Var = this.n) == null) {
            return;
        }
        y28Var.a.a(str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // defpackage.v5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.Map r24, defpackage.kt1 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.a(java.lang.String, java.lang.String, java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    @Override // defpackage.v5b
    public final Object b(kt1 kt1Var) {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r13 == r9) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d7  */
    @Override // defpackage.v5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.c(java.lang.String, kt1):java.lang.Object");
    }

    @Override // defpackage.v5b
    public final void close() {
        this.m = null;
        this.n = null;
    }

    public final String f(int i, String str) {
        ld4 ld4Var = this.m;
        if (ld4Var != null) {
            str.getClass();
            Map map = ld4Var.d;
            if (map != null) {
                return (String) map.get(Character.valueOf(str.charAt(i)));
            }
        }
        return null;
    }

    public final xl7 g(int i, int i2, String str) {
        y28 y28Var = this.n;
        String strA = null;
        if (y28Var == null) {
            ld4 ld4Var = this.m;
            if (ld4Var != null) {
                strA = ld4Var.a(i, i2, str);
            }
        } else if (this.g == 0) {
            str.getClass();
            String str2 = (String) y28Var.b.b(i, i2, str);
            if (str2 != null) {
                return new xl7(str2, Boolean.TRUE);
            }
            ld4 ld4Var2 = this.m;
            if (ld4Var2 != null) {
                strA = ld4Var2.a(i, i2, str);
            }
        } else {
            ld4 ld4Var3 = this.m;
            String strA2 = ld4Var3 != null ? ld4Var3.a(i, i2, str) : null;
            if (strA2 != null) {
                return new xl7(strA2, Boolean.FALSE);
            }
            y28 y28Var2 = this.n;
            if (y28Var2 != null) {
                str.getClass();
                strA = (String) y28Var2.b.b(i, i2, str);
            }
            if (strA != null) {
                return new xl7(strA, Boolean.TRUE);
            }
        }
        return new xl7(strA, Boolean.FALSE);
    }

    public final String h(int i, int i2, String str) {
        ld4 ld4Var = this.m;
        if (ld4Var == null) {
            return null;
        }
        str.getClass();
        as2 as2Var = ld4Var.c;
        if (as2Var != null) {
            return (String) as2Var.b(i, i2, str);
        }
        return null;
    }

    public final Character i(char c) {
        Map map;
        ld4 ld4Var = this.m;
        if (ld4Var == null || (map = ld4Var.j) == null) {
            return null;
        }
        return (Character) map.get(Character.valueOf(c));
    }

    public final xl7 j(int i, int i2, String str) {
        y28 y28Var = this.n;
        String strB = null;
        if (y28Var == null) {
            ld4 ld4Var = this.m;
            if (ld4Var != null) {
                strB = ld4Var.b(i, i2, str);
            }
        } else if (this.g == 0) {
            str.getClass();
            String str2 = (String) y28Var.a.b(i, i2, str);
            if (str2 != null) {
                return new xl7(str2, Boolean.TRUE);
            }
            ld4 ld4Var2 = this.m;
            if (ld4Var2 != null) {
                strB = ld4Var2.b(i, i2, str);
            }
        } else {
            ld4 ld4Var3 = this.m;
            String strB2 = ld4Var3 != null ? ld4Var3.b(i, i2, str) : null;
            if (strB2 != null) {
                return new xl7(strB2, Boolean.FALSE);
            }
            y28 y28Var2 = this.n;
            if (y28Var2 != null) {
                str.getClass();
                strB = (String) y28Var2.a.b(i, i2, str);
            }
            if (strB != null) {
                return new xl7(strB, Boolean.TRUE);
            }
        }
        return new xl7(strB, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.y98
            if (r0 == 0) goto L13
            r0 = r11
            y98 r0 = (defpackage.y98) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            y98 r0 = new y98
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.s
            rs2 r2 = r10.b
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            xx1 r8 = defpackage.xx1.a
            if (r1 == 0) goto L58
            if (r1 == r6) goto L4f
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L39
            ca8 r10 = r0.b
            r07 r0 = r0.a
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L36
            goto Lb2
        L36:
            r10 = move-exception
            goto Lbf
        L39:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r7
        L3f:
            int r5 = r0.d
            int r1 = r0.c
            ca8 r4 = r0.b
            r07 r6 = r0.a
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L4b
            goto L9a
        L4b:
            r10 = move-exception
            r0 = r6
            goto Lbf
        L4f:
            int r1 = r0.c
            r07 r6 = r0.a
            defpackage.e11.e0(r11)
            r11 = r6
            goto L6b
        L58:
            defpackage.e11.e0(r11)
            t07 r11 = r10.l
            r0.a = r11
            r0.c = r5
            r0.s = r6
            java.lang.Object r1 = r11.p(r0)
            if (r1 != r8) goto L6a
            goto Lb0
        L6a:
            r1 = r5
        L6b:
            ld4 r6 = r10.m     // Catch: java.lang.Throwable -> Lbd
            if (r6 == 0) goto L86
            as2 r9 = r6.a     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L86
            as2 r9 = r6.b     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L86
            as2 r9 = r6.c     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L86
            java.util.Map r9 = r6.d     // Catch: java.lang.Throwable -> Lbd
            if (r9 == 0) goto L86
            f76 r6 = r6.i     // Catch: java.lang.Throwable -> Lbd
            if (r6 == 0) goto L86
            goto Lb7
        L84:
            r0 = r11
            goto Lbf
        L86:
            r0.a = r11     // Catch: java.lang.Throwable -> Lbd
            r0.b = r10     // Catch: java.lang.Throwable -> Lbd
            r0.c = r1     // Catch: java.lang.Throwable -> Lbd
            r0.d = r5     // Catch: java.lang.Throwable -> Lbd
            r0.s = r4     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> Lbd
            if (r4 != r8) goto L97
            goto Lb0
        L97:
            r6 = r11
            r11 = r4
            r4 = r10
        L9a:
            ld4 r11 = (defpackage.ld4) r11     // Catch: java.lang.Throwable -> L4b
            r4.m = r11     // Catch: java.lang.Throwable -> L4b
            java.lang.String r11 = r10.a     // Catch: java.lang.Throwable -> L4b
            r0.a = r6     // Catch: java.lang.Throwable -> L4b
            r0.b = r10     // Catch: java.lang.Throwable -> L4b
            r0.c = r1     // Catch: java.lang.Throwable -> L4b
            r0.d = r5     // Catch: java.lang.Throwable -> L4b
            r0.s = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r11 = r2.d(r11, r0)     // Catch: java.lang.Throwable -> L4b
            if (r11 != r8) goto Lb1
        Lb0:
            return r8
        Lb1:
            r0 = r6
        Lb2:
            y28 r11 = (defpackage.y28) r11     // Catch: java.lang.Throwable -> L36
            r10.n = r11     // Catch: java.lang.Throwable -> L36
            r11 = r0
        Lb7:
            r11.q(r7)
            heb r10 = defpackage.heb.a
            return r10
        Lbd:
            r10 = move-exception
            goto L84
        Lbf:
            r0.q(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.l(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r20, defpackage.w98[] r21, boolean[] r22) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.n(java.lang.String, w98[], boolean[]):void");
    }

    public final void o(String str, w98[] w98VarArr, boolean[] zArr) {
        boolean z;
        for (int iMin = Math.min(this.i, str.length()); iMin >= 1; iMin--) {
            int length = str.length() - iMin;
            int i = 0;
            while (i <= length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= iMin) {
                        z = false;
                        break;
                    } else {
                        if (zArr[i + i2]) {
                            i += i2 + 1;
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    y28 y28Var = this.n;
                    String str2 = y28Var != null ? (String) y28Var.b.b(i, iMin, str) : null;
                    if (str2 != null) {
                        int i3 = i + iMin;
                        w98VarArr[i] = new w98(2, str.substring(i, i3), e(str2), true);
                        for (int i4 = 0; i4 < iMin; i4++) {
                            zArr[i + i4] = true;
                        }
                        i = i3;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void p(String str, w98[] w98VarArr, boolean[] zArr) {
        boolean z;
        for (int iMin = Math.min(this.i, str.length()); iMin >= 2; iMin--) {
            int length = str.length() - iMin;
            int i = 0;
            while (i <= length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= iMin) {
                        z = false;
                        break;
                    } else {
                        if (zArr[i + i2]) {
                            i += i2 + 1;
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    ld4 ld4Var = this.m;
                    String strA = ld4Var != null ? ld4Var.a(i, iMin, str) : null;
                    if (strA != null) {
                        int i3 = i + iMin;
                        w98VarArr[i] = new w98(2, str.substring(i, i3), e(strA), false);
                        for (int i4 = 0; i4 < iMin; i4++) {
                            zArr[i + i4] = true;
                        }
                        i = i3;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void q(String str, w98[] w98VarArr, boolean[] zArr, int i) {
        boolean z;
        int iMin = Math.min(i, str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            int iMin2 = Math.min(iMin, str.length() - i2);
            while (true) {
                if (iMin2 > 1) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iMin2) {
                            z = false;
                            break;
                        } else {
                            if (zArr[i2 + i3]) {
                                iMin2 = i3;
                                z = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (!z) {
                        xl7 xl7VarJ = j(i2, iMin2, str);
                        String str2 = (String) xl7VarJ.a;
                        boolean zBooleanValue = ((Boolean) xl7VarJ.b).booleanValue();
                        if (str2 != null) {
                            w98VarArr[i2] = new w98(1, str.substring(i2, i2 + iMin2), e(str2), zBooleanValue);
                            for (int i4 = 0; i4 < iMin2; i4++) {
                                zArr[i2 + i4] = true;
                            }
                            i2 += iMin2 - 1;
                        } else {
                            iMin2--;
                        }
                    }
                }
            }
            i2++;
        }
    }

    public final void r(String str, w98[] w98VarArr, boolean[] zArr, int i) {
        boolean z;
        for (int iMin = Math.min(i, str.length()); iMin > 1; iMin--) {
            int length = str.length() - iMin;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        z = false;
                        break;
                    } else {
                        if (zArr[i2 + i3]) {
                            i2 += i3 + 1;
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                if (!z) {
                    xl7 xl7VarJ = j(i2, iMin, str);
                    String str2 = (String) xl7VarJ.a;
                    boolean zBooleanValue = ((Boolean) xl7VarJ.b).booleanValue();
                    if (str2 != null) {
                        int i4 = i2 + iMin;
                        w98VarArr[i2] = new w98(1, str.substring(i2, i4), e(str2), zBooleanValue);
                        for (int i5 = 0; i5 < iMin; i5++) {
                            zArr[i2 + i5] = true;
                        }
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public final void s(String str, w98[] w98VarArr, boolean[] zArr, int i) {
        boolean z;
        for (int iMin = Math.min(this.i, str.length()); iMin >= i; iMin--) {
            int length = str.length() - iMin;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        z = false;
                        break;
                    } else {
                        if (zArr[i2 + i3]) {
                            i2 += i3 + 1;
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
                if (!z) {
                    xl7 xl7VarJ = j(i2, iMin, str);
                    String str2 = (String) xl7VarJ.a;
                    boolean zBooleanValue = ((Boolean) xl7VarJ.b).booleanValue();
                    if (str2 != null) {
                        int i4 = i2 + iMin;
                        w98VarArr[i2] = new w98(1, str.substring(i2, i4), e(str2), zBooleanValue);
                        for (int i5 = 0; i5 < iMin; i5++) {
                            zArr[i2 + i5] = true;
                        }
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public final ArrayList t(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() != 0) {
            ArrayList arrayListU = js8.u(str, '\n', 65533);
            int size = arrayListU.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListU.get(i);
                i++;
                xl7 xl7Var = (xl7) obj;
                String str2 = (String) xl7Var.a;
                int length = str2.length();
                int i2 = 0;
                StringBuilder sb = null;
                StringBuilder sb2 = null;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    Character chI = i(cCharAt);
                    if (chI != null) {
                        if (sb == null) {
                            sb2 = new StringBuilder();
                            sb = new StringBuilder();
                        }
                        if (sb2 != null) {
                            sb2.append(cCharAt);
                        }
                        sb.append(chI.charValue());
                    } else if (sb != null) {
                        sb2.getClass();
                        arrayList.addAll(w(str2.substring(i2, i3 - sb2.length())));
                        arrayList.add(new w98(4, sb2.toString(), sb.toString(), false));
                        sb = null;
                        sb2 = null;
                        i2 = i3;
                    }
                }
                if (sb != null) {
                    int length2 = str2.length();
                    sb2.getClass();
                    arrayList.addAll(w(str2.substring(i2, length2 - sb2.length())));
                    arrayList.add(new w98(4, sb2.toString(), sb.toString(), false));
                } else if (i2 < str2.length()) {
                    arrayList.addAll(w(str2.substring(i2)));
                }
                arrayList.add(new w98(0, String.valueOf(xl7Var.b), null, false));
            }
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r13, defpackage.kt1 r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.u(int, kt1, java.lang.String):java.lang.Object");
    }

    public final ArrayList v(String str) {
        int i;
        boolean z;
        if (this.h == 0) {
            boolean[] zArr = new boolean[str.length()];
            w98[] w98VarArr = new w98[str.length()];
            if (this.e != 0) {
                n(str, w98VarArr, zArr);
            }
            if (this.g == 1) {
                p(str, w98VarArr, zArr);
                o(str, w98VarArr, zArr);
            } else {
                o(str, w98VarArr, zArr);
                p(str, w98VarArr, zArr);
            }
            int i2 = this.f;
            if (i2 == 0) {
                q(str, w98VarArr, zArr, this.i);
            } else if (i2 == 1) {
                r(str, w98VarArr, zArr, this.i);
            } else if (i2 == 2) {
                s(str, w98VarArr, zArr, 4);
                q(str, w98VarArr, zArr, 3);
            } else if (i2 == 3) {
                s(str, w98VarArr, zArr, 5);
                q(str, w98VarArr, zArr, 4);
            }
            int length = 0;
            while (length < str.length()) {
                if (!zArr[length]) {
                    zArr[length] = true;
                    xl7 xl7VarG = g(length, 1, str);
                    String str2 = (String) xl7VarG.a;
                    boolean zBooleanValue = ((Boolean) xl7VarG.b).booleanValue();
                    if (str2 == null || str2.length() == 0) {
                        xl7 xl7VarJ = j(length, 1, str);
                        String str3 = (String) xl7VarJ.a;
                        boolean zBooleanValue2 = ((Boolean) xl7VarJ.b).booleanValue();
                        if (str3 != null) {
                            w98VarArr[length] = new w98(1, String.valueOf(str.charAt(length)), e(str3), zBooleanValue2);
                        } else {
                            Character chI = i(str.charAt(length));
                            if (chI != null) {
                                w98VarArr[length] = new w98(4, String.valueOf(str.charAt(length)), String.valueOf(chI.charValue()), false);
                            } else {
                                String strF = f(length, str);
                                if (strF != null) {
                                    w98VarArr[length] = new w98(3, String.valueOf(str.charAt(length)), e(strF), false);
                                } else {
                                    int iK = fw.K(str, length);
                                    int i3 = iK >= 65536 ? 2 : 1;
                                    if ((iK >>> 16) >= 17) {
                                        gp.l("Not a valid code point");
                                        return null;
                                    }
                                    String strSubstring = i3 > 1 ? str.substring(length, i3 + length) : null;
                                    if (strSubstring != null) {
                                        w98VarArr[length] = new w98(0, strSubstring, null, false);
                                        length += strSubstring.length();
                                    } else {
                                        w98VarArr[length] = new w98(0, String.valueOf(str.charAt(length)), null, false);
                                    }
                                }
                            }
                        }
                    } else {
                        w98VarArr[length] = new w98(2, String.valueOf(str.charAt(length)), e(str2), zBooleanValue);
                    }
                }
                length++;
            }
            return fw.i0(w98VarArr);
        }
        boolean[] zArr2 = new boolean[str.length()];
        w98[] w98VarArr2 = new w98[str.length()];
        if (this.e != 0) {
            n(str, w98VarArr2, zArr2);
        }
        int i4 = this.f;
        if (i4 == 0) {
            q(str, w98VarArr2, zArr2, this.i);
        } else if (i4 == 1) {
            r(str, w98VarArr2, zArr2, this.i);
        } else if (i4 == 2) {
            s(str, w98VarArr2, zArr2, 4);
            q(str, w98VarArr2, zArr2, 3);
        } else if (i4 == 3) {
            s(str, w98VarArr2, zArr2, 5);
            q(str, w98VarArr2, zArr2, 4);
        }
        for (int iMin = Math.min(this.i, str.length()); iMin > 1; iMin--) {
            int length2 = str.length() - iMin;
            int i5 = 0;
            while (i5 <= length2) {
                int i6 = 0;
                while (true) {
                    if (i6 >= iMin) {
                        z = false;
                        break;
                    }
                    if (zArr2[i5 + i6]) {
                        i5 += i6 + 1;
                        z = true;
                        break;
                    }
                    i6++;
                }
                if (!z) {
                    xl7 xl7VarG2 = g(i5, iMin, str);
                    String str4 = (String) xl7VarG2.a;
                    boolean zBooleanValue3 = ((Boolean) xl7VarG2.b).booleanValue();
                    if (str4 == null || str4.length() == 0) {
                        i5++;
                    } else {
                        int i7 = i5 + iMin;
                        w98VarArr2[i5] = new w98(2, str.substring(i5, i7), e(str4), zBooleanValue3);
                        for (int i8 = 0; i8 < iMin; i8++) {
                            zArr2[i5 + i8] = true;
                        }
                        i5 = i7;
                    }
                }
            }
        }
        int length3 = 0;
        while (length3 < str.length()) {
            if (!zArr2[length3]) {
                zArr2[length3] = true;
                xl7 xl7VarJ2 = j(length3, 1, str);
                String str5 = (String) xl7VarJ2.a;
                boolean zBooleanValue4 = ((Boolean) xl7VarJ2.b).booleanValue();
                if (str5 != null) {
                    i = length3 + 1;
                    w98VarArr2[length3] = new w98(1, str.substring(length3, i), e(str5), zBooleanValue4);
                } else {
                    xl7 xl7VarG3 = g(length3, 1, str);
                    String str6 = (String) xl7VarG3.a;
                    boolean zBooleanValue5 = ((Boolean) xl7VarG3.b).booleanValue();
                    if (str6 == null || str6.length() == 0) {
                        Character chI2 = i(str.charAt(length3));
                        if (chI2 != null) {
                            w98VarArr2[length3] = new w98(4, String.valueOf(str.charAt(length3)), String.valueOf(chI2.charValue()), false);
                        } else {
                            String strF2 = f(length3, str);
                            if (strF2 != null) {
                                w98VarArr2[length3] = new w98(3, String.valueOf(str.charAt(length3)), e(strF2), false);
                            } else {
                                int iK2 = fw.K(str, length3);
                                int i9 = iK2 >= 65536 ? 2 : 1;
                                if ((iK2 >>> 16) >= 17) {
                                    gp.l("Not a valid code point");
                                    return null;
                                }
                                String strSubstring2 = i9 > 1 ? str.substring(length3, i9 + length3) : null;
                                if (strSubstring2 != null) {
                                    w98VarArr2[length3] = new w98(0, strSubstring2, null, false);
                                    length3 += strSubstring2.length();
                                } else {
                                    w98VarArr2[length3] = new w98(0, String.valueOf(str.charAt(length3)), null, false);
                                }
                            }
                        }
                    } else {
                        i = length3 + 1;
                        w98VarArr2[length3] = new w98(2, str.substring(length3, i), e(str6), zBooleanValue5);
                    }
                }
                length3 = i;
            }
            length3++;
        }
        return fw.i0(w98VarArr2);
    }

    public final ArrayList w(String str) {
        Character chI;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String strValueOf = String.valueOf(str.charAt(i));
            String strF = f(0, strValueOf);
            if (strF == null && (chI = i(strValueOf.charAt(0))) != null) {
                strF = String.valueOf(chI.charValue());
            }
            arrayList.add(new w98(3, strValueOf, strF, false));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0074 -> B:24:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ba8
            if (r0 == 0) goto L13
            r0 = r9
            ba8 r0 = (defpackage.ba8) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ba8 r0 = new ba8
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.s
            r2 = 1
            java.lang.String r3 = "\n"
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r8 = r0.d
            java.util.List r1 = r0.c
            java.util.Iterator r5 = r0.b
            java.util.List r6 = r0.a
            defpackage.e11.e0(r9)
            goto L75
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L37:
            defpackage.e11.e0(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r1 = r8.length()
            if (r1 != 0) goto L46
            return r9
        L46:
            java.lang.String[] r1 = new java.lang.String[]{r3}
            java.util.List r8 = defpackage.bw9.p0(r8, r1)
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r1 = r9
            r8 = r4
        L55:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            r0.a = r1
            r0.b = r5
            r0.c = r1
            r0.d = r8
            r0.s = r2
            java.util.ArrayList r9 = r7.y(r9)
            xx1 r6 = defpackage.xx1.a
            if (r9 != r6) goto L74
            return r6
        L74:
            r6 = r1
        L75:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            defpackage.fc1.p0(r1, r9)
            w98 r9 = new w98
            r9.<init>(r4, r3, r3, r4)
            r6.add(r9)
            r1 = r6
            goto L55
        L84:
            defpackage.fc1.M0(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca8.x(java.lang.String, kt1):java.lang.Object");
    }

    public final ArrayList y(String str) {
        Object objV;
        Object objV2;
        ArrayList arrayList = new ArrayList();
        k96 k96VarD = q.d(str);
        if (k96VarD != null) {
            String str2 = (String) ((i96) k96VarD.a()).get(3);
            String str3 = (String) ((i96) k96VarD.a()).get(2);
            ArrayList arrayListV = v((String) ((i96) k96VarD.a()).get(5));
            Serializable serializableB = v71.b(str3);
            if (serializableB == null || (objV2 = serializableB.toString()) == null) {
                objV2 = v(str3);
            }
            arrayList.add(new w98(0, (String) ((i96) k96VarD.a()).get(1), k(str2) + " " + objV2, false));
            if (!arrayListV.isEmpty()) {
                arrayList.add(new w98(4, "", ":", false));
                fc1.p0(arrayList, arrayListV);
                return arrayList;
            }
        } else {
            k96 k96VarD2 = r.d(str);
            if (k96VarD2 == null) {
                return v(str);
            }
            String str4 = (String) ((i96) k96VarD2.a()).get(3);
            String str5 = (String) ((i96) k96VarD2.a()).get(2);
            ArrayList arrayListV2 = v((String) ((i96) k96VarD2.a()).get(5));
            Serializable serializableB2 = v71.b(str5);
            if (serializableB2 == null || (objV = serializableB2.toString()) == null) {
                objV = v(str5);
            }
            arrayList.add(new w98(0, (String) ((i96) k96VarD2.a()).get(1), k(str4) + " " + objV, false));
            if (!arrayListV2.isEmpty()) {
                arrayList.add(new w98(4, (String) ((i96) k96VarD2.a()).get(4), ":", false));
                fc1.p0(arrayList, arrayListV2);
            }
        }
        return arrayList;
    }
}
