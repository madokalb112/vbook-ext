package defpackage;

import android.graphics.pdf.models.selection.SelectionBoundary;
import android.view.textclassifier.TextClassifier;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class k27 implements NativeTypedArrayView.RealThis, NativeTypedArrayView.TypedArrayConstructable, os3, ll2 {
    public final /* synthetic */ int a;

    public /* synthetic */ k27(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ SelectionBoundary a(Object obj) {
        return (SelectionBoundary) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier f(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new d72(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void n(String str) {
        throw new NullPointerException(str);
    }

    @Override // defpackage.os3
    public ls3[] b() {
        return new ls3[]{new tb7()};
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.TypedArrayConstructable
    public NativeTypedArrayView construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        switch (this.a) {
            case 1:
                return new NativeUint16Array(nativeArrayBuffer, i, i2);
            case 2:
            default:
                return new NativeUint8ClampedArray(nativeArrayBuffer, i, i2);
            case 3:
                return new NativeUint32Array(nativeArrayBuffer, i, i2);
            case 4:
                return new NativeUint8Array(nativeArrayBuffer, i, i2);
        }
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis
    public NativeTypedArrayView realThis(Scriptable scriptable) {
        switch (this.a) {
            case 0:
                return NativeUint16Array.realThis(scriptable);
            case 2:
                return NativeUint32Array.realThis(scriptable);
            case 5:
                return NativeUint8Array.realThis(scriptable);
            default:
                return NativeUint8ClampedArray.realThis(scriptable);
        }
    }

    @Override // defpackage.ll2
    public void e(s58 s58Var) {
    }
}
