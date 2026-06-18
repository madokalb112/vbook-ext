package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media.MediaBrowserServiceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class nc1 implements it3, pv3, im7, ht3, kz9, dp5, fj1 {
    public static final am7 s = new am7(0);
    public static final zl7 t = new zl7();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public nc1(bp bpVar, uka ukaVar, List list, pn2 pn2Var, b64 b64Var) {
        int i;
        uka ukaVar2;
        bp bpVar2 = bpVar;
        uka ukaVar3 = ukaVar;
        int i2 = 14;
        this.a = 14;
        this.b = bpVar2;
        this.c = list;
        int i3 = 0;
        hx6 hx6Var = new hx6(this, 0);
        xu5 xu5Var = xu5.c;
        this.d = ex1.Z(xu5Var, hx6Var);
        this.e = ex1.Z(xu5Var, new hx6(this, 1));
        km7 km7Var = ukaVar3.b;
        bp bpVar3 = cp.a;
        ArrayList arrayList = bpVar2.d;
        String str = bpVar2.b;
        lc3 lc3Var = lc3.a;
        List listR0 = arrayList != null ? fc1.R0(new k54(10), arrayList) : lc3Var;
        ArrayList arrayList2 = new ArrayList();
        vv vvVar = new vv();
        int size = listR0.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            ap apVar = (ap) listR0.get(i4);
            ap apVarA = ap.a(apVar, km7Var.b((km7) apVar.a), i3, i2);
            Object obj = apVarA.a;
            int i6 = apVarA.c;
            int i7 = apVarA.b;
            while (i5 < i7 && !vvVar.isEmpty()) {
                ap apVar2 = (ap) vvVar.last();
                List list2 = listR0;
                int i8 = apVar2.c;
                lc3 lc3Var2 = lc3Var;
                Object obj2 = apVar2.a;
                if (i7 < i8) {
                    arrayList2.add(new ap(obj2, i5, i7));
                    i5 = i7;
                    listR0 = list2;
                    lc3Var = lc3Var2;
                } else {
                    int i9 = size;
                    arrayList2.add(new ap(obj2, i5, i8));
                    i5 = apVar2.c;
                    while (!vvVar.isEmpty() && i5 == ((ap) vvVar.last()).c) {
                        vvVar.removeLast();
                    }
                    listR0 = list2;
                    lc3Var = lc3Var2;
                    size = i9;
                }
            }
            List list3 = listR0;
            lc3 lc3Var3 = lc3Var;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new ap(km7Var, i5, i7));
                i5 = i7;
            }
            ap apVar3 = (ap) vvVar.h();
            if (apVar3 != null) {
                int i11 = apVar3.c;
                Object obj3 = apVar3.a;
                int i12 = apVar3.b;
                if (i12 == i7 && i11 == i6) {
                    vvVar.removeLast();
                    vvVar.addLast(new ap(((km7) obj3).b((km7) obj), i7, i6));
                } else if (i12 == i11) {
                    arrayList2.add(new ap(obj3, i12, i11));
                    vvVar.removeLast();
                    vvVar.addLast(new ap(obj, i7, i6));
                } else {
                    if (i11 < i6) {
                        w58.p();
                        throw null;
                    }
                    vvVar.addLast(new ap(((km7) obj3).b((km7) obj), i7, i6));
                }
            } else {
                vvVar.addLast(new ap(obj, i7, i6));
            }
            i4++;
            listR0 = list3;
            lc3Var = lc3Var3;
            size = i10;
            i2 = 14;
            i3 = 0;
        }
        lc3 lc3Var4 = lc3Var;
        while (i5 <= str.length() && !vvVar.isEmpty()) {
            ap apVar4 = (ap) vvVar.last();
            Object obj4 = apVar4.a;
            int i13 = apVar4.c;
            arrayList2.add(new ap(obj4, i5, i13));
            while (!vvVar.isEmpty() && i13 == ((ap) vvVar.last()).c) {
                vvVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str.length()) {
            arrayList2.add(new ap(km7Var, i5, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ap(km7Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            ap apVar5 = (ap) arrayList2.get(i14);
            int i15 = apVar5.b;
            int i16 = apVar5.c;
            String strSubstring = i15 != i16 ? str.substring(i15, i16) : "";
            List listA = cp.a(bpVar2, i15, i16, new e4(10));
            bp bpVar4 = new bp(strSubstring, listA == null ? lc3Var4 : listA);
            km7 km7VarA = (km7) apVar5.a;
            if (km7VarA.b == 0) {
                km7VarA = km7.a(km7VarA, 0, km7Var.b, 0L, (dha) null, (iy5) null, 509);
            }
            uka ukaVar4 = new uka(ukaVar3.a, km7Var.b(km7VarA));
            List list4 = bpVar4.a;
            List list5 = list4 == null ? lc3Var4 : list4;
            List list6 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                List list7 = list6;
                ap apVar6 = (ap) list6.get(i17);
                int i18 = i17;
                int i19 = apVar6.b;
                km7 km7Var2 = km7Var;
                int i20 = apVar6.c;
                if (cp.b(i15, i16, i19, i20)) {
                    if (i15 > i19 || i20 > i16) {
                        r75.a("placeholder can not overlap with paragraph.");
                    }
                    ukaVar2 = ukaVar4;
                    arrayList4.add(new ap(apVar6.a, i19 - i15, i20 - i15));
                } else {
                    ukaVar2 = ukaVar4;
                }
                i17 = i18 + 1;
                list6 = list7;
                ukaVar4 = ukaVar2;
                km7Var = km7Var2;
            }
            arrayList3.add(new hm7(new fh(strSubstring, ukaVar4, list5, arrayList4, b64Var, pn2Var), i15, i16));
            i14++;
            bpVar2 = bpVar;
            ukaVar3 = ukaVar;
        }
        this.f = arrayList3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:85|86|152|87|91) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f1, code lost:
    
        r37 = r3;
        r33 = r4;
        r35 = r5;
        r34 = r7;
        r32 = r8;
        r36 = r9;
        r31 = r12;
        r0 = new java.lang.StringBuilder("c");
        r0.append(r10);
        r3 = r16;
        r0.append(r3);
        r0 = defpackage.zn7.f(r15, r0.toString());
        r4 = defpackage.gx3.a;
        r4.getClass();
        r4 = new defpackage.he8(r4.O0(r0, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0325, code lost:
    
        r4.write(defpackage.iw9.B(r2.Y().x()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0334, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0337, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x033a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x033c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x033e, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0342, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0343, code lost:
    
        i12.r(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0346, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x03e3 -> B:103:0x03e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0480 -> B:117:0x0478). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x03ba -> B:99:0x03c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H(java.lang.String r57, java.util.Map r58, defpackage.kt1 r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.H(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:36|37|104|38|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:27|(1:29)|30|102|31|100|32|33|(1:71)(2:44|(10:57|56|58|(0)(0)|65|(0)(0)|68|70|23|(6:74|(1:76)(2:77|(2:80|(4:81|(1:83)|84|(1:107)(1:99)))(0))|86|(1:88)(1:89)|90|(2:92|(1:111)(3:95|96|97))(1:98))(0))(2:48|(2:50|110)(13:51|52|(0)|55|56|58|(0)(0)|65|(0)(0)|68|70|23|(0)(0))))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        r9 = r43;
        r23 = r21;
        r4 = r24;
        r17 = r14;
        r20 = r15;
        r14 = r14;
        r30 = r25;
        r15 = r13;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0172, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0174, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0176, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017b, code lost:
    
        i12.r(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017e, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r1v12, types: [a82, java.lang.String, java.util.Iterator, java.util.List, odb, zn7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01d2 -> B:52:0x01d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.String r43, java.util.Map r44, defpackage.kt1 r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.I(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    public static Object P(rh6 rh6Var) {
        Object obj;
        String strX;
        int i = 0;
        if (rh6Var instanceof uh5) {
            uh5 uh5Var = (uh5) rh6Var;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = uh5Var.n;
            if (linkedHashMap == null) {
                lc5.i0("sectionIdMap");
                throw null;
            }
            if (linkedHashMap.get(new Integer(0)) == null) {
                ArrayList arrayList2 = uh5Var.m;
                if (arrayList2 == null) {
                    lc5.i0("sections");
                    throw null;
                }
                vh5 vh5Var = (vh5) fc1.z0(arrayList2);
                if (vh5Var != null) {
                    th6 th6Var = new th6();
                    String strH = uh5Var.h(vh5Var);
                    aq4 aq4Var = aq4.a;
                    b93 b93VarC = aq4.f(strH).P().c();
                    strX = b93VarC != null ? b93VarC.X() : null;
                    th6Var.b = strX != null ? strX : "";
                    th6Var.a = "0:".concat(vh5Var.e);
                    arrayList.add(th6Var);
                }
            }
            ArrayList arrayList3 = uh5Var.k;
            if (arrayList3 != null) {
                int size = arrayList3.size();
                while (i < size) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    Q(arrayList, (o7a) obj2);
                }
            }
            return arrayList;
        }
        if (!(rh6Var instanceof wh5)) {
            return lc3.a;
        }
        wh5 wh5Var = (wh5) rh6Var;
        ArrayList arrayList4 = new ArrayList();
        LinkedHashMap linkedHashMap2 = wh5Var.s;
        if (linkedHashMap2 == null) {
            lc5.i0("sectionIdMap");
            throw null;
        }
        if (linkedHashMap2.get(new Integer(0)) == null) {
            ArrayList arrayList5 = wh5Var.r;
            if (arrayList5 == null) {
                lc5.i0("sections");
                throw null;
            }
            int size2 = arrayList5.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList5.get(i2);
                i2++;
                if (((ai5) obj).g.length() > 0) {
                    break;
                }
            }
            ai5 ai5Var = (ai5) obj;
            if (ai5Var != null) {
                th6 th6Var2 = new th6();
                String strH2 = wh5Var.h(ai5Var);
                aq4 aq4Var2 = aq4.a;
                b93 b93VarC2 = aq4.f(strH2).P().c();
                strX = b93VarC2 != null ? b93VarC2.X() : null;
                th6Var2.b = strX != null ? strX : "";
                th6Var2.a = "0:".concat(ai5Var.g);
                arrayList4.add(th6Var2);
            }
        }
        ArrayList arrayList6 = wh5Var.k;
        if (arrayList6 != null) {
            int size3 = arrayList6.size();
            while (i < size3) {
                Object obj3 = arrayList6.get(i);
                i++;
                R(arrayList4, (o7a) obj3);
            }
        }
        return arrayList4;
    }

    public static final void Q(ArrayList arrayList, o7a o7aVar) {
        th6 th6Var = new th6();
        th6Var.b = o7aVar.a;
        th6Var.a = arrayList.size() + ":" + o7aVar.b;
        List list = o7aVar.c;
        th6Var.c = list != null;
        th6 th6Var2 = (th6) fc1.F0(arrayList);
        if (th6Var2 != null && th6Var2.c) {
            String str = th6Var2.a;
            String strS0 = bw9.s0(str, ":", str);
            String str2 = th6Var.a;
            if (strS0.equals(bw9.s0(str2, ":", str2))) {
                th6Var2.a = "skip:".concat(th6Var2.a);
            }
        }
        if (th6Var2 != null) {
            th6Var2.d = th6Var.a;
        }
        arrayList.add(th6Var);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Q(arrayList, (o7a) it.next());
            }
        }
    }

    public static final void R(ArrayList arrayList, o7a o7aVar) {
        th6 th6Var = new th6();
        th6Var.b = o7aVar.a;
        th6Var.a = arrayList.size() + ":" + o7aVar.b;
        List list = o7aVar.c;
        th6Var.c = list != null;
        th6 th6Var2 = (th6) fc1.F0(arrayList);
        if (th6Var2 != null && th6Var2.c) {
            String str = th6Var2.a;
            String strS0 = bw9.s0(str, ":", str);
            String str2 = th6Var.a;
            if (strS0.equals(bw9.s0(str2, ":", str2))) {
                th6Var2.a = "skip:".concat(th6Var2.a);
            }
        }
        if (th6Var2 != null) {
            th6Var2.d = th6Var.a;
        }
        arrayList.add(th6Var);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R(arrayList, (o7a) it.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.nc1 r9, java.lang.String r10, defpackage.uqb r11, defpackage.f5 r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.j(nc1, java.lang.String, uqb, f5, kt1):java.lang.Object");
    }

    public static ArrayList w(String str, List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                gc1.i0();
                throw null;
            }
            qf3 qf3Var = (qf3) obj;
            arrayList.add(new q04(str, qf3Var.a, qf3Var.b));
            arrayList.addAll(w(str + "#" + i, qf3Var.c));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0233 A[EDGE_INSN: B:156:0x0233->B:123:0x0233 BREAK  A[LOOP:0: B:100:0x01ea->B:160:0x01ea], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String y(defpackage.rh6 r29, defpackage.th6 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.y(rh6, th6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lf3
            if (r0 == 0) goto L13
            r0 = r5
            lf3 r0 = (defpackage.lf3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lf3 r0 = new lf3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.e
            t07 r5 = (defpackage.t07) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L55
            kf3 r5 = (kf3) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            kf3 r5 = new kf3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.f = r5     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r4 = move-exception
            goto L67
        L57:
            java.lang.Object r4 = r4.f     // Catch: java.lang.Throwable -> L55
            kf3 r4 = (kf3) r4     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L61
            r0.q(r3)
            return r4
        L61:
            java.lang.String r4 = "epubFile"
            defpackage.lc5.i0(r4)     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        L67:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.A(kt1):java.lang.Object");
    }

    public float B(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return z(i, z);
        }
        int I = ny1.I(layout, i, z2);
        int lineStart = layout.getLineStart(I);
        int lineEnd = layout.getLineEnd(I);
        if (i != lineStart && i != lineEnd) {
            return z(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return z(i, z);
        }
        int iD = D(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(E(iD))) == -1;
        int iJ = J(lineEnd, lineStart);
        int iE = E(iD);
        int i4 = lineStart - iE;
        int i5 = iJ - iE;
        Bidi bidiN = n(iD);
        Bidi bidiCreateLineBidi = bidiN != null ? bidiN.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(I) : layout.getLineRight(I);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        bn5[] bn5VarArr = new bn5[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            bn5VarArr[i6] = new bn5(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, bn5VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (bn5VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == bn5VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(I) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(bn5VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(bn5VarArr[i3 + 1].a) : layout.getLineRight(I);
        }
        int iJ2 = i > iJ ? J(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (bn5VarArr[i9].b == iJ2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == bn5VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(I) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(bn5VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(bn5VarArr[i2 + 1].b) : layout.getLineRight(I);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vh6
            if (r0 == 0) goto L13
            r0 = r5
            vh6 r0 = (defpackage.vh6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vh6 r0 = new vh6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.e
            t07 r5 = (defpackage.t07) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L6a
            rh6 r5 = (defpackage.rh6) r5     // Catch: java.lang.Throwable -> L6a
            if (r5 != 0) goto L6c
            zh6 r5 = new zh6     // Catch: java.lang.Throwable -> L6a
            oh5 r5 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = defpackage.zn7.b     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            zn7 r1 = xn7.b(r1, r2)     // Catch: java.lang.Throwable -> L6a
            r5.getClass()     // Catch: java.lang.Throwable -> L6a
            java.io.File r5 = r1.toFile()     // Catch: java.lang.Throwable -> L6a
            j85 r5 = defpackage.tu1.k0(r5)     // Catch: java.lang.Throwable -> L6a
            rh6 r5 = defpackage.zh6.a(r5)     // Catch: java.lang.Throwable -> L6a
            r4.f = r5     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r4 = move-exception
            goto L7c
        L6c:
            java.lang.Object r4 = r4.f     // Catch: java.lang.Throwable -> L6a
            rh6 r4 = (defpackage.rh6) r4     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L76
            r0.q(r3)
            return r4
        L76:
            java.lang.String r4 = "mobiBook"
            defpackage.lc5.i0(r4)     // Catch: java.lang.Throwable -> L6a
            throw r3     // Catch: java.lang.Throwable -> L6a
        L7c:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.C(kt1):java.lang.Object");
    }

    public int D(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f;
        int iG = gc1.G(arrayList, Integer.valueOf(i));
        int i2 = iG < 0 ? -(iG + 1) : iG + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int E(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f).get(i - 1)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(defpackage.a82 r32, java.util.Map r33, defpackage.kt1 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.F(a82, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01be -> B:44:0x01d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(defpackage.a82 r42, java.util.Map r43, defpackage.kt1 r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.G(a82, java.util.Map, kt1):java.lang.Object");
    }

    public int J(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((lc5.V(cCharAt, 8192) < 0 || lc5.V(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    public void K(List list, boolean z) throws e20 {
        Object next;
        LinkedHashSet<vu6> linkedHashSet = new LinkedHashSet();
        vv vvVar = new vv(new i96(list));
        while (!vvVar.isEmpty()) {
            vu6 vu6Var = (vu6) vvVar.removeLast();
            if (linkedHashSet.add(vu6Var)) {
                ArrayList arrayList = vu6Var.e;
                arrayList.getClass();
                Iterator it = new en8(arrayList).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((dn8) it).b;
                    if (listIterator.hasPrevious()) {
                        vu6 vu6Var2 = (vu6) listIterator.previous();
                        if (!linkedHashSet.contains(vu6Var2)) {
                            vvVar.addLast(vu6Var2);
                        }
                    }
                }
            }
        }
        y91 y91Var = (y91) this.e;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) y91Var.d;
        for (vu6 vu6Var3 : linkedHashSet) {
            for (Map.Entry entry : vu6Var3.c.entrySet()) {
                String str = (String) entry.getKey();
                n95 n95Var = (n95) entry.getValue();
                if0 if0Var = n95Var.a;
                zk4 zk4Var = (zk4) ((nc1) y91Var.b).b;
                str.getClass();
                if0 if0Var2 = n95Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) y91Var.c;
                n95 n95Var2 = (n95) concurrentHashMap2.get(str);
                yv5 yv5Var = yv5.e;
                if (n95Var2 != null) {
                    if (!z) {
                        throw new e20("Already existing definition for " + if0Var2 + " at " + str);
                    }
                    if0Var2.toString();
                    zk4Var.getClass();
                    yv5Var.compareTo(yv5.c);
                    Iterator it2 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((kf9) next).a.equals(if0Var2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((kf9) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(if0Var2.hashCode()));
                    }
                }
                if0Var2.toString();
                zk4Var.getClass();
                yv5Var.compareTo(yv5.a);
                concurrentHashMap2.put(str, n95Var);
            }
            for (kf9 kf9Var : vu6Var3.b) {
                concurrentHashMap.put(Integer.valueOf(kf9Var.a.hashCode()), kf9Var);
            }
        }
        s16 s16Var = (s16) this.d;
        s16Var.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ((Set) s16Var.c).addAll(((vu6) it3.next()).d);
        }
    }

    public q6 L(int i, int i2, int i3) {
        q6 q6Var = (q6) ((ii1) this.b).a();
        if (q6Var != null) {
            q6Var.a = i;
            q6Var.b = i2;
            q6Var.c = i3;
            return q6Var;
        }
        q6 q6Var2 = new q6();
        q6Var2.a = i;
        q6Var2.b = i2;
        q6Var2.c = i3;
        return q6Var2;
    }

    public void M() {
        cb6 cb6Var = new cb6(this, (MediaBrowserServiceCompat) this.e);
        this.b = cb6Var;
        cb6Var.onCreate();
    }

    public void N(int i, int i2) {
        String str = (String) this.c;
        h13 h13Var = (h13) this.b;
        xa8 xa8Var = (xa8) this.e;
        xa8Var.b = i;
        xa8Var.c = i2;
        ng8 ng8Var = (ng8) this.f;
        if (!ng8Var.a) {
            ng8Var.a = true;
            h13Var.b.u.x0(1, str);
        }
        h13.d((qg8) this.d, h13Var, xa8Var, str, false);
    }

    public void O(int i, int i2) {
        xa8 xa8Var = (xa8) this.e;
        xa8Var.b = i;
        xa8Var.c = i2;
        h13 h13Var = (h13) this.b;
        String str = (String) this.c;
        h13.a(h13Var, str);
        h13.d((qg8) this.d, h13Var, xa8Var, str, true);
        h13Var.b.u.x0(4, str);
    }

    public void S(q6 q6Var) {
        pq7 pq7Var = (pq7) this.d;
        ((ArrayList) this.c).add(q6Var);
        int i = q6Var.a;
        if (i == 1) {
            pq7Var.y(q6Var.b, q6Var.c);
            return;
        }
        if (i == 2) {
            int i2 = q6Var.b;
            int i3 = q6Var.c;
            RecyclerView recyclerView = (RecyclerView) pq7Var.a;
            recyclerView.K(i2, i3, false);
            recyclerView.s0 = true;
            return;
        }
        if (i == 4) {
            pq7Var.x(q6Var.b, q6Var.c);
        } else if (i == 8) {
            pq7Var.A(q6Var.b, q6Var.c);
        } else {
            w58.j(q6Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.oq4
            if (r0 == 0) goto L13
            r0 = r5
            oq4 r0 = (defpackage.oq4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            oq4 r0 = new oq4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.e
            t07 r5 = (defpackage.t07) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L90
            zx2 r5 = (zx2) r5     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto L93
            oh5 r5 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = defpackage.zn7.b     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L90
            r2 = 0
            zn7 r1 = xn7.b(r1, r2)     // Catch: java.lang.Throwable -> L90
            r5.getClass()     // Catch: java.lang.Throwable -> L90
            java.io.File r5 = r1.toFile()     // Catch: java.lang.Throwable -> L90
            j85 r5 = defpackage.tu1.k0(r5)     // Catch: java.lang.Throwable -> L90
            xq0 r1 = new xq0     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r1.K0(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = r1.p0()     // Catch: java.lang.Throwable -> L77
            r5.close()     // Catch: java.lang.Throwable -> L75
            r1.p()     // Catch: java.lang.Throwable -> L75
            r5 = r3
            goto L85
        L75:
            r5 = move-exception
            goto L85
        L77:
            r2 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L7f
            r1.p()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r5 = move-exception
            i12.r(r2, r5)     // Catch: java.lang.Throwable -> L90
        L83:
            r5 = r2
            r2 = r3
        L85:
            if (r5 != 0) goto L92
            aq4 r5 = defpackage.aq4.a     // Catch: java.lang.Throwable -> L90
            zx2 r5 = defpackage.aq4.f(r2)     // Catch: java.lang.Throwable -> L90
            r4.f = r5     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r4 = move-exception
            goto L97
        L92:
            throw r5     // Catch: java.lang.Throwable -> L90
        L93:
            r0.q(r3)
            return r5
        L97:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.T(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ws3
            if (r0 == 0) goto L13
            r0 = r5
            ws3 r0 = (defpackage.ws3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ws3 r0 = new ws3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.e
            t07 r5 = (defpackage.t07) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L55
            mu3 r5 = (mu3) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            mu3 r5 = new mu3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.f = r5     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r4 = move-exception
            goto L5b
        L57:
            r0.q(r3)
            return r5
        L5b:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.U(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tdb
            if (r0 == 0) goto L13
            r0 = r5
            tdb r0 = (defpackage.tdb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tdb r0 = new tdb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.e
            t07 r5 = (defpackage.t07) r5
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r5
        L43:
            java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L87
            odb r5 = (defpackage.odb) r5     // Catch: java.lang.Throwable -> L87
            if (r5 != 0) goto L89
            oh5 r5 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = defpackage.zn7.b     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L87
            r2 = 0
            zn7 r1 = xn7.b(r1, r2)     // Catch: java.lang.Throwable -> L87
            r5.getClass()     // Catch: java.lang.Throwable -> L87
            java.io.File r5 = r1.toFile()     // Catch: java.lang.Throwable -> L87
            j85 r5 = defpackage.tu1.k0(r5)     // Catch: java.lang.Throwable -> L87
            ie8 r1 = new ie8     // Catch: java.lang.Throwable -> L87
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L87
            cp4 r5 = new cp4     // Catch: java.lang.Throwable -> L79
            r2 = 7
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L79
            odb r5 = r5.n(r1)     // Catch: java.lang.Throwable -> L79
            r4.f = r5     // Catch: java.lang.Throwable -> L79
            r1.close()     // Catch: java.lang.Throwable -> L77
            r4 = r3
            goto L83
        L77:
            r4 = move-exception
            goto L83
        L79:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r5 = move-exception
            i12.r(r4, r5)     // Catch: java.lang.Throwable -> L87
        L82:
            r5 = r3
        L83:
            if (r4 != 0) goto L86
            goto L89
        L86:
            throw r4     // Catch: java.lang.Throwable -> L87
        L87:
            r4 = move-exception
            goto L8d
        L89:
            r0.q(r3)
            return r5
        L8d:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.V(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W(defpackage.kt1 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.a5c
            if (r0 == 0) goto L13
            r0 = r9
            a5c r0 = (defpackage.a5c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            a5c r0 = new a5c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 2
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            r07 r0 = r0.a
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r8 = move-exception
            goto L7c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r4
        L35:
            int r1 = r0.b
            r07 r6 = r0.a
            defpackage.e11.e0(r9)
            r9 = r6
            goto L5a
        L3e:
            defpackage.e11.e0(r9)
            java.lang.Object r9 = r8.f
            gnb r9 = (defpackage.gnb) r9
            if (r9 == 0) goto L48
            return r9
        L48:
            java.lang.Object r9 = r8.e
            t07 r9 = (defpackage.t07) r9
            r0.a = r9
            r1 = 0
            r0.b = r1
            r0.e = r2
            java.lang.Object r6 = r9.p(r0)
            if (r6 != r5) goto L5a
            goto L6e
        L5a:
            java.lang.Object r6 = r8.b     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7a
            gnb r6 = defpackage.anb.b(r6)     // Catch: java.lang.Throwable -> L7a
            r0.a = r9     // Catch: java.lang.Throwable -> L7a
            r0.b = r1     // Catch: java.lang.Throwable -> L7a
            r0.e = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = defpackage.wn9.G(r6, r2, r2, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r7 = r0
            r0 = r9
            r9 = r7
        L72:
            gnb r9 = (defpackage.gnb) r9     // Catch: java.lang.Throwable -> L2d
            r8.f = r9     // Catch: java.lang.Throwable -> L2d
            r0.q(r4)
            return r9
        L7a:
            r8 = move-exception
            r0 = r9
        L7c:
            r0.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.W(kt1):java.lang.Object");
    }

    public void X(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q6 q6Var = (q6) arrayList.get(i);
            q6Var.getClass();
            ((ii1) this.b).k(q6Var);
        }
        arrayList.clear();
    }

    public void Y(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.b).put(str, obj);
        b07 b07Var = (b07) ((LinkedHashMap) this.d).get(str);
        if (b07Var != null) {
            ((fr9) b07Var).k(obj);
        }
        b07 b07Var2 = (b07) ((LinkedHashMap) this.e).get(str);
        if (b07Var2 != null) {
            ((fr9) b07Var2).k(obj);
        }
    }

    public boolean Z(float[] fArr) {
        zl7[] zl7VarArr = (zl7[]) this.d;
        if (zl7VarArr != null && zl7VarArr.length != 0) {
            for (zl7 zl7Var : zl7VarArr) {
                zl7Var.getClass();
                fArr.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (10.0f > f2 || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((hm7) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    public int a0(int i, int i2) {
        int i3;
        int i4;
        ii1 ii1Var = (ii1) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q6 q6Var = (q6) arrayList.get(size);
            int i5 = q6Var.a;
            int i6 = q6Var.b;
            if (i5 == 8) {
                int i7 = q6Var.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            q6Var.b = i6 + 1;
                            q6Var.c = i7 + 1;
                        } else if (i2 == 2) {
                            q6Var.b = i6 - 1;
                            q6Var.c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        q6Var.c = i7 + 1;
                    } else if (i2 == 2) {
                        q6Var.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        q6Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        q6Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= q6Var.c;
                } else if (i5 == 2) {
                    i += q6Var.c;
                }
            } else if (i2 == 1) {
                q6Var.b = i6 + 1;
            } else if (i2 == 2) {
                q6Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            q6 q6Var2 = (q6) arrayList.get(size2);
            int i8 = q6Var2.a;
            int i9 = q6Var2.c;
            if (i8 == 8) {
                if (i9 == q6Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    ii1Var.k(q6Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                ii1Var.k(q6Var2);
            }
        }
        return i;
    }

    public int b(long j) {
        long[] jArr = (long[]) this.c;
        int iB = hjb.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public float c() {
        return ((Number) ((dp5) this.d).getValue()).floatValue();
    }

    @Override // defpackage.dp5
    public boolean d() {
        return ((rtb) this.f) != null;
    }

    public long e(int i) {
        return ((long[]) this.c)[i];
    }

    public float f() {
        return ((Number) ((dp5) this.e).getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.Map r10, defpackage.jt1 r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.g(java.util.Map, jt1):java.lang.Object");
    }

    @Override // defpackage.r58
    public Object get() {
        switch (this.a) {
            case 5:
                return new bj2((Executor) ((r58) this.b).get(), (ng6) ((r58) this.c).get(), (be5) ((be5) this.d).get(), (br8) ((r58) this.e).get(), (br8) ((r58) this.f).get());
            case 15:
                return new ii8((iua) ((q58) this.b).get(), (az3) ((q58) this.c).get(), (qu) ((q58) this.d).get(), (ji8) ((q58) this.e).get(), (g89) ((q58) this.f).get());
            default:
                return new m59((gy3) ((kg2) this.b).a, (az3) ((q58) this.c).get(), (j69) ((q58) this.d).get(), (wg3) ((q58) this.e).get(), (jx1) ((q58) this.f).get());
        }
    }

    @Override // defpackage.dp5
    public Object getValue() {
        rtb rtbVar = (rtb) this.f;
        if (rtbVar != null) {
            return rtbVar;
        }
        cub cubVarF = ((uc8) this.c).b.f();
        xtb xtbVarC = ((uc8) this.d).b.c();
        ry6 ry6VarD = ((uc8) this.e).b.d();
        xtbVarC.getClass();
        aub aubVar = new aub(cubVarF, xtbVarC, ry6VarD);
        a91 a91Var = (a91) this.b;
        String strF = a91Var.f();
        if (strF == null) {
            gp.l("Local and anonymous classes can not be ViewModels");
            return null;
        }
        rtb rtbVarA = aubVar.a(a91Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strF));
        this.f = rtbVarA;
        return rtbVarA;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|79|(1:81)|82|83|85|(1:87)(3:88|(1:89)|91)|92|(1:94)(1:96)|95|97|411|98|409|99|100|(5:111|69|(2:71|(2:73|(2:75|(1:77)(17:78|79|(0)|82|83|85|(0)(0)|92|(0)(0)|95|97|411|98|409|99|100|(1:112)(0)))(14:84|83|85|(0)(0)|92|(0)(0)|95|97|411|98|409|99|100|(0)(0)))(2:114|115))(8:116|(1:118)(2:119|(2:122|(4:123|(1:125)|126|(1:425)(1:159))))|128|(1:130)(1:131)|132|(8:134|401|135|(1:137)|407|141|142|(1:152))|153|(3:156|157|158))|155|442)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:103|104|419|105|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:229|230|423|231|235) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:223|(1:417)|224|415|225|226|(2:237|(2:239|(15:242|243|(1:245)|246|248|(1:250)(3:251|(1:252)|254)|255|(1:257)(1:258)|259|260|263|(1:265)(1:266)|267|217|(6:270|(1:272)(2:273|(2:276|(4:277|(1:279)|280|(1:430)(1:296))))|282|(1:284)(1:285)|286|(2:288|(3:291|292|293))(2:294|295))(0)))(12:247|248|(0)(0)|255|(0)(0)|259|260|263|(0)(0)|267|217|(0)(0)))(1:261)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0452, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0454, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0456, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x045a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x045b, code lost:
    
        i12.r(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x045e, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x08f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x08fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x08ff, code lost:
    
        i12.r(r0, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0eb8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0ebb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0ef6  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0fa5  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0fbc  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0fd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:242:0x096e -> B:243:0x097f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x099f -> B:248:0x09b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x0a41 -> B:260:0x0a3d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:340:0x0ea3 -> B:341:0x0eb4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:0x0f89 -> B:355:0x0f9b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x034f -> B:79:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x038a -> B:83:0x0387). Please report as a decompilation issue!!! */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r60, java.util.Map r61, defpackage.kt1 r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.h(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:51:0x0131, B:68:0x0162], limit reached: 453 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[LOOP:1: B:31:0x00b5->B:33:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:468:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x031a -> B:140:0x031d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x04cb -> B:217:0x04cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:345:0x073e -> B:347:0x0742). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:410:0x08e1 -> B:421:0x0933). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:412:0x08f7 -> B:421:0x0933). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:416:0x091a -> B:417:0x091f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01e2 -> B:85:0x01e7). Please report as a decompilation issue!!! */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.jt1 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.i(jt1):java.lang.Object");
    }

    @Override // defpackage.fj1
    public Object k(ks ksVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((oa8) this.b, (oa8) this.c, (oa8) this.d, (oa8) this.e, (oa8) this.f, ksVar);
    }

    public cy0 l(na0 na0Var, ib4 ib4Var) {
        int i;
        int i2;
        int i3;
        pg8 pg8Var = new pg8();
        pg8Var.a = -1;
        synchronized (this.b) {
            Throwable th = (Throwable) this.c;
            if (th != null) {
                na0Var.b(th);
                return mc8.c;
            }
            b00 b00Var = (b00) this.d;
            do {
                i = b00Var.get();
                i2 = i + 1;
            } while (!b00Var.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            pg8Var.a = (i2 >>> 27) & 15;
            ((kz6) this.e).a(na0Var);
            if (z && ib4Var != null) {
                try {
                    ib4Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.b) {
                        try {
                            if (((Throwable) this.c) == null) {
                                this.c = th2;
                                kz6 kz6Var = (kz6) this.e;
                                Object[] objArr = kz6Var.a;
                                int i5 = kz6Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((na0) objArr[i6]).b(th2);
                                }
                                ((kz6) this.e).d();
                                b00 b00Var2 = (b00) this.d;
                                do {
                                    i3 = b00Var2.get();
                                } while (!b00Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new ab6(new ma0(i4, na0Var, this, pg8Var));
        }
    }

    public List m(long j) {
        s7b s7bVar = (s7b) this.b;
        Map map = (Map) this.d;
        HashMap map2 = (HashMap) this.e;
        HashMap map3 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        s7bVar.g(j, s7bVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        s7bVar.i(j, false, s7bVar.h, treeMap);
        s7bVar.h(j, map, map2, s7bVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                v7b v7bVar = (v7b) map2.get(pair.first);
                v7bVar.getClass();
                arrayList2.add(new c22((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, bitmapDecodeByteArray, v7bVar.c, 0, v7bVar.e, v7bVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, v7bVar.f, v7bVar.g, false, -16777216, v7bVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            v7b v7bVar2 = (v7b) map2.get(entry.getKey());
            v7bVar2.getClass();
            b22 b22Var = (b22) entry.getValue();
            CharSequence charSequence = b22Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (jn2 jn2Var : (jn2[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), jn2.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(jn2Var), spannableStringBuilder.getSpanEnd(jn2Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = v7bVar2.c;
            int i10 = v7bVar2.d;
            b22Var.e = f;
            b22Var.f = i10;
            b22Var.g = v7bVar2.e;
            b22Var.h = v7bVar2.b;
            b22Var.l = v7bVar2.f;
            float f2 = v7bVar2.i;
            int i11 = v7bVar2.h;
            b22Var.k = f2;
            b22Var.j = i11;
            b22Var.p = v7bVar2.j;
            arrayList2.add(b22Var.a());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi n(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.E(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.n(int):java.text.Bidi");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(defpackage.f5 r6, defpackage.drb r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dqb
            if (r0 == 0) goto L13
            r0 = r8
            dqb r0 = (defpackage.dqb) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dqb r0 = new dqb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            int r5 = r0.c
            java.util.Iterator r6 = r0.b
            drb r7 = r0.a
            defpackage.e11.e0(r8)
            goto L4f
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.e11.e0(r8)
            java.lang.Object r5 = r5.e
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = r6.a     // Catch: java.lang.Throwable -> L6d
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L6d
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L6d
            java.util.List r6 = defpackage.fc1.Z0(r6)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r4 = r6
            r6 = r5
            r5 = r4
        L4f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r6.next()
            xz6 r8 = (defpackage.xz6) r8
            r0.a = r7
            r0.b = r6
            r0.c = r5
            r0.f = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L6a:
            heb r5 = defpackage.heb.a
            return r5
        L6d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.o(f5, drb, kt1):java.lang.Object");
    }

    public int p() {
        return ((long[]) this.c).length;
    }

    public boolean q(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            q6 q6Var = (q6) arrayList.get(i2);
            int i3 = q6Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = q6Var.b;
                    int i5 = q6Var.c + i4;
                    while (i4 < i5) {
                        if (v(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (v(q6Var.c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void r() {
        pq7 pq7Var = (pq7) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pq7) this.d).r((q6) arrayList.get(i));
        }
        X(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            q6 q6Var = (q6) arrayList2.get(i2);
            int i3 = q6Var.a;
            if (i3 == 1) {
                pq7Var.r(q6Var);
                pq7Var.y(q6Var.b, q6Var.c);
            } else if (i3 == 2) {
                pq7Var.r(q6Var);
                int i4 = q6Var.b;
                int i5 = q6Var.c;
                RecyclerView recyclerView = (RecyclerView) pq7Var.a;
                recyclerView.K(i4, i5, true);
                recyclerView.s0 = true;
                recyclerView.p0.b += i5;
            } else if (i3 == 4) {
                pq7Var.r(q6Var);
                pq7Var.x(q6Var.b, q6Var.c);
            } else if (i3 == 8) {
                pq7Var.r(q6Var);
                pq7Var.A(q6Var.b, q6Var.c);
            }
        }
        X(arrayList2);
    }

    public void s() {
        ((zk4) this.b).getClass();
        yv5 yv5Var = yv5.e;
        yv5 yv5Var2 = yv5.a;
        yv5Var.compareTo(yv5Var2);
        long jA = xu6.a();
        y91 y91Var = (y91) this.e;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) y91Var.d;
        int i = 0;
        kf9[] kf9VarArr = (kf9[]) concurrentHashMap.values().toArray(new kf9[0]);
        ArrayList arrayListE = gc1.E(Arrays.copyOf(kf9VarArr, kf9VarArr.length));
        concurrentHashMap.clear();
        nc1 nc1Var = (nc1) y91Var.b;
        s16 s16Var = new s16((zk4) nc1Var.b, (ev8) ((s16) nc1Var.d).e, ug8.a(h67.class), (rm7) null);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((kf9) obj).b(s16Var);
        }
        long jA2 = jua.a(jA);
        mc8 mc8Var = k63.b;
        k63.i(jA2, o63.MICROSECONDS);
        yv5Var.compareTo(yv5Var2);
    }

    public void t(q6 q6Var) {
        int i;
        ii1 ii1Var = (ii1) this.b;
        int i2 = q6Var.a;
        if (i2 == 1 || i2 == 8) {
            gp.l("should not dispatch add or move for pre layout");
            return;
        }
        int iA0 = a0(q6Var.b, i2);
        int i3 = q6Var.b;
        int i4 = q6Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                w58.j(q6Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < q6Var.c; i6++) {
            int iA02 = a0((i * i6) + q6Var.b, q6Var.a);
            int i7 = q6Var.a;
            if (i7 == 2 ? iA02 != iA0 : !(i7 == 4 && iA02 == iA0 + 1)) {
                q6 q6VarL = L(i7, iA0, i5);
                u(q6VarL, i3);
                ii1Var.k(q6VarL);
                if (q6Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iA0 = iA02;
            } else {
                i5++;
            }
        }
        ii1Var.k(q6Var);
        if (i5 > 0) {
            q6 q6VarL2 = L(q6Var.a, iA0, i5);
            u(q6VarL2, i3);
            ii1Var.k(q6VarL2);
        }
    }

    public void u(q6 q6Var, int i) {
        pq7 pq7Var = (pq7) this.d;
        pq7Var.r(q6Var);
        int i2 = q6Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                pq7Var.x(i, q6Var.c);
                return;
            } else {
                gp.l("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = q6Var.c;
        RecyclerView recyclerView = (RecyclerView) pq7Var.a;
        recyclerView.K(i, i3, true);
        recyclerView.s0 = true;
        recyclerView.p0.b += i3;
    }

    public int v(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (i2 < size) {
            q6 q6Var = (q6) arrayList.get(i2);
            int i3 = q6Var.a;
            int i4 = q6Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = q6Var.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (q6Var.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = q6Var.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += q6Var.c;
            }
            i2++;
        }
        return i;
    }

    public void x(kb4 kb4Var) {
        int i;
        synchronized (this.b) {
            try {
                kz6 kz6Var = (kz6) this.e;
                this.e = (kz6) this.f;
                this.f = kz6Var;
                b00 b00Var = (b00) this.d;
                do {
                    i = b00Var.get();
                } while (!b00Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = kz6Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    kb4Var.invoke(kz6Var.f(i3));
                }
                kz6Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float z(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public /* synthetic */ nc1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public nc1(pq7 pq7Var, byte b) {
        this.a = 20;
        this.b = pq7Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new Object();
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        this.f = wx1.b(gx1.T(o0aVarA, nh2.c));
    }

    public nc1(String str, m62 m62Var, m76 m76Var, int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
            case 9:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
            case 13:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
            case 19:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
            case 22:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
            default:
                this.b = str;
                this.c = m62Var;
                this.d = m76Var;
                this.e = u07.a();
                break;
        }
    }

    public nc1(Map map) {
        this.a = 16;
        map.getClass();
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new si1(this, 4);
    }

    public nc1(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new zk4(23);
                c85 c85Var = new c85();
                c85Var.a = this;
                c85Var.b = new ArrayList();
                this.c = c85Var;
                this.d = new s16(this);
                this.e = new y91(this);
                new ConcurrentHashMap();
                new HashMap();
                this.f = new lp8(29);
                break;
            default:
                this.b = new Object();
                this.d = new b00(0);
                this.e = new kz6();
                this.f = new kz6();
                break;
        }
    }

    public nc1(Layout layout) {
        this.a = 11;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iW = bw9.W(((Layout) this.b).getText(), '\n', length, 4);
            length = iW < 0 ? ((Layout) this.b).getText().length() : iW + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.b).getText().length());
        this.f = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.f).size()];
        ((ArrayList) this.f).size();
    }

    public nc1(a91 a91Var, uc8 uc8Var, uc8 uc8Var2, uc8 uc8Var3) {
        this.a = 21;
        this.b = a91Var;
        this.c = uc8Var;
        this.d = uc8Var2;
        this.e = uc8Var3;
    }

    public nc1(s7b s7bVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = 18;
        this.b = s7bVar;
        this.e = map2;
        this.f = map3;
        this.d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        s7bVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
    
        r2 = new java.util.ArrayList();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a5, code lost:
    
        if (r3 >= r1.b) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a7, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01aa, code lost:
    
        if (r4 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
    
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
    
        if (r4 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
    
        if (r3 >= r1.b) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b5, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b6, code lost:
    
        if (r4 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b8, code lost:
    
        r6 = r3 + 1;
        r3 = (defpackage.mc1) r4[r3];
        r4 = r3.j;
        r11 = (int[]) r4.b;
        r4 = (int[]) r4.c;
        r12 = r3.a;
        r3 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cc, code lost:
    
        if (r12 > r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
    
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d3, code lost:
    
        r17 = r11[r12];
        r18 = r4[r17];
        r13 = r13 + r18;
        r14 = (((r17 >> 10) & 31) * r18) + r14;
        r15 = (((r17 >> 5) & 31) * r18) + r15;
        r16 = (r18 * (r17 & 31)) + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ef, code lost:
    
        if (r12 == r3) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f1, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f4, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f7, code lost:
    
        r3 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
    
        r11 = r13;
        r21 = r5;
        r6 = new defpackage.bm7(defpackage.ra1.w((int) java.lang.Math.rint(r3 / r11), 5, 8) | (((defpackage.ra1.w((int) java.lang.Math.rint(r14 / r11), 5, 8) << 16) | (-16777216)) | (defpackage.ra1.w((int) java.lang.Math.rint(r15 / r11), 5, 8) << 8)), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0238, code lost:
    
        if (Z(r6.c) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
    
        r2.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023d, code lost:
    
        r5 = r21;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0243, code lost:
    
        r21 = r5;
        defpackage.mn5.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0248, code lost:
    
        throw r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0249, code lost:
    
        r20.f = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024b, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nc1(int[] r21, int r22, defpackage.zl7[] r23) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc1.<init>(int[], int, zl7[]):void");
    }

    public /* synthetic */ nc1(int i, boolean z) {
        this.a = i;
    }

    public nc1(List list, ArrayList arrayList) {
        Object obj;
        this.a = 1;
        list.getClass();
        arrayList.getClass();
        this.b = list;
        this.c = arrayList;
        this.d = new HashMap();
        this.e = new HashMap();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i = ((bm7) next).b;
                do {
                    Object next2 = it.next();
                    int i2 = ((bm7) next2).b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        this.f = (bm7) obj;
    }

    public nc1(pq7 pq7Var) {
        this.a = 2;
        this.b = new ii1(30, 8);
        this.f = new ArrayList();
        this.c = new ArrayList();
        this.d = pq7Var;
        this.e = new uc6(this);
    }

    public nc1(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.a = 12;
        this.e = mediaBrowserServiceCompat;
        this.d = mediaBrowserServiceCompat;
        this.f = new ArrayList();
    }
}
