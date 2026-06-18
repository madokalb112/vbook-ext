package org.mozilla.javascript;

import org.mozilla.javascript.NativePromise;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativePromise.Reaction b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Scriptable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(NativePromise.Reaction reaction, Context context, Scriptable scriptable, Object obj, int i) {
        this.a = i;
        this.b = reaction;
        this.c = context;
        this.d = scriptable;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Scriptable scriptable = this.d;
        Context context = this.c;
        NativePromise.Reaction reaction = this.b;
        switch (i) {
            case 0:
                reaction.invoke(context, scriptable, obj);
                break;
            default:
                reaction.invoke(context, scriptable, obj);
                break;
        }
    }
}
