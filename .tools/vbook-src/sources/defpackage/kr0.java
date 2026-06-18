package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kr0 {
    public static final z11 a = new z11(-1, null, null, 0);
    public static final int b = ym9.k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = ym9.k(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final zy2 d = new zy2("BUFFERED", 6);
    public static final zy2 e = new zy2("SHOULD_BUFFER", 6);
    public static final zy2 f = new zy2("S_RESUMING_BY_RCV", 6);
    public static final zy2 g = new zy2("RESUMING_BY_EB", 6);
    public static final zy2 h = new zy2("POISONED", 6);
    public static final zy2 i = new zy2("DONE_RCV", 6);
    public static final zy2 j = new zy2("INTERRUPTED_SEND", 6);
    public static final zy2 k = new zy2("INTERRUPTED_RCV", 6);
    public static final zy2 l = new zy2("CHANNEL_CLOSED", 6);
    public static final zy2 m = new zy2("SUSPEND", 6);
    public static final zy2 n = new zy2("SUSPEND_NO_WAITER", 6);
    public static final zy2 o = new zy2("FAILED", 6);
    public static final zy2 p = new zy2("NO_RECEIVE_RESULT", 6);
    public static final zy2 q = new zy2("CLOSE_HANDLER_CLOSED", 6);
    public static final zy2 r = new zy2("CLOSE_HANDLER_INVOKED", 6);
    public static final zy2 s = new zy2("NO_CLOSE_CAUSE", 6);

    public static final boolean a(zx0 zx0Var, Object obj, zb4 zb4Var) {
        zy2 zy2VarD = zx0Var.d(obj, zb4Var);
        if (zy2VarD == null) {
            return false;
        }
        zx0Var.l(zy2VarD);
        return true;
    }
}
