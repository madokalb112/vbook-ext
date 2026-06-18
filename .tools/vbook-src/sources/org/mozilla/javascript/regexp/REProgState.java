package org.mozilla.javascript.regexp;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
class REProgState {
    final REBackTrackData backTrack;
    final int continuationOp;
    final int continuationPc;
    final int index;
    final int max;
    final int min;
    final REProgState previous;

    public REProgState(REProgState rEProgState, int i, int i2, int i3, REBackTrackData rEBackTrackData, int i4, int i5) {
        this.previous = rEProgState;
        this.min = i;
        this.max = i2;
        this.index = i3;
        this.continuationOp = i4;
        this.continuationPc = i5;
        this.backTrack = rEBackTrackData;
    }
}
