package defpackage;

import android.view.contentcapture.ContentCaptureSession;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j31 implements h03, hj1, j3b, e06 {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void d() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void e(int i, String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + i + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void j() {
        throw new ClassCastException();
    }

    @Override // defpackage.hj1
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public Object apply(Object obj) {
        i62.b.getClass();
        return b02.a.p((zz1) obj).getBytes(Charset.forName("UTF-8"));
    }

    public double c(double d) {
        switch (this.a) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 5:
                float[] fArr = hd1.a;
                return hd1.b(hd1.c, d);
            case 6:
                float[] fArr2 = hd1.a;
                return hd1.a(hd1.c, d);
            case 7:
                float[] fArr3 = hd1.a;
                return hd1.d(hd1.d, d);
            default:
                float[] fArr4 = hd1.a;
                return hd1.c(hd1.d, d);
        }
    }

    public void invoke(Object obj) {
        ea eaVar = (ea) obj;
        switch (this.a) {
            case 24:
                eaVar.getClass();
                break;
            case 25:
                eaVar.getClass();
                break;
            case 26:
                eaVar.getClass();
                break;
            case 27:
                eaVar.getClass();
                break;
            case 28:
                eaVar.getClass();
                break;
            default:
                eaVar.getClass();
                break;
        }
    }
}
