package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mn5 implements be9, eq1, vb6, sx4, os3, NativeTypedArrayView.TypedArrayConstructable, NativeTypedArrayView.RealThis {
    public final /* synthetic */ int a;

    public /* synthetic */ mn5(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ void g() {
        throw new fi1();
    }

    public static /* synthetic */ void h(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void k(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* synthetic */ void m() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void o() {
        throw new IndexOutOfBoundsException();
    }

    public boolean a() {
        return false;
    }

    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.os3
    public ls3[] b() {
        return new ls3[]{new uw6(zz9.r, 16)};
    }

    public int c(Object obj) {
        String str = ((pb6) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.TypedArrayConstructable
    public NativeTypedArrayView construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        switch (this.a) {
            case 20:
                return new NativeFloat32Array(nativeArrayBuffer, i, i2);
            case 21:
            case 23:
            case 25:
            default:
                return new NativeInt8Array(nativeArrayBuffer, i, i2);
            case 22:
                return new NativeFloat64Array(nativeArrayBuffer, i, i2);
            case 24:
                return new NativeInt16Array(nativeArrayBuffer, i, i2);
            case 26:
                return new NativeInt32Array(nativeArrayBuffer, i, i2);
        }
    }

    public boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis
    public NativeTypedArrayView realThis(Scriptable scriptable) {
        switch (this.a) {
            case 21:
                return NativeFloat32Array.realThis(scriptable);
            case 22:
            case 24:
            case 26:
            default:
                return NativeInt8Array.realThis(scriptable);
            case 23:
                return NativeFloat64Array.realThis(scriptable);
            case 25:
                return NativeInt16Array.realThis(scriptable);
            case 27:
                return NativeInt32Array.realThis(scriptable);
        }
    }
}
