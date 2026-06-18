package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaMap;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v17 implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ v17(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return NativeArrayBuffer.js_isView(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeDataView.lambda$init$18(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeDataView.lambda$init$3(context, scriptable, scriptable2, objArr);
            case 3:
                return NativeDataView.lambda$init$4(context, scriptable, scriptable2, objArr);
            case 4:
                return NativeDataView.lambda$init$5(context, scriptable, scriptable2, objArr);
            case 5:
                return NativeDataView.lambda$init$6(context, scriptable, scriptable2, objArr);
            case 6:
                return NativeDataView.lambda$init$7(context, scriptable, scriptable2, objArr);
            case 7:
                return NativeDataView.lambda$init$8(context, scriptable, scriptable2, objArr);
            case 8:
                return NativeDataView.lambda$init$9(context, scriptable, scriptable2, objArr);
            case 9:
                return NativeDataView.lambda$init$10(context, scriptable, scriptable2, objArr);
            case 10:
                return NativeDataView.lambda$init$11(context, scriptable, scriptable2, objArr);
            case 11:
                return NativeDataView.lambda$init$12(context, scriptable, scriptable2, objArr);
            case 12:
                return NativeDataView.lambda$init$13(context, scriptable, scriptable2, objArr);
            case 13:
                return NativeDataView.lambda$init$14(context, scriptable, scriptable2, objArr);
            case 14:
                return NativeDataView.lambda$init$15(context, scriptable, scriptable2, objArr);
            case 15:
                return NativeDataView.lambda$init$16(context, scriptable, scriptable2, objArr);
            case 16:
                return NativeDataView.lambda$init$17(context, scriptable, scriptable2, objArr);
            case 17:
                return NativeJSON.parse(context, scriptable, scriptable2, objArr);
            case 18:
                return NativeJSON.stringify(context, scriptable, scriptable2, objArr);
            case 19:
                return NativeJavaMap.lambda$static$0(context, scriptable, scriptable2, objArr);
            case 20:
                return NativeJavaObject.lambda$static$0(context, scriptable, scriptable2, objArr);
            case 21:
                return NativePromise.doCatch(context, scriptable, scriptable2, objArr);
            case 22:
                return NativePromise.resolve(context, scriptable, scriptable2, objArr);
            case 23:
                return NativePromise.reject(context, scriptable, scriptable2, objArr);
            case 24:
                return NativePromise.all(context, scriptable, scriptable2, objArr);
            case 25:
                return NativePromise.allSettled(context, scriptable, scriptable2, objArr);
            case 26:
                return NativePromise.race(context, scriptable, scriptable2, objArr);
            case 27:
                return NativePromise.any(context, scriptable, scriptable2, objArr);
            case 28:
                return NativeSymbol.js_keyFor(context, scriptable, scriptable2, objArr);
            default:
                return NativeSymbol.js_toString(context, scriptable, scriptable2, objArr);
        }
    }
}
