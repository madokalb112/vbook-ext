package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z17 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z17(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return NativePromise.lambda$makeThenFinally$4(obj, context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.lambda$makeCatchFinally$6(obj, context, scriptable, scriptable2, objArr);
        }
    }
}
