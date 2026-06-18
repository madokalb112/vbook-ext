package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class dj0 {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public dj0(m62 m62Var, x5b x5bVar, mka mkaVar, w25 w25Var) {
        m62Var.getClass();
        x5bVar.getClass();
        mkaVar.getClass();
        w25Var.getClass();
        this.a = m62Var;
        this.b = x5bVar;
        this.c = mkaVar;
        this.d = w25Var;
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static String c(String str) {
        String string = bw9.B0(str).toString();
        if (!iw9.K(string, "[", false) || !iw9.C(string, "]", false)) {
            return str;
        }
        List listR0 = f39.r0(new r04(yg8.a(new yg8("\"(https?://[^\"]+)\""), string), new e4(28)));
        return !listR0.isEmpty() ? fc1.D0(listR0, "", null, null, new e4(29), 30) : str;
    }

    public static Object d(dj0 dj0Var, c24 c24Var, String str, o1a o1aVar) {
        Object objB = c24Var.b(new rm3(om3.s, 1, 1, pm3.b, "", str), o1aVar);
        return objB == xx1.a ? objB : heb.a;
    }

    public static Object e(c24 c24Var, String str, o1a o1aVar) {
        str.getClass();
        Object objB = c24Var.b(new rm3(om3.t, 0, 0, pm3.c, str, 38), o1aVar);
        return objB == xx1.a ? objB : heb.a;
    }

    public static Object f(dj0 dj0Var, c24 c24Var, om3 om3Var, int i, int i2, jt1 jt1Var) {
        dj0Var.getClass();
        Object objB = c24Var.b(new rm3(om3Var, i, i2, pm3.a, "", 32), jt1Var);
        return objB == xx1.a ? objB : heb.a;
    }

    public static String i(a82 a82Var, boolean z) {
        String strP;
        String strP2;
        a82Var.getClass();
        Map map = a82Var.c;
        Map map2 = a82Var.b;
        if (z) {
            strP = p(map2, a82Var);
        } else {
            String str = (String) map2.get("raw");
            if (str == null) {
                strP = (String) fc1.y0(map2.values());
                if (strP == null) {
                    strP = "book";
                }
            } else {
                strP = str;
            }
        }
        if (z) {
            strP2 = p(map, a82Var);
        } else {
            strP2 = (String) map.get("raw");
            if (strP2 == null && (strP2 = (String) fc1.y0(map.values())) == null) {
                strP2 = "";
            }
        }
        StringBuilder sb = new StringBuilder();
        String strO = o(strP);
        sb.append(bw9.a0(strO) ? "book" : strO);
        String strO2 = o(strP2);
        if (!bw9.a0(strO2)) {
            sb.append("_");
            sb.append(strO2);
        }
        return sb.toString();
    }

    public static final xl7 l(s5b s5bVar, int i, int i2) {
        Object next;
        Object next2;
        List list = s5bVar.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                t5b t5bVar = (t5b) next;
                int i3 = t5bVar.a;
                if (i3 <= i && i < i3 + t5bVar.b) {
                    break;
                }
            }
            t5b t5bVar2 = (t5b) next;
            if (t5bVar2 != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    t5b t5bVar3 = (t5b) next2;
                    int i4 = t5bVar3.a;
                    if (i4 < i2 && i2 <= i4 + t5bVar3.b) {
                        break;
                    }
                }
                t5b t5bVar4 = (t5b) next2;
                if (t5bVar4 != null) {
                    return new xl7(Integer.valueOf(t5bVar2.c), Integer.valueOf(t5bVar4.c + t5bVar4.d));
                }
            }
        }
        return null;
    }

    public static String m(String str, List list, List list2) {
        List listY;
        String str2;
        mf5 mf5Var;
        String strG;
        String string = bw9.B0(str).toString();
        int i = 0;
        if (iw9.K(string, "[", false) && iw9.C(string, "]", false)) {
            ArrayList arrayList = new ArrayList();
            try {
                for (mf5 mf5Var2 : nf5.e(ue5.d.c(bw9.B0(str).toString())).a) {
                    if (mf5Var2 instanceof jg5) {
                        jg5 jg5Var = (jg5) mf5Var2;
                        String strA = jg5Var instanceof cg5 ? null : jg5Var.a();
                        if (strA != null) {
                            str2 = bw9.a0(strA) ? null : strA;
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    } else if ((mf5Var2 instanceof fg5) && (mf5Var = (mf5) ((fg5) mf5Var2).get("link")) != null && (strG = i12.G(mf5Var)) != null) {
                        str2 = bw9.a0(strG) ? null : strG;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return arrayList.isEmpty() ? "" : fc1.D0(arrayList, "", null, null, new vi0(0), 30);
        }
        aq4 aq4Var = aq4.a;
        bp bpVarG = aq4.g(aq4.d(c(str)));
        String str3 = bpVarG.b;
        str3.getClass();
        ArrayList arrayList2 = new ArrayList(str3.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < str3.length()) {
            arrayList2.add(new mz7(str3.charAt(i2), i3));
            i2++;
            i3++;
        }
        i21 i21Var = new i21(arrayList2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ad2 ad2Var = (ad2) it.next();
            i21Var = i21Var.d(ad2Var.c, "", ad2Var.e, false);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ob2 ob2Var = (ob2) it2.next();
            i21Var = i21Var.d(ob2Var.c, ob2Var.d, false, ob2Var.e);
        }
        bp bpVarE = i21Var.e(bpVarG);
        aq4 aq4Var2 = aq4.a;
        String string2 = bw9.B0(aq4.i(bpVarE)).toString();
        if (bw9.a0(string2) || !bw9.O(string2, "<br", true)) {
            return string2;
        }
        Pattern patternCompile = Pattern.compile("(?i)(?:\\s*<br\\s*/?>\\s*)+");
        patternCompile.getClass();
        String string3 = bw9.B0(string2).toString();
        string3.getClass();
        bw9.m0(0);
        Matcher matcher = patternCompile.matcher(string3);
        if (matcher.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList3.add(string3.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList3.add(string3.subSequence(iEnd, string3.length()).toString());
            listY = arrayList3;
        } else {
            listY = gc1.Y(string3.toString());
        }
        ArrayList arrayList4 = new ArrayList(gc1.M(listY, 10));
        Iterator it3 = listY.iterator();
        while (it3.hasNext()) {
            arrayList4.add(bw9.B0((String) it3.next()).toString());
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            if (!bw9.a0((String) obj)) {
                arrayList5.add(obj);
            }
        }
        if (arrayList5.isEmpty()) {
            return "";
        }
        if (arrayList5.size() != 1) {
            return fc1.D0(arrayList5, "", null, null, new vi0(1), 30);
        }
        return "<p>" + fc1.x0(arrayList5) + "</p>";
    }

    public static String o(String str) {
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        return bw9.B0(strReplaceAll).toString();
    }

    public static String p(Map map, a82 a82Var) {
        Object next;
        String str = (String) map.get("raw");
        if (str == null) {
            str = "";
        }
        String str2 = (String) a82Var.C.get("engine_id");
        if (str2 == null) {
            str2 = "";
        }
        if (!bw9.a0(str2)) {
            String str3 = (String) map.get(str2);
            if (str3 == null) {
                str3 = "";
            }
            if (!bw9.a0(str3)) {
                return str3;
            }
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (!lc5.Q(entry.getKey(), "raw") && !bw9.a0((CharSequence) entry.getValue())) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        String str4 = entry2 != null ? (String) entry2.getValue() : null;
        String str5 = str4 != null ? str4 : "";
        return bw9.a0(str5) ? str : str5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(4:(2:(1:(1:(2:15|(8:17|192|18|19|144|194|77|(2:79|(7:81|(1:83)(1:87)|(1:89)|90|(10:93|188|94|(3:96|186|97)(1:101)|98|102|(1:104)(1:106)|(1:108)|109|(7:111|112|182|113|(1:119)(1:117)|118|(2:122|199)(7:123|195|124|125|126|135|(5:138|180|139|140|(1:200)(5:143|144|194|77|(11:149|(2:151|(1:153))|154|(1:156)|157|158|178|159|160|(1:162)|163)(0)))))(4:134|126|135|(0)))|92|198)(2:147|148))(0))(2:22|23))(8:24|184|25|26|180|139|140|(0)(0)))(12:30|176|31|32|195|124|125|126|135|(0)|92|198))(13:36|172|37|38|188|94|(0)(0)|98|102|(0)(0)|(0)|109|(0)(0))|29)(4:41|174|42|43)|168|(1:170)|171)(3:46|(2:49|(2:52|(13:55|(1:57)|58|(2:61|59)|197|62|(1:64)(1:65)|190|66|(1:68)(1:70)|69|71|(2:73|142)(1:74))))|54)|75|76|194|77|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0459, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x045a, code lost:
    
        r2 = r46;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0561 A[Catch: all -> 0x052d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x052d, blocks: (B:97:0x0511, B:104:0x0561), top: B:186:0x0511 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x056f A[Catch: all -> 0x062d, TRY_LEAVE, TryCatch #8 {all -> 0x062d, blocks: (B:94:0x0505, B:102:0x053b, B:109:0x0569, B:111:0x056f), top: B:188:0x0505 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0795 A[Catch: all -> 0x0459, TryCatch #11 {all -> 0x0459, blocks: (B:77:0x042d, B:79:0x0433, B:81:0x043d, B:83:0x0456, B:90:0x0465, B:135:0x065a, B:147:0x078f, B:148:0x0794, B:149:0x0795, B:151:0x07a2, B:153:0x07ae, B:154:0x07b2, B:156:0x07bc, B:157:0x07c2), top: B:194:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0433 A[Catch: all -> 0x0459, TryCatch #11 {all -> 0x0459, blocks: (B:77:0x042d, B:79:0x0433, B:81:0x043d, B:83:0x0456, B:90:0x0465, B:135:0x065a, B:147:0x078f, B:148:0x0794, B:149:0x0795, B:151:0x07a2, B:153:0x07ae, B:154:0x07b2, B:156:0x07bc, B:157:0x07c2), top: B:194:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x050f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x075e -> B:144:0x0771). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.c24 r43, java.lang.String r44, defpackage.jl3 r45, defpackage.kt1 r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj0.a(c24, java.lang.String, jl3, kt1):java.lang.Object");
    }

    public void b() {
        HashMap map = (HashMap) this.f;
        HashMap map2 = (HashMap) this.e;
        Collection collectionValues = map2.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            try {
                dx1.x((kka) it.next());
            } catch (Throwable unused) {
            }
        }
        map2.clear();
        Collection collectionValues2 = map.values();
        collectionValues2.getClass();
        Iterator it2 = collectionValues2.iterator();
        while (it2.hasNext()) {
            try {
                dx1.v((t25) it2.next());
            } catch (Throwable unused2) {
            }
        }
        map.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r6, int r7, defpackage.v92 r8, defpackage.kt1 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.aj0
            if (r0 == 0) goto L13
            r0 = r9
            aj0 r0 = (defpackage.aj0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aj0 r0 = new aj0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            mc3 r2 = defpackage.mc3.a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2b
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L28
            goto L5d
        L28:
            r5 = move-exception
            goto La1
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L32:
            defpackage.e11.e0(r9)
            java.lang.Object r9 = r5.f
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r1 = r9.get(r6)
            if (r1 != 0) goto L4c
            java.lang.Object r5 = r5.d
            w25 r5 = (defpackage.w25) r5
            x25 r5 = (defpackage.x25) r5
            t25 r1 = r5.a(r7, r6)
            r9.put(r6, r1)
        L4c:
            t25 r1 = (defpackage.t25) r1
            int r5 = r8.d     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r8.e     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r1.u(r5, r6, r3, r0)     // Catch: java.lang.Throwable -> L28
            xx1 r5 = defpackage.xx1.a
            if (r9 != r5) goto L5d
            return r5
        L5d:
            v25 r9 = (defpackage.v25) r9     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r5 = r9.b     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L69
            r5 = r2
            goto La7
        L69:
            java.util.ArrayList r5 = r9.b     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r7 = 10
            int r7 = defpackage.gc1.M(r5, r7)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L28
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L28
        L7a:
            if (r3 >= r7) goto L8e
            java.lang.Object r8 = r5.get(r3)     // Catch: java.lang.Throwable -> L28
            int r3 = r3 + 1
            y25 r8 = (defpackage.y25) r8     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L28
            jg5 r8 = defpackage.nf5.a(r8)     // Catch: java.lang.Throwable -> L28
            r6.add(r8)     // Catch: java.lang.Throwable -> L28
            goto L7a
        L8e:
            we5 r5 = new we5     // Catch: java.lang.Throwable -> L28
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "raw"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            java.util.Map r5 = java.util.Collections.singletonMap(r6, r5)     // Catch: java.lang.Throwable -> L28
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            goto La7
        La1:
            pm8 r6 = new pm8
            r6.<init>(r5)
            r5 = r6
        La7:
            boolean r6 = r5 instanceof defpackage.pm8
            if (r6 == 0) goto Lad
            goto Lae
        Lad:
            r2 = r5
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj0.g(java.lang.String, int, v92, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r5, int r6, defpackage.v92 r7, defpackage.kt1 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.bj0
            if (r0 == 0) goto L13
            r0 = r8
            bj0 r0 = (defpackage.bj0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bj0 r0 = new bj0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            mc3 r2 = defpackage.mc3.a
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L29
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L27
            goto L5c
        L27:
            r4 = move-exception
            goto L74
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.e11.e0(r8)
            java.lang.Object r8 = r4.e
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r1 = r8.get(r5)
            if (r1 != 0) goto L4a
            java.lang.Object r4 = r4.c
            mka r4 = (defpackage.mka) r4
            nka r4 = (defpackage.nka) r4
            kka r1 = r4.a(r6, r5)
            r8.put(r5, r1)
        L4a:
            kka r1 = (defpackage.kka) r1
            int r4 = r7.d     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r7.e     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            r6 = 0
            java.lang.Object r8 = r1.u(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L27
            xx1 r4 = defpackage.xx1.a
            if (r8 != r4) goto L5c
            return r4
        L5c:
            lka r8 = (defpackage.lka) r8     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r8.b     // Catch: java.lang.Throwable -> L27
            boolean r4 = defpackage.bw9.a0(r4)     // Catch: java.lang.Throwable -> L27
            if (r4 == 0) goto L68
            r4 = r2
            goto L7a
        L68:
            java.lang.String r4 = "raw"
            java.lang.String r5 = r8.b     // Catch: java.lang.Throwable -> L27
            java.util.Map r4 = java.util.Collections.singletonMap(r4, r5)     // Catch: java.lang.Throwable -> L27
            r4.getClass()     // Catch: java.lang.Throwable -> L27
            goto L7a
        L74:
            pm8 r5 = new pm8
            r5.<init>(r4)
            r4 = r5
        L7a:
            boolean r5 = r4 instanceof defpackage.pm8
            if (r5 == 0) goto L80
            goto L81
        L80:
            r2 = r4
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj0.h(java.lang.String, int, v92, kt1):java.lang.Object");
    }

    public Map j() {
        return y86.P(new xl7("name", (String) this.b), new xl7("nameCondition", null), new xl7("modifiers", (LinkedHashSet) this.c), new xl7("modifiersNot", (LinkedHashSet) this.d), new xl7("modifiersCondition", null), new xl7("isSynthetic", null), new xl7("isSyntheticNot", null), new xl7("annotations", (LinkedHashSet) this.e), new xl7("annotationsNot", (LinkedHashSet) this.f), new xl7("genericString", null));
    }

    public m62 k() {
        return (m62) this.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(4:12|137|13|14)(2:17|18))(2:19|(1:21)(4:22|(1:24)|(2:27|(6:30|(1:32)|33|(1:37)|38|(1:40)(1:(8:113|114|(2:115|(2:117|(2:159|157)(1:156))(2:154|122))|123|(1:125)|(1:128)|129|(1:131)(1:132))(4:44|(1:46)(1:47)|48|(1:50)(15:51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|133|64|(1:66)|70|71|(1:73)(1:74))))))|29))|135|75|80|(1:82)|83|(2:85|(1:(11:88|(4:91|(1:142)(3:140|94|143)|141|89)|139|95|(4:98|(1:147)(3:145|101|148)|146|96)|144|102|(4:105|(1:152)(3:150|108|153)|151|103)|149|109|110)(1:111)))|112|114|(3:115|(0)(0)|157)|123|(0)|(0)|129|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.util.Map r15, defpackage.a82 r16, boolean r17, defpackage.v5b r18, boolean r19, defpackage.kt1 r20) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj0.n(java.util.Map, a82, boolean, v5b, boolean, kt1):java.lang.Object");
    }

    public dj0() {
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
    }
}
