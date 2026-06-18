package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hdb implements Executor {
    public static final hdb a;
    public static final Handler b;
    public static final /* synthetic */ hdb[] c;

    static {
        hdb hdbVar = new hdb("INSTANCE", 0);
        a = hdbVar;
        c = new hdb[]{hdbVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static hdb valueOf(String str) {
        return (hdb) Enum.valueOf(hdb.class, str);
    }

    public static hdb[] values() {
        return (hdb[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
