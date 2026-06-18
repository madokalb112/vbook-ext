package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import defpackage.il9;
import defpackage.tu1;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.platform.ContextAwarePlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AssetPublicSuffixList extends BasePublicSuffixList {
    public final String f = "PublicSuffixDatabase.list";

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public final il9 b() throws IOException {
        Platform platform = Platform.a;
        Object obj = Platform.a;
        ContextAwarePlatform contextAwarePlatform = obj != null ? (ContextAwarePlatform) obj : null;
        Context contextB = contextAwarePlatform != null ? contextAwarePlatform.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open(this.f);
            inputStreamOpen.getClass();
            return tu1.l0(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            sy3.m("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        sy3.m("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }
}
