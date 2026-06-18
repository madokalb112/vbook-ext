package defpackage;

import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class u17 implements Constructable {
    public final /* synthetic */ int a;

    public /* synthetic */ u17(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Constructable
    public final Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        switch (this.a) {
            case 0:
                return NativeArrayBuffer.js_constructor(context, scriptable, objArr);
            case 1:
                return NativeDataView.js_constructor(context, scriptable, objArr);
            case 2:
                return NativeFloat32Array.lambda$init$0(context, scriptable, objArr);
            case 3:
                return NativeFloat64Array.lambda$init$0(context, scriptable, objArr);
            case 4:
                return NativeInt16Array.lambda$init$0(context, scriptable, objArr);
            case 5:
                return NativeInt32Array.lambda$init$0(context, scriptable, objArr);
            case 6:
                return NativeInt8Array.lambda$init$0(context, scriptable, objArr);
            case 7:
                return NativePromise.constructor(context, scriptable, objArr);
            case 8:
                return NativeSymbol.js_constructor(context, scriptable, objArr);
            case 9:
                return NativeUint16Array.lambda$init$0(context, scriptable, objArr);
            case 10:
                return NativeUint32Array.lambda$init$0(context, scriptable, objArr);
            case 11:
                return NativeUint8Array.lambda$init$0(context, scriptable, objArr);
            default:
                return NativeUint8ClampedArray.lambda$init$0(context, scriptable, objArr);
        }
    }
}
