package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sy1 {
    public static final oy1 r = new oy1(1);
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final q32 b;
    public final c85 c;
    public final fx3 d;
    public final y91 e;
    public final yx4 f;
    public final fx3 g;
    public final ht h;
    public final c85 i;
    public final zy1 j;
    public final ba k;
    public final py1 l;
    public final oj1 m;
    public e02 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public sy1(Context context, yx4 yx4Var, q32 q32Var, fx3 fx3Var, c85 c85Var, ht htVar, fx3 fx3Var2, c85 c85Var2, oj1 oj1Var, zy1 zy1Var, ba baVar, py1 py1Var, y91 y91Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = yx4Var;
        this.b = q32Var;
        this.g = fx3Var;
        this.c = c85Var;
        this.h = htVar;
        this.d = fx3Var2;
        this.i = c85Var2;
        this.j = zy1Var;
        this.k = baVar;
        this.l = py1Var;
        this.m = oj1Var;
        this.e = y91Var;
    }

    public static Task a(sy1 sy1Var) {
        Task taskCall;
        sy1Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : fx3.f(((File) sy1Var.g.d).listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult((Object) null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new ry1(sy1Var, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05de  */
    /* JADX WARN: Type inference failed for: r0v7, types: [py1] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32, k80 r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy1.b(boolean, k80, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        Map mapUnmodifiableMap;
        List listUnmodifiableList;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strR = ky0.r("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strR, null);
        }
        Locale locale = Locale.US;
        yx4 yx4Var = this.f;
        ht htVar = this.h;
        x80 x80Var = new x80(yx4Var.c, htVar.f, htVar.g, yx4Var.c().a, ky0.a(htVar.d != null ? 4 : 1), htVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        z80 z80Var = new z80(gc1.X());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        mg1 mg1Var = mg1.a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            mg1 mg1Var2 = (mg1) mg1.b.get(str8.toLowerCase(locale));
            if (mg1Var2 != null) {
                mg1Var = mg1Var2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = mg1Var.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jK = gc1.K(context);
        boolean zW = gc1.W();
        int iQ = gc1.Q();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new w80(x80Var, z80Var, new y80(iOrdinal, iAvailableProcessors, jK, blockCount, zW, iQ)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            fx3 fx3Var = this.d;
            synchronized (((String) fx3Var.b)) {
                fx3Var.b = str;
                bk5 bk5Var = (bk5) ((AtomicMarkableReference) ((r00) fx3Var.e).b).getReference();
                synchronized (bk5Var) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(bk5Var.a));
                }
                ii1 ii1Var = (ii1) fx3Var.s;
                synchronized (ii1Var) {
                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) ii1Var.c));
                }
                str3 = str10;
                str5 = str9;
                str2 = str7;
                str4 = str11;
                i = 4;
                ((f02) ((y91) fx3Var.d).c).a(new zi2(fx3Var, str, mapUnmodifiableMap, listUnmodifiableList, 2));
            }
        }
        c85 c85Var = this.i;
        ((nw3) c85Var.b).b();
        c85Var.b = c85.c;
        if (str != null) {
            c85Var.b = new bb8(((fx3) c85Var.a).c(str, "userlog"));
        }
        this.l.a(str);
        oj1 oj1Var = this.m;
        a02 a02Var = (a02) oj1Var.a;
        Charset charset = zz1.a;
        m60 m60Var = new m60();
        m60Var.a = "20.0.5";
        ht htVar2 = a02Var.c;
        String str12 = htVar2.a;
        if (str12 == null) {
            k27.n("Null gmpAppId");
            return;
        }
        m60Var.b = str12;
        yx4 yx4Var2 = a02Var.b;
        String str13 = yx4Var2.c().a;
        if (str13 == null) {
            k27.n("Null installationUuid");
            return;
        }
        m60Var.d = str13;
        m60Var.e = yx4Var2.c().b;
        m60Var.f = yx4Var2.c().c;
        String str14 = htVar2.f;
        if (str14 == null) {
            k27.n("Null buildVersion");
            return;
        }
        m60Var.h = str14;
        String str15 = htVar2.g;
        if (str15 == null) {
            k27.n("Null displayVersion");
            return;
        }
        m60Var.i = str15;
        m60Var.c = i;
        m60Var.m = (byte) (m60Var.m | 1);
        v60 v60Var = new v60();
        v60Var.f = false;
        byte b = (byte) (v60Var.m | 2);
        v60Var.d = jCurrentTimeMillis;
        v60Var.m = (byte) (b | 1);
        if (str == null) {
            k27.n("Null identifier");
            return;
        }
        v60Var.b = str;
        String str16 = a02.g;
        if (str16 == null) {
            k27.n("Null generator");
            return;
        }
        v60Var.a = str16;
        String str17 = yx4Var2.c;
        if (str17 == null) {
            k27.n("Null identifier");
            return;
        }
        String str18 = yx4Var2.c().a;
        rg2 rg2Var = htVar2.h;
        if (((jr2) rg2Var.c) == null) {
            rg2Var.c = new jr2(rg2Var);
        }
        jr2 jr2Var = (jr2) rg2Var.c;
        String str19 = jr2Var.b;
        if (jr2Var == null) {
            rg2Var.c = new jr2(rg2Var);
        }
        v60Var.g = new x60(str17, str14, str15, str18, str19, ((jr2) rg2Var.c).c);
        u70 u70Var = new u70();
        u70Var.a = 3;
        u70Var.e = (byte) (u70Var.e | 1);
        if (str6 == null) {
            k27.n("Null version");
            return;
        }
        u70Var.b = str6;
        if (str2 == null) {
            k27.n("Null buildVersion");
            return;
        }
        u70Var.c = str2;
        u70Var.d = gc1.X();
        u70Var.e = (byte) (u70Var.e | 2);
        v60Var.i = u70Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) a02.f.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jK2 = gc1.K(a02Var.a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zW2 = gc1.W();
        int iQ2 = gc1.Q();
        z60 z60Var = new z60();
        z60Var.a = iIntValue;
        byte b2 = (byte) (z60Var.j | 1);
        z60Var.j = b2;
        if (str5 == null) {
            k27.n("Null model");
            return;
        }
        z60Var.b = str5;
        z60Var.c = iAvailableProcessors2;
        z60Var.d = jK2;
        z60Var.e = blockCount2;
        z60Var.f = zW2;
        z60Var.g = iQ2;
        z60Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            k27.n("Null manufacturer");
            return;
        }
        z60Var.h = str20;
        String str21 = str4;
        if (str21 == null) {
            k27.n("Null modelClass");
            return;
        }
        z60Var.i = str21;
        v60Var.j = z60Var.a();
        v60Var.l = 3;
        v60Var.m = (byte) (v60Var.m | 4);
        m60Var.j = v60Var.a();
        n60 n60VarA = m60Var.a();
        fx3 fx3Var2 = ((c02) oj1Var.b).b;
        yz1 yz1Var = n60VarA.k;
        if (yz1Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((w60) yz1Var).b;
        try {
            c02.g.getClass();
            c02.f(fx3Var2.c(str22, "report"), b02.a.p(n60VarA));
            File fileC = fx3Var2.c(str22, "start-time");
            long j = ((w60) yz1Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileC), c02.e);
            try {
                outputStreamWriter.write("");
                fileC.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String strR2 = ky0.r("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strR2, e);
            }
        }
    }

    public final boolean d(k80 k80Var) throws Throwable {
        y91.m();
        e02 e02Var = this.n;
        if (e02Var != null && e02Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, k80Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((c02) this.m.b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.a;
        int iT = gc1.T(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iT == 0 ? null : context.getResources().getString(iT);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = sy1.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = resourceAsStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                resourceAsStream.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            resourceAsStream.close();
            throw th;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.d.g(strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(Task task) {
        Task task2;
        Task taskK;
        TaskCompletionSource taskCompletionSource = this.o;
        fx3 fx3Var = ((c02) this.m.b).b;
        if (fx3.f(((File) fx3Var.f).listFiles()).isEmpty() && fx3.f(((File) fx3Var.s).listFiles()).isEmpty() && fx3.f(((File) fx3Var.t).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        js8 js8Var = js8.f;
        js8Var.v("Crash reports are available to be sent.");
        q32 q32Var = this.b;
        if (q32Var.j()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskK = Tasks.forResult(Boolean.TRUE);
        } else {
            js8Var.m("Automatic data collection is disabled.");
            js8Var.v("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (q32Var.c) {
                task2 = ((TaskCompletionSource) q32Var.d).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new wfc(19));
            js8Var.m("Waiting for send/deleteUnsentReports to be called.");
            taskK = t96.K(taskOnSuccessTask, this.p.getTask());
        }
        f02 f02Var = (f02) this.e.b;
        c85 c85Var = new c85();
        c85Var.b = this;
        c85Var.a = task;
        taskK.onSuccessTask(f02Var, c85Var);
    }
}
