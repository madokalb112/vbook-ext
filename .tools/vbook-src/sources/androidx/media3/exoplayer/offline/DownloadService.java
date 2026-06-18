package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.dx1;
import defpackage.fe;
import defpackage.tw1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class DownloadService extends Service {
    public static final HashMap a = new HashMap();

    public abstract tw1 a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        dx1.y(a.get(getClass()));
        a();
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        }
        throw null;
    }

    public final void onTimeout(int i, int i2) {
        fe.n0("DownloadService", "onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
