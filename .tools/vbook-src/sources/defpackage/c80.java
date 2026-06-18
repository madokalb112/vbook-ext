package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c80 extends vk3 {
    public final byte[] a;
    public final byte[] b;

    public c80(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vk3) {
            vk3 vk3Var = (vk3) obj;
            boolean z = vk3Var instanceof c80;
            c80 c80Var = (c80) vk3Var;
            if (Arrays.equals(this.a, z ? c80Var.a : c80Var.a)) {
                c80 c80Var2 = (c80) vk3Var;
                if (Arrays.equals(this.b, z ? c80Var2.b : c80Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
