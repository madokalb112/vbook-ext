package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yx4 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final zy2 a;
    public final Context b;
    public final String c;
    public final az3 d;
    public final q32 e;
    public g80 f;

    public yx4(Context context, String str, az3 az3Var, q32 q32Var) {
        if (context == null) {
            gp.l("appContext must not be null");
            throw null;
        }
        if (str == null) {
            gp.l("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = az3Var;
        this.e = q32Var;
        this.a = new zy2();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final wy3 b(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new d7(0, y91.u, g02.class, "isNotMainThread", "isNotMainThread()Z", 0, 15).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        az3 az3Var = this.d;
        if (z) {
            try {
                str = ((i80) Tasks.await(((zy3) az3Var).e(), 10000L, timeUnit)).a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((zy3) az3Var).c(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new wy3(str2, str);
    }

    public final synchronized g80 c() {
        String str;
        g80 g80Var = this.f;
        if (g80Var != null && (g80Var.b != null || !this.e.j())) {
            return this.f;
        }
        js8 js8Var = js8.f;
        js8Var.v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        js8Var.v("Cached Firebase Installation ID: " + string);
        if (this.e.j()) {
            wy3 wy3VarB = b(false);
            js8Var.v("Fetched Firebase Installation ID: " + wy3VarB.a);
            if (wy3VarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wy3VarB = new wy3(str, null);
            }
            if (Objects.equals(wy3VarB.a, string)) {
                this.f = new g80(sharedPreferences.getString("crashlytics.installation.id", null), wy3VarB.a, wy3VarB.b);
            } else {
                this.f = new g80(a(sharedPreferences, wy3VarB.a), wy3VarB.a, wy3VarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new g80(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new g80(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        js8Var.v("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        zy2 zy2Var = this.a;
        Context context = this.b;
        synchronized (zy2Var) {
            try {
                if (zy2Var.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    zy2Var.b = installerPackageName;
                }
                str = "".equals(zy2Var.b) ? null : zy2Var.b;
            } finally {
            }
        }
        return str;
    }
}
