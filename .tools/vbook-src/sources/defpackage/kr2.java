package defpackage;

import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kr2 {
    public static final d6a a = new d6a(new dh1(29));

    public static lp8 a() {
        return ((ph) a.getValue()).b;
    }

    public static String b() {
        d();
        String string = Settings.Secure.getString(((ph) a().b).a.getContentResolver(), "android_id");
        string.getClass();
        return string;
    }

    public static String c() {
        d();
        a();
        String str = Build.MANUFACTURER;
        str.getClass();
        a();
        String str2 = Build.MODEL;
        str2.getClass();
        return str + " " + str2;
    }

    public static void d() {
        ((ph) a.getValue()).getClass();
    }
}
