package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zy3 implements az3 {
    public static final Object m = new Object();
    public final gy3 a;
    public final xy3 b;
    public final ab6 c;
    public final jjb d;
    public final ep5 e;
    public final wb8 f;
    public final Object g;
    public final ExecutorService h;
    public final k39 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public zy3(gy3 gy3Var, s58 s58Var, ExecutorService executorService, k39 k39Var) {
        gy3Var.a();
        xy3 xy3Var = new xy3(gy3Var.a, s58Var);
        ab6 ab6Var = new ab6(gy3Var);
        if (p38.b == null) {
            p38.b = new p38(4);
        }
        p38 p38Var = p38.b;
        if (jjb.c == null) {
            jjb.c = new jjb(p38Var);
        }
        jjb jjbVar = jjb.c;
        ep5 ep5Var = new ep5(new ej1(gy3Var, 2));
        wb8 wb8Var = new wb8();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = gy3Var;
        this.b = xy3Var;
        this.c = ab6Var;
        this.d = jjbVar;
        this.e = ep5Var;
        this.f = wb8Var;
        this.h = executorService;
        this.i = k39Var;
    }

    public static zy3 d() {
        gy3 gy3VarC = gy3.c();
        gy3VarC.a();
        return (zy3) gy3VarC.d.a(az3.class);
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        r80 r80VarA;
        int i;
        synchronized (m) {
            try {
                gy3 gy3Var = this.a;
                gy3Var.a();
                c85 c85VarP = c85.p(gy3Var.a);
                try {
                    r80VarA = this.c.A();
                    int i2 = r80VarA.b;
                    i = 2;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (z) {
                        String strG = g(r80VarA);
                        ab6 ab6Var = this.c;
                        q80 q80VarA = r80VarA.a();
                        q80VarA.a = strG;
                        q80VarA.b = 3;
                        r80VarA = q80VarA.a();
                        ab6Var.v(r80VarA);
                    }
                    if (c85VarP != null) {
                        c85VarP.C();
                    }
                } catch (Throwable th) {
                    if (c85VarP != null) {
                        c85VarP.C();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j(r80VarA);
        this.i.execute(new yy3(this, i));
    }

    public final r80 b(r80 r80Var) throws bz3 {
        int i;
        int responseCode;
        a90 a90Var;
        a90 a90VarF;
        xy3 xy3Var = this.b;
        gy3 gy3Var = this.a;
        gy3Var.a();
        String str = gy3Var.c.a;
        String str2 = r80Var.a;
        gy3 gy3Var2 = this.a;
        gy3Var2.a();
        String str3 = gy3Var2.c.g;
        String str4 = r80Var.d;
        r01 r01Var = xy3Var.c;
        if (!r01Var.a()) {
            throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = xy3.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i2 = 0; i2 <= 1; i2 = i + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = xy3Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    xy3.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    r01Var.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i = i2;
            }
            if (responseCode >= 200 && responseCode < 300) {
                a90VarF = xy3.f(httpURLConnectionC);
            } else {
                xy3.b(httpURLConnectionC, null, str, str3);
                i = i2;
                if (responseCode == 401 || responseCode == 404) {
                    if (((byte) (0 | 1)) != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    a90Var = new a90(null, 0L, 3);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    a90VarF = a90Var;
                } else {
                    if (responseCode == 429) {
                        throw new bz3("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        a90Var = new a90(null, 0L, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        a90VarF = a90Var;
                    }
                }
            }
            int iC = dx1.C(a90VarF.c);
            if (iC == 0) {
                String str5 = a90VarF.a;
                long j = a90VarF.b;
                this.d.a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                q80 q80VarA = r80Var.a();
                q80VarA.c = str5;
                q80VarA.e = j;
                byte b = (byte) (q80VarA.h | 1);
                q80VarA.f = jCurrentTimeMillis;
                q80VarA.h = (byte) (b | 2);
                return q80VarA.a();
            }
            if (iC == 1) {
                q80 q80VarA2 = r80Var.a();
                q80VarA2.g = "BAD CONFIG";
                q80VarA2.b = 5;
                return q80VarA2.a();
            }
            if (iC != 2) {
                throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            q80 q80VarA3 = r80Var.a();
            q80VarA3.b = 2;
            return q80VarA3.a();
        }
        throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        f();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pe4 pe4Var = new pe4(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(pe4Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new yy3(this, 0));
        return task;
    }

    public final Task e() {
        f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        oe4 oe4Var = new oe4(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(oe4Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new yy3(this, 1));
        return task;
    }

    public final void f() {
        gy3 gy3Var = this.a;
        gy3Var.a();
        ex1.A(gy3Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gy3Var.a();
        ex1.A(gy3Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gy3Var.a();
        ex1.A(gy3Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gy3Var.a();
        String str = gy3Var.c.b;
        Pattern pattern = jjb.b;
        ex1.v("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gy3Var.a();
        ex1.v("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", jjb.b.matcher(gy3Var.c.a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(defpackage.r80 r6) {
        /*
            r5 = this;
            gy3 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            gy3 r0 = r5.a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.b
            r0 = 1
            if (r6 != r0) goto L5c
            ep5 r6 = r5.e
            java.lang.Object r6 = r6.get()
            gy4 r6 = (gy4) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r5 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            wb8 r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.wb8.a()
            return r5
        L56:
            return r2
        L57:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r5     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L5c:
            wb8 r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.wb8.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy3.g(r80):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xy3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h80] */
    public final r80 h(r80 r80Var) throws bz3 {
        int responseCode;
        String str = r80Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            gy4 gy4Var = (gy4) this.e.get();
            synchronized (gy4Var.a) {
                try {
                    String[] strArr = gy4.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = gy4Var.a.getString("|T|" + gy4Var.b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        xy3 xy3Var = this.b;
        gy3 gy3Var = this.a;
        gy3Var.a();
        String str3 = gy3Var.c.a;
        String str4 = r80Var.a;
        gy3 gy3Var2 = this.a;
        gy3Var2.a();
        String str5 = gy3Var2.c.g;
        gy3 gy3Var3 = this.a;
        gy3Var3.a();
        String str6 = gy3Var3.c.b;
        r01 r01Var = xy3Var.c;
        if (!r01Var.a()) {
            throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = xy3.a("projects/" + str5 + "/installations");
        int i2 = 0;
        h80 h80Var = xy3Var;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = h80Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    xy3.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    r01Var.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                h80 h80VarE = xy3.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                h80Var = h80VarE;
            } else {
                try {
                    xy3.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                if (responseCode == 429) {
                    throw new bz3("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    h80 h80Var2 = new h80(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    h80Var = h80Var2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    h80Var = h80Var;
                }
            }
            int iC = dx1.C(h80Var.e);
            if (iC != 0) {
                if (iC != 1) {
                    throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
                }
                q80 q80VarA = r80Var.a();
                q80VarA.g = "BAD CONFIG";
                q80VarA.b = 5;
                return q80VarA.a();
            }
            String str7 = h80Var.b;
            String str8 = h80Var.c;
            this.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            a90 a90Var = h80Var.d;
            String str9 = a90Var.a;
            long j = a90Var.b;
            q80 q80VarA2 = r80Var.a();
            q80VarA2.a = str7;
            q80VarA2.b = 4;
            q80VarA2.c = str9;
            q80VarA2.d = str8;
            q80VarA2.e = j;
            byte b = (byte) (q80VarA2.h | 1);
            q80VarA2.f = jCurrentTimeMillis;
            q80VarA2.h = (byte) (b | 2);
            return q80VarA2.a();
        }
        throw new bz3("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void i(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((jr9) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(r80 r80Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((jr9) it.next()).b(r80Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
