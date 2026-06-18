package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i0c extends ContentObserver {
    public final /* synthetic */ ir0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0c(ir0 ir0Var, Handler handler) {
        super(handler);
        this.a = ir0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.k(heb.a);
    }
}
