package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g25 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ g25(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        boolean z = false;
        int iIntValue = 0;
        z = false;
        int i3 = this.c;
        int i4 = this.b;
        switch (i2) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (i4 > i3) {
                    options.inDensity = i4;
                    options.inTargetDensity = i3;
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                bitmapDecodeByteArray.getClass();
                return new uy4(new ng(bitmapDecodeByteArray));
            case 1:
                xl7 xl7Var = (xl7) obj;
                return tw2.o("| ", ne6.c(i4, (String) xl7Var.a), " | ", ne6.c(i3, (String) xl7Var.b), " |");
            case 2:
                long j = ((pja) obj).a;
                if (((int) (j >> 32)) >= i4 && ((int) (4294967295L & j)) <= i3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                List list = (List) obj;
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    i = -1;
                    if (it.hasNext()) {
                        tj7 tj7Var = (tj7) it.next();
                        if (!(tj7Var instanceof pia) || tj7Var.b != i4 || i3 >= ((pia) tj7Var).g.c) {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                    }
                }
                if (i5 >= 0) {
                    iIntValue = i5;
                } else {
                    Iterator it2 = list.iterator();
                    int i6 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((tj7) it2.next()).b == i4) {
                                i = i6;
                            } else {
                                i6++;
                            }
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    if (i < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
