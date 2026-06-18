package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zza;
import com.google.android.gms.internal.firebase-auth-api.zzaeq;
import com.google.android.gms.internal.firebase-auth-api.zzaer;
import com.google.android.gms.internal.firebase-auth-api.zzaes;
import com.google.android.gms.internal.firebase-auth-api.zzafd;
import com.google.android.gms.internal.firebase-auth-api.zzagi;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import defpackage.ex1;
import defpackage.gl9;
import defpackage.gy3;
import defpackage.j31;
import defpackage.rec;
import defpackage.s16;
import defpackage.s58;
import defpackage.t1c;
import defpackage.tec;
import defpackage.yb0;
import defpackage.zk4;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class RecaptchaActivity extends i94 implements zzaes {
    public static long N;
    public static final tec O = tec.b;
    public boolean M = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri.Builder m(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        gy3 gy3VarD = gy3.d(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gy3VarD);
        zk4 zk4Var = zk4.z;
        Context applicationContext = getApplicationContext();
        synchronized (zk4Var) {
            ex1.z(str);
            ex1.z(string);
            SharedPreferences sharedPreferencesK = zk4.k(applicationContext, str);
            zk4.l(sharedPreferencesK);
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strA = hlc.c(getApplicationContext(), gy3VarD.e()).a();
        String strZza = null;
        if (TextUtils.isEmpty(strA)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            n(gl9.q("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.g) {
        }
        if (TextUtils.isEmpty(null)) {
            strZza = zzafd.zza();
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZza).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Status status) {
        N = 0L;
        this.M = false;
        Intent intent = new Intent();
        HashMap map = rec.a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        s16.E(this).R(intent);
        O.a.getClass();
        fec.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        N = 0L;
        this.M = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        s16.E(this).R(intent);
        O.a.getClass();
        fec.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            o();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - N < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        N = jCurrentTimeMillis;
        if (bundle != null) {
            this.M = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*zi1*/.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.app.Activity, com.google.firebase.auth.internal.RecaptchaActivity] */
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.M) {
                o();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = t1c.L(yb0.R(this, packageName)).toLowerCase(Locale.US);
                gy3 gy3VarD = gy3.d(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gy3VarD);
                if (zzagl.zza(gy3VarD)) {
                    ?? r8 = this;
                    gy3VarD.a();
                    r8.zza(r8.m(Uri.parse(zzagl.zza(gy3VarD.c.a)).buildUpon(), r8.getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.p);
                    recaptchaActivity = r8;
                } else {
                    RecaptchaActivity recaptchaActivity2 = this;
                    new zzaeq(packageName, lowerCase, intent, gy3VarD, recaptchaActivity2).executeOnExecutor(firebaseAuth.s, new Void[0]);
                    recaptchaActivity = recaptchaActivity2;
                }
            } catch (PackageManager.NameNotFoundException e) {
                RecaptchaActivity recaptchaActivity3 = this;
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(recaptchaActivity3, packageName);
                recaptchaActivity = recaptchaActivity3;
            }
            recaptchaActivity.M = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            n(rec.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            o();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        zk4 zk4Var = zk4.z;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (zk4Var) {
            ex1.z(packageName2);
            ex1.z(stringExtra2);
            SharedPreferences sharedPreferencesK = zk4.k(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = sharedPreferencesK.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = sharedPreferencesK.getString(str3, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            n(gl9.q("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = hlc.c(getApplicationContext(), gy3.d(str).e()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        N = 0L;
        this.M = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        s16.E(this).R(intent3);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit2.putString("recaptchaToken", queryParameter);
        editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*zi1*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.M);
    }

    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            o();
        } else {
            n(status);
        }
    }

    public final void zza(Uri uri, String str, s58 s58Var) {
        if (s58Var.get() == null) {
            Task taskForResult = Tasks.forResult(uri);
            wo9 wo9Var = new wo9(28, false);
            wo9Var.b = this;
            wo9Var.c = str;
            taskForResult.addOnCompleteListener(wo9Var);
            return;
        }
        j31.j();
    }
}
