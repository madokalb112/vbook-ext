package okhttp3.internal.platform;

import android.content.Context;
import defpackage.l75;
import defpackage.lc3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class PlatformInitializer implements l75 {
    @Override // defpackage.l75
    public final List a() {
        return lc3.a;
    }

    @Override // defpackage.l75
    public final Object b(Context context) {
        context.getClass();
        Platform platform = Platform.a;
        Object obj = Platform.a;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.a(context);
        }
        return Platform.a;
    }
}
