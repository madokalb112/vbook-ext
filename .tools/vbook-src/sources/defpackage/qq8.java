package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qq8 extends rq8 {
    public static final h76 k = new h76("SHA512", new wo8(20));
    public static final long[] l = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long g;
    public final long[] h;
    public final byte[] i;
    public final long[] j;

    public qq8() {
        super(Token.CASE, 64);
        this.h = new long[8];
        this.i = new byte[Token.CASE];
        c();
        this.j = new long[80];
    }

    @Override // defpackage.vj4
    public final void a(byte[] bArr) {
        j(bArr);
    }

    @Override // defpackage.vj4
    public final void c() {
        this.g = 0L;
        long[] jArr = this.h;
        jArr[0] = 7640891576956012808L;
        jArr[1] = -4942790177534073029L;
        jArr[2] = 4354685564936845355L;
        jArr[3] = -6534734903238641935L;
        jArr[4] = 5840696475078001361L;
        jArr[5] = -7276294671716946913L;
        jArr[6] = 2270897969802886507L;
        jArr[7] = 6620516959819538809L;
        byte[] bArr = this.i;
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
    }

    @Override // defpackage.vj4
    public final void d(byte[] bArr) {
        k(bArr.length, bArr);
    }

    @Override // defpackage.vj4
    public final void f(byte[] bArr) {
        j(bArr);
        c();
        this.e = 0;
        this.f = 0L;
    }

    @Override // defpackage.vj4
    public final vj4 g(int i, byte[] bArr) {
        k(i, bArr);
        this.f += (long) i;
        return this;
    }

    public final void i(int i, byte[] bArr) {
        int i2;
        long[] jArr;
        h76 h76Var;
        int i3;
        int i4 = 0;
        while (true) {
            i2 = 16;
            jArr = this.j;
            if (i4 >= 16) {
                break;
            }
            int i5 = (i4 * 8) + i;
            jArr[i4] = ((((long) bArr[i5 + 6]) & 255) << 8) | ((((long) bArr[i5]) & 255) << 56) | ((((long) bArr[i5 + 1]) & 255) << 48) | ((((long) bArr[i5 + 2]) & 255) << 40) | ((((long) bArr[i5 + 3]) & 255) << 32) | ((((long) bArr[i5 + 4]) & 255) << 24) | ((((long) bArr[i5 + 5]) & 255) << 16) | (((long) bArr[i5 + 7]) & 255);
            i4++;
        }
        while (true) {
            h76Var = k;
            if (i2 >= 80) {
                break;
            }
            long j = jArr[i2 - 2];
            h76Var.getClass();
            long jE = ((j >>> 6) ^ (h76.e(19, j) ^ h76.e(61, j))) + jArr[i2 - 7];
            long j2 = jArr[i2 - 15];
            jArr[i2] = jE + ((j2 >>> 7) ^ (h76.e(1, j2) ^ h76.e(8, j2))) + jArr[i2 - 16];
            i2++;
        }
        long[] jArr2 = this.h;
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = jArr2[2];
        long j6 = jArr2[3];
        long j7 = jArr2[4];
        long j8 = jArr2[5];
        long j9 = jArr2[6];
        long j10 = jArr2[7];
        int i6 = 0;
        long j11 = j7;
        for (i3 = 80; i6 < i3; i3 = 80) {
            h76Var.getClass();
            long jE2 = j10 + ((h76.e(14, j11) ^ h76.e(18, j11)) ^ h76.e(41, j11)) + (j9 ^ (j11 & (j8 ^ j9))) + l[i6] + jArr[i6];
            long j12 = j6 + jE2;
            long jE3 = jE2 + ((h76.e(28, j3) ^ h76.e(34, j3)) ^ h76.e(39, j3)) + ((j3 & j4) | (j5 & (j3 | j4)));
            i6++;
            long j13 = j8;
            j8 = j11;
            j11 = j12;
            j6 = j5;
            j5 = j4;
            j4 = j3;
            j3 = jE3;
            j10 = j9;
            j9 = j13;
        }
        jArr2[0] = jArr2[0] + j3;
        jArr2[1] = jArr2[1] + j4;
        jArr2[2] = jArr2[2] + j5;
        jArr2[3] = jArr2[3] + j6;
        jArr2[4] = jArr2[4] + j11;
        jArr2[5] = jArr2[5] + j8;
        jArr2[6] = jArr2[6] + j9;
        jArr2[7] = jArr2[7] + j10;
    }

    public final void j(byte[] bArr) {
        long j;
        long j2 = this.g;
        if (j2 >= 0) {
            j = j2 % 128;
        } else {
            long j3 = j2 - ((((j2 >>> 1) / 128) << 1) * 128);
            j = j3 - ((Long.MIN_VALUE ^ j3) >= -9223372036854775680L ? 128L : 0L);
        }
        int i = (int) j;
        int i2 = i + 1;
        byte[] bArr2 = this.i;
        bArr2[i] = -128;
        if (i2 > 112) {
            Arrays.fill(bArr2, i2, Token.CASE, (byte) 0);
            i(0, bArr2);
            i2 = 0;
        }
        Arrays.fill(bArr2, i2, 120, (byte) 0);
        long j4 = this.g * 8;
        this.g = j4;
        bArr2[120] = (byte) (j4 >>> 56);
        bArr2[121] = (byte) (j4 >>> 48);
        bArr2[122] = (byte) (j4 >>> 40);
        bArr2[123] = (byte) (j4 >>> 32);
        bArr2[124] = (byte) (j4 >>> 24);
        bArr2[125] = (byte) (j4 >>> 16);
        bArr2[126] = (byte) (j4 >>> 8);
        bArr2[127] = (byte) j4;
        i(0, bArr2);
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i3 * 8;
            long j5 = this.h[i3];
            bArr[i4] = (byte) (j5 >>> 56);
            bArr[i4 + 1] = (byte) (j5 >>> 48);
            bArr[i4 + 2] = (byte) (j5 >>> 40);
            bArr[i4 + 3] = (byte) (j5 >>> 32);
            bArr[i4 + 4] = (byte) (j5 >>> 24);
            bArr[i4 + 5] = (byte) (j5 >>> 16);
            bArr[i4 + 6] = (byte) (j5 >>> 8);
            bArr[i4 + 7] = (byte) j5;
        }
    }

    public final void k(int i, byte[] bArr) {
        long j;
        int i2;
        long j2 = this.g;
        if (j2 >= 0) {
            j = j2 % 128;
        } else {
            long j3 = j2 - ((((j2 >>> 1) / 128) << 1) * 128);
            j = j3 - ((Long.MIN_VALUE ^ j3) >= -9223372036854775680L ? 128L : 0L);
        }
        int i3 = (int) j;
        this.g = j2 + ((long) i);
        byte[] bArr2 = this.i;
        if (i3 != 0) {
            i2 = 128 - i3;
            if (i < i2) {
                bArr2.getClass();
                fw.R(bArr, i3, bArr2, 0, i);
                return;
            } else {
                bArr2.getClass();
                fw.R(bArr, i3, bArr2, 0, i2);
                i -= i2;
                i(0, bArr2);
            }
        } else {
            i2 = 0;
        }
        while (i >= 128) {
            i(i2, bArr);
            i -= 128;
            i2 += Token.CASE;
        }
        bArr2.getClass();
        fw.R(bArr, 0, bArr2, i2, i + i2);
    }
}
