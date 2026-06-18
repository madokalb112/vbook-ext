package org.mozilla.javascript;

import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.NativePromise;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Interpreter.CallFrame) obj).lambda$equals$0(this.c, context, scriptable, scriptable2, objArr);
            default:
                return ((NativePromise.PromiseAnyRejector) obj).lambda$reject$0((NativePromise.PromiseElementResolver) this.c, context, scriptable, scriptable2, objArr);
        }
    }
}
