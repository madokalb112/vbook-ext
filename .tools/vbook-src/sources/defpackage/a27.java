package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class a27 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Scriptable b;
    public final /* synthetic */ Callable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a27(Scriptable scriptable, Callable callable, Object obj, int i) {
        this.a = i;
        this.b = scriptable;
        this.c = callable;
        this.d = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return NativePromise.lambda$makeThenFinally$5(this.b, this.c, this.d, context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.lambda$makeCatchFinally$7(this.b, this.c, this.d, context, scriptable, scriptable2, objArr);
        }
    }
}
