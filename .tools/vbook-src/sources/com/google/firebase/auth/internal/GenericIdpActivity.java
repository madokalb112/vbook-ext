package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zza;
import com.google.android.gms.internal.firebase-auth-api.zzaeq;
import com.google.android.gms.internal.firebase-auth-api.zzaer;
import com.google.android.gms.internal.firebase-auth-api.zzaes;
import com.google.android.gms.internal.firebase-auth-api.zzagi;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import defpackage.ex1;
import defpackage.gl9;
import defpackage.gy3;
import defpackage.j31;
import defpackage.olc;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class GenericIdpActivity extends i94 implements zzaes {
    public static long N;
    public static final /* synthetic */ int O = 0;
    public boolean M = false;

    static {
        tec tecVar = tec.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri.Builder m(Uri.Builder builder, Intent intent, String str, String str2) {
        String string;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str3, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        String strZza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        zk4 zk4Var = zk4.z;
        Context applicationContext = getApplicationContext();
        String str4 = string;
        String str5 = strJoin;
        synchronized (zk4Var) {
            ex1.z(str);
            ex1.z(string3);
            ex1.z(strZza);
            ex1.z(stringExtra4);
            SharedPreferences sharedPreferencesK = zk4.k(applicationContext, str);
            zk4.l(sharedPreferencesK);
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", strZza);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strA = hlc.c(getApplicationContext(), gy3.d(stringExtra4).e()).a();
        if (TextUtils.isEmpty(strA)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            n(gl9.q("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
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
        fec.a(getApplicationContext(), status);
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
        fec.a(this, gl9.q("WEB_CONTEXT_CANCELED"));
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            o();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - N < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        N = jCurrentTimeMillis;
        if (bundle != null) {
            this.M = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*zi1*/.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        olc olcVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.M) {
                o();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = t1c.L(yb0.R(this, packageName)).toLowerCase(Locale.US);
                gy3 gy3VarD = gy3.d(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gy3VarD);
                if (zzagl.zza(gy3VarD)) {
                    gy3VarD.a();
                    zza(m(Uri.parse(zzagl.zza(gy3VarD.c.a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.p);
                } else {
                    new zzaeq(packageName, lowerCase, getIntent(), gy3VarD, this).executeOnExecutor(firebaseAuth.s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            this.M = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            n(rec.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            o();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (zk4.z) {
            ex1.z(packageName2);
            ex1.z(stringExtra2);
            SharedPreferences sharedPreferencesK = zk4.k(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = sharedPreferencesK.getString(str, null);
            String string2 = sharedPreferencesK.getString(str2, null);
            String string3 = sharedPreferencesK.getString(str3, null);
            String string4 = sharedPreferencesK.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesK.getString(str4, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.apply();
            olcVar = (string == null || string2 == null || string3 == null) ? null : new olc(string, string2, string3, string4, string5);
        }
        if (olcVar == null) {
            o();
        }
        if (booleanExtra) {
            stringExtra = hlc.c(getApplicationContext(), gy3.d(olcVar.e).e()).b(stringExtra);
        }
        zzajb zzajbVar = new zzajb(olcVar, stringExtra);
        String str5 = olcVar.d;
        String str6 = olcVar.b;
        zzajbVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            o();
            return;
        }
        N = 0L;
        this.M = false;
        Intent intent2 = new Intent();
        Parcel parcelObtain = Parcel.obtain();
        zzajbVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        s16.E(this).R(intent2);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel parcelObtain2 = Parcel.obtain();
        zzajbVar.writeToParcel(parcelObtain2, 0);
        byte[] bArrMarshall2 = parcelObtain2.marshall();
        parcelObtain2.recycle();
        editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
        editorEdit2.putString("operation", str6);
        editorEdit2.putString("tenantId", str5);
        editorEdit2.putLong("timestamp", System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*zi1*/.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.M);
    }

    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
            wo9 wo9Var = new wo9(27, false);
            wo9Var.b = this;
            wo9Var.c = str;
            taskForResult.addOnCompleteListener(wo9Var);
            return;
        }
        j31.j();
    }
}
