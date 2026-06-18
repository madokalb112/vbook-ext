package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface y04 extends ko {
    default llb a(s9b s9bVar) {
        return new s16(this);
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    float e(long j, float f, float f2, float f3);
}
