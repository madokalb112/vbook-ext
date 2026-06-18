package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jr2 implements t95 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public jr2(rg2 rg2Var) {
        this.a = 0;
        Context context = (Context) rg2Var.b;
        int iT = gc1.T(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iT != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(iT);
            this.c = string;
            String strR = ky0.r("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strR, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.t95
    public p95 toInstant() {
        throw new d72(this.b + " when parsing an Instant from \"" + s32.X0(64, this.c) + '\"');
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jr2(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
