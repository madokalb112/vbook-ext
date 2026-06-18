package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ia9 {
    public static final ni1 b;
    public final Context a;

    static {
        mi1 mi1VarB = ni1.b(ia9.class);
        mi1VarB.a(vn2.b(lh6.class));
        mi1VarB.a(vn2.b(Context.class));
        mi1VarB.f = new bv7(21);
        b = mi1VarB.b();
    }

    public ia9(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
