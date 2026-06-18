package defpackage;

import android.os.Build;
import android.view.View;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import com.reader.data.server.AndroidTestServerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sg implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vm3 r28, defpackage.jt1 r29) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.a(vm3, jt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object objU;
        Object value;
        Object value2;
        String str;
        String str2;
        lc3 lc3Var;
        boolean z;
        heb hebVar;
        int iQ;
        Object value3;
        t41 t41Var;
        String str3;
        Object value4;
        Object objF;
        Object value5;
        Object value6;
        ArrayList arrayList;
        Object value7;
        Object value8;
        cm3 cm3Var;
        Object value9;
        Object objB;
        Object value10;
        Object value11;
        Object value12;
        d68 d68Var;
        String str4;
        Object value13;
        Object value14;
        String str5;
        int i = this.a;
        int i2 = 10;
        int i3 = 7;
        int i4 = 2;
        xx1 xx1Var = xx1.a;
        char c = 1;
        int i5 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        heb hebVar2 = heb.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c85 c85Var = (c85) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    y3.y(c85Var.x(), (View) c85Var.a);
                }
                return hebVar2;
            case 1:
                if (!lc5.Q((paa) obj, paa.a)) {
                    mn5.g();
                    return null;
                }
                AndroidTestServerService androidTestServerService = (AndroidTestServerService) obj2;
                ah1.J(androidTestServerService.c, null, null, new yj(androidTestServerService, objArr == true ? 1 : 0, i4), 3);
                return hebVar2;
            case 2:
                qla qlaVar = (qla) obj;
                AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) obj2;
                iw0 iw0Var = androidTextToSpeechService.B;
                if (lc5.Q(qlaVar, ela.a)) {
                    k9b k9bVar = androidTextToSpeechService.z;
                    if (k9bVar != null && (objU = k9bVar.u(jt1Var)) == xx1Var) {
                        return objU;
                    }
                } else if (qlaVar instanceof fla) {
                    h8b h8bVar = (h8b) androidTextToSpeechService.s.getValue();
                    boolean z2 = ((fla) qlaVar).a;
                    fr9 fr9Var = h8bVar.a;
                    while (true) {
                        Object value15 = fr9Var.getValue();
                        boolean z3 = z2;
                        if (!fr9Var.j(value15, e8b.a((e8b) value15, null, 0, null, z2, false, false, false, Token.INC))) {
                            z2 = z3;
                        }
                    }
                } else if (lc5.Q(qlaVar, gla.a)) {
                    k9b k9bVar2 = androidTextToSpeechService.z;
                    if (k9bVar2 != null) {
                        k9bVar2.o(((zna) k9bVar2.e).c());
                    }
                } else if (lc5.Q(qlaVar, hla.a)) {
                    int i6 = AndroidTextToSpeechService.H;
                    androidTextToSpeechService.e();
                    aj2 aj2Var = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr8 == true ? 1 : 0, 0), 2);
                } else if (lc5.Q(qlaVar, ila.a)) {
                    aj2 aj2Var2 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr7 == true ? 1 : 0, c == true ? 1 : 0), 2);
                } else if (lc5.Q(qlaVar, jla.a)) {
                    aj2 aj2Var3 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr6 == true ? 1 : 0, i4), 2);
                } else if (lc5.Q(qlaVar, kla.a) || lc5.Q(qlaVar, lla.a)) {
                    AndroidTextToSpeechService.a(androidTextToSpeechService);
                } else if (qlaVar instanceof mla) {
                    float f = ((mla) qlaVar).a;
                    aj2 aj2Var4 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new el(androidTextToSpeechService, f, objArr5 == true ? 1 : 0, 0), 2);
                } else if (lc5.Q(qlaVar, nla.a)) {
                    aj2 aj2Var5 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr4 == true ? 1 : 0, 3), 2);
                } else if (lc5.Q(qlaVar, ola.a)) {
                    aj2 aj2Var6 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr3 == true ? 1 : 0, i3), 2);
                } else {
                    if (!lc5.Q(qlaVar, pla.a)) {
                        mn5.g();
                        return null;
                    }
                    int i7 = AndroidTextToSpeechService.H;
                    androidTextToSpeechService.e();
                    aj2 aj2Var7 = rw2.a;
                    ah1.J(iw0Var, nh2.c, null, new cl(androidTextToSpeechService, objArr2 == true ? 1 : 0, 10), 2);
                }
                return hebVar2;
            case 3:
                List list = (List) obj;
                fr9 fr9Var2 = ((vz0) obj2).d;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                        ((uz0) value).getClass();
                        list.getClass();
                    } while (!fr9Var2.j(value, new uz0(list, false)));
                }
                return hebVar2;
            case 4:
                i7b i7bVar = (i7b) obj;
                b01 b01Var = (b01) obj2;
                Object obj3 = i7bVar.a;
                Object obj4 = i7bVar.b;
                c4b c4bVar = (c4b) i7bVar.c;
                List list2 = (List) obj3;
                HashMap map = new HashMap();
                Iterator it = ((List) obj4).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    lc3 lc3Var2 = lc3.a;
                    if (!zHasNext) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            oz0 oz0Var = (oz0) it2.next();
                            String str6 = oz0Var.a;
                            String str7 = oz0Var.b;
                            List list3 = (List) map.get(str6);
                            if (list3 == null) {
                                list3 = lc3Var2;
                            }
                            List<zv5> listS0 = fc1.S0(list3, i5);
                            ArrayList arrayList3 = new ArrayList(gc1.M(listS0, i2));
                            for (zv5 zv5Var : listS0) {
                                Iterator it3 = it2;
                                String strG = ((j4b) b01Var.d).g(zv5Var.b, c4bVar.a, zv5Var.C, c4bVar.a(zv5Var.m), c4bVar.c);
                                String str8 = zv5Var.a;
                                String str9 = zv5Var.d;
                                String str10 = zv5Var.l;
                                boolean z4 = zv5Var.p;
                                c4b c4bVar2 = c4bVar;
                                int i8 = zv5Var.u;
                                if (i8 > 0) {
                                    str = str8;
                                    str2 = str9;
                                    lc3Var = lc3Var2;
                                    z = z4;
                                    hebVar = hebVar2;
                                    iQ = (int) (((((double) wx1.Q(zv5Var.s, 0, i8 - 1)) + wx1.O(zv5Var.t, 0.0d, 1.0d)) * 100.0d) / ((double) i8));
                                } else {
                                    str = str8;
                                    str2 = str9;
                                    lc3Var = lc3Var2;
                                    z = z4;
                                    hebVar = hebVar2;
                                    iQ = 0;
                                }
                                arrayList3.add(new ob9(str, strG, str2, str10, z, zv5Var.u, 0, iQ, zv5Var.G, zv5Var.q));
                                it2 = it3;
                                c4bVar = c4bVar2;
                                lc3Var2 = lc3Var;
                                hebVar2 = hebVar;
                            }
                            c4b c4bVar3 = c4bVar;
                            Iterator it4 = it2;
                            lc3 lc3Var3 = lc3Var2;
                            heb hebVar3 = hebVar2;
                            List list4 = (List) map.get(oz0Var.a);
                            arrayList2.add(new pz0(str6, str7, arrayList3, list4 != null ? list4.size() : 0));
                            it2 = it4;
                            c4bVar = c4bVar3;
                            lc3Var2 = lc3Var3;
                            hebVar2 = hebVar3;
                            i2 = 10;
                            i5 = 3;
                        }
                        heb hebVar4 = hebVar2;
                        fr9 fr9Var3 = b01Var.e;
                        if (fr9Var3 != null) {
                            do {
                                value2 = fr9Var3.getValue();
                                ((zz0) value2).getClass();
                            } while (!fr9Var3.j(value2, new zz0(arrayList2, false)));
                        }
                        return hebVar4;
                    }
                    zv5 zv5Var2 = (zv5) it.next();
                    for (String str11 : zv5Var2.g) {
                        List list5 = (List) map.get(str11);
                        if (list5 == null) {
                            list5 = lc3Var2;
                        }
                        map.put(str11, fc1.J0(list5, zv5Var2));
                    }
                }
                break;
            case 5:
                ihb ihbVar = (ihb) obj;
                fr9 fr9Var4 = ((v41) obj2).e;
                if (fr9Var4 != null) {
                    do {
                        value3 = fr9Var4.getValue();
                        t41Var = (t41) value3;
                        str3 = ihbVar != null ? ihbVar.a : null;
                    } while (!fr9Var4.j(value3, t41.a(t41Var, false, false, false, false, str3 == null ? "" : str3, null, null, Token.ASSIGN_DIV)));
                }
                return hebVar2;
            case 6:
                return c((i7b) obj, jt1Var);
            case 7:
                ihb ihbVar2 = (ihb) obj;
                fr9 fr9Var5 = ((t02) obj2).e;
                if (fr9Var5 != null) {
                    do {
                        value4 = fr9Var5.getValue();
                    } while (!fr9Var5.j(value4, s02.a((s02) value4, false, false, false, false, ihbVar2 != null && ihbVar2.e == 3, null, null, null, null, 495)));
                }
                return hebVar2;
            case 8:
                a52 a52Var = (a52) obj2;
                return ((a52Var.h.a() instanceof wx3) || (objF = a52.f(a52Var, true, jt1Var)) != xx1Var) ? hebVar2 : objF;
            case 9:
                ((kb4) obj2).invoke((me2) obj);
                return hebVar2;
            case 10:
                return a((vm3) obj, jt1Var);
            case 11:
                return d((String) obj, jt1Var);
            case 12:
                pz2 pz2Var = (pz2) obj2;
                for (fa2 fa2Var : (List) obj) {
                    if (fa2Var.d) {
                        pz2Var.b.put(fa2Var.b, fa2Var.c);
                    }
                }
                return hebVar2;
            case 13:
                List list6 = (List) obj;
                fr9 fr9Var6 = ((xz2) obj2).d;
                if (fr9Var6 != null) {
                    do {
                        value5 = fr9Var6.getValue();
                        ((vz2) value5).getClass();
                        list6.getClass();
                    } while (!fr9Var6.j(value5, new vz2(list6, false)));
                }
                return hebVar2;
            case 14:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (r03 r03Var : (List) obj) {
                    String strI = zk4.i(r03Var.j, "yyyyMMdd");
                    if (linkedHashMap.containsKey(strI)) {
                        ArrayList arrayList4 = (ArrayList) linkedHashMap.get(strI);
                        if (arrayList4 != null) {
                            arrayList4.add(r03Var);
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(r03Var);
                        linkedHashMap.put(strI, arrayList5);
                    }
                }
                fr9 fr9Var7 = ((v13) obj2).d;
                if (fr9Var7 != null) {
                    do {
                        value6 = fr9Var7.getValue();
                        s13 s13Var = (s13) value6;
                        arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(new q13(((r03) fc1.x0((List) entry.getValue())).j, (List) entry.getValue()));
                        }
                        s13Var.getClass();
                    } while (!fr9Var7.j(value6, new s13(arrayList, false)));
                }
                return hebVar2;
            case 15:
                List list7 = (List) obj;
                fr9 fr9Var8 = ((za3) obj2).d;
                if (fr9Var8 != null) {
                    do {
                        value7 = fr9Var8.getValue();
                        ((ya3) value7).getClass();
                        list7.getClass();
                    } while (!fr9Var8.j(value7, new ya3(list7)));
                }
                return hebVar2;
            case 16:
                c0a c0aVar = (c0a) obj;
                zj3 zj3Var = ((nk3) obj2).u;
                jk2 jk2VarU = zj3Var.u();
                jk2VarU.getClass();
                ik2 ik2Var = new ik2(jk2VarU);
                ik2Var.f(c0aVar != null ? c0aVar.a : null);
                ik2Var.i(3, c0aVar == null);
                zj3Var.P(new jk2(ik2Var));
                return hebVar2;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fr9 fr9Var9 = ((em3) obj2).s;
                if (fr9Var9 != null) {
                    do {
                        value8 = fr9Var9.getValue();
                        cm3Var = (cm3) value8;
                    } while (!fr9Var9.j(value8, cm3.a(cm3Var, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, zBooleanValue ? cm3Var.z : false, zBooleanValue, null, null, null, 973078527)));
                }
                return hebVar2;
            case 18:
                return e((List) obj, jt1Var);
            case 19:
                List list8 = (List) obj;
                fr9 fr9Var10 = ((pp3) obj2).e;
                if (fr9Var10 != null) {
                    do {
                        value9 = fr9Var10.getValue();
                        ((op3) value9).getClass();
                        list8.getClass();
                    } while (!fr9Var10.j(value9, new op3(list8, false)));
                }
                return hebVar2;
            case 20:
                ((Collection) obj2).add(obj);
                return hebVar2;
            case 21:
                i7b i7bVar2 = (i7b) obj;
                cm4 cm4Var = (cm4) obj2;
                f4b f4bVar = cm4Var.c;
                Object obj5 = i7bVar2.a;
                Object obj6 = i7bVar2.b;
                c4b c4bVar4 = (c4b) i7bVar2.c;
                ac9 ac9Var = (ac9) obj5;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (zv5 zv5Var3 : (List) obj6) {
                    long j = zv5Var3.G;
                    String str12 = zv5Var3.m;
                    String strI2 = zk4.i(j, "yyyyMMdd");
                    if (linkedHashMap2.containsKey(strI2)) {
                        ArrayList arrayList6 = (ArrayList) linkedHashMap2.get(strI2);
                        if (arrayList6 != null) {
                            arrayList6.add(fx1.I0(zv5Var3, ((j4b) f4bVar).g(zv5Var3.b, c4bVar4.a, zv5Var3.C, c4bVar4.a(str12), c4bVar4.c)));
                        }
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(fx1.I0(zv5Var3, ((j4b) f4bVar).g(zv5Var3.b, c4bVar4.a, zv5Var3.C, c4bVar4.a(str12), c4bVar4.c)));
                        linkedHashMap2.put(strI2, arrayList7);
                    }
                }
                fr9 fr9Var11 = cm4Var.s;
                if (fr9Var11 != null) {
                    while (true) {
                        Object value16 = fr9Var11.getValue();
                        zl4 zl4Var = (zl4) value16;
                        int i9 = ac9Var.b;
                        int i10 = ac9Var.c;
                        boolean z5 = ac9Var.h;
                        boolean z6 = ac9Var.f;
                        boolean z7 = ac9Var.g;
                        ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
                        for (Iterator it5 = linkedHashMap2.entrySet().iterator(); it5.hasNext(); it5 = it5) {
                            Map.Entry entry2 = (Map.Entry) it5.next();
                            arrayList8.add(new yl4(((ob9) fc1.x0((List) entry2.getValue())).i, (List) entry2.getValue()));
                            ac9Var = ac9Var;
                        }
                        ac9 ac9Var2 = ac9Var;
                        if (!fr9Var11.j(value16, zl4.a(zl4Var, i9, i10, z6, z7, z5, false, arrayList8, 64))) {
                            ac9Var = ac9Var2;
                        }
                    }
                }
                return hebVar2;
            case 22:
                return a((vm3) obj, jt1Var);
            case 23:
                sa5 sa5Var = (sa5) obj;
                if (sa5Var instanceof c28) {
                    objB = ym.b((ym) obj2, new Float(0.96f), null, null, jt1Var, 14);
                    if (objB != xx1Var) {
                        return hebVar2;
                    }
                } else if (sa5Var instanceof d28) {
                    objB = ym.b((ym) obj2, new Float(1.0f), null, null, jt1Var, 14);
                    if (objB != xx1Var) {
                        return hebVar2;
                    }
                } else if (!(sa5Var instanceof b28) || (objB = ym.b((ym) obj2, new Float(1.0f), null, null, jt1Var, 14)) != xx1Var) {
                    return hebVar2;
                }
                return objB;
            case 24:
                ((jv6) obj2).c.i(((Number) obj).floatValue());
                return hebVar2;
            case 25:
                List list9 = (List) obj;
                fr9 fr9Var12 = ((c17) obj2).d;
                if (fr9Var12 != null) {
                    do {
                        value10 = fr9Var12.getValue();
                        ((a17) value10).getClass();
                        list9.getClass();
                    } while (!fr9Var12.j(value10, new a17(list9, false)));
                }
                return hebVar2;
            case 26:
                List listR0 = fc1.R0(new zp4(i3), (List) obj);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj7 : listR0) {
                    p95 p95Var = p95.c;
                    p95 p95VarG = ny1.G(((x77) obj7).e);
                    mua.Companion.getClass();
                    w16 w16VarA = yib.F(p95VarG, lua.a()).a();
                    Object arrayList9 = linkedHashMap3.get(w16VarA);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap3.put(w16VarA, arrayList9);
                    }
                    ((List) arrayList9).add(obj7);
                }
                ArrayList arrayList10 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    arrayList10.add(new q87((w16) entry3.getKey(), (List) entry3.getValue()));
                }
                fr9 fr9Var13 = ((c97) obj2).d;
                if (fr9Var13 != null) {
                    do {
                        value11 = fr9Var13.getValue();
                        ((a97) value11).getClass();
                    } while (!fr9Var13.j(value11, new a97(arrayList10, false)));
                }
                return hebVar2;
            case 27:
                ihb ihbVar3 = (ihb) obj;
                fr9 fr9Var14 = ((e68) obj2).e;
                if (fr9Var14 != null) {
                    do {
                        value12 = fr9Var14.getValue();
                        d68Var = (d68) value12;
                        str4 = ihbVar3 != null ? ihbVar3.a : null;
                    } while (!fr9Var14.j(value12, d68.a(d68Var, false, false, null, str4 == null ? "" : str4, ihbVar3 != null && ihbVar3.e == 3, null, Token.ASSIGN_BITAND)));
                }
                return hebVar2;
            case 28:
                zv5 zv5Var4 = (zv5) obj;
                ce8 ce8Var = (ce8) obj2;
                fr9 fr9Var15 = ce8Var.s;
                if (zv5Var4 != null) {
                    if (fr9Var15 != null) {
                        do {
                            value14 = fr9Var15.getValue();
                            str5 = zv5Var4.a;
                        } while (!fr9Var15.j(value14, wd8.a((wd8) value14, false, str5, ((j4b) ce8Var.e).e(zv5Var4.b, str5, zv5Var4.m), zv5Var4.e, zv5Var4.f, false, 32)));
                    }
                } else if (fr9Var15 != null) {
                    do {
                        value13 = fr9Var15.getValue();
                    } while (!fr9Var15.j(value13, wd8.a((wd8) value13, false, null, null, 0, 0, true, 30)));
                }
                return hebVar2;
            default:
                e59 e59Var = (e59) obj;
                sa9 sa9Var = (sa9) obj2;
                e59Var.getClass();
                sa9Var.h = e59Var;
                if (sa9Var.j) {
                    sa9Var.j = false;
                    sa9Var.c();
                }
                Object objA = sa9.a(sa9Var, e59Var.a.a, pa9.a, jt1Var);
                return objA == xx1Var ? objA : hebVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.i7b r8, defpackage.jt1 r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            r1 = r0
            e71 r1 = (defpackage.e71) r1
            boolean r0 = r9 instanceof defpackage.u61
            if (r0 == 0) goto L18
            r0 = r9
            u61 r0 = (defpackage.u61) r0
            int r2 = r0.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.b = r2
            goto L1d
        L18:
            u61 r0 = new u61
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r7 = r0.a
            int r9 = r0.b
            r2 = 1
            if (r9 == 0) goto L3a
            if (r9 != r2) goto L33
            fv1 r8 = r0.f
            java.util.List r9 = r0.e
            ihb r0 = r0.d
            defpackage.e11.e0(r7)
            r3 = r8
            r5 = r0
        L31:
            r4 = r9
            goto L60
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L3a:
            defpackage.e11.e0(r7)
            java.lang.Object r7 = r8.a
            java.lang.Object r9 = r8.b
            java.lang.Object r8 = r8.c
            ihb r8 = (defpackage.ihb) r8
            java.util.List r9 = (java.util.List) r9
            fv1 r7 = (defpackage.fv1) r7
            r1.x = r8
            r0.d = r8
            r0.e = r9
            r0.f = r7
            r0.b = r2
            java.lang.Object r0 = defpackage.e71.j(r1, r0)
            xx1 r2 = defpackage.xx1.a
            if (r0 != r2) goto L5c
            return r2
        L5c:
            r3 = r7
            r5 = r8
            r7 = r0
            goto L31
        L60:
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            fr9 r7 = r1.s
            if (r7 == 0) goto L78
        L67:
            java.lang.Object r8 = r7.getValue()
            r2 = r8
            t61 r2 = (defpackage.t61) r2
            t61 r9 = r1.p(r2, r3, r4, r5, r6)
            boolean r8 = r7.j(r8, r9)
            if (r8 == 0) goto L67
        L78:
            heb r7 = defpackage.heb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.c(i7b, jt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r6 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r7, defpackage.jt1 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            nu2 r0 = (defpackage.nu2) r0
            boolean r1 = r8 instanceof defpackage.ju2
            if (r1 == 0) goto L17
            r1 = r8
            ju2 r1 = (defpackage.ju2) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.e = r2
            goto L1c
        L17:
            ju2 r1 = new ju2
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r1.c
            int r8 = r1.e
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r8 == 0) goto L3d
            if (r8 == r3) goto L39
            if (r8 != r2) goto L33
            fr9 r7 = r1.b
            vm3 r8 = r1.a
            defpackage.e11.e0(r6)
            goto L6c
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L39:
            defpackage.e11.e0(r6)
            goto L56
        L3d:
            defpackage.e11.e0(r6)
            fr9 r6 = r0.L
            r6.k(r7)
            qp3 r6 = r0.H
            cq3 r6 = (defpackage.cq3) r6
            wp3 r6 = r6.e(r7)
            r1.e = r3
            java.lang.Object r6 = defpackage.cx1.P(r6, r1)
            if (r6 != r5) goto L56
            goto L6b
        L56:
            r8 = r6
            vm3 r8 = (defpackage.vm3) r8
            fr9 r7 = r0.D
            f4b r6 = r0.J
            r1.a = r8
            r1.b = r7
            r1.e = r2
            j4b r6 = (defpackage.j4b) r6
            java.lang.Integer r6 = r6.h()
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r3) goto L79
            if (r8 == 0) goto L79
            java.lang.String r6 = r8.h
            goto L7a
        L79:
            r6 = r4
        L7a:
            r7.k(r6)
            fr9 r6 = r0.x
            if (r8 == 0) goto L84
            java.util.Map r7 = r8.r
            goto L85
        L84:
            r7 = r4
        L85:
            if (r7 != 0) goto L89
            mc3 r7 = defpackage.mc3.a
        L89:
            r6.getClass()
            r6.l(r4, r7)
            r0.F()
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.d(java.lang.String, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.List r6, defpackage.jt1 r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            wo3 r0 = (defpackage.wo3) r0
            boolean r1 = r7 instanceof defpackage.vo3
            if (r1 == 0) goto L17
            r1 = r7
            vo3 r1 = (defpackage.vo3) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            vo3 r1 = new vo3
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.b
            int r7 = r1.d
            r2 = 1
            if (r7 == 0) goto L32
            if (r7 != r2) goto L2b
            java.util.List r6 = r1.a
            defpackage.e11.e0(r5)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L32:
            defpackage.e11.e0(r5)
            qp3 r5 = r0.c
            r1.a = r6
            r1.d = r2
            cq3 r5 = (defpackage.cq3) r5
            to3 r5 = r5.h()
            xx1 r7 = defpackage.xx1.a
            if (r5 != r7) goto L46
            return r7
        L46:
            to3 r5 = (defpackage.to3) r5
            if (r5 == 0) goto L76
            java.util.List r7 = defpackage.gc1.Y(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r6.next()
            r3 = r2
            to3 r3 = (defpackage.to3) r3
            java.lang.String r3 = r3.a
            java.lang.String r4 = r5.a
            boolean r3 = defpackage.lc5.Q(r3, r4)
            if (r3 != 0) goto L57
            r1.add(r2)
            goto L57
        L72:
            java.util.ArrayList r6 = defpackage.fc1.I0(r7, r1)
        L76:
            fr9 r5 = r0.d
            if (r5 == 0) goto L93
        L7a:
            java.lang.Object r7 = r5.getValue()
            r0 = r7
            uo3 r0 = (defpackage.uo3) r0
            r0.getClass()
            r6.getClass()
            uo3 r0 = new uo3
            r1 = 0
            r0.<init>(r6, r1)
            boolean r7 = r5.j(r7, r0)
            if (r7 == 0) goto L7a
        L93:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg.e(java.util.List, jt1):java.lang.Object");
    }
}
