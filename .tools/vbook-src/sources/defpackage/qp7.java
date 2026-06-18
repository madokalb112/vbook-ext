package defpackage;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface qp7 extends IInterface {
    public static final String k = "androidx$pdf$PdfDocumentRemote".replace('$', '.');

    Bitmap D(int i, int i2, int i3, int i4, int i5, int i6, int i7, ui8 ui8Var);

    void E(int i);

    int h();

    int i();

    int n();

    int q(ParcelFileDescriptor parcelFileDescriptor, String str);

    Bitmap s(int i, int i2, int i3, ui8 ui8Var);

    void v();

    bt2 y(int i);
}
