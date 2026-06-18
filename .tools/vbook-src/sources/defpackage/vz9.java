package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vz9 implements sz9 {
    public final is4 a;
    public final yg8 b = new yg8("<[^>]+>");
    public final yg8 c = new yg8("\\{[^}]*\\}");

    public vz9(is4 is4Var) {
        this.a = is4Var;
    }

    public static xl7 d(String str) {
        int iW = bw9.W(str, '.', 0, 6);
        if (iW < 0) {
            Long lN = iw9.N(str);
            if (lN != null) {
                return new xl7(lN, 0L);
            }
            return null;
        }
        Long lN2 = iw9.N(str.substring(0, iW));
        if (lN2 == null) {
            return null;
        }
        String strSubstring = str.substring(iW + 1);
        if (strSubstring.length() == 0) {
            return new xl7(lN2, 0L);
        }
        Long lN3 = iw9.N(strSubstring.concat("000").substring(0, 3));
        if (lN3 != null) {
            return new xl7(lN2, lN3);
        }
        return null;
    }

    public static Long e(String str) {
        Long lN;
        if (str.length() == 0) {
            return null;
        }
        String strReplace = str.replace(',', '.');
        strReplace.getClass();
        List listO0 = bw9.o0(strReplace, new char[]{':'}, 0, 6);
        int size = listO0.size();
        if (size == 2) {
            Long lN2 = iw9.N((String) listO0.get(0));
            if (lN2 == null) {
                return null;
            }
            long jLongValue = lN2.longValue();
            xl7 xl7VarD = d((String) listO0.get(1));
            if (xl7VarD == null) {
                return null;
            }
            return Long.valueOf((((jLongValue * 60) + ((Number) xl7VarD.a).longValue()) * 1000) + ((Number) xl7VarD.b).longValue());
        }
        if (size != 3 || (lN = iw9.N((String) listO0.get(0))) == null) {
            return null;
        }
        long jLongValue2 = lN.longValue();
        Long lN3 = iw9.N((String) listO0.get(1));
        if (lN3 == null) {
            return null;
        }
        long jLongValue3 = lN3.longValue();
        xl7 xl7VarD2 = d((String) listO0.get(2));
        if (xl7VarD2 == null) {
            return null;
        }
        return Long.valueOf((((jLongValue3 * 60) + (jLongValue2 * 3600) + ((Number) xl7VarD2.a).longValue()) * 1000) + ((Number) xl7VarD2.b).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.util.Map r8, defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.a(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r6, java.util.Map r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            lc3 r0 = defpackage.lc3.a
            boolean r1 = r8 instanceof defpackage.uz9
            if (r1 == 0) goto L15
            r1 = r8
            uz9 r1 = (defpackage.uz9) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            uz9 r1 = new uz9
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.b
            xx1 r2 = defpackage.xx1.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            vz9 r5 = r1.a
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L2b
            goto L49
        L2b:
            r5 = move-exception
            goto L50
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.e11.e0(r8)
            boolean r8 = defpackage.bw9.a0(r6)
            if (r8 == 0) goto L3e
            return r0
        L3e:
            r1.a = r5     // Catch: java.lang.Throwable -> L2b
            r1.d = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r5.a(r6, r7, r1)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r2) goto L49
            return r2
        L49:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2b
            java.util.List r5 = r5.c(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L50:
            pm8 r6 = new pm8
            r6.<init>(r5)
            r5 = r6
        L56:
            java.lang.Throwable r6 = defpackage.qm8.a(r5)
            if (r6 == 0) goto L7d
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto L64
            java.lang.String r7 = ""
        L64:
            boolean r8 = defpackage.pu.a()
            if (r8 == 0) goto L7d
            e46 r8 = e46.b
            k89 r1 = k89.c
            bh5 r2 = r8.a
            k89 r2 = r2.a
            int r2 = r2.compareTo(r1)
            if (r2 > 0) goto L7d
            java.lang.String r2 = "Log"
            r8.a(r1, r2, r7, r6)
        L7d:
            boolean r6 = r5 instanceof defpackage.pm8
            if (r6 == 0) goto L82
            goto L83
        L82:
            r0 = r5
        L83:
            java.io.Serializable r0 = (java.io.Serializable) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.b(java.lang.String, java.util.Map, kt1):java.io.Serializable");
    }

    public final List c(String str) {
        List listY;
        Long lE;
        if (bw9.a0(str)) {
            return lc3.a;
        }
        String strH = iw9.H(iw9.H(str, false, "\r\n", "\n"), false, "\r", "\n");
        Pattern patternCompile = Pattern.compile("\n\\s*\n");
        patternCompile.getClass();
        bw9.m0(0);
        Matcher matcher = patternCompile.matcher(strH);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(strH.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(strH.subSequence(iEnd, strH.length()).toString());
            listY = arrayList;
        } else {
            listY = gc1.Y(strH.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            String strC0 = bw9.C0((String) it.next(), '\n', ' ', '\t');
            if (strC0.length() != 0 && !iw9.K(strC0, "WEBVTT", true) && !iw9.K(strC0, "NOTE", true) && !iw9.K(strC0, "STYLE", true) && !iw9.K(strC0, "REGION", true)) {
                List listO0 = bw9.o0(strC0, new char[]{'\n'}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : listO0) {
                    if (!bw9.a0((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i = -1;
                            break;
                        }
                        Object obj2 = arrayList3.get(i2);
                        i2++;
                        if (bw9.O((String) obj2, "-->", false)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        String str2 = (String) arrayList3.get(i);
                        int iX = bw9.X(str2, "-->", 0, false, 6);
                        xl7 xl7Var = null;
                        if (iX >= 0) {
                            String string = bw9.B0(str2.substring(0, iX)).toString();
                            String string2 = bw9.B0(bw9.v0(bw9.B0(str2.substring(iX + 3)).toString(), ' ')).toString();
                            Long lE2 = e(string);
                            if (lE2 != null && (lE = e(string2)) != null) {
                                xl7Var = new xl7(lE2, lE);
                            }
                        }
                        if (xl7Var != null) {
                            long jLongValue = ((Number) xl7Var.a).longValue();
                            long jLongValue2 = ((Number) xl7Var.b).longValue();
                            if (jLongValue2 > jLongValue) {
                                List listT0 = fc1.t0(arrayList3, i + 1);
                                ArrayList arrayList4 = new ArrayList(gc1.M(listT0, 10));
                                Iterator it2 = listT0.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(bw9.B0(this.c.g(this.b.g((String) it2.next(), ""), "")).toString());
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size2 = arrayList4.size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    Object obj3 = arrayList4.get(i3);
                                    i3++;
                                    if (((String) obj3).length() > 0) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    arrayList2.add(new oz9(jLongValue, jLongValue2, arrayList5));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() > 1) {
            ic1.m0(new cd9(7), arrayList2);
        }
        return arrayList2;
    }
}
