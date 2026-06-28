package com.server.auditor.ssh.client.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.database.models.TagDBModel;

/* JADX INFO: loaded from: classes4.dex */
public class TagChipsCompletionView extends TokenCompleteTextView {
    private String C;
    private mq.f D;

    class a implements InputFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f46557a = false;

        a() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if (this.f46557a) {
                return null;
            }
            String strReplaceAll = charSequence.toString().replaceAll("_", "").toString().replaceAll("[^\\w ,\n]", "");
            if (i12 < TagChipsCompletionView.this.C.length() && i13 == TagChipsCompletionView.this.C.length()) {
                return TagChipsCompletionView.this.C.substring(i12, i13);
            }
            if (!strReplaceAll.equals("")) {
                if (strReplaceAll.length() == 1 && (strReplaceAll.charAt(0) == ',' || strReplaceAll.charAt(0) == ' ' || strReplaceAll.charAt(0) == '\n')) {
                    this.f46557a = true;
                    TagChipsCompletionView.this.performCompletion();
                    if (TagChipsCompletionView.this.D != null) {
                        TagChipsCompletionView.this.D.a();
                    }
                    this.f46557a = false;
                    return "";
                }
                if (!strReplaceAll.toString().matches("[\\w]+")) {
                    return null;
                }
            }
            return strReplaceAll;
        }
    }

    public TagChipsCompletionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = "";
        this.D = null;
        setFilters(new InputFilter[]{new a()});
    }

    @Override // com.server.auditor.ssh.client.widget.TokenCompleteTextView, android.widget.MultiAutoCompleteTextView, android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    @Override // com.server.auditor.ssh.client.widget.TokenCompleteTextView, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            super.onFocusChanged(z10, i10, rect);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setCompletionPerformListener(mq.f fVar) {
        this.D = fVar;
    }

    @Override // com.server.auditor.ssh.client.widget.TokenCompleteTextView
    protected Object x(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new TagDBModel(str);
    }

    @Override // com.server.auditor.ssh.client.widget.TokenCompleteTextView
    protected View z(Object obj) {
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.tag_token, (ViewGroup) getParent(), false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) linearLayout.findViewById(R.id.tag_title_text_view);
        if (obj instanceof TagDBModel) {
            TagDBModel tagDBModel = (TagDBModel) obj;
            if (TextUtils.isEmpty(tagDBModel.getTitle())) {
                tagDBModel.setTitle("default_empty_tag");
            }
            appCompatTextView.setText(tagDBModel.getTitle());
        } else if (obj != null) {
            appCompatTextView.setText(obj.toString());
            appCompatTextView.setCompoundDrawables(null, null, null, null);
        }
        appCompatTextView.setEnabled(isEnabled());
        return linearLayout;
    }
}
