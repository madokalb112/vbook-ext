package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w17 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LambdaConstructor b;

    public /* synthetic */ w17(LambdaConstructor lambdaConstructor, int i) {
        this.a = i;
        this.b = lambdaConstructor;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int i = this.a;
        LambdaConstructor lambdaConstructor = this.b;
        switch (i) {
            case 0:
                return NativeArrayBuffer.lambda$init$0(lambdaConstructor, context, scriptable, scriptable2, objArr);
            case 1:
                return NativePromise.lambda$init$0(lambdaConstructor, context, scriptable, scriptable2, objArr);
            case 2:
                return NativePromise.lambda$init$1(lambdaConstructor, context, scriptable, scriptable2, objArr);
            default:
                return NativeSymbol.lambda$init$0(lambdaConstructor, context, scriptable, scriptable2, objArr);
        }
    }
}
