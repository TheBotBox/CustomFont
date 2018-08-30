package thebotbox.customfont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import bot.box.customfont.CustomFont;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_agency_r)
    TextView tv_agency_r;

    @BindView(R.id.tv_agency_b)
    TextView tv_agency_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tv_agency_r.setTypeface(CustomFont.AGENCY_REGULAR(this));
        tv_agency_b.setTypeface(CustomFont.AGENCY_BOLD(this));

    }
}
