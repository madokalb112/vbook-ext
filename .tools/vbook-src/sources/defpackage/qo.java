package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qo implements br9 {
    public final s9b a;
    public final cn7 b;
    public vo c;
    public long d;
    public long e;
    public boolean f;

    public qo(s9b s9bVar, Object obj, vo voVar, long j, long j2, boolean z) {
        vo voVarY;
        this.a = s9bVar;
        this.b = dk9.x(obj);
        if (voVar != null) {
            voVarY = s32.Y(voVar);
        } else {
            voVarY = (vo) s9bVar.a.invoke(obj);
            voVarY.d();
        }
        this.c = voVarY;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object a() {
        return this.a.b.invoke(this.c);
    }

    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.b.getValue());
        sb.append(", velocity=");
        sb.append(a());
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return dx1.j(sb, this.e, ')');
    }

    public /* synthetic */ qo(s9b s9bVar, Object obj, vo voVar, int i) {
        this(s9bVar, obj, (i & 4) != 0 ? null : voVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
