package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
class REGlobalData {
    REBackTrackData backTrackStackTop;
    int cp;
    boolean multiline;
    long[] parens;
    RECompiled regexp;
    int skipped;
    REProgState stateStackTop;

    public int parensIndex(int i) {
        return (int) this.parens[i];
    }

    public int parensLength(int i) {
        return (int) (this.parens[i] >>> 32);
    }

    public void setParens(int i, int i2, int i3) {
        REBackTrackData rEBackTrackData = this.backTrackStackTop;
        if (rEBackTrackData != null) {
            long[] jArr = rEBackTrackData.parens;
            long[] jArr2 = this.parens;
            if (jArr == jArr2) {
                this.parens = (long[]) jArr2.clone();
            }
        }
        this.parens[i] = (((long) i3) << 32) | (((long) i2) & 4294967295L);
    }
}
