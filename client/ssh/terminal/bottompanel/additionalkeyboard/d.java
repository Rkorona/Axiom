package com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard;

import android.R;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.AdditionalPanelKeys;
import com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.KeyTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38969a;

        static {
            int[] iArr = new int[AdditionalPanelKeys.TypeAdditionalPanelKey.values().length];
            f38969a = iArr;
            try {
                iArr[AdditionalPanelKeys.TypeAdditionalPanelKey.DifferentStateKey.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38969a[AdditionalPanelKeys.TypeAdditionalPanelKey.TwoStateKey.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static String a(String str) {
        return str.equals("Shift+Tab") ? "shift\ntab" : str;
    }

    public static void b(String str, TextView textView, String str2, int i10) {
        Integer[] numArrA = i.a(str2);
        AdditionalPanelKeys.TypeAdditionalPanelKey type = AdditionalPanelKeys.TypeAdditionalPanelKey.getType(str2);
        String strA = a(str2);
        textView.clearComposingText();
        textView.setText(strA);
        textView.setContentDescription(str2);
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.setBackgroundResource(resourceId);
        if (textView instanceof KeyTextView) {
            int i11 = a.f38969a[type.ordinal()];
            if (i11 == 1) {
                ((KeyTextView) textView).setResourceHolder(new com.server.auditor.ssh.client.ssh.terminal.bottompanel.additionalkeyboard.a(textView.getContext(), str));
            } else if (i11 == 2) {
                ((KeyTextView) textView).setResourceHolder(new l(textView.getContext(), str, str2));
            } else if (numArrA.length == 0) {
                textView.setText(strA);
                ((KeyTextView) textView).setResourceHolder(new KeyTextView.a(textView.getContext(), str));
            } else {
                ((KeyTextView) textView).setResourceHolder(new j(textView.getContext(), str, str2));
            }
            ((KeyTextView) textView).setResourceByState();
        } else {
            textView.setText(strA);
        }
        textView.setTag(new k(i10, str2));
    }

    public static void c(TextView textView) {
        textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), com.server.auditor.ssh.client.R.color.additional_keyboard_btn_text_color));
    }

    static void d(KeyTextView keyTextView, View.OnClickListener onClickListener, int i10, int i11, String str) {
        e(keyTextView, i10);
        keyTextView.setTag(new k(i11, str));
        keyTextView.setOnClickListener(onClickListener);
    }

    public static void e(TextView textView, int i10) {
        ImageSpan imageSpan = new ImageSpan(textView.getContext(), i10);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("g");
        spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }
}
