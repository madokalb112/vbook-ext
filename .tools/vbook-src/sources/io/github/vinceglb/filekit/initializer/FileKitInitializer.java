package io.github.vinceglb.filekit.initializer;

import android.content.Context;
import defpackage.js8;
import defpackage.l75;
import defpackage.lc3;
import defpackage.tv3;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FileKitInitializer implements l75 {
    @Override // defpackage.l75
    public final List a() {
        return lc3.a;
    }

    @Override // defpackage.l75
    public final Object b(Context context) {
        context.getClass();
        js8 js8Var = js8.d;
        WeakReference weakReference = tv3.a;
        tv3.a = new WeakReference(context);
        return js8Var;
    }
}
