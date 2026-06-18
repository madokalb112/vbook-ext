package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return NativeMath.expm1(context, scriptable, scriptable2, objArr);
            case 1:
                return NativeMath.floor(context, scriptable, scriptable2, objArr);
            case 2:
                return NativeMath.fround(context, scriptable, scriptable2, objArr);
            case 3:
                return NativeMath.hypot(context, scriptable, scriptable2, objArr);
            case 4:
                return NativeMath.imul(context, scriptable, scriptable2, objArr);
            case 5:
                return NativeProxy.revocable(context, scriptable, scriptable2, objArr);
            case 6:
                return NativeReflect.apply(context, scriptable, scriptable2, objArr);
            case 7:
                return NativeReflect.has(context, scriptable, scriptable2, objArr);
            case 8:
                return NativeReflect.isExtensible(context, scriptable, scriptable2, objArr);
            case 9:
                return NativeReflect.ownKeys(context, scriptable, scriptable2, objArr);
            case 10:
                return NativeReflect.preventExtensions(context, scriptable, scriptable2, objArr);
            case 11:
                return NativeReflect.set(context, scriptable, scriptable2, objArr);
            case 12:
                return NativeReflect.setPrototypeOf(context, scriptable, scriptable2, objArr);
            case 13:
                return NativeReflect.construct(context, scriptable, scriptable2, objArr);
            case 14:
                return NativeReflect.defineProperty(context, scriptable, scriptable2, objArr);
            case 15:
                return NativeReflect.deleteProperty(context, scriptable, scriptable2, objArr);
            case 16:
                return NativeReflect.get(context, scriptable, scriptable2, objArr);
            case 17:
                return NativeReflect.getOwnPropertyDescriptor(context, scriptable, scriptable2, objArr);
            default:
                return NativeReflect.getPrototypeOf(context, scriptable, scriptable2, objArr);
        }
    }
}
