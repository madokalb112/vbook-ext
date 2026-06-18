package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Comment extends AstNode {
    private Token.CommentType commentType;
    private String value;

    public Comment(int i, int i2, Token.CommentType commentType, String str) {
        super(i, i2);
        this.type = Token.COMMENT;
        this.commentType = commentType;
        this.value = str;
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public String getValue() {
        return this.value;
    }

    public void setCommentType(Token.CommentType commentType) {
        this.commentType = commentType;
    }

    public void setValue(String str) {
        this.value = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder(getLength() + 10);
        sb.append(makeIndent(i));
        sb.append(this.value);
        if (Token.CommentType.BLOCK_COMMENT == getCommentType()) {
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
