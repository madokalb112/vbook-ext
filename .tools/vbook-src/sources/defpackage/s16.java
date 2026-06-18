package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s16 implements pv3, pk9, ht3, b0a, d09, olb {
    public static s16 s;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public static final Object f = new Object();
    public static final ov9 t = new ov9();

    public s16(Typeface typeface, qg6 qg6Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 13;
        this.e = typeface;
        this.b = qg6Var;
        this.d = new sg6(1024);
        int iA = qg6Var.a(6);
        if (iA != 0) {
            int i5 = iA + qg6Var.a;
            i = ((ByteBuffer) qg6Var.d).getInt(((ByteBuffer) qg6Var.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int iA2 = qg6Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + qg6Var.a;
            i2 = ((ByteBuffer) qg6Var.d).getInt(((ByteBuffer) qg6Var.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            pbb pbbVar = new pbb(this, i7);
            pg6 pg6VarB = pbbVar.b();
            int iA3 = pg6VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) pg6VarB.d).getInt(iA3 + pg6VarB.a) : 0, (char[]) this.c, i7 * 2);
            pg6 pg6VarB2 = pbbVar.b();
            int iA4 = pg6VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + pg6VarB2.a;
                i3 = ((ByteBuffer) pg6VarB2.d).getInt(((ByteBuffer) pg6VarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                gp.l("invalid metadata codepoint length");
                throw null;
            }
            sg6 sg6Var = (sg6) this.d;
            pg6 pg6VarB3 = pbbVar.b();
            int iA5 = pg6VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + pg6VarB3.a;
                i4 = ((ByteBuffer) pg6VarB3.d).getInt(((ByteBuffer) pg6VarB3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            sg6Var.a(pbbVar, 0, i4 - 1);
        }
    }

    public static s16 E(i94 i94Var) {
        s16 s16Var;
        synchronized (f) {
            try {
                if (s == null) {
                    s = new s16(i94Var.getApplicationContext(), 0);
                }
                s16Var = s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s16Var;
    }

    public static boolean G(byte b) {
        return b == 10 || b == 13;
    }

    public static t6b J(zn7 zn7Var) {
        int iX;
        t6b t6bVar = new t6b();
        if (gx3.a.e0(zn7Var)) {
            try {
                ie8 ie8Var = new ie8(tu1.k0(zn7Var.toFile()));
                while (true) {
                    try {
                        String strP = ie8Var.P();
                        if (strP == null) {
                            try {
                                break;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else if (strP.length() != 0 && (iX = bw9.X(strP, "=", 0, false, 6)) > 0 && iX != strP.length() - 1) {
                            t6bVar.a(strP.substring(0, iX), strP.substring(iX + 1));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            ie8Var.close();
                        } catch (Throwable th3) {
                            i12.r(th, th3);
                        }
                    }
                }
                ie8Var.close();
                th = null;
                if (th != null) {
                    throw th;
                }
            } catch (Throwable unused) {
            }
        }
        return t6bVar;
    }

    public static void O(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void k(s16 s16Var, r37 r37Var) {
        s16Var.getClass();
        r37Var.getClass();
        if (((LinkedHashSet) s16Var.d).add(r37Var)) {
            x37 x37Var = (x37) s16Var.c;
            x37Var.getClass();
            if (r37Var.g != null) {
                so9.r(r37Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            x37Var.e.addFirst(r37Var);
            r37Var.g = s16Var;
            x37Var.b();
        }
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        for (aa4 aa4Var : ((HashMap) this.c).values()) {
            if (aa4Var != null) {
                arrayList.add(aa4Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public l00 B(String str) {
        str.getClass();
        l00 l00Var = new l00();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        vr8 vr8Var = new vr8(lowerCase);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        if (linkedHashMap.containsKey(vr8Var)) {
            Object obj = linkedHashMap.get(vr8Var);
            obj.getClass();
            Iterator it = ((Map) obj).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                tr8 tr8Var = (tr8) entry.getKey();
                if (entry.getValue() != null) {
                    j31.j();
                    return null;
                }
                String str2 = tr8Var.a;
                throw null;
            }
        }
        return l00Var;
    }

    public int C() {
        return 2;
    }

    public List D() {
        ArrayList arrayList;
        if (((ArrayList) this.e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.e)) {
            arrayList = new ArrayList((ArrayList) this.e);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable F(defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.F(kt1):java.io.Serializable");
    }

    public boolean H(String str, b93 b93Var, i00 i00Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        str.getClass();
        i00Var.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        vr8 vr8Var = new vr8(lowerCase);
        String str2 = i00Var.a;
        str2.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        tr8 tr8Var = new tr8(lowerCase2);
        Set set = (Set) ((LinkedHashMap) this.c).get(vr8Var);
        if (set == null || !set.contains(tr8Var)) {
            if (((Map) ((LinkedHashMap) this.d).get(vr8Var)) != null) {
                l00 l00VarB = B(str);
                if (l00VarB.k(str2)) {
                    return l00VarB.i(str2).equals(i00Var.a());
                }
            }
            if (!str.equals(":all") && H(":all", b93Var, i00Var)) {
                return true;
            }
        } else {
            if (!linkedHashMap.containsKey(vr8Var)) {
                return true;
            }
            Object obj = linkedHashMap.get(vr8Var);
            obj.getClass();
            Map map = (Map) obj;
            if (!map.containsKey(tr8Var)) {
                return true;
            }
            Object obj2 = map.get(tr8Var);
            obj2.getClass();
            Set set2 = (Set) obj2;
            String strA = b93Var.a(str2);
            if (strA.length() == 0) {
                strA = i00Var.a();
            }
            i00Var.c(strA);
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String str3 = ((ur8) it.next()).a;
                if (!str3.equals("#")) {
                    String strConcat = str3.concat(":");
                    String lowerCase3 = strA.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    if (iw9.K(lowerCase3, strConcat, false)) {
                        return true;
                    }
                } else if (iw9.K(strA, "#", false)) {
                    Pattern patternCompile = Pattern.compile(".*\\s.*");
                    patternCompile.getClass();
                    if (!patternCompile.matcher(strA).matches()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public boolean I(String str) {
        str.getClass();
        HashSet hashSet = (HashSet) this.b;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return hashSet.contains(new vr8(lowerCase));
    }

    public void K(aa4 aa4Var) {
        f94 f94Var = aa4Var.c;
        String str = f94Var.e;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(f94Var.e, aa4Var);
        if (u94.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + f94Var);
        }
    }

    public void L(aa4 aa4Var) {
        HashMap map = (HashMap) this.c;
        f94 f94Var = aa4Var.c;
        if (f94Var.O) {
            ((w94) this.b).i(f94Var);
        }
        if (map.get(f94Var.e) == aa4Var && ((aa4) map.put(f94Var.e, null)) != null && u94.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + f94Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.k01
            if (r0 == 0) goto L13
            r0 = r5
            k01 r0 = (defpackage.k01) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k01 r0 = new k01
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
            java.lang.Object r5 = r4.d
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
            java.lang.Object r5 = r4.e     // Catch: java.lang.Throwable -> L55
            h01 r5 = (h01) r5     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            h01 r5 = new h01     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r4.b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L55
            r4.e = r5     // Catch: java.lang.Throwable -> L55
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.M(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zp7
            if (r0 == 0) goto L13
            r0 = r5
            zp7 r0 = (defpackage.zp7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zp7 r0 = new zp7
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
            java.lang.Object r5 = r4.d
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
            java.lang.Object r5 = r4.e     // Catch: java.lang.Throwable -> L54
            tm r5 = (defpackage.tm) r5     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L56
            java.lang.Object r5 = r4.b     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L54
            tm r5 = ae9.a(r5)     // Catch: java.lang.Throwable -> L54
            r4.e = r5     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r4 = move-exception
            goto L61
        L56:
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L54
            tm r4 = (defpackage.tm) r4     // Catch: java.lang.Throwable -> L54
            r4.getClass()     // Catch: java.lang.Throwable -> L54
            r0.q(r3)
            return r4
        L61:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.N(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P(defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            bi1 r0 = (defpackage.bi1) r0
            boolean r1 = r10 instanceof defpackage.nq8
            if (r1 == 0) goto L17
            r1 = r10
            nq8 r1 = (defpackage.nq8) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            nq8 r1 = new nq8
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 2
            r4 = 1
            heb r5 = defpackage.heb.a
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            r07 r9 = r1.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L33
            goto L71
        L33:
            r10 = move-exception
            goto L7c
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r6
        L3b:
            r07 r2 = r1.a
            defpackage.e11.e0(r10)
            r10 = r2
            goto L5b
        L42:
            defpackage.e11.e0(r10)
            boolean r10 = r0.M()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            java.lang.Object r10 = r9.b
            t07 r10 = (defpackage.t07) r10
            r1.a = r10
            r1.d = r4
            java.lang.Object r2 = r10.p(r1)
            if (r2 != r7) goto L5b
            goto L6f
        L5b:
            boolean r2 = r0.M()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r10.q(r6)
            return r5
        L65:
            r1.a = r10     // Catch: java.lang.Throwable -> L78
            r1.d = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r9.s(r1)     // Catch: java.lang.Throwable -> L78
            if (r9 != r7) goto L70
        L6f:
            return r7
        L70:
            r9 = r10
        L71:
            r0.Q(r5)     // Catch: java.lang.Throwable -> L33
            r9.q(r6)
            return r5
        L78:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r9.q(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.P(kt1):java.lang.Object");
    }

    public ee0 Q(List list) {
        ee0 ee0Var;
        HashMap map = (HashMap) this.b;
        ArrayList arrayListO = o(list);
        if (arrayListO.size() < 2) {
            return (ee0) gx1.I(arrayListO, null);
        }
        Collections.sort(arrayListO, new di(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((ee0) arrayListO.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListO.size()) {
                break;
            }
            ee0 ee0Var2 = (ee0) arrayListO.get(i3);
            if (i2 == ee0Var2.c) {
                arrayList.add(new Pair(ee0Var2.b, Integer.valueOf(ee0Var2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (ee0) arrayListO.get(0);
            }
        }
        ee0 ee0Var3 = (ee0) map.get(arrayList);
        if (ee0Var3 != null) {
            return ee0Var3;
        }
        List listSubList = arrayListO.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((ee0) listSubList.get(i5)).d;
        }
        int iNextInt = ((Random) this.e).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                ee0Var = (ee0) gx1.L(listSubList);
                break;
            }
            ee0Var = (ee0) listSubList.get(i);
            i6 += ee0Var.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        map.put(arrayList, ee0Var);
        return ee0Var;
    }

    public void R(Intent intent) {
        synchronized (((HashMap) this.c)) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.b).getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.d).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle S(String str, Bundle bundle) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void T(mx7 mx7Var) {
        if (((ay7) this.c) == ay7.b) {
            ym5 ym5Var = (ym5) this.b;
            if (ym5Var == null) {
                gp.j("layoutCoordinates not set");
                return;
            }
            rw1.j0(mx7Var, ym5Var.P(0L), new by7((cy7) this.e, 1), true);
        }
        this.c = ay7.c;
    }

    public void U(vq9 vq9Var) {
        vq9Var.getClass();
        Runnable vc6Var = new vc6(13, this, vq9Var);
        synchronized (this.d) {
        }
        ((Handler) ((uf4) this.b).b).postDelayed(vc6Var, 5400000L);
    }

    @Override // defpackage.pk9
    public ag9 b() {
        return (kj2) this.e;
    }

    @Override // defpackage.pk9
    public il9 c() {
        return (lj2) this.d;
    }

    @Override // defpackage.pk9
    public void cancel() throws IOException {
        ((Socket) this.b).close();
    }

    public void d(f94 f94Var) {
        if (((ArrayList) this.e).contains(f94Var)) {
            w58.s(f94Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.e)) {
            ((ArrayList) this.e).add(f94Var);
        }
        f94Var.w = true;
    }

    public long f(vo voVar, vo voVar2, vo voVar3) {
        int iB = voVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((wo) this.b).get(i).c(voVar.a(i), voVar2.a(i), voVar3.a(i)));
        }
        return jMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r18v0, types: [s16] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, lc3] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.Map r19, defpackage.jt1 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.g(java.util.Map, jt1):java.lang.Object");
    }

    @Override // defpackage.r58
    public Object get() {
        return new fz3((gy3) ((kg2) this.b).a, (j69) ((q58) this.c).get(), (jx1) ((q58) this.d).get(), (h69) ((q58) this.e).get());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:259|335|(1:337)|338|340|(1:342)(3:343|(1:344)|346)|347|(1:349)(1:351)|350|352|479|353|477|354|355|(5:366|325|(2:327|(2:329|(2:331|(1:333)(16:334|335|(0)|338|340|(0)(0)|347|(0)(0)|350|352|479|353|477|354|355|(1:367)(0)))(13:339|340|(0)(0)|347|(0)(0)|350|352|479|353|477|354|355|(0)(0)))(2:368|369))(8:370|(1:372)(2:373|(2:376|(4:377|(1:379)|380|(1:533)(1:413))))|382|(1:384)(1:385)|386|(8:388|489|389|(1:391)|503|395|396|(1:406))|407|(3:410|411|412))|409|550)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:358|359|487|360|364) */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0bff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0c01, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0c03, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0c07, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0c08, code lost:
    
        i12.r(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0c0b, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025c  */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r3v22, types: [a82, java.lang.Object, java.lang.String, java.util.Iterator, java.util.List, qy2, zn7, zx2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:334:0x0ae8 -> B:335:0x0b05). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:339:0x0b31 -> B:340:0x0b51). Please report as a decompilation issue!!! */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r77, java.util.Map r78, defpackage.kt1 r79) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.h(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.pv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.jt1 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.i(jt1):java.lang.Object");
    }

    public void l(w37 w37Var) {
        if (((LinkedHashSet) this.e).add(w37Var)) {
            ((x37) this.c).a(this, w37Var, -1);
        }
    }

    public vo m(long j, vo voVar, vo voVar2, vo voVar3) {
        if (((vo) this.d) == null) {
            this.d = voVar3.c();
        }
        vo voVar4 = (vo) this.d;
        if (voVar4 == null) {
            lc5.i0("velocityVector");
            throw null;
        }
        int iB = voVar4.b();
        int i = 0;
        while (true) {
            vo voVar5 = (vo) this.d;
            if (i >= iB) {
                if (voVar5 != null) {
                    return voVar5;
                }
                lc5.i0("velocityVector");
                throw null;
            }
            if (voVar5 == null) {
                lc5.i0("velocityVector");
                throw null;
            }
            voVar5.e(i, ((wo) this.b).get(i).b(j, voVar.a(i), voVar2.a(i), voVar3.a(i)));
            i++;
        }
    }

    public void n(ne7 ne7Var, int i) {
        if (i != 1 && i != 0) {
            gp.k(dx1.f(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.e).add(ne7Var)) {
            ((x37) this.c).a(this, ne7Var, i);
        }
    }

    public ArrayList o(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.c;
        O(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.d;
        O(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ee0 ee0Var = (ee0) list.get(i);
            if (!map.containsKey(ee0Var.b) && !map2.containsKey(Integer.valueOf(ee0Var.c))) {
                arrayList.add(ee0Var);
            }
        }
        return arrayList;
    }

    public void p(vq9 vq9Var) {
        Runnable runnable;
        vq9Var.getClass();
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.e).remove(vq9Var);
        }
        if (runnable != null) {
            ((Handler) ((uf4) this.b).b).removeCallbacks(runnable);
        }
    }

    public void q(w37 w37Var, p37 p37Var) {
        x37 x37Var = (x37) this.c;
        x37Var.getClass();
        if (x37Var.g != 0) {
            return;
        }
        r37 r37VarC = x37Var.c(-1);
        x37Var.f = r37VarC;
        x37Var.g = -1;
        x37Var.h = w37Var;
        if (p37Var != null) {
            if (r37VarC != null) {
                r37VarC.d = new a47(p37Var, -1);
                r37VarC.d(p37Var);
            }
            fr9 fr9Var = x37Var.a;
            a47 a47Var = new a47(p37Var, -1);
            fr9Var.getClass();
            fr9Var.l(null, a47Var);
        }
    }

    public void r(mx7 mx7Var, boolean z) {
        cy7 cy7Var = (cy7) this.e;
        List list = mx7Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ux7) list.get(i)).b()) {
                T(mx7Var);
                return;
            }
        }
        ym5 ym5Var = (ym5) this.b;
        if (ym5Var == null) {
            gp.j("layoutCoordinates not set");
            return;
        }
        rw1.j0(mx7Var, ym5Var.P(0L), new sh(12, this, cy7Var), false);
        if (((ay7) this.c) == ay7.b) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ux7) list.get(i2)).a();
                }
            }
            lnc lncVar = mx7Var.b;
            if (lncVar != null) {
                lncVar.a = !cy7Var.c;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(defpackage.kt1 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.e
            a52 r0 = (a52) r0
            boolean r1 = r7 instanceof defpackage.j42
            if (r1 == 0) goto L17
            r1 = r7
            j42 r1 = (defpackage.j42) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c = r2
            goto L1c
        L17:
            j42 r1 = new j42
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.e11.e0(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r3
        L33:
            defpackage.e11.e0(r7)
            goto L68
        L37:
            defpackage.e11.e0(r7)
            java.lang.Object r7 = r6.d
            java.util.List r7 = (java.util.List) r7
            xx1 r2 = defpackage.xx1.a
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            ra5 r7 = r0.h()
            m42 r5 = new m42
            r5.<init>(r0, r6, r3)
            r1.c = r4
            java.lang.Object r7 = r7.c(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            o32 r7 = (defpackage.o32) r7
            goto L6a
        L5e:
            r1.c = r5
            r6 = 0
            java.lang.Object r7 = a52.g(r0, r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            o32 r7 = (defpackage.o32) r7
        L6a:
            zc r6 = r0.h
            r6.b(r7)
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.s(kt1):java.lang.Object");
    }

    public String toString() {
        switch (this.a) {
            case 7:
                String string = ((Socket) this.b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public vo u(long j, vo voVar, vo voVar2, vo voVar3) {
        if (((vo) this.c) == null) {
            this.c = voVar.c();
        }
        vo voVar4 = (vo) this.c;
        if (voVar4 == null) {
            lc5.i0("valueVector");
            throw null;
        }
        int iB = voVar4.b();
        int i = 0;
        while (true) {
            vo voVar5 = (vo) this.c;
            if (i >= iB) {
                if (voVar5 != null) {
                    return voVar5;
                }
                lc5.i0("valueVector");
                throw null;
            }
            if (voVar5 == null) {
                lc5.i0("valueVector");
                throw null;
            }
            voVar5.e(i, ((wo) this.b).get(i).e(j, voVar.a(i), voVar2.a(i), voVar3.a(i)));
            i++;
        }
    }

    public vo v(vo voVar, vo voVar2, vo voVar3) {
        if (((vo) this.e) == null) {
            this.e = voVar3.c();
        }
        vo voVar4 = (vo) this.e;
        if (voVar4 == null) {
            lc5.i0("endVelocityVector");
            throw null;
        }
        int iB = voVar4.b();
        int i = 0;
        while (true) {
            vo voVar5 = (vo) this.e;
            if (i >= iB) {
                if (voVar5 != null) {
                    return voVar5;
                }
                lc5.i0("endVelocityVector");
                throw null;
            }
            if (voVar5 == null) {
                lc5.i0("endVelocityVector");
                throw null;
            }
            voVar5.e(i, ((wo) this.b).get(i).d(voVar.a(i), voVar2.a(i), voVar3.a(i)));
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(byte[] r33, int r34, int r35, a0a r36, eq1 r37) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s16.w(byte[], int, int, a0a, eq1):void");
    }

    public f94 x(String str) {
        aa4 aa4Var = (aa4) ((HashMap) this.c).get(str);
        if (aa4Var != null) {
            return aa4Var.c;
        }
        return null;
    }

    public f94 y(String str) {
        for (aa4 aa4Var : ((HashMap) this.c).values()) {
            if (aa4Var != null) {
                f94 f94VarY = aa4Var.c;
                if (!str.equals(f94VarY.e)) {
                    f94VarY = f94VarY.H.c.y(str);
                }
                if (f94VarY != null) {
                    return f94VarY;
                }
            }
        }
        return null;
    }

    public ArrayList z() {
        ArrayList arrayList = new ArrayList();
        for (aa4 aa4Var : ((HashMap) this.c).values()) {
            if (aa4Var != null) {
                arrayList.add(aa4Var);
            }
        }
        return arrayList;
    }

    public /* synthetic */ s16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s16(String str, at3 at3Var, String str2, byte[] bArr, String str3, String str4) {
        this.a = 9;
        this.b = at3Var;
        this.c = str2;
        this.d = bArr;
        this.e = str3;
    }

    public s16(String str, m62 m62Var, int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = str;
                this.c = m62Var;
                this.d = u07.a();
                break;
            default:
                this.b = str;
                this.c = m62Var;
                this.d = u07.a();
                break;
        }
    }

    public s16(vx1 vx1Var, f0 f0Var, kx1 kx1Var, et1 et1Var) {
        this.a = 24;
        this.b = vx1Var;
        this.c = et1Var;
        this.d = vm7.c(Integer.MAX_VALUE, 6, null);
        this.e = new uf4(5);
        yd5 yd5Var = (yd5) vx1Var.q().get(s00.s);
        if (yd5Var != null) {
            yd5Var.invokeOnCompletion(new fb3(27, f0Var, this, kx1Var));
        }
    }

    public s16(String str, m62 m62Var, m76 m76Var) {
        this.a = 8;
        this.b = str;
        this.c = m62Var;
        this.d = m76Var;
        this.e = new d6a(new uk2(this, 3));
    }

    public s16(zk4 zk4Var, ev8 ev8Var, a91 a91Var, rm7 rm7Var) {
        this.a = 21;
        zk4Var.getClass();
        ev8Var.getClass();
        this.b = zk4Var;
        this.c = ev8Var;
        this.d = a91Var;
        this.e = rm7Var;
        rh5.a(a91Var);
    }

    public s16(nc1 nc1Var) {
        this.a = 1;
        this.b = nc1Var;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.c = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = concurrentHashMap;
        ov9 ov9Var = t;
        ev8 ev8Var = new ev8(ov9Var, "_root_", null, nc1Var, 8);
        this.e = ev8Var;
        setNewSetFromMap.add(ov9Var);
        concurrentHashMap.put("_root_", ev8Var);
    }

    public s16(Socket socket) {
        this.a = 7;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new lj2(this);
        this.e = new kj2(this);
    }

    public s16(cy7 cy7Var) {
        this.a = 19;
        this.e = cy7Var;
        this.c = ay7.a;
    }

    public s16(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            case 11:
                this.e = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 14:
                final zn7 zn7VarF = zn7.f(qu1.d0(gx3.a), "analyzer");
                final int i2 = 0;
                this.b = new d6a(new ib4(this) { // from class: d17
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i3 = i2;
                        zn7 zn7Var = zn7VarF;
                        switch (i3) {
                            case 0:
                                return s16.J(zn7.f(zn7Var, "phienam.txt"));
                            case 1:
                                return s16.J(zn7.f(zn7Var, "ho.txt"));
                            case 2:
                                return s16.J(zn7.f(zn7Var, "nhanxung.txt"));
                            default:
                                return s16.J(zn7.f(zn7Var, "loc.txt"));
                        }
                    }
                });
                final int i3 = 1;
                this.c = new d6a(new ib4(this) { // from class: d17
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i32 = i3;
                        zn7 zn7Var = zn7VarF;
                        switch (i32) {
                            case 0:
                                return s16.J(zn7.f(zn7Var, "phienam.txt"));
                            case 1:
                                return s16.J(zn7.f(zn7Var, "ho.txt"));
                            case 2:
                                return s16.J(zn7.f(zn7Var, "nhanxung.txt"));
                            default:
                                return s16.J(zn7.f(zn7Var, "loc.txt"));
                        }
                    }
                });
                final int i4 = 2;
                this.d = new d6a(new ib4(this) { // from class: d17
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i32 = i4;
                        zn7 zn7Var = zn7VarF;
                        switch (i32) {
                            case 0:
                                return s16.J(zn7.f(zn7Var, "phienam.txt"));
                            case 1:
                                return s16.J(zn7.f(zn7Var, "ho.txt"));
                            case 2:
                                return s16.J(zn7.f(zn7Var, "nhanxung.txt"));
                            default:
                                return s16.J(zn7.f(zn7Var, "loc.txt"));
                        }
                    }
                });
                final int i5 = 3;
                this.e = new d6a(new ib4(this) { // from class: d17
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i32 = i5;
                        zn7 zn7Var = zn7VarF;
                        switch (i32) {
                            case 0:
                                return s16.J(zn7.f(zn7Var, "phienam.txt"));
                            case 1:
                                return s16.J(zn7.f(zn7Var, "ho.txt"));
                            case 2:
                                return s16.J(zn7.f(zn7Var, "nhanxung.txt"));
                            default:
                                return s16.J(zn7.f(zn7Var, "loc.txt"));
                        }
                    }
                });
                break;
            case 18:
                this.b = new hn7();
                this.c = new hn7();
                this.d = new ds7();
                break;
            case 22:
                this.b = new HashSet();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                this.e = new LinkedHashMap();
                break;
            default:
                Random random = new Random();
                this.b = new HashMap();
                this.e = random;
                this.c = new HashMap();
                this.d = new HashMap();
                break;
        }
    }

    public s16(y5 y5Var) {
        this.a = 16;
        this.b = y5Var;
        this.c = new x37();
        new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
    }

    public s16(uf4 uf4Var, wo9 wo9Var) {
        this.a = 26;
        uf4Var.getClass();
        this.b = uf4Var;
        this.c = wo9Var;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public s16(Context context, int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = context.getApplicationContext();
                this.c = x15.o;
                this.d = null;
                this.e = new ps3();
                break;
            default:
                this.c = new HashMap();
                this.d = new HashMap();
                this.e = new ArrayList();
                this.b = context;
                new vz(this, context.getMainLooper(), 1);
                break;
        }
    }

    public s16(hh8 hh8Var, j17 j17Var, j17 j17Var2, j17 j17Var3) {
        Object objL;
        this.a = 15;
        if (hh8Var != null) {
            objL = a55.l(hh8Var);
        } else {
            w45 w45Var = a55.b;
            objL = hh8.e;
        }
        this.b = objL;
        this.c = j17Var;
        this.d = j17Var2;
        this.e = j17Var3;
    }

    public s16(a52 a52Var, List list) {
        this.a = 6;
        this.e = a52Var;
        this.b = u07.a();
        this.c = p7c.d();
        this.d = fc1.Z0(list);
    }

    public s16(long j, long j2, long j3) {
        this.a = 25;
        this.b = dk9.x(new fg9(j));
        this.c = dk9.x(new eb7(j2));
        this.d = dk9.x(new eb7(j3));
        this.e = dk9.x(new eb7(j2));
    }

    public s16(AudioTrack audioTrack, uf4 uf4Var) {
        this.a = 2;
        this.b = audioTrack;
        this.c = uf4Var;
        Handler handlerP = hjb.p((Handler.Callback) null);
        this.d = handlerP;
        k20 k20Var = new k20(this);
        this.e = k20Var;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) k20Var, handlerP);
    }

    public s16(wo woVar) {
        this.a = 29;
        this.b = woVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s16(y04 y04Var) {
        this((wo) new uc6(y04Var));
        this.a = 29;
    }

    public s16(a2b a2bVar, boolean[] zArr) {
        this.a = 20;
        this.b = a2bVar;
        this.c = zArr;
        int i = a2bVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
