package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fx3 implements ht3 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object s;
    public final Object t;

    public fx3(Context context) {
        String string;
        this.a = 0;
        String str = ((m70) f38.a.b(context)).a;
        this.b = str;
        File filesDir = context.getFilesDir();
        this.c = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? gc1.g0(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        d(file);
        this.d = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.e = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.f = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.s = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.t = file5;
    }

    public static synchronized void d(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean e(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static List f(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.c, str);
        if (file.exists() && e(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public Object b() {
        Map map = (Map) ((on1) this.s).e(vs4.a);
        if (map != null) {
            return map.get(aw4.a);
        }
        return null;
    }

    public File c(String str, String str2) {
        File file = new File((File) this.e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void g(String str) {
        r00 r00Var = (r00) this.f;
        synchronized (r00Var) {
            try {
                if (((bk5) ((AtomicMarkableReference) r00Var.b).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) r00Var.b;
                    atomicMarkableReference.set((bk5) atomicMarkableReference.getReference(), true);
                    po8 po8Var = new po8(r00Var, 5);
                    AtomicReference atomicReference = (AtomicReference) r00Var.c;
                    while (!atomicReference.compareAndSet(null, po8Var)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((f02) ((y91) ((fx3) r00Var.d).d).c).a(po8Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r58
    public Object get() {
        return new sa9((j69) ((q58) this.b).get(), (n59) ((q58) this.c).get(), (m59) ((q58) this.d).get(), (iua) ((q58) this.e).get(), (h42) ((q58) this.f).get(), (d38) ((q58) this.s).get(), (jx1) ((q58) this.t).get());
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "HttpRequestData(url=" + ((ngb) this.b) + ", method=" + ((gu4) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public fx3(q58 q58Var, q58 q58Var2, q58 q58Var3, q58 q58Var4, q58 q58Var5, q58 q58Var6, q58 q58Var7) {
        this.a = 2;
        this.b = q58Var;
        this.c = q58Var2;
        this.d = q58Var3;
        this.e = q58Var4;
        this.f = q58Var5;
        this.s = q58Var6;
        this.t = q58Var7;
    }

    public fx3(String str, fx3 fx3Var, y91 y91Var) {
        this.a = 3;
        this.e = new r00(this, false);
        this.f = new r00(this, true);
        this.s = new ii1(11, (byte) 0);
        this.t = new AtomicMarkableReference(null, false);
        this.b = str;
        this.c = new jg6(fx3Var);
        this.d = y91Var;
    }

    public fx3(ngb ngbVar, gu4 gu4Var, ik4 ik4Var, wh7 wh7Var, o0a o0aVar, on1 on1Var) {
        Object objKeySet;
        this.a = 1;
        gu4Var.getClass();
        o0aVar.getClass();
        on1Var.getClass();
        this.b = ngbVar;
        this.c = gu4Var;
        this.d = ik4Var;
        this.e = wh7Var;
        this.f = o0aVar;
        this.s = on1Var;
        Map map = (Map) on1Var.e(vs4.a);
        this.t = (map == null || (objKeySet = map.keySet()) == null) ? sc3.a : objKeySet;
    }
}
