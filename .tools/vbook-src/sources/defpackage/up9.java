package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class up9 implements yx1, jt1 {
    public static final up9 a = new up9();

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        return null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return hc3.a;
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
