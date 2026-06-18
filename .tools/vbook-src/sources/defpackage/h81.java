package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h81 extends yv0 {
    public static final h81 d = new h81("CBC", 0);
    public static final h81 e = new h81("ECB", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h81(String str, int i) {
        super(str, 2);
        this.c = i;
    }

    @Override // defpackage.yv0
    public final byte[] a(byte[] bArr, h hVar, md2 md2Var, byte[] bArr2) {
        switch (this.c) {
            case 0:
                byte[] bArrU = s32.U(bArr2);
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                byte[] bArr3 = new byte[16];
                int iO = sw1.O(0, bArrCopyOf.length - 1, 16);
                if (iO >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 16;
                        fw.R(bArrCopyOf, 0, bArr3, i, i2);
                        hVar.a(bArrCopyOf, i, 16);
                        int length = bArrU.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            int i4 = i + i3;
                            bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrU[i3]);
                        }
                        fw.R(bArr3, 0, bArrU, 0, 16);
                        if (i != iO) {
                            i = i2;
                        }
                    }
                }
                return Arrays.copyOf(Arrays.copyOf(bArrCopyOf, bArrCopyOf.length), md2Var.p0(bArrCopyOf));
            default:
                hVar.a(bArr, 0, bArr.length);
                return Arrays.copyOf(Arrays.copyOf(bArr, bArr.length), md2Var.p0(bArr));
        }
    }

    @Override // defpackage.yv0
    public final byte[] b(byte[] bArr, h hVar, md2 md2Var, byte[] bArr2) {
        switch (this.c) {
            case 0:
                byte[] bArrU = s32.U(bArr2);
                int iO0 = md2Var.o0(bArr.length);
                int length = bArr.length + iO0;
                byte[] bArr3 = new byte[length];
                fw.R(bArr, 0, bArr3, 0, bArr.length);
                md2Var.r(bArr3, bArr.length, iO0);
                int iO = sw1.O(0, length - 1, 16);
                if (iO >= 0) {
                    int i = 0;
                    while (true) {
                        int length2 = bArrU.length;
                        for (int i2 = 0; i2 < length2; i2++) {
                            int i3 = i + i2;
                            bArr3[i3] = (byte) (bArr3[i3] ^ bArrU[i2]);
                        }
                        hVar.c(bArr3, i, 16);
                        int i4 = i + 16;
                        fw.R(bArr3, 0, bArrU, i, i4);
                        if (i != iO) {
                            i = i4;
                        }
                    }
                }
                return bArr3;
            default:
                int iO02 = md2Var.o0(bArr.length);
                int length3 = bArr.length + iO02;
                byte[] bArr4 = new byte[length3];
                fw.R(bArr, 0, bArr4, 0, bArr.length);
                md2Var.r(bArr4, bArr.length, iO02);
                hVar.c(bArr4, 0, length3);
                return bArr4;
        }
    }
}
