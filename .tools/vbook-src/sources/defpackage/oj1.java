package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oj1 implements bj1, b0a, it3 {
    public static final mj1 t = new mj1(0);
    public static final byte[] u = {0, 7, 8, 15};
    public static final byte[] v = {0, 119, -120, -1};
    public static final byte[] w = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object s;

    public oj1(ArrayList arrayList, ArrayList arrayList2, hj1 hj1Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        ug3 ug3Var = new ug3();
        this.e = ug3Var;
        this.s = hj1Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(ni1.c(ug3Var, ug3.class, ez9.class, o68.class));
        int i = 0;
        arrayList3.add(ni1.c(this, oj1.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ni1 ni1Var = (ni1) obj;
            if (ni1Var != null) {
                arrayList3.add(ni1Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((s58) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((hj1) this.s).a(componentRegistrar));
                        it.remove();
                    }
                } catch (xc5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((ni1) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                tw1.K(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                tw1.K(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                ni1 ni1Var2 = (ni1) obj4;
                ((HashMap) this.a).put(ni1Var2, new ep5(new nj1(i, this, ni1Var2)));
            }
            arrayList5.addAll(z(arrayList3));
            arrayList5.addAll(A());
            y();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            n((HashMap) this.a, bool.booleanValue());
        }
    }

    public static c70 h(c70 c70Var, c85 c85Var, fx3 fx3Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        b70 b70VarA = c70Var.a();
        String strC = ((nw3) c85Var.b).c();
        if (strC != null) {
            b70VarA.e = new p70(strC);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        r00 r00Var = (r00) fx3Var.e;
        if (zIsEmpty) {
            bk5 bk5Var = (bk5) ((AtomicMarkableReference) r00Var.b).getReference();
            synchronized (bk5Var) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(bk5Var.a));
            }
        } else {
            bk5 bk5Var2 = (bk5) ((AtomicMarkableReference) r00Var.b).getReference();
            synchronized (bk5Var2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(bk5Var2.a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = bk5.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, bk5.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listR = r(mapUnmodifiableMap2);
        bk5 bk5Var3 = (bk5) ((AtomicMarkableReference) ((r00) fx3Var.f).b).getReference();
        synchronized (bk5Var3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(bk5Var3.a));
        }
        List listR2 = r(mapUnmodifiableMap3);
        if (!listR.isEmpty() || !listR2.isEmpty()) {
            d70 d70Var = (d70) c70Var.c;
            b70VarA.c = new d70(d70Var.a, listR, listR2, d70Var.d, d70Var.e, d70Var.f, d70Var.g);
        }
        return b70VarA.a();
    }

    public static vz1 i(c70 c70Var, fx3 fx3Var) {
        List listUnmodifiableList;
        ii1 ii1Var = (ii1) fx3Var.s;
        synchronized (ii1Var) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) ii1Var.c));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            vo8 vo8Var = (vo8) listUnmodifiableList.get(i);
            vo8Var.getClass();
            q70 q70Var = new q70();
            s80 s80Var = (s80) vo8Var;
            String str = s80Var.e;
            if (str == null) {
                k27.n("Null variantId");
                return null;
            }
            String str2 = s80Var.b;
            if (str2 == null) {
                k27.n("Null rolloutId");
                return null;
            }
            q70Var.a = new s70(str2, str);
            String str3 = s80Var.c;
            if (str3 == null) {
                k27.n("Null parameterKey");
                return null;
            }
            q70Var.b = str3;
            q70Var.c = s80Var.d;
            q70Var.d = s80Var.f;
            q70Var.e = (byte) (q70Var.e | 1);
            arrayList.add(q70Var.a());
        }
        if (arrayList.isEmpty()) {
            return c70Var;
        }
        b70 b70VarA = c70Var.a();
        b70VarA.f = new t70(arrayList);
        return b70VarA.a();
    }

    public static byte[] k(int i, int i2, y01 y01Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) y01Var.g(i2);
        }
        return bArr;
    }

    public static String l(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public static oj1 m(Context context, yx4 yx4Var, fx3 fx3Var, ht htVar, c85 c85Var, fx3 fx3Var2, ab6 ab6Var, k80 k80Var, ab6 ab6Var2, py1 py1Var, y91 y91Var) {
        a02 a02Var = new a02(context, yx4Var, htVar, ab6Var, k80Var);
        c02 c02Var = new c02(fx3Var, k80Var, py1Var);
        b02 b02Var = i62.b;
        g6b.b(context);
        return new oj1(a02Var, c02Var, new i62(new bk8(g6b.a().c(new zv0(i62.c, i62.d)).a("FIREBASE_CRASHLYTICS_REPORT", new bd3("json"), i62.e), k80Var.c(), ab6Var2)), c85Var, fx3Var2, yx4Var, y91Var);
    }

    public static int[] o() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = q(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = Token.SWITCH;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = q(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] p() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = q(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & Token.WITH;
                if (i2 == 0) {
                    iArr[i] = q(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = q(Token.SWITCH, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = q(255, ((i & 1) != 0 ? 43 : 0) + Token.SWITCH + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + Token.SWITCH + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + Token.SWITCH + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = q(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int q(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static List r(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                k27.n("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                k27.n("Null value");
                return null;
            }
            arrayList.add(new s60(str, str2));
        }
        Collections.sort(arrayList, new di(22));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj1.t(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static p63 u(y01 y01Var, int i) {
        int iG;
        int i2;
        int iG2;
        int iG3;
        int iG4;
        int i3 = 8;
        int iG5 = y01Var.g(8);
        y01Var.o(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrO = o();
        int[] iArrP = p();
        while (i5 > 0) {
            int iG6 = y01Var.g(i3);
            int iG7 = y01Var.g(i3);
            int[] iArr2 = (iG7 & Token.CASE) != 0 ? iArr : (iG7 & 64) != 0 ? iArrO : iArrP;
            if ((iG7 & 1) != 0) {
                iG3 = y01Var.g(i3);
                iG4 = y01Var.g(i3);
                iG = y01Var.g(i3);
                iG2 = y01Var.g(i3);
                i2 = i5 - 6;
            } else {
                int iG8 = y01Var.g(6) << i4;
                int iG9 = y01Var.g(4) << 4;
                iG = y01Var.g(4) << 4;
                i2 = i5 - 4;
                iG2 = y01Var.g(i4) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i6;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr2[iG6] = q((byte) (255 - (iG2 & 255)), hjb.i((int) ((1.402d * d2) + d), 0, 255), hjb.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), hjb.i((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iG5 = iG5;
            iArrP = iArrP;
            i3 = 8;
            i4 = 2;
        }
        return new p63(iG5, iArr, iArrO, iArrP);
    }

    public static r63 v(y01 y01Var) {
        byte[] bArr;
        int iG = y01Var.g(16);
        y01Var.o(4);
        int iG2 = y01Var.g(2);
        boolean zF = y01Var.f();
        y01Var.o(1);
        byte[] bArr2 = hjb.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = y01Var.g(16);
                int iG4 = y01Var.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    y01Var.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    y01Var.j(iG4, bArr);
                }
            }
            return new r63(iG, zF, bArr2, bArr);
        }
        y01Var.o(y01Var.g(8) * 16);
        bArr = bArr2;
        return new r63(iG, zF, bArr2, bArr);
    }

    public ArrayList A() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            ni1 ni1Var = (ni1) entry.getKey();
            if (ni1Var.e != 0) {
                s58 s58Var = (s58) entry.getValue();
                for (oa8 oa8Var : ni1Var.b) {
                    if (!map2.containsKey(oa8Var)) {
                        map2.put(oa8Var, new HashSet());
                    }
                    ((Set) map2.get(oa8Var)).add(s58Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                au5 au5Var = (au5) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new g8(14, au5Var, (s58) it.next()));
                }
            } else {
                oa8 oa8Var2 = (oa8) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                au5 au5Var2 = new au5();
                au5Var2.b = null;
                au5Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                au5Var2.a.addAll(set);
                map.put(oa8Var2, au5Var2);
            }
        }
        return arrayList;
    }

    public Task B(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList arrayListB = ((c02) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                b02 b02Var = c02.g;
                String strE = c02.e(file);
                b02Var.getClass();
                arrayList.add(new o60(b02.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            o60 o60Var = (o60) obj;
            if (str == null || str.equals(o60Var.b)) {
                i62 i62Var = (i62) this.c;
                n60 n60Var = o60Var.a;
                if (n60Var.f == null || n60Var.g == null) {
                    wy3 wy3VarB = ((yx4) this.f).b(true);
                    n60 n60Var2 = o60Var.a;
                    String str2 = wy3VarB.a;
                    m60 m60VarA = n60Var2.a();
                    m60VarA.e = str2;
                    n60 n60VarA = m60VarA.a();
                    String str3 = wy3VarB.b;
                    m60 m60VarA2 = n60VarA.a();
                    m60VarA2.f = str3;
                    o60Var = new o60(m60VarA2.a(), o60Var.b, o60Var.c);
                }
                boolean z = str != null;
                bk8 bk8Var = i62Var.a;
                synchronized (bk8Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) bk8Var.i.b).getAndIncrement();
                            if (bk8Var.f.size() < bk8Var.e) {
                                js8 js8Var = js8.f;
                                js8Var.m("Enqueueing report: " + o60Var.b);
                                js8Var.m("Queue size: " + bk8Var.f.size());
                                bk8Var.g.execute(new ak8(0, bk8Var, o60Var, taskCompletionSource));
                                js8Var.m("Closing task for report: " + o60Var.b);
                                taskCompletionSource.trySetResult(o60Var);
                            } else {
                                bk8Var.a();
                                String str4 = "Dropping report due to queue being full: " + o60Var.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) bk8Var.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(o60Var);
                            }
                        } else {
                            bk8Var.b(o60Var, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new w58(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public int C() {
        return 2;
    }

    public synchronized s58 d(oa8 oa8Var) {
        au5 au5Var = (au5) ((HashMap) this.c).get(oa8Var);
        if (au5Var != null) {
            return au5Var;
        }
        return t;
    }

    public eh7 e(oa8 oa8Var) {
        s58 s58VarF = f(oa8Var);
        return s58VarF == null ? new eh7(eh7.c, eh7.d) : s58VarF instanceof eh7 ? (eh7) s58VarF : new eh7(null, s58VarF);
    }

    public synchronized s58 f(oa8 oa8Var) {
        gx1.y(oa8Var, "Null interface requested.");
        return (s58) ((HashMap) this.b).get(oa8Var);
    }

    public Object get() {
        Context context = (Context) ((r58) this.a).get();
        ng6 ng6Var = (ng6) ((r58) this.b).get();
        br8 br8Var = (br8) ((r58) this.c).get();
        be5 be5Var = (be5) ((be5) this.d).get();
        Executor executor = (Executor) ((r58) this.e).get();
        br8 br8Var2 = (br8) ((r58) this.f).get();
        am7 am7Var = new am7(7);
        bv7 bv7Var = new bv7(6);
        br8 br8Var3 = (br8) ((r58) this.s).get();
        k80 k80Var = new k80();
        k80Var.b = context;
        k80Var.c = ng6Var;
        k80Var.d = br8Var;
        k80Var.e = be5Var;
        k80Var.f = executor;
        k80Var.g = br8Var2;
        k80Var.a = am7Var;
        k80Var.h = bv7Var;
        k80Var.i = br8Var3;
        return k80Var;
    }

    public void n(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            ni1 ni1Var = (ni1) entry.getKey();
            s58 s58Var = (s58) entry.getValue();
            int i = ni1Var.d;
            if (i == 1 || (i == 2 && z)) {
                s58Var.get();
            }
        }
        ug3 ug3Var = (ug3) this.e;
        synchronized (ug3Var) {
            try {
                arrayDeque = ug3Var.b;
                if (arrayDeque != null) {
                    ug3Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw j39.h(it);
            }
        }
    }

    public void reset() {
        v63 v63Var = (v63) this.f;
        v63Var.c.clear();
        v63Var.d.clear();
        v63Var.e.clear();
        v63Var.f.clear();
        v63Var.g.clear();
        v63Var.h = null;
        v63Var.i = null;
    }

    public void s(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.a);
        }
        n(map, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(byte[] r44, int r45, int r46, a0a r47, eq1 r48) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj1.w(byte[], int, int, a0a, eq1):void");
    }

    public void x(Throwable th, Thread thread, String str, hh3 hh3Var, boolean z) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        boolean zEquals = str.equals("crash");
        a02 a02Var = (a02) this.a;
        long j = hh3Var.b;
        Context context = a02Var.a;
        int i = context.getResources().getConfiguration().orientation;
        ab6 ab6Var = a02Var.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        s16 s16Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            s16Var = new s16(th2.getLocalizedMessage(), th2.getClass().getName(), ab6Var.j(th2.getStackTrace()), s16Var, 27);
        }
        s16 s16Var2 = s16Var;
        b70 b70Var = new b70();
        b70Var.b = str;
        b70Var.a = j;
        b70Var.g = (byte) (b70Var.g | 1);
        oz1 oz1VarB = f38.a.b(context);
        int i2 = ((m70) oz1VarB).c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListA = f38.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) s16Var2.d;
        String name = thread.getName();
        if (name == null) {
            k27.n("Null name");
            return;
        }
        List listD = a02.d(stackTraceElementArr, 4);
        if (listD == null) {
            k27.n("Null frames");
            return;
        }
        arrayList.add(new i70(name, 4, listD));
        if (z) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                } else {
                    StackTraceElement[] stackTraceElementArrJ = ab6Var.j(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        k27.n("Null name");
                        return;
                    }
                    it = it2;
                    List listD2 = a02.d(stackTraceElementArrJ, 0);
                    if (listD2 == null) {
                        k27.n("Null frames");
                        return;
                    }
                    arrayList.add(new i70(name2, 0, listD2));
                }
                it2 = it;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        g70 g70VarC = a02.c(s16Var2, 0);
        h70 h70VarE = a02.e();
        List listA = a02Var.a();
        if (listA == null) {
            k27.n("Null binaries");
            return;
        }
        b70Var.c = new d70(new e70(listUnmodifiableList, g70VarC, null, h70VarE, listA), null, null, boolValueOf, oz1VarB, arrayListA, i);
        b70Var.d = a02Var.b(i);
        c70 c70VarA = b70Var.a();
        Map map = hh3Var.c;
        c85 c85Var = (c85) this.d;
        fx3 fx3Var = (fx3) this.e;
        vz1 vz1VarI = i(h(c70VarA, c85Var, fx3Var, map), fx3Var);
        if (z) {
            ((c02) this.b).d(vz1VarI, hh3Var.a, zEquals);
        } else {
            ((f02) ((y91) this.s).c).a(new rj3(this, vz1VarI, hh3Var, zEquals));
        }
    }

    public void y() {
        HashMap map = (HashMap) this.b;
        HashMap map2 = (HashMap) this.c;
        for (ni1 ni1Var : ((HashMap) this.a).keySet()) {
            for (vn2 vn2Var : ni1Var.c) {
                boolean z = vn2Var.b == 2;
                oa8 oa8Var = vn2Var.a;
                if (z && !map2.containsKey(oa8Var)) {
                    Set set = Collections.EMPTY_SET;
                    au5 au5Var = new au5();
                    au5Var.b = null;
                    au5Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    au5Var.a.addAll(set);
                    map2.put(oa8Var, au5Var);
                } else if (map.containsKey(oa8Var)) {
                    continue;
                } else {
                    int i = vn2Var.b;
                    if (i == 1) {
                        throw new xn2("Unsatisfied dependency for component " + ni1Var + ": " + oa8Var);
                    }
                    if (i != 2) {
                        map.put(oa8Var, new eh7(eh7.c, eh7.d));
                    }
                }
            }
        }
    }

    public ArrayList z(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ni1 ni1Var = (ni1) obj;
            if (ni1Var.e == 0) {
                s58 s58Var = (s58) ((HashMap) this.a).get(ni1Var);
                for (oa8 oa8Var : ni1Var.b) {
                    if (map.containsKey(oa8Var)) {
                        arrayList2.add(new g8(13, (eh7) ((s58) map.get(oa8Var)), s58Var));
                    } else {
                        map.put(oa8Var, s58Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public /* synthetic */ oj1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.s = obj7;
    }

    public oj1(List list) {
        hn7 hn7Var = new hn7((byte[]) list.get(0));
        int iG = hn7Var.G();
        int iG2 = hn7Var.G();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new q63(719, 575, 0, 719, 0, 575);
        this.e = new p63(0, new int[]{0, -1, -16777216, -8421505}, o(), p());
        this.f = new v63(iG, iG2);
    }

    public oj1(Context context, sn1 sn1Var, u1c u1cVar, l38 l38Var, WorkDatabase workDatabase, d2c d2cVar, ArrayList arrayList) {
        context.getClass();
        l38Var.getClass();
        this.a = sn1Var;
        this.b = u1cVar;
        this.c = l38Var;
        this.d = workDatabase;
        this.e = d2cVar;
        this.f = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.s = applicationContext;
        new wo9(20);
    }
}
