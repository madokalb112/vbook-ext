package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class bd0 extends cd0 {
    public final yc0 c;
    public final Character d;
    public volatile cd0 e;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bd0(defpackage.yc0 r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.c = r3
            if (r4 == 0) goto L17
            char r0 = r4.charValue()
            byte[] r3 = r3.g
            int r1 = r3.length
            if (r0 >= r1) goto L17
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            defpackage.fx1.I(r3, r0, r4)
            r2.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd0.<init>(yc0, java.lang.Character):void");
    }

    @Override // defpackage.cd0
    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fx1.P(0, i, bArr.length);
        while (i2 < i) {
            yc0 yc0Var = this.c;
            c(sb, bArr, i2, Math.min(yc0Var.f, i - i2));
            i2 += yc0Var.f;
        }
    }

    public final void c(StringBuilder sb, byte[] bArr, int i, int i2) {
        fx1.P(i, i + i2, bArr.length);
        yc0 yc0Var = this.c;
        int i3 = yc0Var.f;
        int i4 = yc0Var.d;
        int i5 = 0;
        fx1.G(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(yc0Var.b[((int) (j >>> (i7 - i5))) & yc0Var.c]);
            i5 += i4;
        }
        Character ch = this.d;
        if (ch != null) {
            while (i5 < yc0Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public cd0 d(yc0 yc0Var, Character ch) {
        return new bd0(yc0Var, ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bd0) {
            bd0 bd0Var = (bd0) obj;
            if (this.c.equals(bd0Var.c) && Objects.equals(this.d, bd0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        yc0 yc0Var = this.c;
        sb.append(yc0Var);
        if (8 % yc0Var.d != 0) {
            Character ch = this.d;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public bd0(String str, String str2) {
        this(new yc0(str, str2.toCharArray()), (Character) '=');
    }
}
