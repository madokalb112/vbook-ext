package org.mozilla.javascript.typedarrays;

import defpackage.k27;
import defpackage.mn5;
import defpackage.u17;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class NativeUint8ClampedArray extends NativeTypedArrayView<Integer> {
    private static final String CLASS_NAME = "Uint8ClampedArray";
    private static final long serialVersionUID = -3349419704390398895L;

    public NativeUint8ClampedArray(int i) {
        this(new NativeArrayBuffer(i), 0, i);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 3, 2, new u17(12));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        NativeTypedArrayView.init(context, scriptable, lambdaConstructor, new k27(7));
        lambdaConstructor.defineProperty("BYTES_PER_ELEMENT", (Object) 1, 7);
        lambdaConstructor.definePrototypeProperty("BYTES_PER_ELEMENT", (Object) 1, 7);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, lambdaConstructor);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Scriptable lambda$init$0(Context context, Scriptable scriptable, Object[] objArr) {
        return NativeTypedArrayView.js_constructor(context, scriptable, objArr, new k27(6), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NativeUint8ClampedArray realThis(Scriptable scriptable) {
        return (NativeUint8ClampedArray) LambdaConstructor.convertThisObject(scriptable, NativeUint8ClampedArray.class);
    }

    @Override // java.util.List
    public Integer get(int i) {
        if (!checkIndex(i)) {
            return (Integer) js_get(i);
        }
        mn5.o();
        return null;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public int getBytesPerElement() {
        return 1;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_get(int i) {
        return checkIndex(i) ? Undefined.instance : ByteIo.readUint8(this.arrayBuffer.buffer, i + this.offset);
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_set(int i, Object obj) {
        if (checkIndex(i)) {
            return Undefined.instance;
        }
        ByteIo.writeUint8(this.arrayBuffer.buffer, i + this.offset, Conversions.toUint8Clamp(obj));
        return null;
    }

    @Override // java.util.List
    public Integer set(int i, Integer num) {
        if (!checkIndex(i)) {
            return (Integer) js_set(i, num);
        }
        mn5.o();
        return null;
    }

    public NativeUint8ClampedArray(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        super(nativeArrayBuffer, i, i2, i2);
    }

    public NativeUint8ClampedArray() {
    }
}
