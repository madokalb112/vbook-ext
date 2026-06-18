package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ej2 {
    public String a;

    public static void a(y91 y91Var, j89 j89Var) {
        String str = j89Var.a;
        if (str != null) {
            y91Var.M("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        y91Var.M("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        y91Var.M("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.5");
        y91Var.M("Accept", "application/json");
        y91Var.M("X-CRASHLYTICS-DEVICE-MODEL", j89Var.b);
        String str2 = j89Var.c;
        if (str2 != null) {
            y91Var.M("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = j89Var.d;
        if (str3 != null) {
            y91Var.M("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = j89Var.e.c().a;
        if (str4 != null) {
            y91Var.M("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(j89 j89Var) {
        HashMap map = new HashMap();
        map.put("build_version", j89Var.h);
        map.put("display_version", j89Var.g);
        map.put("source", Integer.toString(j89Var.i));
        String str = j89Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(ii1 ii1Var) {
        String str = this.a;
        int i = ii1Var.b;
        js8 js8Var = js8.f;
        js8Var.v("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) ii1Var.c;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                js8Var.z("Failed to parse settings JSON from ".concat(str), e);
                js8Var.z("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (js8Var.k(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }
}
