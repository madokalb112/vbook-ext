package baidu.lac.jni;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class LacLib {
    public static final LacLib INSTANCE = new LacLib();

    static {
        System.loadLibrary("paddle_lite_jni");
        System.loadLibrary("lac_analyzer");
    }

    private LacLib() {
    }

    public static final native NativeToken[] analyze(long j, String str);

    public static final native long create(Context context, String str, int i);

    public static final native void destroy(long j);
}
