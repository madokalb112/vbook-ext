package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gy3 {
    public static final Object k = new Object();
    public static final cw l = new cw(0);
    public final Context a;
    public final String b;
    public final dz3 c;
    public final oj1 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final ep5 g;
    public final s58 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public gy3(Context context, String str, dz3 dz3Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        ex1.z(str);
        this.b = str;
        this.c = dz3Var;
        v80 v80Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListW = new c85(context, new uf4(ComponentDiscoveryService.class, 11)).w();
        Trace.endSection();
        Trace.beginSection("Runtime");
        hdb hdbVar = hdb.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListW);
        int i = 1;
        arrayList.add(new ej1(new FirebaseCommonRegistrar(), i));
        arrayList.add(new ej1(new ExecutorsRegistrar(), i));
        arrayList2.add(ni1.c(context, Context.class, new Class[0]));
        arrayList2.add(ni1.c(this, gy3.class, new Class[0]));
        arrayList2.add(ni1.c(dz3Var, dz3.class, new Class[0]));
        zk4 zk4Var = new zk4(18);
        if (xg9.j(context) && FirebaseInitProvider.b.get()) {
            arrayList2.add(ni1.c(v80Var, v80.class, new Class[0]));
        }
        oj1 oj1Var = new oj1(arrayList, arrayList2, zk4Var);
        this.d = oj1Var;
        Trace.endSection();
        this.g = new ep5(new nj1(2, this, context));
        this.h = oj1Var.c(yg2.class);
        dy3 dy3Var = new dy3(this);
        a();
        if (atomicBoolean.get()) {
            wb0.e.a.get();
        }
        copyOnWriteArrayList.add(dy3Var);
        Trace.endSection();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                for (gy3 gy3Var : l.values()) {
                    gy3Var.a();
                    arrayList.add(gy3Var.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static gy3 c() {
        gy3 gy3Var;
        synchronized (k) {
            try {
                gy3Var = (gy3) l.get("[DEFAULT]");
                if (gy3Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + cr.q() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((yg2) gy3Var.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gy3Var;
    }

    public static gy3 d(String str) {
        gy3 gy3Var;
        String str2;
        synchronized (k) {
            try {
                gy3Var = (gy3) l.get(str.trim());
                if (gy3Var == null) {
                    ArrayList arrayListB = b();
                    if (arrayListB.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListB);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((yg2) gy3Var.h.get()).a();
            } finally {
            }
        }
        return gy3Var;
    }

    public static gy3 g(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                dz3 dz3VarA = dz3.a(context);
                if (dz3VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return h(context, dz3VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static gy3 h(Context context, dz3 dz3Var) {
        gy3 gy3Var;
        AtomicReference atomicReference = ey3.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = ey3.a;
            if (atomicReference2.get() == null) {
                ey3 ey3Var = new ey3();
                while (true) {
                    if (atomicReference2.compareAndSet(null, ey3Var)) {
                        wb0.b(application);
                        wb0.e.a(ey3Var);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            cw cwVar = l;
            ex1.E("FirebaseApp name [DEFAULT] already exists!", !cwVar.containsKey("[DEFAULT]"));
            ex1.D(context, "Application context cannot be null.");
            gy3Var = new gy3(context, "[DEFAULT]", dz3Var);
            cwVar.put("[DEFAULT]", gy3Var);
        }
        gy3Var.f();
        return gy3Var;
    }

    public final void a() {
        ex1.E("FirebaseApp was deleted", !this.f.get());
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gy3)) {
            return false;
        }
        gy3 gy3Var = (gy3) obj;
        gy3Var.a();
        return this.b.equals(gy3Var.b);
    }

    public final void f() {
        Context context = this.a;
        boolean zJ = xg9.j(context);
        String str = this.b;
        if (zJ) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            a();
            this.d.s("[DEFAULT]".equals(str));
            ((yg2) this.h.get()).a();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = fy3.b;
        if (atomicReference.get() == null) {
            fy3 fy3Var = new fy3(context);
            while (!atomicReference.compareAndSet(null, fy3Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(fy3Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        ab6 ab6Var = new ab6(this);
        ab6Var.m(this.b, "name");
        ab6Var.m(this.c, "options");
        return ab6Var.toString();
    }
}
