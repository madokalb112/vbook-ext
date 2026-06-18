package org.mozilla.javascript.typedarrays;

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
public class NativeInt16Array extends NativeTypedArrayView<Short> {
    private static final int BYTES_PER_ELEMENT = 2;
    private static final String CLASS_NAME = "Int16Array";
    private static final long serialVersionUID = -8592870435287581398L;

    public NativeInt16Array(int i) {
        this(new NativeArrayBuffer(((double) i) * 2.0d), 0, i);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, CLASS_NAME, 3, 2, new u17(4));
        lambdaConstructor.setPrototypePropertyAttributes(7);
        NativeTypedArrayView.init(context, scriptable, lambdaConstructor, new mn5(25));
        lambdaConstructor.defineProperty("BYTES_PER_ELEMENT", (Object) 2, 7);
        lambdaConstructor.definePrototypeProperty("BYTES_PER_ELEMENT", (Object) 2, 7);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, lambdaConstructor);
        ScriptableObject.defineProperty(scriptable, CLASS_NAME, lambdaConstructor, 2);
        if (z) {
            lambdaConstructor.sealObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Scriptable lambda$init$0(Context context, Scriptable scriptable, Object[] objArr) {
        return NativeTypedArrayView.js_constructor(context, scriptable, objArr, new mn5(24), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NativeInt16Array realThis(Scriptable scriptable) {
        return (NativeInt16Array) LambdaConstructor.convertThisObject(scriptable, NativeInt16Array.class);
    }

    @Override // java.util.List
    public Short get(int i) {
        if (!checkIndex(i)) {
            return (Short) js_get(i);
        }
        mn5.o();
        return null;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public int getBytesPerElement() {
        return 2;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_get(int i) {
        return checkIndex(i) ? Undefined.instance : ByteIo.readInt16(this.arrayBuffer.buffer, (i * 2) + this.offset, NativeArrayBufferView.useLittleEndian());
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView
    public Object js_set(int i, Object obj) {
        if (checkIndex(i)) {
            return Undefined.instance;
        }
        ByteIo.writeInt16(this.arrayBuffer.buffer, (i * 2) + this.offset, Conversions.toInt16(obj), NativeArrayBufferView.useLittleEndian());
        return null;
    }

    @Override // java.util.List
    public Short set(int i, Short sh) {
        if (!checkIndex(i)) {
            return (Short) js_set(i, sh);
        }
        mn5.o();
        return null;
    }

    public NativeInt16Array(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        super(nativeArrayBuffer, i, i2, i2 * 2);
    }

    public NativeInt16Array() {
    }
}
