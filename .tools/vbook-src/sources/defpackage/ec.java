package defpackage;

import android.content.Context;
import android.os.BatteryManager;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ec {
    public final Context a;
    public final BatteryManager b;

    public ec(Context context) {
        this.a = context;
        this.b = (BatteryManager) hs1.getSystemService(context, BatteryManager.class);
    }
}
