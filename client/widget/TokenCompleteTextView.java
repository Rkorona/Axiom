package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.QwertyKeyListener;
import android.text.style.ReplacementSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.Filter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TokenCompleteTextView extends AppCompatMultiAutoCompleteTextView implements TextView.OnEditorActionListener {
    private boolean A;
    boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MultiAutoCompleteTextView.Tokenizer f46573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f46574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f46575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f46576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TokenDeleteStyle f46577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TokenClickStyle f46578f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f46579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f46580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Layout f46581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f46582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f46583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f46584z;

    public static class HintSpan extends TextAppearanceSpan {
        public HintSpan(String str, int i10, int i11, ColorStateList colorStateList, ColorStateList colorStateList2) {
            super(str, i10, i11, colorStateList, colorStateList2);
        }
    }

    public enum TokenClickStyle {
        None(false),
        Delete(false),
        Select(true),
        SelectDeselect(true);

        private boolean mIsSelectable;

        TokenClickStyle(boolean z10) {
            this.mIsSelectable = z10;
        }

        public boolean isSelectable() {
            return this.mIsSelectable;
        }
    }

    public enum TokenDeleteStyle {
        _Parent,
        Clear,
        PartialCompletion,
        ToString
    }

    class a implements InputFilter {
        a() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (charSequence.length() == 1 && charSequence.charAt(0) == ',') {
                TokenCompleteTextView.this.performCompletion();
                return "";
            }
            if (i12 >= TokenCompleteTextView.this.f46579u.length() || i13 != TokenCompleteTextView.this.f46579u.length()) {
                return null;
            }
            return TokenCompleteTextView.this.f46579u.substring(i12, i13);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f46586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f46587b;

        b(Object obj, CharSequence charSequence) {
            this.f46586a = obj;
            this.f46587b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f46586a == null) {
                return;
            }
            if (TokenCompleteTextView.this.f46582x || !TokenCompleteTextView.this.f46576d.contains(this.f46586a)) {
                SpannableStringBuilder spannableStringBuilderT = TokenCompleteTextView.this.t(this.f46587b);
                f fVarS = TokenCompleteTextView.this.s(this.f46586a);
                Editable text = TokenCompleteTextView.this.getText();
                if (text != null) {
                    int length = text.length();
                    if (TokenCompleteTextView.this.f46580v) {
                        length = TokenCompleteTextView.this.f46579u.length();
                        text.insert(length, spannableStringBuilderT);
                    } else {
                        text.append((CharSequence) spannableStringBuilderT);
                    }
                    text.setSpan(fVarS, length, (spannableStringBuilderT.length() + length) - 1, 33);
                    if (!TokenCompleteTextView.this.f46576d.contains(this.f46586a)) {
                        TokenCompleteTextView.this.f46575c.onSpanAdded(text, fVarS, length, (spannableStringBuilderT.length() + length) - 1);
                    }
                    TokenCompleteTextView.this.setSelection(text.length());
                }
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f46589a;

        c(Object obj) {
            this.f46589a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Editable text = TokenCompleteTextView.this.getText();
            if (text == null) {
                return;
            }
            for (f fVar : (f[]) text.getSpans(0, text.length(), f.class)) {
                if (fVar.b().equals(this.f46589a)) {
                    TokenCompleteTextView.this.F(fVar);
                }
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TokenCompleteTextView tokenCompleteTextView = TokenCompleteTextView.this;
            tokenCompleteTextView.B(tokenCompleteTextView.isFocused());
        }
    }

    private class e extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f46592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f46593d;

        public e(int i10, Context context, int i11, int i12, int i13) {
            super(new TextView(context));
            this.f46592c = "";
            TextView textView = (TextView) this.f46600a;
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setTextColor(i11);
            textView.setTextSize(0, i12);
            textView.setMinimumWidth(i13);
            b(i10);
        }

        public void b(int i10) {
            this.f46593d = i10;
            String str = "+" + this.f46593d;
            this.f46592c = str;
            ((TextView) this.f46600a).setText(str);
        }
    }

    protected class f extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f46595c;

        public f(View view, Object obj) {
            super(view);
            this.f46595c = obj;
        }

        public Object b() {
            return this.f46595c;
        }

        public void c() {
            Editable text = TokenCompleteTextView.this.getText();
            if (text == null) {
                return;
            }
            TokenCompleteTextView.this.F(this);
            if (TokenCompleteTextView.this.getSelectionStart() != text.getSpanEnd(this) + 1) {
                TokenCompleteTextView.this.setSelection(text.getSpanEnd(this) + 1);
            }
        }
    }

    private class g extends InputConnectionWrapper {
        public g(InputConnection inputConnection, boolean z10) {
            super(inputConnection, z10);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i10, int i11) {
            if (TokenCompleteTextView.this.y(false)) {
                return true;
            }
            return super.deleteSurroundingText(i10, i11);
        }
    }

    public interface h {
    }

    private class i implements SpanWatcher {
        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (!(obj instanceof f) || TokenCompleteTextView.this.f46584z) {
                return;
            }
            TokenCompleteTextView.this.f46576d.add(((f) obj).b());
            TokenCompleteTextView.c(TokenCompleteTextView.this);
            if (TokenCompleteTextView.this.getFilter() != null) {
                TokenCompleteTextView.this.getFilter().filter("");
            }
            TokenCompleteTextView.this.clearComposingText();
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (!(obj instanceof f) || TokenCompleteTextView.this.f46584z) {
                return;
            }
            f fVar = (f) obj;
            if (TokenCompleteTextView.this.f46576d.contains(fVar.b())) {
                TokenCompleteTextView.this.f46576d.remove(fVar.b());
            }
            TokenCompleteTextView.c(TokenCompleteTextView.this);
        }

        private i() {
        }
    }

    private class j implements TextWatcher {
        protected void a(f fVar, Editable editable) {
            editable.removeSpan(fVar);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            Editable text = TokenCompleteTextView.this.getText();
            if (text == null) {
                return;
            }
            TokenCompleteTextView.this.u();
            TokenCompleteTextView.this.H();
            int i13 = i10 - i11;
            for (f fVar : (f[]) text.getSpans(i13, i13 + i12, f.class)) {
                int i14 = i10 + i12;
                if (text.getSpanStart(fVar) < i14 && i14 <= text.getSpanEnd(fVar)) {
                    int spanStart = text.getSpanStart(fVar);
                    int spanEnd = text.getSpanEnd(fVar);
                    a(fVar, text);
                    int i15 = spanEnd - 1;
                    if (i15 >= 0 && text.charAt(i15) == ',') {
                        text.delete(i15, spanEnd);
                    }
                    if (spanStart >= 0 && text.charAt(spanStart) == ',') {
                        text.delete(spanStart, spanStart + 1);
                    }
                }
            }
        }

        private j() {
        }
    }

    private class k extends ReplacementSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected View f46600a;

        public k(View view) {
            this.f46600a = view;
        }

        private void a() {
            this.f46600a.measure(View.MeasureSpec.makeMeasureSpec((int) TokenCompleteTextView.this.D(), RtlSpacingHelper.UNDEFINED), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = this.f46600a;
            view.layout(0, 0, view.getMeasuredWidth(), this.f46600a.getMeasuredHeight());
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            a();
            canvas.save();
            canvas.translate(f10, (i14 - this.f46600a.getBottom()) - (((i14 - i12) - this.f46600a.getBottom()) / 2));
            this.f46600a.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            a();
            if (fontMetricsInt != null) {
                int measuredHeight = this.f46600a.getMeasuredHeight();
                int i12 = fontMetricsInt.descent;
                int i13 = fontMetricsInt.ascent;
                int i14 = measuredHeight - (i12 - i13);
                if (i14 > 0) {
                    int i15 = i14 / 2;
                    int i16 = i14 - i15;
                    fontMetricsInt.descent = i12 + i16;
                    fontMetricsInt.ascent = i13 - i15;
                    fontMetricsInt.bottom += i16;
                    fontMetricsInt.top -= i15;
                }
            }
            return this.f46600a.getRight();
        }
    }

    public TokenCompleteTextView(Context context) {
        super(context);
        this.f46577e = TokenDeleteStyle._Parent;
        this.f46578f = TokenClickStyle.None;
        this.f46579u = "";
        this.f46580v = false;
        this.f46581w = null;
        this.f46582x = true;
        this.f46583y = false;
        this.f46584z = false;
        this.A = false;
        this.B = false;
        C();
    }

    private void A() {
        if (enoughToFilter()) {
            performCompletion();
            return;
        }
        View viewFocusSearch = focusSearch(130);
        if (viewFocusSearch != null) {
            viewFocusSearch.requestFocus();
        }
    }

    private void C() {
        setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        this.f46576d = new ArrayList();
        getText();
        this.f46575c = new i();
        G();
        setTextIsSelectable(false);
        setLongClickable(false);
        setInputType(589824);
        setOnEditorActionListener(this);
        setFilters(new InputFilter[]{new a()});
        setDeletionStyle(TokenDeleteStyle.Clear);
        this.f46583y = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float D() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(f fVar) {
        Editable text = getText();
        if (text == null) {
            return;
        }
        if (((i[]) text.getSpans(0, text.length(), i.class)).length == 0) {
            this.f46575c.onSpanRemoved(text, fVar, text.getSpanStart(fVar), text.getSpanEnd(fVar));
        }
        text.delete(text.getSpanStart(fVar), text.getSpanEnd(fVar) + 1);
    }

    private void G() {
        Editable text = getText();
        if (text != null) {
            text.setSpan(this.f46575c, 0, text.length(), 18);
            addTextChangedListener(new j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        HintSpan hintSpan;
        Editable text = getText();
        CharSequence hint = getHint();
        if (text == null || hint == null || this.f46579u.length() <= 0) {
            return;
        }
        HintSpan[] hintSpanArr = (HintSpan[]) text.getSpans(0, text.length(), HintSpan.class);
        int length = this.f46579u.length();
        if (hintSpanArr.length > 0) {
            hintSpan = hintSpanArr[0];
            length += text.getSpanEnd(hintSpan) - text.getSpanStart(hintSpan);
        } else {
            hintSpan = null;
        }
        if (text.length() != length) {
            if (hintSpan == null) {
                return;
            }
            int spanStart = text.getSpanStart(hintSpan);
            int spanEnd = text.getSpanEnd(hintSpan);
            text.removeSpan(hintSpan);
            text.replace(spanStart, spanEnd, "");
            this.f46580v = false;
            return;
        }
        this.f46580v = true;
        if (hintSpan != null) {
            return;
        }
        Typeface typeface = getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        ColorStateList hintTextColors = getHintTextColors();
        HintSpan hintSpan2 = new HintSpan(null, style, (int) getTextSize(), hintTextColors, hintTextColors);
        text.insert(this.f46579u.length(), hint);
        text.setSpan(hintSpan2, this.f46579u.length(), this.f46579u.length() + getHint().length(), 33);
        setSelection(this.f46579u.length());
    }

    static /* bridge */ /* synthetic */ h c(TokenCompleteTextView tokenCompleteTextView) {
        tokenCompleteTextView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SpannableStringBuilder t(CharSequence charSequence) {
        return new SpannableStringBuilder("," + ((Object) this.f46573a.terminateToken(charSequence)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        Editable text;
        TokenClickStyle tokenClickStyle = this.f46578f;
        if (tokenClickStyle == null || !tokenClickStyle.isSelectable() || (text = getText()) == null) {
            return;
        }
        for (f fVar : (f[]) text.getSpans(0, text.length(), f.class)) {
            fVar.f46600a.setSelected(false);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(boolean z10) {
        Editable text;
        TokenClickStyle tokenClickStyle = this.f46578f;
        if (tokenClickStyle != null && tokenClickStyle.isSelectable() && (text = getText()) != null) {
            for (f fVar : (f[]) text.getSpans(0, text.length(), f.class)) {
                if (fVar.f46600a.isSelected()) {
                    F(fVar);
                    return true;
                }
            }
        }
        return z10;
    }

    protected void B(boolean z10) {
        Layout layout;
        if (z10) {
            setSingleLine(false);
            Editable text = getText();
            if (text != null) {
                for (e eVar : (e[]) text.getSpans(0, text.length(), e.class)) {
                    text.delete(text.getSpanStart(eVar), text.getSpanEnd(eVar));
                    text.removeSpan(eVar);
                }
                if (this.f46580v) {
                    setSelection(this.f46579u.length());
                } else {
                    setSelection(text.length());
                }
                if (((i[]) getText().getSpans(0, getText().length(), i.class)).length == 0) {
                    text.setSpan(this.f46575c, 0, text.length(), 18);
                    return;
                }
                return;
            }
            return;
        }
        setSingleLine(true);
        Editable text2 = getText();
        if (text2 != null && (layout = this.f46581w) != null) {
            int lineVisibleEnd = layout.getLineVisibleEnd(0);
            f[] fVarArr = (f[]) text2.getSpans(0, lineVisibleEnd, f.class);
            int size = this.f46576d.size() - fVarArr.length;
            if (size > 0) {
                int length = lineVisibleEnd + 1;
                e eVar2 = new e(size, getContext(), getCurrentTextColor(), (int) getTextSize(), (int) D());
                text2.insert(length, eVar2.f46592c);
                if (Layout.getDesiredWidth(text2, 0, eVar2.f46592c.length() + length, this.f46581w.getPaint()) > D()) {
                    text2.delete(length, eVar2.f46592c.length() + length);
                    if (fVarArr.length > 0) {
                        int spanStart = text2.getSpanStart(fVarArr[fVarArr.length - 1]);
                        eVar2.b(size + 1);
                        length = spanStart;
                    } else {
                        length = this.f46579u.length();
                    }
                    text2.insert(length, eVar2.f46592c);
                }
                text2.setSpan(eVar2, length, eVar2.f46592c.length() + length, 33);
            }
        }
    }

    public void E(Object obj) {
        post(new c(obj));
    }

    @Override // android.widget.AutoCompleteTextView
    protected CharSequence convertSelectionToString(Object obj) {
        this.f46574b = obj;
        int iOrdinal = this.f46577e.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? super.convertSelectionToString(obj) : obj.toString() : w() : "";
    }

    @Override // android.widget.MultiAutoCompleteTextView, android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        MultiAutoCompleteTextView.Tokenizer tokenizer;
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd >= 0 && (tokenizer = this.f46573a) != null) {
            int iFindTokenStart = tokenizer.findTokenStart(text, selectionEnd);
            if (iFindTokenStart < this.f46579u.length()) {
                iFindTokenStart = this.f46579u.length();
            }
            if (selectionEnd - iFindTokenStart >= getThreshold()) {
                return true;
            }
        }
        return false;
    }

    public List<Object> getObjects() {
        return this.f46576d;
    }

    protected ArrayList<Serializable> getSerializableObjects() {
        ArrayList<Serializable> arrayList = new ArrayList<>();
        for (Object obj : getObjects()) {
            if (obj instanceof Serializable) {
                arrayList.add((Serializable) obj);
            } else {
                Timber.d("Unable to save '%s'", obj);
            }
        }
        if (arrayList.size() != this.f46576d.size()) {
            Timber.d("You should make your objects Serializable or override getSerializableObjects and convertSerializableArrayToObjectArray", new Object[0]);
        }
        return arrayList;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f46583y && !this.B) {
            this.B = true;
            setShadowLayer(getShadowRadius(), getShadowDx(), getShadowDy(), getShadowColor());
            this.B = false;
        }
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        g gVar = new g(super.onCreateInputConnection(editorInfo), true);
        int i10 = editorInfo.imeOptions;
        int i11 = i10 & 255;
        if ((i10 & 6) != 0) {
            editorInfo.imeOptions = (i10 ^ i11) | 6;
        }
        int i12 = editorInfo.imeOptions;
        if ((1073741824 & i12) != 0) {
            editorInfo.imeOptions = i12 & (-1073741825);
        }
        return gVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        A();
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Editable text = getText();
        text.setSpan(this.f46575c, 0, text.length(), 18);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            r0 = 23
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L18
            r0 = 61
            if (r4 == r0) goto L18
            r0 = 66
            if (r4 == r0) goto L18
            r0 = 67
            if (r4 == r0) goto L13
            goto L22
        L13:
            boolean r0 = r3.y(r2)
            goto L23
        L18:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L22
            r3.A = r1
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != 0) goto L2d
            boolean r4 = super.onKeyDown(r4, r5)
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.widget.TokenCompleteTextView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean zOnKeyUp = super.onKeyUp(i10, keyEvent);
        if (this.A) {
            this.A = false;
            A();
        }
        return zOnKeyUp;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f46581w = getLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.prefix);
        this.f46579u = savedState.prefix;
        H();
        this.f46582x = savedState.allowDuplicates;
        this.f46578f = savedState.tokenClickStyle;
        this.f46577e = savedState.tokenDeleteStyle;
        G();
        Iterator it = v(savedState.baseObjects).iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        if (isFocused()) {
            return;
        }
        post(new d());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        ArrayList<Serializable> serializableObjects = getSerializableObjects();
        this.f46584z = true;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        this.f46584z = false;
        SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
        savedState.prefix = this.f46579u;
        savedState.allowDuplicates = this.f46582x;
        savedState.tokenClickStyle = this.f46578f;
        savedState.tokenDeleteStyle = this.f46577e;
        savedState.baseObjects = serializableObjects;
        return savedState;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        if (this.f46580v) {
            i10 = 0;
        }
        TokenClickStyle tokenClickStyle = this.f46578f;
        if (tokenClickStyle != null && tokenClickStyle.isSelectable() && getText() != null) {
            u();
        }
        String str = this.f46579u;
        if (str != null && (i10 < str.length() || i10 < this.f46579u.length())) {
            setSelection(this.f46579u.length());
            return;
        }
        Editable text = getText();
        if (text != null) {
            for (f fVar : (f[]) text.getSpans(i10, i10, f.class)) {
                int spanEnd = text.getSpanEnd(fVar);
                if (i10 <= spanEnd && text.getSpanStart(fVar) < i10) {
                    int i12 = spanEnd + 1;
                    if (length() <= i12) {
                        setSelection(i12);
                        return;
                    } else {
                        setSelection(length());
                        return;
                    }
                }
            }
        }
        super.onSelectionChanged(i10, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int offsetForPosition;
        int actionMasked = motionEvent.getActionMasked();
        Editable text = getText();
        TokenClickStyle tokenClickStyle = this.f46578f;
        TokenClickStyle tokenClickStyle2 = TokenClickStyle.None;
        boolean zOnTouchEvent = tokenClickStyle == tokenClickStyle2 ? super.onTouchEvent(motionEvent) : false;
        if (isFocused() && text != null && this.f46581w != null && actionMasked == 1 && (offsetForPosition = getOffsetForPosition(motionEvent.getX(), motionEvent.getY())) != -1) {
            f[] fVarArr = (f[]) text.getSpans(offsetForPosition, offsetForPosition, f.class);
            if (fVarArr.length > 0) {
                fVarArr[0].c();
                zOnTouchEvent = true;
            }
        }
        return (zOnTouchEvent || this.f46578f == tokenClickStyle2) ? zOnTouchEvent : super.onTouchEvent(motionEvent);
    }

    public void p(Object obj) {
        q(obj, "");
    }

    @Override // android.widget.AutoCompleteTextView
    public void performCompletion() {
        if (getListSelection() != -1) {
            super.performCompletion();
            return;
        }
        if (TextUtils.isEmpty(w())) {
            super.performCompletion();
            return;
        }
        Object item = getAdapter().getCount() > 0 ? getAdapter().getItem(0) : x(w());
        if (item == null) {
            super.performCompletion();
        } else {
            replaceText(convertSelectionToString(item));
        }
    }

    @Override // android.widget.MultiAutoCompleteTextView
    protected void performFiltering(CharSequence charSequence, int i10, int i11, int i12) {
        if (i10 < this.f46579u.length()) {
            i10 = this.f46579u.length();
        }
        Filter filter = getFilter();
        if (filter != null) {
            filter.filter(charSequence.subSequence(i10, i11), this);
        }
    }

    public void q(Object obj, CharSequence charSequence) {
        post(new b(obj, charSequence));
    }

    public void r(boolean z10) {
        this.f46582x = z10;
    }

    @Override // android.widget.MultiAutoCompleteTextView, android.widget.AutoCompleteTextView
    protected void replaceText(CharSequence charSequence) {
        clearComposingText();
        SpannableStringBuilder spannableStringBuilderT = t(charSequence);
        f fVarS = s(this.f46574b);
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        int iFindTokenStart = this.f46573a.findTokenStart(text, selectionEnd);
        if (iFindTokenStart < this.f46579u.length()) {
            iFindTokenStart = this.f46579u.length();
        }
        String strSubstring = TextUtils.substring(text, iFindTokenStart, selectionEnd);
        if (text != null) {
            if (fVarS == null) {
                text.replace(iFindTokenStart, selectionEnd, "");
                return;
            }
            if (!this.f46582x && this.f46576d.contains(fVarS.b())) {
                text.replace(iFindTokenStart, selectionEnd, "");
                return;
            }
            QwertyKeyListener.markAsReplaced(text, iFindTokenStart, selectionEnd, strSubstring);
            text.replace(iFindTokenStart, selectionEnd, spannableStringBuilderT);
            text.setSpan(fVarS, iFindTokenStart, (spannableStringBuilderT.length() + iFindTokenStart) - 1, 33);
        }
    }

    protected f s(Object obj) {
        if (obj == null) {
            return null;
        }
        return new f(z(obj), obj);
    }

    public void setDeletionStyle(TokenDeleteStyle tokenDeleteStyle) {
        this.f46577e = tokenDeleteStyle;
    }

    public void setPrefix(String str) {
        this.f46579u = "";
        Editable text = getText();
        if (text != null) {
            text.insert(0, str);
        }
        this.f46579u = str;
        H();
    }

    public void setTokenClickStyle(TokenClickStyle tokenClickStyle) {
        this.f46578f = tokenClickStyle;
    }

    public void setTokenListener(h hVar) {
    }

    @Override // android.widget.MultiAutoCompleteTextView
    public void setTokenizer(MultiAutoCompleteTextView.Tokenizer tokenizer) {
        super.setTokenizer(tokenizer);
        this.f46573a = tokenizer;
    }

    protected ArrayList v(ArrayList arrayList) {
        return new ArrayList();
    }

    protected String w() {
        if (this.f46580v) {
            return "";
        }
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        int iFindTokenStart = this.f46573a.findTokenStart(text, selectionEnd);
        if (iFindTokenStart < this.f46579u.length()) {
            iFindTokenStart = this.f46579u.length();
        }
        return TextUtils.substring(text, iFindTokenStart, selectionEnd);
    }

    protected abstract Object x(String str);

    protected abstract View z(Object obj);

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean allowDuplicates;
        ArrayList<Serializable> baseObjects;
        String prefix;
        TokenClickStyle tokenClickStyle;
        TokenDeleteStyle tokenDeleteStyle;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.prefix = parcel.readString();
            this.allowDuplicates = parcel.readInt() != 0;
            this.tokenClickStyle = TokenClickStyle.values()[parcel.readInt()];
            this.tokenDeleteStyle = TokenDeleteStyle.values()[parcel.readInt()];
            this.baseObjects = (ArrayList) parcel.readSerializable();
        }

        public String toString() {
            return ("TokenCompleteTextView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " tokens=" + this.baseObjects) + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.prefix);
            parcel.writeInt(this.allowDuplicates ? 1 : 0);
            parcel.writeInt(this.tokenClickStyle.ordinal());
            parcel.writeInt(this.tokenDeleteStyle.ordinal());
            parcel.writeSerializable(this.baseObjects);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TokenCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46577e = TokenDeleteStyle._Parent;
        this.f46578f = TokenClickStyle.None;
        this.f46579u = "";
        this.f46580v = false;
        this.f46581w = null;
        this.f46582x = true;
        this.f46583y = false;
        this.f46584z = false;
        this.A = false;
        this.B = false;
        C();
    }

    public TokenCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46577e = TokenDeleteStyle._Parent;
        this.f46578f = TokenClickStyle.None;
        this.f46579u = "";
        this.f46580v = false;
        this.f46581w = null;
        this.f46582x = true;
        this.f46583y = false;
        this.f46584z = false;
        this.A = false;
        this.B = false;
        C();
    }
}
